import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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

public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<RRT> list = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i<n ; i++){
            int ticketno = sc.nextInt();
            sc.nextLine();

            String raisedBy = sc.nextLine();
            String assignedTo = sc.nextLine();
            int priority = sc.nextInt();
            sc.nextLine();
            String project = sc.nextLine();

            list.add(new RRT(ticketno, raisedBy, assignedTo, priority, project));
        }


        String searchByProject = sc.nextLine();
        RRT ans = getHighestPriorityTicket(list, searchByProject);

        if(ans != null){
            System.out.println(ans.getTicketNo()+"#"+ans.getRaisedBy()+"#"+ans.getAssignedTo());
        }
        else{
            System.out.println("No such ticket");
        }

        sc.close();
    }

    public static RRT getHighestPriorityTicket(List<RRT> list, String searchByProject){
        int maxi = Integer.MAX_VALUE;
        RRT ans = null;

        for(RRT obj: list){
            if(obj.getProject().compareToIgnoreCase(searchByProject) == 0 && obj.getPriority() < maxi){
                maxi = obj.getPriority();
                ans = obj;
            }
        }
        return ans;
    }
}
