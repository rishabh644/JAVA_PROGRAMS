
public class ArrayStack implements stack
{
   public static final int CAPACITY=1024;//default capacity of stack
   private int N;   //maximum capacity of the stack
   private int S[]; //S holds the elements of the stack
   private int t=-1;   //the top element of the stack
   public ArrayStack()//initialize the stack with default capacity
   {this(CAPACITY)}
   public ArrayStack(int cap)
   {
   N=cap;
   s= new Object[N]
    }
	public int size()
	{return (t+1);}
public boolean isEmpty()
{ return(t<0);}

public void push(int obj) throws StackFullException
{
 int(size()==N)
 throw new StackFullException("Stack overflow");
 S[++t]=obj;
   }
 public int top() throws StackEmptyException {
 if(isEmpty())
  throw new StackEmptyException("Stack is empty");
  return S[t];
  
public int pop() throws StackEmptyException{
int elem;
if(isEmpty())
 throw new StackEmptyException("Stack is Empty");
 elem=S[t];
 S[t--]=null;
 return elem;
 }
 