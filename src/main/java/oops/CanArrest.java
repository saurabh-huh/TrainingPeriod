package oops;

public class CanArrest {
    public static void main(String[] args) {
        MP mp = new MP("Arun","A1",200000);
        Minister minister = new Minister("Yogi ji","B1",2000000);
        PM pm = new PM("Modi Ji","C1",1000,false);

        Commissioner commissioner = new Commissioner();
        commissioner.canArrestMP(mp);
        commissioner.canArrestMinister(minister,pm);
    }
}

class MP{
    public String name;
    public String constituency;
    int spendingLimit = 100000;
    int expense;
    String driver = "Car";
    public boolean isSpendingLimitExceed(){
        return expense > spendingLimit;
    }

    public String getConstituency() {
        return constituency;
    }

    public String getDriver() {
        return driver;
    }

    public MP(String name, String constituency,int expense) {
        this.constituency = constituency;
        this.expense = expense;
        this.name = name;
    }
}

class Minister extends MP{
    public Minister(String name,String constituency,int expense){
        super(name, constituency,expense);
        this.spendingLimit = 1000000;
    }
}
class PM extends Minister{
    boolean isPermit;
    public PM(String name,String constituency,int expense,boolean isPermit){
        super(name,constituency,expense);
        this.spendingLimit = 10000000;
        this.driver = "Aircraft";
        this.isPermit = isPermit;
    }
}
class Commissioner{
    public void canArrestMP(MP mp){
        if(mp.isSpendingLimitExceed()){
            System.out.println(mp.name+" Arrested");
        } else {
            System.out.println("Not Arrested");
        }
    }
    public void canArrestMinister(Minister minister,PM pm){
        if(minister.isSpendingLimitExceed() && pm.isPermit){
            System.out.println(minister.name + " Arrested with PM permission");
        }
        else {
            System.out.println("Not Arrested");
        }
    }
}
