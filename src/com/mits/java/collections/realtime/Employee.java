package com.mits.java.collections.realtime;

public class  Employee {

    private int empId;
    private String empName;
    private String email;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


    @Override
    public int hashCode()
    {
        return empId;
    }

    @Override
    public boolean equals(Object obj)
    {
        Employee employee = (Employee) obj;

        return (empId == employee.empId);
    }




}
