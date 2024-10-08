public class Triangle{
    public int size;
    public char symbol;
    public Triangle(int s, char c){
        size = s;
        symbol = c;
        }
    public void displaySolidLL(){
        }
    public void displaySolidLR(){
    }
    public void displaySolidUL(){
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
