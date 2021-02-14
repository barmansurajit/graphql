package com.learn.graphql.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
@Builder
public class BankAccount {
    UUID id;
    Customer customer;
    List<Asset> assets;
    Currency currency;
}
