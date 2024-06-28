package processmanagement;

public class Process {
    private int processId;
    private String processName;
    private String status; // Possible values: "Pending", "Running", "Completed"
    
    // Constructor
    public Process(int processId, String processName, String status) {
        this.processId = processId;
        this.processName = processName;
        this.status = status;
    }
    
    // Getters
    public int getProcessId() {
        return processId;
    }
    
    public String getProcessName() {
        return processName;
    }
    
    public String getStatus() {
        return status;
    }
    
    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Process{" +
               "processId=" + processId +
               ", processName='" + processName + '\'' +
               ", status='" + status + '\'' +
               '}';
    }
}

