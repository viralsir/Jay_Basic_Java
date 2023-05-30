package interfacedemo;

public interface i2
{
    float[] disocunt_by_department={10,20,30,50};
    String departments[]={"HR","Finance","IT","Marketing"};

    int getSalary();

    float calculate_salary(int salary,int department_code);

    void display_salary(float finalsalary);


}
