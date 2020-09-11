class FinallyDemo {
public static void main(String [] args){
int i=0;
String greetings[]={"Hello Twinkle !","Hello Java !"," Hello World !"};
while(i<4){
try{
System.out.println(greetings[i++]);
}
catch(Exception e){
System.out.println(e.getMessage());

System.out.println("You should quit and reset index value<3: ");

}

/* //finally
 //System.out.printlnYou should quit and reset index value<3
//*/}
    }
 }