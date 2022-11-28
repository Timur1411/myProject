public class task {
    String name;
    int value;
    task(String name){
        this.name=name;
        this.value=0;
    }
    task(String name, int value){
        this.name=name;
        this.value=value;
    }
    public int plus(){
        return value++;
    }
    public int minus(){
        return value--;
    }
}
