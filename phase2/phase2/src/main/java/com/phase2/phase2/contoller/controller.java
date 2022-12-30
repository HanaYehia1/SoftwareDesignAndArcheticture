package com.phase2.phase2.contoller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phase2.phase2.model.account;
import com.phase2.phase2.service.serviceImp;
import com.phase2.phase2.service.serviceProducer;
import com.phase2.phase2.model.response;

@RestController
public class controller {

	List<account> list = new ArrayList<account>();
	 @Autowired
	    serviceImp Service = new serviceImp();
	    serviceProducer ser = new serviceProducer();
	@PostMapping("/user/signUp")
    public response signUp(@RequestParam("username") String username,@RequestParam("email")String email,@RequestParam("password")String password) 
	{
        boolean res = Service.signUp(username,email,password);
        response response = new response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("account Already Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("account created successfully");
        return response;
    }
	@PostMapping("/user/signIn")
	public response sigIn(@RequestParam("email") String email,@RequestParam("password")String password) 
	{
        boolean res = Service.signIn(email,password);
        response response = new response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("Account doesn't exist");
            return response;
        }
        response.setStatus(true);
        response.setMessage("Successfully signed in");
        return response;
    }
	
	@GetMapping("/user/search")
	public ArrayList<String> search(@RequestParam("s")String s)
	{ 
		ArrayList<String> str=new ArrayList<>();
		str=ser.searchService(s);
	 	return str;
	}
}
