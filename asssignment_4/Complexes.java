//Q8. Design a class ‘Complex’ to manipulate Complex numbers having data members as real and imag. The class should have a parameterizedconstructor to initialize its data members. It should also have methods display() to display the complex number (in the format 5+3i for example), add() to add two Complex numbers. Test these methods by creating main method in another class.
import java.util.Scanner;
class Complexes {
    private double real, imag;

    public Complexes(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void display() {
        System.out.println(real + "+" + imag + "i");
    }

    public static Complexes add(Complexes complex1, Complexes complex2) {
        return new Complexes(complex1.real + complex2.real, complex1.imag + complex2.imag);
    }
}

class Main7 {
    public static void main(String[] args) {
        Complexes complex1 = createComplex("first");
        Complexes complex2 = createComplex("second");
        System.out.println("The two complex numbers are: ");
        complex1.display();
        complex2.display();
        Complexes sum = Complexes.add(complex1, complex2);
        System.out.print("Sum of two complex numbers is: ");
        sum.display();
    }

    private static Complexes createComplex(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imag for " + name + " complex number: ");
        double real = sc.nextDouble();
        double imag = sc.nextDouble();
        return new Complexes(real, imag);
    }
}

