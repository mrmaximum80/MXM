package lesson14;

import java.util.List;

public class Contact implements Comparable<Contact> {

    private String name;
    private String phoneNumber;
    private String Operator;
    private Integer count = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public void countIncrement() {
        this.count++;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int compareTo(Contact o) {
        return this.getCount().compareTo(o.getCount());
    }
}
