import java.util.Scanner;

class RRT{
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project){
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public int getTicketNo(){
        return this.ticketNo;
    }
    public String getRaisedBy(){
        return this.raisedBy;
    }
    public String getAssignedTo(){
        return this.assignedTo;
    }
    public int getPriority(){
        return this.priority;
    }
    public String getProject(){
        return this.project;
    }
}

class GenericClass{
    public int value;
    public RRT obj;

    public GenericClass(RRT obj, int value){
        this.obj = obj;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public RRT getObj(){
        return this.obj;
    }
}

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of team");
        int n = sc.nextInt();
        sc.nextLine();

        RRT[] rapidTeam = new RRT[n];

        for(int i = 0 ; i<n ; i++){
            int tNo = sc.nextInt();
            sc.nextLine();
            String raise = sc.nextLine();
            String assign = sc.nextLine();
            int prio = sc.nextInt();
            sc.nextLine();
            String project = sc.nextLine();

            rapidTeam[i] = new RRT(tNo,raise,assign,prio,project);
        }

        System.out.println("Enter the given Project: ");
        String givenProject = sc.nextLine();

        RRT ans = getHighestPriorityTicket(rapidTeam, givenProject);
        if(ans != null){
            System.out.println("TicketNo: "+ans.getTicketNo()+", Raised By: "+ans.getRaisedBy()+", Assigned To: "+ans.getAssignedTo());
        }
        else{
            System.out.println("No such Ticket");
        }

    }

    public static RRT getHighestPriorityTicket(RRT[] rapidTeam, String givenProject){
        GenericClass obj1 = new GenericClass(null, 0);
        for(RRT teams: rapidTeam){
            if(teams.getProject().equalsIgnoreCase(givenProject)){
                if(obj1.obj != null){
                    if(teams.getPriority() < obj1.value){
                        obj1.obj = teams;
                        obj1.value = teams.getPriority();
                    }
                }
                else{
                    obj1.value = teams.getPriority();
                    obj1.obj = teams;
                }
            }
        }
        return obj1.obj;
    }
}
