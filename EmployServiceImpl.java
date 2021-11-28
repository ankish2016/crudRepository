package empAdress.curd.serviceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import empAdress.curd.Model.Employe;
import empAdress.curd.Repository.EmployeRepository;
import empAdress.curd.service.EmployService;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;

@Service
public class EmployServiceImpl implements EmployService {

	@Autowired
	private EmployeRepository employeRepository;

	public Employe AddEmploy(Employe employ) {

		return this.employeRepository.save(employ);
	}

	@Override
	public Employe getEmployById(long employId)   {
		Employe emp=null;
		try
		{
		 emp = this.employeRepository.findById(employId).get(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emp;
	}

	public List<Employe> getAllEmployes() {

		return this.employeRepository.findAll();
	}

	@Override
	public void deleteEmploy(Long employId) {
//		try {

			this.employeRepository.deleteById(employId);
//		} catch (Exception e) {
//			System.out.println("id is not available");
//		}
	}
}
