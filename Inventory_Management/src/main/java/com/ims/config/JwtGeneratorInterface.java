package com.ims.config;

import java.util.Map;

import com.ims.dto.AdminDTO;

public interface JwtGeneratorInterface {
	Map<String, String> generateToken(AdminDTO user);

}
