package office_hours.day_03_class_object_review;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ScrumTeam {

    ArrayList<Tester> testTeam = new ArrayList<>();

    public void hireTester(Tester tester){
        testTeam.add(tester);
    }

    public void fireTester(long employeeID){
       // Predicate<Tester> predicate = x -> x.employeeID == employeeID;

        testTeam.removeIf(x -> x.employeeID == employeeID);
    }

}
