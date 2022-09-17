import java.security.MessageDigest;
import java.security.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; 
import java.time.ZonedDateTime;
public class signin {
    ArrayList<String> Timestamps = new ArrayList<>();


    Timestamp timestamp = new Timestamp(Instant.now());
    ZonedDateTime zdt = new ZonedDateTime.now();
    Random random = new Random();
    String space = " "; //since java is shit and can't let me see if a byte contains
    Scanner scanner = new Scanner(System.in);
    boolean isSignedIn;

    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> groupChats = new ArrayList<>();


    public void signInPromt(byte space, String UserName) {
        System.out.println("Please create your username");
        UserName = scanner.nextLine();
        if(UserName.contains()(space)) {
            System.out.println();
            signInPromt(null);
        } else if(UserName.length()>16) { 
            System.out.println("Name is too long, make sure its less than 16 letter");
            signInPromt(null);
        }
    }
    public void logInPromt(String Username, List verifiedUserList) {
         ArrayList<String> verifiedUsers = String.getList();
        System.out.println("what is your username?");
        UserName = scanner.nextLine();
        if(verifiedUserListUserName.contains(this.Username)) {
            System.out.println("This username is already taken!");
        }
    }

    public void verifyPinHash(byte PinHash, byte LatestPinHash, List verifiedPinHashes)  {
        if (LatestPinHash.isVerified == true) {
            verifiedPinHashes.add(LatestPinHash);
        } else {
            System.out.println("error: wrong password, try again");
            logInPromt(null);


        }

    }
    public void verifyUser(byte LatestUser, boolean isSignedIn) {
        List <String> verifiedUsers = new ArrayList<>();
    if(isSignedIn == true) {
        verifiedUsers.add(LatestUser);
    } else {
        System.out.println("sign in before verifying");
    }
    ArrayList <byte[]> verifiedPinHashes = new ArrayList<byte[]>();
}
public void verifyIP() {
    //can't pull ip 😦
}
public void verifyHWID() {
    //not sure if I can do this with only jre
}
public void comparePinHash(List verifiedUsers, byte LatestUser, byte LatestPinHash, List PinHashList) {
    if(LatestPinHash :: PinHashList) {
        verifiedUsers.add(LatestUser);
    } else {
        System.out.println("error: wrong password");

    }
public void chatLogger(ArrayList verifiedUsers, int messageCount) {
    ArrayList<String> chatLogs = new ArrayList<>();
    this.chatLogs.add(Arraylist verifiedUsers);
    if(messageCount != null) {
        chatLogs.add(this.message);
    }
public  groupLogger(int groupCount) {
    if(groupCount++)
        System.out.println(latestGroup );
    }


    public void getNewUserUUID(String Useruuid, boolean isUnique) {
        if(int a = 0; isUnique = false; a++) {
             this.Useruuid = (String)random.nextInt(10);
        }
    public String getNewAccountUUID() {

    }
    public void isUnique(List verifiedUsers) {
        if(getVerifiedUser.contains())
    }
    public int messageCount(List messages, List groupChats) {
        if()
    }
    public int groupchatCount() {

    }
    public String timestampToString(Timestamp timestamp, ZonedDateTime zdt) {
        this.timestamp = timestamp;
        this.zdt = zdt;
        if(timestamp | zdt) {

        }
    }
    public String getTimeStamp(Timestamp timestamp) {

    }

    public byte generateToken() {
        ArrayList<byte> Token = new ArrayList<>();

        if(Token != null)
            if() ArrayList.isCreated {
                Token.add()
                if(Token.length++) {

                }
            }

    }
}
