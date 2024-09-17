import AttendanceSystem.*;
import GradingSystem.*;
import LibrarySystem.*;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean toRun = true;
        LocalDate now = LocalDate.now();

        while(toRun) {
            System.out.println("[1]: Mark Attendance");
            System.out.println("[2]: Record Grades");
            System.out.println("[3]: Manage Books");
            System.out.print("Select Option: ");
            Integer option = obj.nextInt();

            switch (option) {
                case 1:
                    AttendanceAdapter atAdpt = new AttendanceAdapter(new Attendance());
                    System.out.println(atAdpt.integrateSystem() + " on " + now +"\n"  );
                    break;
                case 2:
                    GradingSystemAdapter grdAdpt = new GradingSystemAdapter(new GradingSystem());
                    System.out.println(grdAdpt.integrateSystem()+"\n");
                    break;
                case 3:
                    LibrarySystemAdapter libAdpt = new LibrarySystemAdapter(new LibrarySystem());
                    System.out.println(libAdpt.integrateSystem()+"\n");
                    break;
                default:
                    System.out.println("Thank you");
                    toRun = false;
            }
        }
        obj.close();
    }
}