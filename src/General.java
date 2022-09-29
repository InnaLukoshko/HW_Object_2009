import java.io.*;

public class General {
    public static final String INFO_FILE = "infoAboutEmployee.txt";
    public static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
//        serialize();
//        Employee employee = deserialize();
//        System.out.println(employee);
    }
    public static void serialize() {
        try (FileOutputStream fos = new FileOutputStream(INFO_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Employee employee = new Employee();
            System.out.println("Введите данные о сотруднике через ввод (ФИО, возраст, должность и ставку (почасовая или помесячняая))");
            employee.setFio(reader.readLine());
            employee.setAge(Integer.parseInt(reader.readLine()));
            employee.setJobTitle(reader.readLine());
            String wageRate = reader.readLine();
            if (wageRate.equalsIgnoreCase("почасовая")) {
                employee.setWageRate(WageRate.HOURLY);
            } else if (wageRate.equalsIgnoreCase("помесячная")) {
                employee.setWageRate(WageRate.MONTHLY);
            } else System.out.println("Ошибка ввода ставки зарплаты");

            oos.writeObject(employee);
            System.out.println("Данные сотрудника внесены в файл");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static Employee deserialize() {
        Employee employee = null;
        try (FileInputStream fis = new FileInputStream(INFO_FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            employee = (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return employee;
    }
}
