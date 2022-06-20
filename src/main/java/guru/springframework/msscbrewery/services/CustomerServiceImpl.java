package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Brice Tangang")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo implement update customer
        log.debug("update customer");
    }

    @Override
    public void deleteById(UUID customerId) {
        //todo implement deleteby id
        log.debug("delete customer");
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return  CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Brice Tangang")
                .build();
    }
}
