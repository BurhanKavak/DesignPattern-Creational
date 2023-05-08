import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();


        Employees empNew = (Employees) emps.clone();
        Employees empNew1 = (Employees) emps.clone();

        List<String> list = empNew.getEmpList();
        list.add("Busenur");
        List<String> list1 = empNew1.getEmpList();
        list.remove("Asım");

        System.out.println("emp List: "+emps.getEmpList());
        System.out.println("empNew List:" + list);
        System.out.println("empNew1 List: " + list1);
    }
}