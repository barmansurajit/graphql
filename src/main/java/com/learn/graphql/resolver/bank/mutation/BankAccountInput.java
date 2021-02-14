package com.learn.graphql.resolver.bank.mutation;

import com.learn.graphql.domain.bank.Currency;
import com.learn.graphql.domain.bank.input.CreateBankAccountInput;
import com.learn.graphql.domain.bank.BankAccount;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountInput implements GraphQLMutationResolver {
    public BankAccount createBankAccount(CreateBankAccountInput createBankAccountInput){
        log.info("Creating a bank account for {}", createBankAccountInput);
        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.USD)
                .build();
    }
}