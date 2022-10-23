package com.debjit.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.debjit.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 3, message = "Username must be minimum of 3 characters!")
	private String name;
	
	@Email(message = "Email address is not valid!!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be within 3 to 10 characters...!!")
	private String password;
	
	@NotNull
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
	
	
}
