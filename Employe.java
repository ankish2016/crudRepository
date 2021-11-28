package empAdress.curd.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data

public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;

	@Size(min = 4, max = 7, message = "name field is required minum char 4 and max 7")
	// @NotBlank(message = "name field is required")
	private String empName;

	private EmpDepartment empDepartment;
	@Pattern(regexp = "^\\d+$", message = "use the number only ")
	private String empAge;

	// @NotBlank
	// @Column(unique = true)
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "write down proper @gmail.com format ")
	private String empEmail;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "empId")
	private List<Address> adress;
}
