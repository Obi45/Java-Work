import  java.util.Scanner;
public class Nokia3310{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter 1 to 13 to select options");
System.out.print("1. phone book\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. profiles\n13. Sim services\n");

 
int options = input.nextInt();
switch(options){
case 1:
System.out.println("phone book");
System.out.print("1. Search\n2. Service Nos\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b card\n8. options\n9. Speed dials\n10. Voice tag\n");

System.out.println("Enter 1 to 10 to view the phone book options");
int phoneBook = input.nextInt();
switch(phoneBook){
case 1: System.out.println("Search");
break;
case 2: System.out.println("Service Nos");
break;
case 3: System.out.println("Add name");
break; 
case 4: System.out.println("Erase");
break;
case 5: System.out.println("Edit");
break;
case 6: System.out.println("Assign tone");
break;
case 7: System.out.println("Send b card");
break;
case 8: System.out.println("Options");
System.out.print("1. type of view\n2. Memory statue\n");
System.out.println("Enter 1 to 2 for more options");
int option = input.nextInt();
switch(option){
case 1:System.out.println("type of view");
break;
case 2: System.out.println("Memory statue");
}
break;
case 9: System.out.println("Speed dial");
break;
case 10:System.out.println("Voice tag");
}
case 2: 
System.out.println("Messages");
System.out.print("1. Write messages\n2. inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Meesages settings\n8. Info service\n9. Voice mailbox number\n10. Service Command editor\n");

System.out.println("Enter 1 to 10 to view the messages");
int messages = input.nextInt();
switch(messages){
case 1: System.out.println("Write messages");
break;
case 2: System.out.println("inbox");
break;
case 3: System.out.println("Picture messages");
break;
case 4: System.out.println("Template");
break;
case 5: System.out.println("outbox");
break;
case 6: System.out.println("Smileys");
break;
case 7: System.out.println("message setting");
System.out.println("Set 1");
System.out.print("1. Message centre number\n2. Message sent as \n3. Message validity\n. ");
System.out.println("Enter 1 to 3 for more message settings");
int set = input.nextInt();
switch(set){
case 1: System.out.println("Message centre number");
break;
case 2: System.out.println("Message sent as");
break;
case 3: System.out.println("Message validity");
}
System.out.println("Common");
System.out.print("1. Delivery report\n2. Reply via same centre\n3. Character support\n");
System.out.println("Enter common settings from 1 to 3 ");
int common = input.nextInt();
switch(common){
case 1: System.out.println("Delivery report");
break;
case 2: System.out.println("Reply via same centre");
break;
case 3: System.out.println("character support");
}
break;
case 8: System.out.println("Info service");
break;
case 9: System.out.println("Voice mailbox number");
break;
case 10: System.out.println("Service Command editor");
}
case 3:
System.out.println("chat");

case 4:
System.out.println("Call register");
System.out.print("1. Miss calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost setting\n8. prepaid credit\n");

System.out.println("Enter 1 to 5 to view call register");
int callRegister = input.nextInt();
switch(callRegister){
case 1: System.out.println("missed calls");
break;
case 2: System.out.println("Received calls");
break;
case 3: System.out.println("Dialled numbers");
break;
case 4: System.out.println("Erase recent call lists");
break;
case 5: System.out.println("Show call duration");
System.out.print("1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled call duration\n5. Clear timers\n.");
System.out.println("Enter from 1 to 5 to access show call durations");
int callDuration = input.nextInt();
switch(callDuration){
case 1: System.out.println("last call duration");
break;
case 2: System.out.println("All call duration");
break;
case 3: System.out.println("Received call durations");
break;
case 4: System.out.println("dialled call duration");
break;
case 5: System.out.println("Clear timers");
}
break;
case 6: System.out.println("Show call costs");
System.out.print("1. Last call cost\n2. All call cost\n3. Clear counter\n.");
System.out.println("Enter 1 to 3 to access call cost");
int callCost = input.nextInt();
switch(callCost){
case 1: System.out.println("Last call cost");
break;
case 2: System.out.println("All call cost");
break;
case 3: System.out.println("Clear counter");
}
break;
case 7: System.out.println("Show call cost setting");
System.out.print("1. Call cost limit\n2. Show cost in\n.");
System.out.println("press 1 or 2 to access call cost");
int callerCost = input.nextInt();
switch(callerCost){
case 1: System.out.println("Call cost limit");
break;
case 2: System.out.println("Show cost in");
break;
}
break;
case 8: System.out.println("prepared credit");
}
case 5:
System.out.println("Tone");
System.out.print("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. keypad tone\n7. Warming and gane tone\n8. Vibrating alert\n9. Screen saver\n");
 
System.out.println("Enter 1 to 9 to access tone settings");
int tones = input.nextInt();
switch(tones){
case 1: System.out.println("Ringing tone");
break;
case 2: System.out.println("Ringing volume");
break;
case 3: System.out.println("incoming call alert");
break;
case 4: System.out.println("Composer");
break;
case 5: System.out.println("Message alert tone");
break;
case 6: System.out.println("KeyPad tones");
break;
case 7: System.out.println("warming and game tones");
break;
case 8: System.out.println("Vibrating alert");
break;
case 9: System.out.println("Screen saver");
}
case 6:
System.out.println("Settings");
System.out.print("1. Call settings\n2. Phone setting\n3. Security setting\n4. Restore factory settings\n");

System.out.println("Enter 1 to 4 to access settings");
int settings = input.nextInt();
switch(settings){
case 1: System.out.println("Call settings");
System.out.print("1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. phone line in use\n6. Automatic answer\n.");

System.out.println("Enter 1 to 5 call settings");
int callSetting = input.nextInt();
switch(callSetting){
case 1: System.out.println("Automatic redial");
break;
case 2: System.out.println("Speed dialling");
break;
case 3: System.out.println("Call waiting options");
break;
case 4: System.out.println("Own number sending");
break;
case 5: System.out.println("phone line in use");
break;
case 6: System.out.println("Automatic answer");
}
break;
case 2: System.out.println("Phone setting");
System.out.print("1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. lights\n6. Confirm sim service actions\n.");
System.out.println("Enter from 1 to 6 for more phone settings options");
int phoneSetting = input.nextInt();
switch(phoneSetting){
case 1: System.out.println("Language");
break;
case 2: System.out.println("Cell info display");
break;
case 3: System.out.println("Welcome note");
break;
case 4: System.out.println("Network selection");
break;
case 5: System.out.println("Lights");
break;
case 6: System.out.println("Confirm SIM service actions");
}
break;
case 3: System.out.println("Security setting");
System.out.print("1. Pin code request\n2. Call barring service\n3. fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access code\n. ");
System.out.println("Enter 1 to 6 to access the security setting");
int securitySetting = input.nextInt();
switch(securitySetting){
case 1: System.out.println("Pin code request");
break;
case 2: System.out.println("Call barring service");
break;
case 3: System.out.println("fixed dialling");
break;
case 4: System.out.println("Close user group");
break;
case 5: System.out.println("Phone security");
break;
case 6: System.out.println("Change access code");
}
break;
case 4: System.out.println("Restore factory settings");
}
case 7:
System.out.println("Call divert");

case 8:
System.out.println("Games");

case 9: 
System.out.println("Calculator");

case 10:
  System.out.println("Reminder");

case 11:
System.out.println("Clock");
System.out.print("1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stop watch\n5. Countdown timer\n6. Auto update of date and time\n");

System.out.println("Enter 1 to 6 to access clock");
int clock = input.nextInt();
switch(clock){
case 1: System.out.println("Alarm clock");
break;
case 2: System.out.println("Clock settings");
break;
case 3: System.out.println("Date settings");
break;
case 4: System.out.println("Stop watch");
break;
case 5: System.out.println("Countdown time");
break;
case 6: System.out.println("Auto update of date and time");
}

case 12:
System.out.println("profile");

case 13:
System.out.println("SIM services");






}








}




} 