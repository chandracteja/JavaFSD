class Result {

    public void calculateGrade() {
        System.out.println("Calculating Grade ...");
    }
}

class UGStudent extends Result {

    @Override
    public void calculateGrade() {
        System.out.println("Grade calculated using UG rules");
    }
}

class PGStudent extends Result {

    @Override
    public void calculateGrade() {
        System.out.println("Grade calculated using PG rules");
    }
}

class marks {
    public static void main(String args[]){
        Result r1 = new UGStudent();
        Result r2 = new PGStudent();
        r1.calculateGrade();
        r2.calculateGrade();
        
    }
}