package coder_amit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import coder_amit.entity.Load;
import coder_amit.services.LoadService;

@Controller
@RestController
public class MyController {
	@Autowired
	private LoadService loadservice;

	@GetMapping("/home")
	public String home() {
		return "this is homeage";
		
	}
	//Get the loads 
	
	@GetMapping("/load")
public List<Load> getLoades(){
		
		return this.loadservice.getLoades();	
	}
	
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String  loadId) {
		
		return this.loadservice.getLoad(Long.parseLong(loadId));
	}

	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load) {
		return this.loadservice.addLoad(load);
	}
	
	@PutMapping("/load/{loadId}")
	public Load updateLoad(@RequestBody Load load) {
return this.loadservice.updateLoad(load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public Load deleteLoad(@RequestBody Load load) {
		return this.loadservice.deleteLoad(load);
	}
	
	
}