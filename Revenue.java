public class Revenue {
   static int MaxRevenue(int garage[],int m){
       int bikes[]=new int[m];
       int cars[]=new int[m];
       int trucks[]=new int[m];
            for(int i=0;i<m;i++) {
                bikes[i] = garage[i] * 100;
                cars[i] = garage[i] * 250;
                trucks[i] = garage[i] * 500;
            }
            int max=0;


       return max;
   }
    public static void main(String[] args) {
        int bikes[]={6,5,14,11};
        int cars []={8,7,10,13};
        int trucks[]={2,8,11,5};
        int m=bikes.length;
        System.out.println(MaxRevenue(bikes,m));
        System.out.println(MaxRevenue(cars,m));
        System.out.println(MaxRevenue(trucks,m));
    }
}
