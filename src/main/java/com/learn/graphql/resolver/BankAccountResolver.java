package com.learn.graphql.resolver;

import com.learn.graphql.domain.BankAccount;
import com.learn.graphql.domain.Currency;
import com.learn.graphql.domain.Customer;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id){
        log.info("Finding bank account id: {}", id);
        return BankAccount.builder()
                .id(id)
                .customer(Customer.builder()
                        .id(UUID.randomUUID())
                        .firstName("Andy")
                        .lastName("Jassy")
                        .build())
                .currency(Currency.USD)
                .build();
    }
}