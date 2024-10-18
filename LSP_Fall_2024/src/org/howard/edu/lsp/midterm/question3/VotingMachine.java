package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidates;

    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // Add a candidate to the list
    public void addCandidate(String name) {
        candidates.put(name, 0);  // Initially zero votes
    }

    // Cast a vote for the candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate not found.");
        }
    }

    // Print the number of votes each candidate received
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}