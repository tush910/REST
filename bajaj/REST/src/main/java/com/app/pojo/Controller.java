package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {

	
	
	@PostMapping()
	public ResponseEntity<?> addProduct(@RequestBody Data d)
	{
		System.out.println("In Testdfdfd");
		char [] arr = d.getData();
		
		User_Status u = new User_Status();
		if(arr.length>0)
		{
			u.setStatus("true");
		}
		else
			u.setStatus("false");
		u.setUserid("tush021");
		u.setEmailid("tusharkaushik09@gmail.com");
		u.setRoll(1214);
		List<Character> no =new ArrayList<>();
		List<Character> ch =new ArrayList<>();
		for(int i=0; i<arr.length; i++)
		{
			char c = arr[i];
			
			if(Character.isDigit(c))
				no.add(((c)));
			else if(Character.isLetter(c))
				ch.add(c);
		}
		char [] temp = new char [no.size()];
		for(int i=0; i<temp.length; i++)
		{
			temp[i]=no.get(i);
			
		}
		char [] temp2 = new char [ch.size()];
		for(int i=0; i<temp.length; i++)
		{
			temp2[i]=ch.get(i);
		}
		u.setNum(temp);
		u.setCharacter(temp2);
		return new ResponseEntity<>(u, HttpStatus.OK);
	}
}