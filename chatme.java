import java.util.*;
class Chat{
    public void howAreYou(){
        System.out.println(" Thank you for talking becouse I am single so I want to a such person ");
        System.out.println(" who talk me.");
        System.out.println("           "+"By the way how are you ?");
         try( Scanner sc=new Scanner(System.in)){
        String fine=sc.nextLine(),s="I am fine";
        if(fine.compareTo(s)==0){
         System.out.println(" Thank God you are fine becouse now day's all person have some problem  ");
        System.out.println(" so I think that you have any problem also ");
    iAmFine();
    }
    else{
        System.out.println("You no I think you have no manner");
        System.out.println("You are not risponse why anyway");
        iAmFine();
    }
}
}
    public void iAmFine(){
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("           "+"Can you tell me your name: ");
        String name=sc.nextLine();
        System.out.println(" Oh so sweet name"+" "+name+" "+"but it not your nake name ");
        System.out.println(" any way I want only a talker ");
       System.out.println("            "+" Can you tell me  gender or you want to abues me");
       String gender=sc.nextLine(),n="male";
       if(gender.compareTo(n)==0){
System.out.println("Oh you are a"+" "+gender);
System.out.println("Thank God you are a"+gender);
System.out.println("You know I am girl and I search a"+gender);
System.out.println("Which have good personality and "+ gender +" have manner");
System.out.println("who give rispect to the"+gender);
System.out.println("                   "+"Are you single ?");
System.out.println("                   "+"you can answer yes or no");
String repl=sc.nextLine(),m="yes";
if(repl.compareTo(m)==0){
    System.out.println("Oh you are single so sad");
    System.out.println("But you know that my searching complete right now");
}
else{
    System.out.println("congrantulation you have a girlfreind");
    System.out.println("But it's so sad for me becouse...... ");
}
 }
       else{
        System.out.println("Oh you are a"+" "+gender);
System.out.println("Thank God you are a "+gender);
System.out.println("You know I am boy and I search a"+gender);
System.out.println("Which so beautiful and "+ gender +" have good manner");
System.out.println("who give rispect to the boy");
System.out.println("Are you single ?");
System.out.println("you can answer yes or no");
String repl=sc.nextLine(), m="yes";
if(repl.compareTo(m)==0){
    System.out.println("Oh you are single so sad");
    System.out.println("But you know that my searching complete right now");
}
else{
    System.out.println("congrantulation you have a boyfreind");
    System.out.println("But it's so sad for me becouse...... ");
}
       }
    }
}
public void sorry(){
    System.out.println(" Sorry I think you are too busy that you not talk me and thank you");
}
}
public class chatme{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
Chat c=new Chat();
System.out.println(" Hey can you talk  me ");
    String thing=sc.nextLine();
switch(thing){
    case "yes":
    case "YES":
    c.howAreYou();
break;
case "no":
case "not":
case "NOT":
case "NO":
c.sorry();
break;
default:
System.out.println("So sorry yet my learning process not complete so you only answer yes or no then ");
System.out.println(" I try to understand your language ");
}
}
    }
}