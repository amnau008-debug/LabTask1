public class Lab {

    private static int counter = 0;
    private static String ID_PREFIX = "LAB";

    private String id;
    private String universityName;
    private String departmentName;
    private String sectionName;
    private String labName;
    private int totalComputers;
    private int bookedComputers;
    private Date labDate;

    private String generateID() {
        counter++;
        return ID_PREFIX + counter;
    }

    
    public Lab() {
        this("COMSATS","CS","A","Programming Lab",40,0,new Date(1,1,2025));
    }

    
    public Lab(String u, String d) {
        this(u,d,"A","Basic Lab",30,0,new Date(1,1,2025));
    }

    
    public Lab(String u, String d, String s) {
        this(u,d,s,"General Lab",30,0,new Date(1,1,2025));
    }

    
    public Lab(String u,String d,String s,String l,int t,int b,Date date) {
        id = generateID();
        universityName = u;
        departmentName = d;
        sectionName = s;
        labName = l;
        totalComputers = t;
        bookedComputers = b;
        labDate = new Date(date);
    }

    
    public Lab(Lab l) {
        id = generateID();
        universityName = l.universityName;
        departmentName = l.departmentName;
        sectionName = l.sectionName;
        labName = l.labName;
        totalComputers = l.totalComputers;
        bookedComputers = l.bookedComputers;
        labDate = new Date(l.labDate);
    }

    
    public void bookComputers(int count) {

        if(bookedComputers + count <= totalComputers) {
            bookedComputers += count;
            System.out.println(count + " computers booked");
        }
        else {
            System.out.println("Not enough computers available");
        }
    }

    
    public void cancelBooking(int count) {

        if(count <= bookedComputers) {
            bookedComputers -= count;
            System.out.println(count + " booking cancelled");
        }
    }

    public int availableComputers() {
        return totalComputers - bookedComputers;
    }

   
    public boolean equals(Lab l) {

        if(universityName.equals(l.universityName) &&
           departmentName.equals(l.departmentName) &&
           sectionName.equals(l.sectionName))
            return true;
        else
            return false;
    }

    public static int getTotalLabs() {
        return counter;
    }

    
    public String toString() {

        return "\nLab ID: " + id +
               "\nUniversity: " + universityName +
               "\nDepartment: " + departmentName +
               "\nSection: " + sectionName +
               "\nLab Name: " + labName +
               "\nTotal Computers: " + totalComputers +
               "\nBooked Computers: " + bookedComputers +
               "\nAvailable Computers: " + availableComputers() +
               "\nLab Date: " + labDate;
    }
}