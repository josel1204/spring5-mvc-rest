package guru.springfamework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner{

    private CategoryRepository categoryRespository;
    private CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRespository, CustomerRepository customerRepository) {
		this.categoryRespository = categoryRespository;
		this.customerRepository = customerRepository;
	}

	@Override
    public void run(String... args) throws Exception {
    	loadCustomers();
    	loadCategories();
    }

	private void loadCustomers() {
		Customer customer = new Customer();
		customer.setId(1L);
		customer.setFirstname("Luis");
		customer.setLastname("Mendez");
		customerRepository.save(customer);
		
		customer = new Customer();
		customer.setId(2L);
		customer.setFirstname("Elizabeth");
		customer.setLastname("Ramirez");
		customerRepository.save(customer);
	}

	private void loadCategories() {
		Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRespository.save(fruits);
        categoryRespository.save(dried);
        categoryRespository.save(fresh);
        categoryRespository.save(exotic);
        categoryRespository.save(nuts);
        System.out.println("Data Loaded = " + categoryRespository.count() );
	}
}
