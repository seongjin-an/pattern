package facade;

public class Reader {
    private String fileName;
    public Reader(String fileName){
        this.fileName = fileName;
    }
    public void connectFile(){
        String msg = String.format("connect Reader %s", fileName);
        System.out.println(msg);
    }
    public void readFile(){
        String msg = String.format("read fileReader %s", fileName);
        System.out.println(msg);
    }
    public void disconnectFile(){
        String msg = String.format("disconnect Reader %s", fileName);
        System.out.println(msg);
    }
}
