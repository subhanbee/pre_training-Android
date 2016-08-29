class Person{
private String name;
private String address;
Person(String name,String address)
{
this.name=name;
this.address=address;
}
public String getName(){
return "Name: "+name;}
public String getAddress(){
return "Address: "+address;}
public void setAddress(String address){
this.Address=address;
}
public String toString(){
return name+" "+address;
class Student extends Person{
private String program;
private int year;
private double fee;
Student(String name,String address,String program,int year,double fee)
{
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}
public String getProgram(){
return "program: "+program;}
public void setProgram(String program){
this.Program=program;}
public int getYear(){
return "Year: "+year;}
public void setYear(){
this.Year=year;}
public int getFee(){
return "Fee: "+fee;}
public void setFee(double fee){
this.Fee=fee;
}
public String toString(){
return name+" "+address+" "+program+" "+year+" "+fee;
}
}
class Staff extends Person{
private String school;
private double pay;
Staff(String name,String address,String school,double pay)
{
super(name,address);
this.school=school;
this.pay=pay;
}
public String getSchool(){
return "School: "+school;}
public void setSchool(String school){
this.School=school;}
public double getPay() {
return "Pay: "+pay;}
public void setPay(double pay){
this.Pay=pay;
}
public String toString(){
return name+" "+address+" "+school+" "+pay;
}
}
public class TestPerson {
public static void main(String args[])  {
Person p1=new Person("subhani","1/163b");
System.out.println(p1.getName());
System.out.println(p1.getAddress());
System.out.println(p1.toString());
Student s1=new Student("subhani","1/163b","java",2015,2500);
System.out.println(s1.getProgram());
System.out.println(s1.getYear());
System.out.println(s1.getFee());
System.out.println(s1.toString());
Staff st=new Staff("subhani","1/163b","sve",2200);
System.out.println(st.getSchool());
System.out.println(st.getPay());
System.out.println(st.toString());
}
}




