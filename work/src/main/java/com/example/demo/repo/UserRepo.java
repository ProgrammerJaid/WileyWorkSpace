package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

	Optional<User> findById(int id);

	List<User> findByFirstName(String name);

	List<User> findByFirstNameOrLastNameAllIgnoreCase(String name, String name1);

	List<User> findDistinctUserByFirstNameOrderByLastNameDesc(String name);

	List<User> findDistinctUserByFirstNameOrLastNameOrderByLastNameDesc(String name, String name1);

	List<User> findDistinctUserByFirstNameOrLastNameOrderByLastNameAsc(String name, String name2);

	// TODO: Q.)Find user based on highest length of user name
//	@Query(value="SELECT first_name,last_name FROM full_name ORDER BY "
//			+ "(SELECT SUM(LEN(first_name)+LEN(last_name)) FROM fullname)",nativeQuery = true)
//	List<User> getUserByStringLength();

	@Query(value = "SELECT f.* FROM fullname f", nativeQuery = true)
	List<User> getUsers();

	@Query(value = "SELECT f.* FROM fullname f where f.first_name LIKE ?%", nativeQuery = true)
	List<User> findUserLike(String name);

	// TODO:Procedure calling
}
