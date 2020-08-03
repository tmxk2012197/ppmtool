package io.agileinelligence.ppmtool.exceptions;

public class ProjectNofFoundExceptionResponse {
    private String projectNotFound;

    public ProjectNofFoundExceptionResponse(String projectNotFound) {
        this.projectNotFound = projectNotFound;
    }

    public String getProjectNotFound() {
        return projectNotFound;
    }

    public void setProjectNotFound(String projectNotFound) {
        this.projectNotFound = projectNotFound;
    }
}
