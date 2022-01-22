package adapter;

public class AirConditioner implements Electronic220V{

    @Override
    public void connect() {
        System.out.println("air-conditioner 220v on");
    }
}
