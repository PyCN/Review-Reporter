package com.azimo.tool.firebase.model;

import java.util.List;

/**
 * Created by F1sherKK on 17/01/17.
 */
public class CreatedIssuesList {

    private List<CreatedIssue> createdIssues;

    public CreatedIssuesList(List<CreatedIssue> createdIssues) {
        this.createdIssues = createdIssues;
    }

    public CreatedIssue get(int index) {
        return createdIssues.get(index);
    }

    public void add(CreatedIssue createdIssue) {
        createdIssues.add(createdIssue);
    }

    public List<CreatedIssue> getCreatedIssues() {
        return createdIssues;
    }

    public int size() {
        return createdIssues.size();
    }
}
