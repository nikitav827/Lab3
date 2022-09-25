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
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddyInfoList.size()) {
            return buddyInfoList.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddyInfo = new BuddyInfo("Bob");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(0);
       System.out.println("ArrayList size:" + addressBook.buddyInfoList.size());

        // System.out.println("ArrayList size:" + addressBook.buddyInfoList.size());
        }







}


