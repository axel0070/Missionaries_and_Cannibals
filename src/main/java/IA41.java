import java.util.ArrayList;

public class IA41 {

    private static ArrayList<State> savedStates = new ArrayList<State>();

    public static void main(String[] args) {
        System.out.println("Hello world");

        State Ei = new State(null,3,3,0,0,0,0,true);
        State Ef = new State(null,0,0,0,0,3,3,false);

        savedStates.add(Ei);
        System.out.println("Ei:");
        Ei.print();

        boolean needStop = false;

        while(!savedStates.contains(Ef) && !needStop)
        {
            ArrayList<State> temp = new ArrayList<State>();

            for(State E : savedStates)
            {
                if(E.isExplored())
                    continue;

                temp.addAll(enumPossibilities(E));
            }

            if(temp.size() == 0)
                needStop = true;

            savedStates.addAll(temp);
            temp.clear();
        }



        if(needStop)
            System.out.println("Solution not found.");
        else
        {
            for(State Ec : savedStates)
            {
                if(Ec.equals(Ef))
                {
                    System.out.println("Printing solution:");

                    Ec.print();
                    State father = Ec.getFather();
                    while(father != null)
                    {
                        father.print();
                        father = father.getFather();
                    }
                }
            }
        }


    }

    public static ArrayList<State> enumPossibilities(State Ei)
    {
        ArrayList<State> states = new ArrayList<State>();

        int nbCannibal = Ei.getNbCannibalBoat() + (Ei.isBoatLeft()?Ei.getNbCannibalLeft():Ei.getNbCannibalRight());
        int nbMissionary = Ei.getNbMissionaryBoat() + (Ei.isBoatLeft()?Ei.getNbMissionaryLeft():Ei.getNbMissionaryRight());

        for(int x = 0 ; x <= nbCannibal; x++)
        {
            for(int y = 0 ; y <= nbMissionary; y++)
            {
                if(x+y>2)
                    continue;

                int NbC = nbCannibal - x;
                int NbM = nbMissionary - y;

                State out;

                if(Ei.isBoatLeft())
                    out = new State(Ei,NbC,NbM,x,y,Ei.getNbCannibalRight(),Ei.getNbMissionaryRight(), x + y == 0);
                    //System.out.println("Config: L:[C:" + NbC + " M: " + NbM + "] B:[C:" + x + " M:" + y + "] R:[C:" + Ei.getNbCannibalRight() + " M: " + Ei.getNbMissionaryRight() + "]");
                else
                    out = new State(Ei,Ei.getNbCannibalLeft(),Ei.getNbMissionaryLeft(),x,y,NbC,NbM, x + y != 0);
                    //System.out.println("Config: L:[C:" + Ei.getNbCannibalLeft() + " M: " + Ei.getNbMissionaryLeft() + "] B:[C:" + x + " M:" + y + "] R:[C:" + NbC + " M: " + NbM + "]");

                if(isStateValid(out))
                    states.add(out);
            }
        }

        return states;
    }

    public static boolean isStateValid(State E)
    {
        return E.getNbCannibalLeft() <= E.getNbMissionaryLeft() && E.getNbCannibalRight() <= E.getNbMissionaryRight() && !savedStates.contains(E);
    }
}
