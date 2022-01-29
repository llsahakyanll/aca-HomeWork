package com.aca;

public class Day18 {
    public static void funcMain() {
//      --------| Task 1 |--------
        /*Animal dog = new Dog();
        dog.voice();
        dog.eat();*/
//      --------| End Task 1 |----

//      --------| Task 2 |--------
        Accounting sahak = new Accounting(50, "WebStart");
        sahak = new TaxAccounting();
        sahak.setCountOfEmployers(50);
        sahak.account();
        sahak = new FinancialAccount();
        sahak.setCountOfEmployers(50);
        sahak.account();
//      --------| End Task 2 |----

    }
}
