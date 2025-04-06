package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_different_class() {
        assertEquals(false, team.equals("not a team"));
    }

    @Test
    public void equals_names_and_members_same() {
        Team other_team = new Team("test-team");
        assertEquals(true, team.equals(other_team));
    }

    @Test
    public void equals_different_members() {
        Team other_team = new Team("test-team");
        other_team.addMember("Joe");
        assertEquals(false, team.equals(other_team));
    }

    @Test
    public void equals_different_name() {
        Team other_team = new Team("different-team");
        assertEquals(false, team.equals(other_team));
    }

    @Test
    public void hashCode_returns_correct_hashcode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        // Team t2 = new Team();
        // t2.setName("foo");
        // t2.addMember("bar");

        // assertEquals(t1.hashCode(), t2.hashCode());

        int expectedResult = t1.getName().hashCode() | t1.getMembers().hashCode();

        assertEquals(expectedResult, t1.hashCode());
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
