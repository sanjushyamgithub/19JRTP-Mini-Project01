package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface IContactService {

	public Integer saveContact(Contact contact);
	public void updateContact(Contact contact);
	public void deleteContact(Integer id);
	public Contact getContact(Integer id);
	public List<Contact> getAllContacts();
	public boolean isPresent(Integer id);
}
