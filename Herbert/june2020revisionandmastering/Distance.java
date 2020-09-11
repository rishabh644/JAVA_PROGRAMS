
class Distance{
public static void main(String [] args)
{
  long distance;
  long days;
  long second;
  int lightspeed;//lightspeed in milespersecond
  lightspeed=186000;
  days=1000;
  second=days*24*60*60;
  distance=lightspeed*second;
  System.out.print("In "+days);
  System.out.print(" days light travels distance of ");
  System.out.println(distance+" miles ");
  

}

}