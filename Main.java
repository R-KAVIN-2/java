public class Main {
    public static void main(String[] args) {
    //calculate the sum and product f array
        int[] array={1,2,3,4};
        int sum=0,product=1;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            product=product*array[i];
        }
        System.out.println("sum"+sum+"product"+product);
    }
}
