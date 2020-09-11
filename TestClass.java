import java.io.*; 
  
// A simple interface 
 class TestClass implements In1 
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        TestClass t = new TestClass(); 
        t.display(); 
        System.out.println(In1.a); 
    } 
} 