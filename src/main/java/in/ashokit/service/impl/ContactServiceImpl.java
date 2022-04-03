package in.ashokit.service.impl;

import java.util.List;

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
	public Integer saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContact(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact getContact(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPresent(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
