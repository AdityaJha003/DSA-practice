public enum Shape {
    ROUND,
    SQUARE
}

public enum LightType {
    FRONT,
    BACK
}

public enum VehicleType {
    CAR,
    TRUCK,
    SUV,
    MUV,
    BUS
}

public enum CarBrand {
    TATA,
    HYUNDAI,
    BMW,
    AUDI,
    HONDA,
    FORD
}

class Color{
    int r;
    int g;
    int b;

}

class Engine{
    int bhp;
    boolean running;
    int speed;
    int topSpeed;
    
    void Start(){
        this.running=true;
    }

    void Stop(){
        this.running=false;
    }
    void increaseSpeed(){
        if(this.running){
            this.speed+=20;
        }
    }
    void decreaseSpeed(){
        if(this.running){
            this.speed-=20;
        }
    }
    int getSpeed(){
        return this.speed;
    }
    int getTopSpeed(){
        return this.topSpeed;
    }
}

class Door{
    boolean isOpen;

    boolean isOpen(){
        return this.isOpen;
    }
    void openDoor(){
        this.isOpen=true;
    }
    void closeDoor(){
        this.isOpen=false;
    }

}

class Light{
    Color color;
    Shape shape;
    LightType lightType;
    boolean fullBeam;

    Color getColor(){
        return this.color;
    }
    Shape getShape(){
        return this.shape;
    }
    boolean FullBeam(){
        return this.fullBeam;
    }
    void switchedOn(){
        this.fullBeam=true;
    }
    void switchedOff(){
        this.fullBeam=false;
    }

}

class Wheel{
    Shape shape;
    Color color;
    int radius;
    boolean slipping;
    boolean hasDust;

    Shape getShape(){
        return this.shape;
    }
    Color getColor(){
        return this.color;
    }
    int getRadius(){
        return this.radius;
    }   
    boolean isSlipping(){
        return this.slipping;
    }
    boolean hasDust(){
        return this.hasDust;
    }
}

class Speaker{
    Shape shape;
}

class MusicSystem{
    Speaker[] speakers;
    String brand;
    int wattage;
    int voltage;
    int volume;
    boolean running;
    
    String getBrand(){
        return this.brand;
    }   
    int getWattage(){
        return this.wattage;
    }
    int getVoltage(){
        return this.voltage;
    }
    int getVolume(){
        return this.volume;
    }
    boolean isRunning(){
        return this.running;
    }
    int getSpeakCount(){
        return this.speakers.length;
    }
    void increaseVolume(){
        if(this.running){
            this.volume+=10;
        }
    }
    void decreaseVolume(){
        if(this.running){
            this.volume-=10;
        }
    }
    void start(){
        this.running=true;
    }
    void stop(){
        this.running=false;
    }

}

class Vehicle{
    CarBrand brand;
    VehicleType vehicleType;
    Light[] lights;
    Wheel[] wheels;
    MusicSystem musicSystem;
    Color color;
    int capacity;
    Door[] doors;
    Engine engine;
    int year;
    int mileage;

    CarBrand getBrand(){
        return this.brand;
    }
    VehicleType getVehicleType(){
        return this.vehicleType;
    }
    int getLightCount(){
        return this.lights.length;
    }
    int getWheelCount(){
        return this.wheels.length;
    }
    int getDoorCount(){
        return this.doors.length;
    }
    void increaseSpeed(){
        this.engine.increaseSpeed();
    }
    void decreaseSpeed(){
        this.engine.decreaseSpeed();
    }
    void start(){
        this.engine.Start();
    }
    void stop(){
        this.engine.Stop();
    }
    void startMusic(){
        this.musicSystem.start();
    }
    void stopMusic(){
        this.musicSystem.stop();
    }
    void increaseVolume(){
        this.musicSystem.increaseVolume();
    }
    void decreaseVolume(){
        this.musicSystem.decreaseVolume();
    }
    void openDoor(int i){
        this.doors[i].openDoor();
    }
    void closeDoor(int i){
        this.doors[i].closeDoor();
    }
    boolean isDoorOpen(int i){
        return this.doors[i].isOpen();
    }
}

public class design {
    public static void main(String[] args) {
        
    }
}
