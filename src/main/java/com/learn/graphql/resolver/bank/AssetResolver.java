package com.learn.graphql.resolver.bank;

import com.learn.graphql.domain.bank.Asset;
import com.learn.graphql.domain.bank.BankAccount;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Component
public class AssetResolver implements GraphQLResolver<BankAccount> {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime()
            .availableProcessors());

    public CompletableFuture<List<Asset>> assets(BankAccount bankAccount) {
        return CompletableFuture.supplyAsync(() -> {
            log.info("Getting assets of bank account id: {}", bankAccount.getId());
            return List.of(
                    Asset.builder().id(UUID.randomUUID()).build(),
                    Asset.builder().id(UUID.randomUUID()).build(),
                    Asset.builder().id(UUID.randomUUID()).build()
            );
        }, executorService);
    }
}
