package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	static int no;
	public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        no=n;
        findAns(0,0,"",ans);
        return ans;
    }
    
    private static void findAns(int op,int cl,String data,List<String> list){
        
        if(data.length()==no*2)
            list.add(data);
        
        if(op<no)
            findAns(op+1,cl,data+"(",list);
        
        if(cl<op)
            findAns(op,cl+1,data+")",list);
        
        return;
    }
}
