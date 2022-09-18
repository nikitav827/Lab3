import java.util.*;

public class AddressBook {
    ArrayList <BuddyInfo> buddyInfoList = new ArrayList<>();


    public void addBuddy(BuddyInfo buddyInfo){
        buddyInfoList.add(buddyInfo);
    }
    public boolean removeBuddy(BuddyInfo buddyInfo){
        boolean returnVal = buddyInfoList.remove(buddyInfo);
        return returnVal;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddyInfo = new BuddyInfo("Bob");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);

        System.out.println("ArrayList size:" + addressBook.buddyInfoList.size());
        addressBook.removeBuddy(buddyInfo);
        System.out.println("ArrayList size:" + addressBook.buddyInfoList.size());
        }







}


