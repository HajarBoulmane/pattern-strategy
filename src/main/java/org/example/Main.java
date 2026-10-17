package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context ctx = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategyMap = new HashMap<>();

        while (true) {
            System.out.print("Quelle stratégie : ");
            String nomStrategy = scanner.next();
            if (nomStrategy.equals("quit")) break;
            try {
                Strategy strategy = strategyMap.get(nomStrategy);      // je cherche dans le cache
                if (strategy == null) {                                // pas encore créé
                    Class c = Class.forName("org.example.StrategyImpl" + nomStrategy);
                    strategy = (Strategy) c.getDeclaredConstructor().newInstance();
                    System.out.println("Création d'un nouvel objet");  // pour voir la différence
                    strategyMap.put(nomStrategy, strategy);            // je range dans le cache
                }
                ctx.setStrategy(strategy);
                ctx.effectuerOperation();
            } catch (Exception e) {
                System.out.println("Stratégie inexistante");
            }
        }
    }}