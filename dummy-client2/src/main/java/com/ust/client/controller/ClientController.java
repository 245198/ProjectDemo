package com.ust.client.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.client.feignInterface.FeignInterface;


@RestController
@RequestMapping("/auth/request")
public class ClientController {
	
	@Autowired
	FeignInterface interface1;
	
	
}
