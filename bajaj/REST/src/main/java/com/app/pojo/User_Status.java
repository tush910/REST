
package com.app.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User_Status {

	private String status;
	private String userid;
	private String emailid;
	private int roll;
	private char[] num;
	private char [] character;
}
