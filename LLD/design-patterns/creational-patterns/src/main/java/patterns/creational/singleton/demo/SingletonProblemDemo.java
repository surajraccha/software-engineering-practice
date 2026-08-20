package patterns.creational.singleton.demo;

import patterns.creational.singleton.problem.ConfigManagerProblem;

public class SingletonProblemDemo {
    public static void main(String[] args) {
        ConfigManagerProblem startupConfig = new ConfigManagerProblem();
        startupConfig.set("environment", "production");

        ConfigManagerProblem billingConfig = new ConfigManagerProblem();

        System.out.println("Startup config: " + startupConfig.identity());
        System.out.println("Billing config: " + billingConfig.identity());
        System.out.println("Startup environment: " + startupConfig.get("environment"));
        System.out.println("Billing environment: " + billingConfig.get("environment"));
        System.out.println("Problem: every caller can create a separate config object.");
    }
}
