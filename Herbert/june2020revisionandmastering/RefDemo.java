


class RefDemo {
 public static void main(String [] arg) {
    BoxWeight weightbox=new BoxWeight(2,3,5,0.35);
    Box plainbox;
	double vol;
	
	vol=weightbox.volume();
	System.out.println(" Volume of WeightBox "+vol);
	System.out.println(" Weight of WeightBox "+weightbox.weight);
	
	plainbox=weightbox;//reference of subclass object to super class type
	
	vol=plainbox.volume();
	System.out.println(" Volume of plainbox "+vol);
	
	/* The following statements is invalid because plainbox
	does not define a weight member. */
	// System.out.println(" Weight of plainbox is "+plainbox.weight);
	
	                           }
				}