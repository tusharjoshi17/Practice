public class Pattern4 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.format("%2d ",count);
            }
            System.out.println("");
        }
    }
}
