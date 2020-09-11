class Employee extends Person{
int empNo;
int[] salaryHistory=new int[12];
String organization;
String designation;
Date doj;
void printSalary(){
for(int s=0;s<salaryHistory.length;s++)
{
System.out.println("Salary "+s+": "+salaryHistory[s]);
}
}
}
