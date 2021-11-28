package empAdress.curd.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import empAdress.curd.Model.Employe;

@Service
public interface EmployService
{
   public Employe AddEmploy(Employe employ);
   public Employe  getEmployById(long employId) throws Exception;
   public List<Employe> getAllEmployes();
   public void deleteEmploy(Long employId);

}
