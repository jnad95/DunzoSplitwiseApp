package datatype;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long id;
    private String name;
    private List<Loan> amountOwnedFrom;
    private List<Loan> amountOwedTo;

    public Person() {
        amountOwnedFrom = new ArrayList<>();
        amountOwedTo = new ArrayList<>();
    }

    public Person(Long id, String name, List<Loan> amountOwnedFrom, List<Loan> amountOwedTo) {
        this.id = id;
        this.name = name;
        this.amountOwnedFrom = amountOwnedFrom;
        this.amountOwedTo = amountOwedTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getAmountOwnedFrom() {
        return amountOwnedFrom;
    }

    public void setAmountOwnedFrom(List<Loan> amountOwnedFrom) {
        this.amountOwnedFrom = amountOwnedFrom;
    }

    public List<Loan> getAmountOwedTo() {
        return amountOwedTo;
    }

    public void setAmountOwedTo(List<Loan> amountOwedTo) {
        this.amountOwedTo = amountOwedTo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountOwnedFrom=" + amountOwnedFrom +
                ", amountOwedTo=" + amountOwedTo +
                '}';
    }
}
