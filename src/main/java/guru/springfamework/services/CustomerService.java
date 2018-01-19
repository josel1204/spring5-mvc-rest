package guru.springfamework.services;

import java.util.List;

import guru.springfamework.api.v1.model.CustomerDTO;

/**
 * Created by jt on 9/26/17.
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);
    
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
}
