public class NearestInteger {
    static int nearestInteger(int num,int m){
        int q=num/m;
        int r=num%m;
        if(r>m/2){
            return q*m+m;
        }
        else{
            return q*m;
        }
    }
public static void main(String[] args) {
        System.out.println(nearestInteger(13,4));
    }
}
