public class variableArg {
//    void show(int ...A){
//        for(int i = 0; i<A.length;i++){
//            System.out.println(A[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        variableArg va = new variableArg();
//        va.show(1,2,3,4,5,6,7,8,9,10);
//    }

    void showList(String ...A){
        for(int i = 0; i<A.length;i++){
            System.out.println(i+1+"."+A[i]);
        }
    }

    public static void main(String[] args) {
        variableArg va = new variableArg();
        va.showList("Hello","World","Welcome","To","Java","Programming","Language");
    }
}
