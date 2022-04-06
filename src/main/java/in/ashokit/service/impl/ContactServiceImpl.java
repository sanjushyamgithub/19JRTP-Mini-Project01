package in.ashokit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;
import in.ashokit.service.IContactService;

@Service
public class ContactServiceImpl implements IContactService {

	// Injected ContactRepository dependency 
	@Autowired
	private ContactRepository repo;
	
	@Override
	public boolean saveContact(Contact contact) {
		contact.setActiveSw("y");
		Contact c = repo.save(contact);
		
		if(c.getId()!=null) {
			return true;
		}
		return false;
		
	}

	/*
	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}
	*/

	@Override
	public boolean deleteContact(Integer id) {
		Optional<Contact> optional = repo.findById(id);
		if(optional.isPresent()) {
			 Contact contact = optional.get();
			 contact.setActiveSw("n");
			 repo.save(contact);
			 return true;
			 
		}
		
		return false;
		
	}

	@Override
	public Contact getContact(Integer id) {
		Optional<Contact> optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return repo.findAll();
	}

	@Override
	public boolean isPresent(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
