package org.example;

public class StrategyImpl1 extends DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        super.operationStrategy();                     // d'abord la stratégie par défaut
        System.out.println("Stratégie 1");             // puis la particularité de la 1
    }
}
