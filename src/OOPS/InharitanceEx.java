package OOPS;

public class InharitanceEx {
    public static void main(String[] args) {
        Address address = new Address("meerut", "UP", "India", 250001);
        Student st = new Student(101, "sam", address, "sam@mail", "btech", 20000.0);
//        st.setId(101);
//        st.setName("sam");
//        st.setCourse("btech");
//        st.setFees(3000.0);
//        st.setAddress("meerut");
//        st.setContect("sam@mail");

        System.out.println(st.getCourse());
        System.out.println(st.getFees());
        System.out.println(st.getAddress());
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getContect());
    }
}



// what is lombok? learn ....