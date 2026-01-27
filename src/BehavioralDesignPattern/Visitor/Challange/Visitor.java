package BehavioralDesignPattern.Visitor.Challange;

interface Visitor {
    public void visit(Book book);
    public void visit(CD cd);
    public void visit(DVD dvd);

    public double getTotalPostage();
}

class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    //collect data about the book
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price,
        // free postage for a book over 20
        if (book.getPrice() < 20.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    public void visit(CD cd) {
        if (cd.getPrice() < 20.0) {
            totalPostageForCart += cd.getWeight() * 2.5;
        }
    }

    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20.0) {
            totalPostageForCart += dvd.getWeight() * 3;
        }
    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}

class SouthAmericaPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    //collect data about the book
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price free postage for a book over 10
        if(book.getPrice() < 30.0) {
            totalPostageForCart += (book.getWeight() * 2) * 2;
        }
    }

    //add other visitors here
    public void visit(CD cd) {
        if (cd.getPrice() < 30.0) {
            totalPostageForCart += (cd.getWeight() * 2.5) * 2;
        }
    }

    public void visit(DVD dvd) {
        if(dvd.getPrice() < 30.0) {
            totalPostageForCart += (dvd.getWeight() * 3)  * 2;
        }
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}





