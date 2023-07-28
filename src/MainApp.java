import datatype.Loan;
import datatype.Person;

import java.util.List;

public class MainApp {

    public static void main(String args[]) {

        /*
         * Sachin	Aashish	20
         * Sanjib	Sachin	70
         * Aashish	Sanjib	40
         * Aashish	Manu	100
         */

        Person sachin = new Person();
        sachin.setName("Sachin");
        sachin.setId(1l);
        Person aashish = new Person();
        aashish.setName("Aashish");
        aashish.setId(2l);
        Person sanjib = new Person();
        sanjib.setName("Sanjib");
        sanjib.setId(3l);
        Person manu = new Person();
        manu.setName("Manu");
        manu.setId(4l);

        sachin.getAmountOwnedFrom().add(new Loan(aashish.getId(), aashish.getName(), 20));
        sanjib.getAmountOwnedFrom().add(new Loan(sachin.getId(), sachin.getName(), 70));
        aashish.getAmountOwnedFrom().add(new Loan(sanjib.getId(), sanjib.getName(), 40));
        aashish.getAmountOwnedFrom().add(new Loan(manu.getId(), manu.getName(), 100));


        List<Person> participants = List.of(sachin, sanjib, aashish, manu);

        System.out.println("Starting the app");
        Splitwise app = new Splitwise(participants);
        List<Person> view1 = app.getSimplifiedView();
        System.out.println(view1);
//        List<Person> view2 = app.getDetailed();
//        System.out.println(view2);
    }
}