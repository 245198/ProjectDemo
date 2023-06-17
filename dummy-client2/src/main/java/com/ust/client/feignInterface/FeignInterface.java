package com.ust.client.feignInterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.client.domain.JwtRequest;




@FeignClient(value="dummy-client2",url="http://localhost:8085")
public interface FeignInterface {
	
	@PostMapping("/authenticate")
    ResponseEntity<JwtRequest> postEndpoint(@RequestBody JwtRequest request);

}

