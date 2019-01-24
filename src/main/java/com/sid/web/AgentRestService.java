package com.sid.web;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sid.dao.AgentRepository;
import com.sid.entities.Affectation;
import com.sid.entities.Agent;
import com.sid.entities.TravailleAPk;

@RestController
public class AgentRestService{
	@Autowired
	private AgentRepository agentRepository;
	
	@RequestMapping(value="/addAgent", method=RequestMethod.POST)
	public Agent addAgent(@RequestBody Agent a) {
		return agentRepository.save(a);
		
	}
	
	@RequestMapping(value="/getAllAgent", method=RequestMethod.GET)
	public List<Agent> addAgent() {
		return agentRepository.findAll();
		
	}
	
	@RequestMapping(value="/getAgentById/{idAgent}", method=RequestMethod.GET)
	public Optional<Agent> getAgentById(@PathVariable Long idAgent) {
		return agentRepository.findById(idAgent);
	}
	
	
	@RequestMapping(value="/chercherAgent", method=RequestMethod.GET)
	public Page<Agent> chercher(@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0")int page,
			@RequestParam(name="size", defaultValue="5")int size
			){
		return agentRepository.chercher("%"+mc+"%", new PageRequest(page, size));
	}
	
	
   
   
   @RequestMapping(value="/deleteAgent/{id}", method=RequestMethod.DELETE)
	public boolean DeleteContact(@PathVariable Long id) {
		agentRepository.deleteById(id);
		return true;
	}

}
