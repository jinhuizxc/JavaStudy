package inherit.superclass;

public class SubClass extends SuperClass{

    private int n;

    public SubClass(){
        super(300);
        System.out.println("SubClass");
    }

    public SubClass(int n){
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }

}
