package BehavioralDesignPattern.Iterator.Challange;

import java.util.LinkedList;

interface IteratorInterface {
    void first();//Reset to first element
    String next();//get next element
    boolean isDone();//End of collection check
    String currentItem();//Retrieve Current Item
}

class ArtsIterator implements IteratorInterface {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects)  {
        this.subjects = subjects;
        position = 0;
    }

    public void first()  {
        position = 0;
    }

    public String next()  {
        return subjects[position++];
    }

    public boolean isDone() {
        return position >= subjects.length;
    }

    public String currentItem()  {
        return subjects[position];
    }
}

class ScienceIterator implements IteratorInterface {
    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects)  {
        this.subjects = subjects;
        position = 0;
    }

    public void first()  {
        position = 0;
    }

    public String next()  {
        return subjects.get(position++);
    }

    public boolean isDone() {
        return position >= subjects.size();
    }

    public String currentItem()  {
        return subjects.get(position);
    }
}
