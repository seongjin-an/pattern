package facade;

public class Writer {
    private String fileName;
    public Writer(String fileName){
        this.fileName = fileName;
    }
    public void connectFile(){
        String msg = String.format("connect Writer %s", fileName);
        System.out.println(msg);
    }
    public void disconnectFile(){
        String msg = String.format("disconnect Writer %s", fileName);
        System.out.println(msg);
    }
    public void write(){
        String msg = String.format("write fileWriter %s", fileName);
        System.out.println(msg);
    }
}
