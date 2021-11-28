package empAdress.curd.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import empAdress.curd.Exception.ResourceNotFoundException;
import empAdress.curd.Model.Employe;
import empAdress.curd.service.EmployService;
@CrossOrigin("*")
@RestController
public class EmployController {
	@Autowired
	private EmployService employService;

 
	
	
	@PostMapping("/SaveEmploy")
	public ResponseEntity<Employe> addEmploy(@Valid @RequestBody Employe employ) {
		Employe addEmploy = null;
		try {
			addEmploy = this.employService.AddEmploy(employ);
			return ResponseEntity.of(Optional.of(addEmploy));
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@GetMapping("/getEmploy/{empId}")
	public ResponseEntity<?> getEmployId(@PathVariable("empId") long empId) throws Exception {

		Employe employById = this.employService.getEmployById(empId);
		if (employById == null) {
			   throw new ResourceNotFoundException("Not found Tutorial with id = " + empId);

		}

		return ResponseEntity.of(Optional.of(employById));
	}

	@GetMapping("/getAllEmp")
	public ResponseEntity<List<Employe>> getAllEmployes() {
		List<Employe> allEmployes = this.employService.getAllEmployes();
		if (allEmployes.size() <= 0) {
			 throw new ResourceNotFoundException("Not found employ with id = ");
		}

		return ResponseEntity.of(Optional.of(allEmployes));
	}

	@DeleteMapping("/deleteEmp/{empId}")
	public ResponseEntity<HttpStatus> DeleteEmploy(@PathVariable("empId") long empId) {		
			this.employService.deleteEmploy(empId);	
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}
	
}
