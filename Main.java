public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5,'s');
        t1.displaySolidLL();
        t1.setSize(100);        //  Try to set size to 100.
        t1.displaySolidLR(); //change to LR
        // t1.setSize(0);          //  Try to set size to 0.
        // t1.displaySolidUR();
        // t1.setSize(5);
        // t1.displaySolidUL();
        // t1.setSize(-10);        //  Try to set size to -10.
        // t1.displaySolidLL();
      
        // Triangle t2 = new Triangle(4);
        // t2.setChar('$');        
        // t2.displayHollowLL();
        // t2.setChar(' ');     //Try to set char to a blank space
        // t2.displayHollowLR();
        // t2.setChar('%');
        // t2.displayHollowUR();
        // t2.displayHollowUL();
      
      
        // Triangle T3 = new Triangle();
        // T3.displaySolidLL();
        // T3.displayHollowUR();
      
        // Triangle t4 = new Triangle('#');
        // t4.displaySolidLR();
        // t4.displayHollowUL();
        // t4.setSize(1);
        // t4.displaySolidLL();
        // t4.displayHollowUR();
    }
}