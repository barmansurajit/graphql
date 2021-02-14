package com.learn.graphql.resolver.bank;

import com.learn.graphql.domain.bank.BankAccount;
import com.learn.graphql.domain.bank.Customer;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Component
public class CustomerResolver implements GraphQLResolver<BankAccount> {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime()
            .availableProcessors());

    public CompletableFuture<Customer> customer(BankAccount bankAccount) {
        return CompletableFuture.supplyAsync(() -> {
            log.info("Requesting customer data for bank account ID - {}", bankAccount.getId());
            return Customer.builder()
                    .id(UUID.randomUUID())
                    .firstName("Andy")
                    .lastName("Jassy")
                    .build();
        }, executorService);
    }
}
