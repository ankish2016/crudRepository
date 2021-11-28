package empAdress.curd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import empAdress.curd.Model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> 
{
	

}
