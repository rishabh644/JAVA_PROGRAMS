class Box{
double length,l;
double width,w;
double height,h;

Box(){
System.out.println("Constructing Box");
length=5;
width=2;
height=10;}
double volume(){
return length*width*height;
}

}