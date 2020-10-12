public class State {

    private State father;

    private int nbCannibalLeft;
    private int nbMissionaryLeft;

    private int nbCannibalBoat;
    private int nbMissionaryBoat;

    private int nbCannibalRight;
    private int nbMissionaryRight;

    private boolean isBoatLeft;

    public boolean isExplored() {
        return explored;
    }

    public void setExplored(boolean explored) {
        this.explored = explored;
    }

    private boolean explored = false;

    public State(State father, int nbCannibalLeft, int nbMissionaryLeft, int nbCannibalBoat, int nbMissionaryBoat, int nbCannibalRight, int nbMissionaryRight, boolean isBoatLeft) {
        this.father = father;
        this.nbCannibalLeft = nbCannibalLeft;
        this.nbMissionaryLeft = nbMissionaryLeft;
        this.nbCannibalBoat = nbCannibalBoat;
        this.nbMissionaryBoat = nbMissionaryBoat;
        this.nbCannibalRight = nbCannibalRight;
        this.nbMissionaryRight = nbMissionaryRight;
        this.isBoatLeft = isBoatLeft;
    }

    public State getFather() {
        return father;
    }

    public void setFather(State father) {
        this.father = father;
    }

    public int getNbCannibalLeft() {
        return nbCannibalLeft;
    }

    public void setNbCannibalLeft(int nbCannibalLeft) {
        this.nbCannibalLeft = nbCannibalLeft;
    }

    public int getNbMissionaryLeft() {
        return nbMissionaryLeft;
    }

    public void setNbMissionaryLeft(int nbMissionaryLeft) {
        this.nbMissionaryLeft = nbMissionaryLeft;
    }

    public int getNbCannibalBoat() {
        return nbCannibalBoat;
    }

    public void setNbCannibalBoat(int nbCannibalBoat) {
        this.nbCannibalBoat = nbCannibalBoat;
    }

    public int getNbMissionaryBoat() {
        return nbMissionaryBoat;
    }

    public void setNbMissionaryBoat(int nbMissionaryBoat) {
        this.nbMissionaryBoat = nbMissionaryBoat;
    }

    public int getNbCannibalRight() {
        return nbCannibalRight;
    }

    public void setNbCannibalRight(int nbCannibalRight) {
        this.nbCannibalRight = nbCannibalRight;
    }

    public int getNbMissionaryRight() {
        return nbMissionaryRight;
    }

    public void setNbMissionaryRight(int nbMissionaryRight) {
        this.nbMissionaryRight = nbMissionaryRight;
    }

    public boolean isBoatLeft() {
        return isBoatLeft;
    }

    public void setBoatLeft(boolean boatLeft) {
        isBoatLeft = boatLeft;
    }

    public void print()
    {
        System.out.println("Config: L:[C:" + nbCannibalLeft + " M: " + nbMissionaryLeft + "] B:[C:" + nbCannibalBoat + " M:" + nbMissionaryBoat + "] R:[C:" + nbCannibalRight + " M: " + nbMissionaryRight + "] isBoatLeft: " + isBoatLeft);
    }

    @Override
    public boolean equals(Object obj) {
        State compare = (State) obj;
        return
                compare.getNbMissionaryRight() == getNbMissionaryRight()
                && compare.getNbCannibalRight() == getNbCannibalRight()
                && compare.getNbMissionaryLeft() == getNbMissionaryLeft()
                && compare.getNbCannibalLeft() == getNbCannibalLeft()
                && compare.getNbCannibalBoat() == getNbCannibalBoat()
                && compare.getNbMissionaryBoat() == getNbMissionaryBoat()
                && compare.isBoatLeft() == isBoatLeft();
    }
}
