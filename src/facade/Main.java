package facade;

public class Main {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.example.com", 22, "/home/example");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("test.tmp");
        writer.connectFile();
        writer.write();

        Reader reader = new Reader("test.tmp");
        reader.connectFile();
        reader.readFile();

        reader.disconnectFile();
        writer.disconnectFile();
        ftpClient.disconnect();

        System.out.println("///////////////////////////////");
        SftpClient sftpClient = new SftpClient("www.example.com", 22, "/home/example", "test.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
    }
}
