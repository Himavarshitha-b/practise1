package Exceptions;
import exception
public class Employee {

           private int empid;

           private String name;

           private float basic;

           private float da;

           private float hra;

           private float totalAllowances;//da+hra

           private float loanEMI;

           private float pf;

           private float totalDeductions;//pf+loanEMI

           private float salary;

 

           public Employee(int empid, String name, float basic, float da, float hra,

                                 float loanEMI, float pf) {

                      super();

                      this.empid = empid;

                      this.name = name;

                      this.basic = basic;

                      this.da = da;

                      this.hra = hra;

                      this.loanEMI = loanEMI;

                      this.pf = pf;

           }

 

           public int getEmpid() {

                      return empid;

           }

 

           public void setEmpid(int empid) {

                      this.empid = empid;

           }

 

           public String getName() {

                      return name;

           }

 

           public void setName(String name) {

                      this.name = name;

           }

 

           public float getBasic() {

                      return basic;

           }

 

           public void setBasic(float basic) {

                      this.basic = basic;

           }

 

           public float getDa() {

                      return da;

           }

 

           public void setDa(float da) {

                      this.da = da;

           }

 

           public float getHra() {

                      return hra;

           }

 

           public void setHra(float hra) {

                      this.hra = hra;

           }

 

           public float getLoanEMI() {

                      return loanEMI;

           }

 

           public void setLoanEMI(float loanEMI) {

                      this.loanEMI = loanEMI;

           }

 

           public float getPf() {

                      return pf;

           }

 

           public void setPf(float pf) {

                      this.pf = pf;

           }

 

           public float getTotalAllowances() {

                      return totalAllowances;

           }

 

           public float getTotalDeductions() {

                      return totalDeductions;

           }

 

           public float getSalary() {

                      return salary;

           }

 

           private void calculateAllowances() {

                      totalAllowances = da + hra;

           }

 

           private void calculateDeductions() throws ExcessiveDeductionException {

                      //No try-catch-finally found here.

                      totalDeductions = pf + loanEMI;

                      if (totalDeductions > 5000) {

                                 throw new ExcessiveDeductionException("Deduction cannot be more than 5000");

                      }

           }

 

           public void calcSalary() {

                      calculateAllowances();

                      try {

                                 calculateDeductions();

                      } catch (ExcessiveDeductionException e) {

                                 System.out.println(e.getMessage());

                                 //e.printStackTrace();//Not used in custom exceptions

                                 totalDeductions = 5000;//Excessive deduction part is removed.

                                 //Deduction restricted to 5000

                      }

                      salary = basic + totalAllowances - totalDeductions;

                      System.out.println("Done!");

           }

 

           @Override

           public String toString() {

                      return "Employee [empid=" + empid + ", name=" + name + ", basic="

                                            + basic + ", da=" + da + ", hra=" + hra + ", totalAllowances="

                                            + totalAllowances + ", loanEMI=" + loanEMI + ", pf=" + pf

                                            + ", totalDeductions=" + totalDeductions + ", salary=" + salary

                                            + "]";

           }

}

 


