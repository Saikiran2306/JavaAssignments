package Assignment7.interfaceExample;

public class SmartTelevision extends Television implements TVFeatures {

   public SmartTelevision(String name) {
        super(name);
    }


    @Override
    public void connect() {
        System.out.println("DVD Connected");
    }

    @Override
    public void disConnect() {
        System.out.println("DVD Disconnected");

    }

    @Override
    public int volumeUP() {
        volume++;
        System.out.println("Volume is " + volume);
        return volume;
    }

    @Override
    public int volumeDOWN() {
        volume--;
        System.out.println("Volume is " + volume);
        return volume;
    }

    @Override
    public void updateOS() {
        System.out.println("OS updated");
    }

    @Override
    public void getUpdates() {
        System.out.println("No updates available");
    }

    @Override
    public void availableHD() {
        System.out.println("Streaming in HD");
    }

    @Override
    public void availableSD() {
        System.out.println("Streaming in SD");
    }
}

