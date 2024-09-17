package GradingSystem;

import Factory.SchoolManagementApp;

public class GradingSystemAdapter implements SchoolManagementApp {
    GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }
    @Override
    public String integrateSystem() {
        return gradingSystem.recordGrades();
    }
}
