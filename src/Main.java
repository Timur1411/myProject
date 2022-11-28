public class Main {
    public static void main(String[] args){
        task object1=new task("Четные числа:");
        task object2=new task("Нечетные числа:");
        for(int a=1;a<=100;a++){
            if(a%2==0){
                object1.plus();
            }else{
                object2.plus();
            }
        }
        System.out.printf("%s:%d\n",object1.name,object1.value);
        System.out.printf("%s:%d\n",object2.name,object2.value);
    }
}
