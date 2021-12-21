package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Owner implements Cloneable, Comparable<Owner> {

    private String owner;
    private String ownerNumber;
    private String ownerOperator;
    private List<Contact> ownerPhoneBook;
    private Integer count = 0;                      // счетчик, сколько раз номер встречается в других записных книжках

    public Owner() {
    }

    public Owner(Owner copy) {
        this.owner = copy.owner;
        this.ownerNumber = copy.ownerNumber;
        this.ownerOperator = copy.ownerOperator;
        this.ownerPhoneBook = copy.ownerPhoneBook;
        this.count = copy.count;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getOwnerOperator() {
        return ownerOperator;
    }

    public void setOwnerOperator(String ownerOperator) {
        this.ownerOperator = ownerOperator;
    }

    public List<Contact> getOwnerPhoneBook() {
        return ownerPhoneBook;
    }

    public void setOwnerPhoneBook(List<Contact> ownerPhoneBook) {
        this.ownerPhoneBook = ownerPhoneBook;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void countIncrement() {
        this.count++;
    }

    @Override
    public int compareTo(Owner o) {
        return this.getCount().compareTo(o.getCount());
    }

}
