package StructuralDesignPattern.Composite.Challange;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor technologyDean = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr. John", "Chair of Math Department");
        Supervisor chairOfComputerScienceDepartment = new Supervisor("Dr. Ian", "Chair Of CS Department");

        Professor mathProf1 = new Professor("Math Professor1", "Adjunct", 302);
        Professor mathProf2 = new Professor("Math Professor2", "Associate", 303);

        Professor cseProf1 = new Professor ("CSE Professor1", "Adjunct", 507);
        Professor cseProf2 = new Professor ("CSE Professor2", "Professor", 508);
        Professor cseProf3 = new Professor ("CSE Professor3", "Professor", 509);

        technologyDean.add(chairOfMathDepartment );
        technologyDean.add(chairOfComputerScienceDepartment );

        /* Professors of Mathematics directly reports to chair of math*/
        chairOfMathDepartment.add(mathProf1);
        chairOfMathDepartment.add(mathProf2);

        /*Professors of  Computer Sc. directly reports to chair of computer science*/
        chairOfComputerScienceDepartment.add(cseProf1);
        chairOfComputerScienceDepartment.add(cseProf2);
        chairOfComputerScienceDepartment.add(cseProf3);

        //Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO ***");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(technologyDean.getDetails());
        List<Faculty> chairs=technologyDean.getMyFaculty();

        for(int i=0;i<chairs.size();i++)
        {
            System.out.println("\t"+chairs.get(i).getDetails());
        }

        List<Faculty> mathProfessors= chairOfMathDepartment.getMyFaculty();
        for(int i=0;i<mathProfessors.size();i++)
        {
            System.out.println("\t\t"+ mathProfessors.get(i).getDetails());
        }

        List<Faculty> cseProfessors= chairOfComputerScienceDepartment.getMyFaculty();
        for(int i=0;i<cseProfessors.size();i++)
        {
            System.out.println("\t\t"+cseProfessors.get(i).getDetails());
        }

        chairOfComputerScienceDepartment.remove(cseProf2);

        System.out.println("\n After CSE Professor2 leaving the organization- CSE department has following faculty:");

        cseProfessors = chairOfComputerScienceDepartment.getMyFaculty();
        for(int i=0;i< cseProfessors.size();i++)
        {
            System.out.println("\t\t"+ cseProfessors.get(i).getDetails());
        }
    }
}
