package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@NoArgsConstructor
@Entity
@XmlRootElement
@Table(name = "contact_tabl")
public class Contact {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String phone;
}
