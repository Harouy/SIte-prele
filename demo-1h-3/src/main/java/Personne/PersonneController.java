package Personne;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class PersonneController {
private final PersonneService Service;
@Autowired
private PersonneController(PersonneService Service) {
	this.Service=Service;
	
}
@GetMapping
public Object getperso(Personne p) {
return 	Service.getpersonne(p);
	
}
@PostMapping
public void register( @RequestBody Personne p) {
	Service.create(p);;
}
}
