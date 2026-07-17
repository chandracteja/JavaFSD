import java.util.HashMap;

class StudentDatabase {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println(students.get(102));

        students.remove(103);

        students.forEach((id, name) ->
            System.out.println(id + " : " + name)
        );
    }
}