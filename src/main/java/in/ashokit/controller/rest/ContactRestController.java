package in.ashokit.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Contact;
import in.ashokit.service.IContactService;

@RestController
@RequestMapping("contacts-rest")
public class ContactRestController {

	//Injected IContactService dependency 
	@Autowired
	private IContactService service;
	
	//save contact
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Contact contact){
	
		return null;
	}
	
	//update contact
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Contact contact){
		
		return null;
	}
	//delete a contact
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		ResponseEntity<?> resp=null;
		
		resp=new ResponseEntity<String>("Deleted successfully "+id,HttpStatus.OK);
		
		return resp;
	}
	
	//get a contact 
	@GetMapping("/get/{id}")
	public ResponseEntity<?> get(@PathVariable Integer id){
		return null;
	}
	//get all contacts
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
	
		return null;
	}
}
