package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Karen Y.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "karenlyuan";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-14");
        team.addMember("Karen Y");
        team.addMember("Shruthi S");
        team.addMember("Andrew Z");
        team.addMember("Ryan C");
        team.addMember("Siddhi M");
        team.addMember("Chloe A");
        return team;
    }
}
