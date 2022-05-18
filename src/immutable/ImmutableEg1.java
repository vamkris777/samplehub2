package immutable;
// step 1 for immutability make class as final
public final class ImmutableEg1 {
    // step 2 make instance as private
    // Step 3 make field as final
    private final Integer employeeId;
    private final String address;
    private final double salary;
    private final String accountNo;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getAccountNo() {
        return accountNo;
    }

    // step 4 create parameterised constructor
    public ImmutableEg1(Integer employeeId, String address, double salary, String accountNo) {
        this.employeeId = employeeId;
        this.address = address;
        this.salary = salary;
        this.accountNo = accountNo;
    }
}
