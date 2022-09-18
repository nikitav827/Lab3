import java.util.*;

public class AddressBook {
    //BuddyInfo buddyInfo = new BuddyInfo();
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

        }







}


