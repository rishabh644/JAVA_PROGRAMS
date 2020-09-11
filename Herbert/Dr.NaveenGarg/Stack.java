
public interface  Stack{


  public int size();
  public boolean isEmpty();
  public int top() throws StackEmptyException;
  
  public void push(int element);
  
  public int pop() throws StackEmptyException;
  
  }