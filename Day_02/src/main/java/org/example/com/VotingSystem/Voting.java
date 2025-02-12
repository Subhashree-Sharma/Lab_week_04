package org.example.com.VotingSystem;

//main class
public class Voting{
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        //casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        //display votes in order of casting
        votingSystem.displayVotesInOrder();

        //display votes in sorted order
        votingSystem.displaySortedVotes();
    }
}