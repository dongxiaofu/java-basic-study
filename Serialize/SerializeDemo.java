import java.io.*;

import employees.*;

public class SerializeDemo {
    private static final String FILENAME = "data.txt";

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "cg";
        employee.address = "Haiding Beijing";
        employee.SSN = 123;

        try {
            FileOutputStream fop = new FileOutputStream(FILENAME);
            ObjectOutputStream out = new ObjectOutputStream(fop);
            out.writeObject(employee);

            out.close();
            fop.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}