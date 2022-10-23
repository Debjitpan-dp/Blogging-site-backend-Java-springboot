package com.debjit.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {

	private String username;  // which is email
	
	private String password;
}
