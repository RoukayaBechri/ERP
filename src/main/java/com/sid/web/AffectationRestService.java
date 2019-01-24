package com.sid.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.dao.AffectationRepository;
import com.sid.entities.Affectation;
import com.sid.entities.TravailleAPk;

@RestController
public class AffectationRestService {
	
	@Autowired
	private AffectationRepository affectationRepository;
	
	@RequestMapping(value="/affectAgentToSite/{idAgent}/{idSite}", method=RequestMethod.PUT)
	public void affectAgentToSite(@PathVariable Long idAgent,@PathVariable Long idSite) {
		   TravailleAPk tapk=new TravailleAPk();
		   tapk.setIdAgent(idAgent);
		   tapk.setIdSite(idSite);
		   
		   Affectation a=new Affectation();
		   a.setTravailleAPk(tapk);
		   a.setDateDebut(new Date());
		   
		   affectationRepository.save(a);
		     
	   }
	
	

}
