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
    ArrayList<String> ZonedDateTime = new ArrayList<>();
 
    Timestamp timestamp = new Timestamp(Instant);
    ZonedDateTime zdt = new ZonedDateTime();
    Random random = new Random();
    String space = " "; //since java is shit and can't let me see if a byte contains
    Scanner scanner = new Scanner(System.in);
    boolean isSignedIn;

    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> groupChats = new ArrayList<>();
    
    byte latestVerifiedPinHash;
    byte latestVerifiedUser;


    public void signInPromt(String space, String Username) {
        System.out.println("Please create your username");
        Username = scanner.nextLine();
        if(Username.contains(space)) {
            System.out.println("Your username can not have a space");
            signInPromt(null);
        } else if(Username.length()>16) { 
            System.out.println("Name is too long, make sure its less than 16 letters");
            if(Username.length()>6) {
            	System.out.println("Name is too short, make sure it is more than 6 letters");
            }
            signInPromt(null);
            
        }
    }
    public void logInPromt(String Username, List verifiedUserList) {
         ArrayList<String> verifiedUserList = String.getList();
        System.out.println("what is your username?");
        Username = scanner.nextLine();
        if(verifiedUserList.contains(Username)) {
            System.out.println("This username is already taken!");
        }
    }

    public void verifyPinHash(byte PinHash, byte LatestPinHash, List verifiedPinHashList )  {
        if (verifiedPinHashList.contains(LatestPinHash)) {
            verifiedPinHashList.add(LatestPinHash);
        } else {
            System.out.println("error: wrong password, try again");
            logInPromt(null);


        }

    }
    public void verifyUser(byte LatestUser, boolean isSignedIn) {
        List <String> verifiedUserList = new ArrayList<>();
    if(isSignedIn == true) {
        verifiedUserList.add(LatestUser);
    } else {
        System.out.println("sign in before verifying");
    }
    ArrayList <byte[]> verifiedPinHashList = new ArrayList<byte[]>();
}
public void verifyIP() {
    //can't pull ip 😦
}
public void verifyHWID() {
    //not sure if I can do this with only jre
}
public void comparePinHash(List verifiedUserList, byte LatestUser, byte LatestPinHash, List PinHashList, 
		List verifiedPinHashList) {
    if(  verifiedPinHashList.contains(LatestPinHash)) {
        verifiedUserList.add(LatestUser);
    } else {
        System.out.println("error: wrong password");
    	}
    }
public void chatLogger(List verifiedUserList, int messageCount, String message) {
    ArrayList<String> chatLogs = new ArrayList<>();
    this.chatLogs.add(List verifiedUserList);
    if(messageCount != null) {
        chatLogs.add(this.message);
    }
public  groupLogger(int groupCount) {
    if(groupCount++)
        System.out.println(latestGroup );
		}
    }


    public void getNewUserUUID(String Useruuid, boolean isUnique) {
        if(int a = 0; isUnique = false; a++) {
             this.Useruuid = (String)random.nextInt(10);
        }
    public String getNewAccountUUID() {

    }
    public void isUnique(List verifiedUserList) {
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
    public void checkVersion(String currentVersion, String latestVersion, boolean isOnLatestVersion) {
    	if(currentVersion != latestVersion) {
    		isOnLatestVersion = false;
    	}
    		System.out.printf("Please update your client, further directions on github repository %n "
    				+ "(https://github.com/Martiemche/ChatApp)");
    	}
    public String getLatestVerifiedUser() {
    	if() {
    		
    	}
    }
    public byte getLatestVerifiedPinHash() {
    	
    }
    public void getLastItem() {
    	 try {
    		 int e = Scanner.lastList.size() - 1;
    	 } catch(Exception IndexOutOfBoundsException)  {
    		 IndexOutOfBoundsException.printStackTrace();
    		 System.out.println("Caught IndexOutOfBoundsException");
    	 	}
    	 }
    public void lastLine() {
    	Scanner inStream = null;
        String test = "";

        inStream = new Scanner( test );

        while(inStream.hasNextLine() )
        {
            System.out.println(inStream.nextLine() );
    }
    }
    	}	

