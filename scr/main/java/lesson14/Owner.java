package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Owner implements Cloneable {

    private String owners;
    private String ownerNumber;
    private String ownerOperator;
    private List<Contact> ownerPhoneBook;

    public Owner() {
    }

    public Owner(Owner copy) {
        this.owners = copy.owners;
        this.ownerNumber = copy.ownerNumber;
        this.ownerOperator = copy.ownerOperator;
        this.ownerPhoneBook = copy.ownerPhoneBook;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getOwner() {
        return owners;
    }

    public void setOwner(String owner) {
        this.owners = owner;
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
    
    public static void print (List<Owner> owners){
        for(int i = 0; i < owners.size(); i++){
            System.out.println(i + ". " + owners.get(i).getOwner() + ", тел.: " + owners.get(i).getOwnerNumber() + ", " +
                    owners.get(i).getOwnerOperator());
            System.out.println("----------------------------------------------------------------");
            List<Contact>phoneBook = owners.get(i).getOwnerPhoneBook();
            for (int j = 0; j < phoneBook.size(); j++){
                System.out.println(j + ". " + phoneBook.get(j).getName() + ", тел.: " + phoneBook.get(j).getPhoneNumber() +
                        phoneBook.get(j).getOperator());
            }
        }
    }

}
