package com.learn.graphql.domain.bank.input;

import lombok.Data;

@Data
public class CreateBankAccountInput {
    private String firstName;
    private String lastName;
}
