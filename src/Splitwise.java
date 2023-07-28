import datatype.Person;

import java.util.List;

public class Splitwise {

    private final List<Person> participants;

    private final LoanSimplifier loanSimplified;

    public Splitwise(List<Person> participants) {
        this.participants = participants;
        loanSimplified = new LoanSimplifierImpl();
    }

    public List<Person> getSimplifiedView() {

        return participants;
    }

    public List<Person> getDetailed() {
        return loanSimplified.simplify(participants);
    }
}
