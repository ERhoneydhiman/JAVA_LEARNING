package GenericClasses;

public class GenericTest <T>{
    private T obj ;
    public GenericTest(T obj){
        this.obj = obj;
    }

    public void show(){
        System.out.println("value of obj is : "+obj);
    }
}

