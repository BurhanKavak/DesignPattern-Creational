import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }
    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Burhan");
        empList.add("Cihan");
        empList.add("Yenes");
        empList.add("Omer");
        empList.add("Asim");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }

        return new Employees(temp);
    }
}
