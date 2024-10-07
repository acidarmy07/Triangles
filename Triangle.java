public class Triangle{
    public int size;
    public char symbol;
    public Triangle(int s, char c){
        size = s;
        symbol = c;
        }
    public void displaySolidLL(){
        String S7 = "\n";
        String SolidLL = "";
        for (int x = 0; x <= size; x++) {
            for (int y = 0; y < x; y++) {
                SolidLL = SolidLL + symbol;
                }
            SolidLL +=(S7);
            }
        System.out.println(SolidLL);
        }
    public void displaySolidLR(){
        spaces = (size - 1);
        String S7 = "\n";
        String SolidLR = "";
        for (int x = 0; x <= size; x++) {
            for (int y = 0; y < size; y++) {
                SolidLR = SolidLR + " " + symbol;
                }
            SolidLR +=(S7);
            }
        System.out.println(SolidLR);
    }
    public void displaySolidUL(){
        String S7 = "\n";
        String SolidUL = "";
        for (int x = 0; x <= size; x++) {
            for (int y = size; y > x; y--) {
                SolidUL = SolidUL + symbol;
                }
            SolidUL +=(S7);
            }
        System.out.println(SolidUL);
    }
    public void displaySolidUR(){

    }
    public void displayHollowLL(){

    }
    public void displayHollowLR(){
        
    }
    public void displayHollowUL(){

    }
    public void displayHollowUR(){
        
    }
    public void setChar(char c){
        symbol = c;
    }
    public void setSize(int s){
        if (s > 50 || s < 0){
            s = 10;
        }
        size = s;
    }
        

}