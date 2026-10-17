package org.example;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("Stratégie par défaut");
    }
}