public class Student {
    
    private char readChoice(){
        return In.nextChar();
    }

    public void use() {
        System.out.println("Student System (l/r/x): ");
        char c;
        while((c = readChoice()) != 'x'){
            switch(c){
                case 'l': System.out.println("Login"); break;
                case 'r': System.out.println("Register"); break;
                default: help(); break;
            }
        }
        System.out.println("Back to University menu");
    }
    
    private void help() {
        System.out.println("Menu options");
        System.out.println("l = Login");
        System.out.println("r = Register");
        System.out.println("x = exit");
    }




}
