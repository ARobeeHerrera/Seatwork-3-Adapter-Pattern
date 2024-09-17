package AttendanceSystem;

import Factory.SchoolManagementApp;

public class AttendanceAdapter implements SchoolManagementApp {
    Attendance attendance ;

    public AttendanceAdapter(Attendance attendance) {
        this.attendance = attendance;
    }
    @Override
    public String integrateSystem() {
        return attendance.markAttendance();
    }
}
