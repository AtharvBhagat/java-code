

package lesson_6;

//Operator overriding- parent and child are having the functions of the same name but child has made changes to it.


class Parent{

    public void sayhello(){
                    System.out.println("Hello from the parent");
                }
            }
            
            class Child extends Parent{
            
            
            public  void sayhello(){
                System.out.println("Hello from the child");
            }
    
    
    }
    
    
    public class Main13 {
        
    public static void main(String[] args) {
        Child c=new Child();
        Parent p=new Parent();
    
    
    p.sayhello();
    c.sayhello();
}


}