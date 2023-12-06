package nesne;
abstract class BaseDatabaseManager{
    public abstract void getData();
}
class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData(){
        System.out.println("Veri getirildi:Oracle");
    }
}
class SqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData(){
        System.out.println("veri getirildi:SQL");
    }
}
class CustomerManager{
    BaseDatabaseManager databasemanager;
    public void getCustomers(){
        databasemanager.getData();
    }
}

public class abstractclass {
    public static void main(String[] args) {
     CustomerManager csm=new CustomerManager();
     csm.databasemanager=new SqlDatabaseManager();
     csm.getCustomers();
    }
}
