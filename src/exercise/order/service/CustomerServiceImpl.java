package exercise.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exercise.order.domain.Customer;
import exercise.order.repository.CustomerRepository;

@Component("customerService") // 데이터에 올리기
public class CustomerServiceImpl  implements CustomerService {
	
	@Autowired // 객체 주입하기
	private CustomerRepository repository; 
	
	
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}
	
	public void deleteCustomer(long id) {
		repository.delete(id);
	}
	
}
