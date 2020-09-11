class Student extends Person{
String institution;
int [] qualif=new int[20];
int rollNo;
int [] marks=new int[5];
void printBioData(){
printData();
System.out.println("Institution :" +institution);
System.out.println("Roll no : "+rollNo);
for(int q=0;q<qualif.length;q++)
{
System.out.println("Marks "+q+"+qualif[q]);
}
for(int m=0;m<marks.length;m++){
System.out.print("Result "+m+": "+marks[m]);
}
}
}
