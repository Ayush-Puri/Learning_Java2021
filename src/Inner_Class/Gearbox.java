package Inner_Class;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear>gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio){
        if((number>0)&&(number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }
    public double wheelSpeed(int revs) {
        if(clutchIsIn){
            System.out.println("Scream !");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }
    public void changeGear(int newGear){
        if((newGear>0)&&(newGear<this.gears.size())&&(this.clutchIsIn)){
            this.currentGear = newGear;
        }else
        {
            System.out.println("Grind !");
            this.currentGear = 0;
        }


    }
    class Gear{
        private int gearNumber;
        private double Ratio;

        public double getRatio() {
            return Ratio;
        }

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            Ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.Ratio);
        }
    }
}
