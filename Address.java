package empAdress.curd.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String country;
	private String state;
	private String city;
	private String locality;
   
	
}
