package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDto;

@Service
public class StudentService {

	@Autowired
	private JdbcTemplate tmp;

    /*Demonstrating prepared statements*/
    public void insertUsingPreparedStatement(Integer id, String fullName) {
        int rowsInserted = tmp.update("insert into students (id,full_name) values (?,?)", ps -> {
            ps.setInt(1, id);
            ps.setString(2, fullName);
        });
        System.out.println("Number of rows updated = " + rowsInserted);
    }

    /*To batch execute same statement with multiple parameter sets*/
    public int batchInsertWithPreparedStatements() {
        List<Object[]> arr = Arrays.asList(
                new Object[]{8, "IRENRE"},
                new Object[]{9, "JNFJN"},
                new Object[]{10, "CMRRCC"}
        );
        int[] batchUpdate = tmp.batchUpdate("insert into students (id,full_name) values (?,?)",arr);
        return batchUpdate.length;
    }

    
    public void batchInsert(List<StudentDto> students) {
        // executing 10 inserts at a time
        tmp.batchUpdate("insert into user_entity (id,first_name,last_name) values (?,?)", students, 6, (ps, argument) -> {
            ps.setInt(1, argument.getId());
            ps.setString(2, argument.getFullName());
        });
    }


    public StudentDto queryUserById(Integer id) {

        StudentDto user = tmp.queryForObject("select * from user_entity where id=?", (resultSet, i) -> {
            StudentDto StudentDto = new StudentDto();
            StudentDto.setId(resultSet.getInt("id"));
            StudentDto.setFullName(resultSet.getString("full_name"));
            return StudentDto;
        }, id);
        System.out.println(user);
        return user;
    }

    public List<StudentDto> queryFromDatabase(int idLessThan) {

        return tmp.query("select id,first_name,last_name from user_entity where id<? ", 
        		preparedStatement -> preparedStatement.setInt(1, idLessThan), (resultSet, i) -> {
            StudentDto StudentDto = new StudentDto();
            StudentDto.setId(resultSet.getInt("id"));
            StudentDto.setFullName(resultSet.getString("full_name"));
            return StudentDto;
        });


    }

    public void delete() {
        int rowsDeleted = tmp.update("delete from user_entity where id<10");
        System.out.println("Number of rows deleted = " + rowsDeleted);

    }
}
