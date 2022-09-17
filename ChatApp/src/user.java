import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.security.MessageDigest;
public class user {


         private String FirstName;
         private String LastName;
         private String Useruuid;
         private String Accountuuid;

        private String UserName;
        private Byte PinHash;

        private String Password;
        private String LatestPassword;

        private String latestMessage;

        private int messageCount;
        private int groupchatCount;



        boolean isSignedin;
        boolean isVerified;
        boolean isUnique;
        boolean isEmpty;

        String LatestUser;
        byte LatestPinHash;

        private String month;
         private int day;
         private int year;

         private String DateOfBirth = month + day + year;

    public void AddUser(String FirstName, String LastName, String month, String day, String year) {
        ArrayList <String> FirstNameList = new ArrayList<String>();
        ArrayList <String> LastNameList = new ArrayList<String>();
        ArrayList <String> PinHashList= new ArrayList<String>();
        ArrayList <String> DateOfBirthList= new ArrayList<String>();
    }
    public void RemoveUser(String FirstNameList, String LastNameList) {

        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
                //add prompt
        FirstNameList.remove(id);
        }
    public void encrypt (String Password) {
        MessageDigest.getInstance("MD5");
        this.PinHash = digest(Password.getBytes());

    }
    public String getName(String FirstName, String LastName) {
        return FirstName;
        return LastName;
    }
    public byte getPinHash(byte PinHash) {
        return PinHash;
    }
    public int getYear(int year) {
        return year;
    }
    public String getMonth(String month) {
        return month;
    }
    public int getDay(int Day) {
        return Day;
    }
    public String getDateOfBirth(String DateOfBirth) {
        return DateOfBirth;
    }
    public ArrayList<String> getVerifiedUsers() {
        return VerifiedUsers;
    }
    public byte ArrayList<byte> getPinHashes() {
        return PinHashes;
    }
    public byte getLatestPinHash() {
    	return LatestPinHash;
    }
    public ArrayList<String> getList() {
        return ArrayList<String>;
    }
    public String getVerifiedUser(String verifiedUser) {
        return verifiedUser;
    }
    public void isEmpty(boolean isEmpty) {
    	if(value)
    }
   
    
    
    
    
    
    }