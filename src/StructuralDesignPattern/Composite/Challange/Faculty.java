package StructuralDesignPattern.Composite.Challange;

interface Faculty {
    public String getDetails();
}

class Professor implements Faculty {
    private String mName;
    private String mPosition;
    private int mOfficeNum;

    Professor(String name, String position, int officeNum) {
        mName = name;
        mPosition = position;
        mOfficeNum = officeNum;
    }

    @Override
    public String getDetails() {
        return (mName + " is the  " + mPosition);
    }
}