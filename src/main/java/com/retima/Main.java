package com.retima;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.instance();
        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.GUI, "true"); // Enable the GUI

        AgentContainer container = runtime.createMainContainer(profile);

        try {
            // Use the fully qualified class name
            AgentController helloAgent = container.createNewAgent("HelloAgent", "com.retima.HelloAgent", null);
            helloAgent.start();

            AgentController hiAgent = container.createNewAgent("HiAgent", "com.retima.HiAgent", null);
            hiAgent.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}