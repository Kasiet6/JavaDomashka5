package com.company;

public class Skeleton extends Boos {
    private int numberOfArrows;


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String prininfo(){
        return super.printInfo() + " " + getNumberOfArrows();
    }
}
