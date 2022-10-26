package encapsulation26;

public class TestEncapsulation
{
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Palak");
        obj.setAge(23);
        obj.setRollNo(50);
        System.out.println("Prime's name :"+obj.getName());
        System.out.println("Prime's age:"+obj.getAge());
        System.out.println("Prime's rollNo:"+obj.getRollNo());
    }
}

