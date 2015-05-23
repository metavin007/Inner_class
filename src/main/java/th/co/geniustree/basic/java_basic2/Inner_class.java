
package th.co.geniustree.basic.java_basic2;

public class Inner_class {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {  //inner แบบ 1 อิมพีเมนพร้อม เรียกใช้ ชื่อ อินโนนิมัสอินเนอร์class
            
            class C {
                
            }
            C c = new C(); // แบบที่ 4 local inner class

            @Override
            public void run() {
                System.out.println("xxxxxxx");
            }
        };
        new Thread(runnable).start();
        
       Inner_class.A a = new Inner_class().new A();//inner แบบ 2
       
        Inner_class.B b = new Inner_class.B(); // inner แบบ 3 static inner class
    }
    
    class A {
        
    }
    
    public static class B {
        
    }
}
