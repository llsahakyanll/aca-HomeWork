package com.aca;

public class Accounting {
//countOfEmployers, departmentName and has method account()
    private int countOfEmployers;
    private String departmentName;

    public Accounting() {
    }
    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }


    public int getCountOfEmployers() {
        return countOfEmployers;
    }
    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account() {

    }
}
