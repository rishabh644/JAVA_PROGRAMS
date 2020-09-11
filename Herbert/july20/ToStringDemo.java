
// Override toString() for Box class

class Box243 {

 double width;
 double height;
 double depth;
 
 Box243(double w,double h,double d) {
 width=w;
 height=h;
 depth=d;
                                 }
 public String toString() {
  return " Dimensions are "+width+" by "+depth+" by "+height+".";
                          }
			}

class ToStringDemo {
 public static void main(String []r) {
 Box243 b=new Box243(10,12,14);
 String s="Box b: "+b;// Concatenate Box object
 
 System.out.println(b); // Convert Box to String
 System.out.println(s);
                                      }
					}
									   