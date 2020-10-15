/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author oat
 */
public class Faculty {
    private String name ;
    private int numStudents ;
    private int buildingNumber ;
public Faculty ( String name , int buildingNumber ) {

this.name = name ;
this.numStudents = 0;
this.buildingNumber = buildingNumber ;

}
public void admitStudents (int numStudents ) {

this . numStudents = this . numStudents + numStudents ;
System.out.println(" Successfully admit "+ numStudents +"students ") ;
printInfo () ;

}
public void printInfo () {

System . out . println ( this . name + " has " +
this.numStudents+"students and is located atbuilding "+ this.buildingNumber ) ;

}
public void computing (){
    if(numStudents < 0)
       System.out.print("ERROR: cannot admit a negative number of students");
}
public void Environment  (){
    System.out.print("Go Green"+name+"");
    
}
    
}
