package immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        // use getter method to use
        ImmutableEg1 eg1 = new ImmutableEg1(1,"d-688",90000.09,"999988887777");
        System.out.println(eg1.getEmployeeId());
        System.out.println(Long.parseLong(eg1.getAccountNo()));
        System.out.println(eg1.getAddress());
        System.out.println(eg1.getSalary());



    }
    }
