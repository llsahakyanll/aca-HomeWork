package com.aca;

public class FinancialAccount extends TaxAccounting{
    public FinancialAccount() {
        super();
    }

    private int countOfEmployers;
    private String departmentName;

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
    @Override
    public void account() {
        System.out.println(getCountOfEmployers() * 75000);
    }
}
