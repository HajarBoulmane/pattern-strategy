package org.example;

public class Context {
    private Strategy strategy = new DefaultStrategyImpl();

    public void effectuerOperation() {
        System.out.println("***** Début de l'opération *****");
        strategy.operationStrategy();
        System.out.println("***** Fin de l'opération *****");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
