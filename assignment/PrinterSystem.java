// Base class
class Printer {
    public void print() {
        System.out.println("Printing document...");
    }
}

// Inkjet Printer
class InkjetPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("Printing using Inkjet Printer.");
    }
}

// Laser Printer
class LaserPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("Printing using Laser Printer.");
    }
}

// Dot Matrix Printer
class DotMatrixPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("Printing using Dot Matrix Printer.");
    }
}

// Main class
public class PrinterSystem {
    public static void main(String[] args) {

        Printer p1 = new InkjetPrinter();
        p1.print();
        Printer p2 = new LaserPrinter();
        p2.print();
        Printer p3 = new DotMatrixPrinter();
        p3.print();
    }
}