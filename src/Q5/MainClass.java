package Q5;

public class MainClass {
    public static void main(String[] args) {
        String jeweleries="ab";
        String stones="aAAbbbb";

        System.out.println(getJCount(jeweleries,stones));
    }

    private static int getJCount(String jeweleries, String stones) {
        int count=0;
        char[] jeweleryArray=jeweleries.toCharArray();
        for(int i=0;i<jeweleryArray.length;i++){
            for(int j=0;j<jeweleryArray.length;j++){
                if(!(stones.indexOf(jeweleryArray[i],j)==-1)){
                    ++count;
                }
            }
        }
        return count;
    }
}
