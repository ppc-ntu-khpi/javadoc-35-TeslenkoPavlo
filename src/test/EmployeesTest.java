package test;

import domain.*;


 /**
 * The class Employees test
 */ 
public class EmployeesTest {


/** 
 *
 * Main
 *
 * @param args[]  the args []. 
 */
    public static void main(String args[]) { 


        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        Artist art = new Artist(skills);
        Employee[] people = {ed, em, art};
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        System.out.println(man);

    }
}
