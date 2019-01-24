package com.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sid.dao.AgentRepository;
import com.sid.entities.Agent;

@SpringBootApplication
public class NourSecurityApplication implements CommandLineRunner {

	
	@Autowired
	private AgentRepository agentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NourSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		//agentRepository.save(new Agent("ahmed","ahmed",df.parse("12/01/1989"),"Tunis","zahrouni","25218852"));
		
		
	}

}

