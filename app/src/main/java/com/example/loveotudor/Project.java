package com.example.loveotudor;

public class Project {
    private String projectName;
    private int projectImageId;
    private String projectDetails;

    public Project(String projectName, int projectImageId, String projectDetails) {
        this.projectName = projectName;
        this.projectImageId = projectImageId;
        this.projectDetails = projectDetails;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getProjectImageId() {
        return projectImageId;
    }

    public String getProjectDetails() {
        return projectDetails;
    }
}
