package BehavioralDesignPattern.Iterator.Challange;

import javax.security.auth.Subject;

public class Client {

    public static void print(IteratorInterface iterator)  {
        while (!iterator.isDone())  {
            System.out.println(iterator.next());
        }
    }



    public static void main(String[] args)
    {
        System.out.println("***Iterator Pattern Demo***\n");
        SubjectInterface Sc_subject = new Science();
        SubjectInterface Ar_subjects = new Arts();

        IteratorInterface Sc_iterator = Sc_subject.createIterator();
        IteratorInterface Ar_iterator = Ar_subjects.createIterator();

        System.out.println("\nScience subjects :");
        print(Sc_iterator);

        System.out.println("\nArts subjects :");
        print(Ar_iterator);
    }
}
