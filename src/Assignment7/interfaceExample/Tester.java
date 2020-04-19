package Assignment7.interfaceExample;


public class Tester {
    public static void connect(ConnectDVD connectDVD) {
        connectDVD.connect();
    }

    public static void VolumeUP(Remote remote) {
        remote.volumeUP();
    }

    public static void updateOS(OperatingSystem operatingSystem) {
        operatingSystem.updateOS();
    }

    public static void availableHD(TVFeatures tvFeatures) {
        tvFeatures.availableHD();
    }

    public static void main(String args[]) {
        SmartTelevision smartTelevision = new SmartTelevision("Samsung");
        connect(smartTelevision);
        VolumeUP(smartTelevision);
        updateOS(smartTelevision);
        availableHD(smartTelevision);
    }

}
