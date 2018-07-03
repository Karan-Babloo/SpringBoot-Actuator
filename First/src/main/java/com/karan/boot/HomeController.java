package com.karan.boot;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.karan.JerseyRest.Student;


@Controller
public class HomeController {

	//@Produces(MediaType.APPLICATION_JSON)
	//@RequestMapping("karan")
	
	@RequestMapping(value = "/karan", produces = { "application/json", "application/xml" })
	public @ResponseBody String Method() throws JsonProcessingException
	
	
	
	{
	System.out.println("hello");
	
	List<Student> st=new ArrayList<Student>();
	
	Student s=new Student("karan",1,"4700");
	Student s1=new Student("pavan",0,"Richardson");
	
	
	st.add(s);
	st.add(s1);
	//System.out.println(s);
	ObjectMapper mapper = new ObjectMapper();
	String mk = mapper.writeValueAsString(st);
	System.out.println(mk);
	return mk;
	}
	
}
