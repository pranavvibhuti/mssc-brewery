package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.Customer;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);
}