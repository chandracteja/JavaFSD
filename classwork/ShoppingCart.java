//E-Commerce application 
public class ShoppingCart{
//BAD: Array with fixed size
private Product[] items = new Product[10]; // Max 10 items only!

//GOOD: ArrayList with dynamic size
private List<Product> items = new ArrayList<>(); //Unlimited items!

public void addProduct(Product product) {
    items.add(product); // Always works, no size limit!
    }
//2. ADDING ELEMENTS
students.add("Alice");
students.add("Bob");
students.add("Charlie");
students.add("Daina");
System.out.println("Students: " + students); // [Alice, Bob, Charlie, Daina]
 //Add at specific position 
 students.add(1, "Eve"); // Insert at index 1

 //Add all from another collection
 List<String> newStudents = Arrays.asList("Frank", "Grace");
 students.addAll(newStudents); 
 System.out.println("After addAll: " + students); // [Alice, Eve, Bob, Charlie, Daina, Frank, Grace]

 //3. ACCESSING ELEMENTS
 String first  = students.get(0); // Alice
 string third = students.get(2); // Bob
 System.out.println("First: " + first + ", Third: " + third);

 //4. REMOVING ELEMENTS
students.remove("1"); // Remove Eve (by index)
students.remove("Bob"); // Remove Bob (by object)
System.out.println("After removals: " + students); // [Alice, Charlie, Daina, Frank, Grace]

//Remove all elements from another collection
students.removeAll(name -> name.startsWith("F")); // Remove all names starting with "F"
System.out.println("After removeAll: " + students); // [Alice, Charlie, Daina, Grace]

// 5. CHECKNG CONTENTS
boolean hasAlice = students.contains("Alice"); // true
boolean hasBob = students.contains("Bob"); // false
System.out.println("Contains Alice? " + hasAlice);
System.out.println("Contains Bob? " + hasBob);

int index = students.indexOf("Charlie"); // 1
System.out.println("Charlie at index: " + index);

//6. SIZE AND CAPACITY
int size = students.sie(); // 4
boolean empty - students.isEmpty(); // false
Sytem.out.println("Size: " + size + ", Empty? " + empty);

//7. ITERATING - Multiple ways 
System.out.println("\n--- For-each loop (Modern) ---");
for (String student : students) {
    System.out.println("Student: " + student);
}

System.out.println("\n--- Traditional for loop ---");
for (int i = 0; i < students.size(); i++) {
    System.out.println("Student # " + i + ": " + students.get(i));
}

System.out.println("\n--- Iterator (Professional)---");
Iterator<String> iterator = students.iterator();
while (iterator.hasNext()) {
    String student = iterator.next();
    System.out.println("Student: " + student);
}

System.out.println("\n--- Lambda forEach (Java 8+) ---");
students.forEach(student -> System.out.println("Student: " + student));

//8. CLEARING THE LIST
students.clear();
System.out.println("After clear: " + students);
System.out.println("Is empty: " + students.isEmpty());
}