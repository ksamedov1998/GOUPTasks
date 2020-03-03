package Q6;

public class MainClass {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println("Raw IP address = " + ip);
        System.out.println("Defanged IP adrres = "+"\""+ defangIP(ip)+"\"");
    }

    public static String defangIP(String ip) {
        StringBuilder stringBuilder=new StringBuilder();
        String[] array=ip.split("\\.");
        printArray(array);

        stringBuilder.append(array[0]);
        for(int i=1;i<array.length;i++){
            stringBuilder.append("[.]"+array[i]);
        }
        return stringBuilder.toString();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]+" ");
        }
        System.out.println();
    }
}
