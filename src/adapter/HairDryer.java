package adapter;

public class HairDryer implements Electronic110V {

    @Override
    public void powerOn() {
        System.out.println("HairDryer 110v on");
    }
}
