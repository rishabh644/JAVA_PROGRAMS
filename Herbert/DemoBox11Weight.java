class DemoBox11Weight{
	public static void main(String [] args){
Box11Weight weightbox=new Box11Weight(3,5,7,9.87);
Box11 plainbox;
Box11Weight mbx=new Box11Weight();
double vol;
vol=weightbox.volume();
System.out.println("Volume of weightbox is"+vol);
System.out.println("Weight of weightbox is"+weightbox.weight);
System.out.println();
plainbox=weightbox;
vol=plainbox.volume();
System.out.println("Volume of plainbox "+vol);
plainbox.width=0;
vol=weightbox.volume();
System.out.println("Volume of weightbox is "+vol);
//System.out.println("Weight of weightbox is "+plainbox.weight);
System.out.println(mbx.volume());
	}
}	