public class Supply {

    Storage storage = new Storage();

    public void checkWater(){
        storage.checkWater();
    }

    public void addWater(double water){
        storage.setWater(water);
    }

    public void getWater(double water){
        storage.useWater(water);
    }

    public void checkGrain(){
        storage.checkMilk();
    }

    public void addGrain(int grain){
        storage.setGrain(grain);
    }

    public void getGrain(int grain){
        storage.useGrain(grain);
    }

    public void checkMilk(){
        storage.checkMilk();
    }

    public void checkGround(){
        storage.checkMilk();
    }

}
