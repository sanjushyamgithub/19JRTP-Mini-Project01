package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import in.ashokit.entity.Contact;

public interface IContactService {

	public boolean saveContact(Contact contact);
	//public void updateContact(Contact contact);
	public boolean deleteContact(Integer id);
	public Contact getContact(Integer id);
	public List<Contact> getAllContacts();
	public boolean isPresent(Integer id);
}
