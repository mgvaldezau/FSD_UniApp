public class University {
    
public static void main(String[] args) {
    (new University()).menu();
}

private char readChoice(){
    return In.nextChar();
}


public void menu() {
    System.out.println("University System: (A)dmin, (S)tudent, or X : ");
    char c;
    while((c = readChoice()) != 'X'){
        switch(c){
            case 'A': System.out.println("Admin options"); break;
            case 'S': System.out.println("Student options"); break;
            default: help(); break;
        }
    }
    System.out.println("Thank You");
}

private void help() {
    System.out.println("Menu options");
    System.out.println("A = Use Admin System");
    System.out.println("S = Use Student System");
    System.out.println("X = exit");
}

}
