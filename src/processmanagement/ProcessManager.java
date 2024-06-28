package processmanagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessManager {
    private ArrayList<Process> allProcesses;
    private LinkedList<Process> pendingProcessesHistory;
    private LinkedList<Process> completedProcessesHistory;
    
    public ProcessManager() {
        this.allProcesses = new ArrayList<>();
        this.pendingProcessesHistory = new LinkedList<>();
        this.completedProcessesHistory = new LinkedList<>();
    }
    
    // Add Process using ArrayList
    public void addProcess(Process process) {
        allProcesses.add(process);
    }
    
    // Remove Process by ID
    public boolean removeProcess(int processId) {
        for (Process process : allProcesses) {
            if (process.getProcessId() == processId) {
                allProcesses.remove(process);
                return true;
            }
        }
        return false;
    }
    
    // Search Process by ID
    public Process searchProcess(int processId) {
        for (Process process : allProcesses) {
            if (process.getProcessId() == processId) {
                return process;
            }
        }
        return null; // Process not found
    }
    
    // List All Processes
    public List<Process> listAllProcesses() {
        return new ArrayList<>(allProcesses); // Return a copy to prevent direct modification
    }
    
    // Update Process Status by ID
    public boolean updateProcessStatus(int processId, String newStatus) {
        for (Process process : allProcesses) {
            if (process.getProcessId() == processId) {
                process.setStatus(newStatus);
                return true;
            }
        }
        return false; // Process not found
    }
    
    // Add to Pending Processes History using LinkedList
    public void addPendingProcess(Process process) {
        pendingProcessesHistory.add(process);
    }
    
    // Add to Completed Processes History using LinkedList
    public void addCompletedProcess(Process process) {
        completedProcessesHistory.add(process);
    }
    
    // Get Pending Processes History
    public List<Process> getPendingProcessesHistory() {
        return new ArrayList<>(pendingProcessesHistory); // Return a copy to prevent direct modification
    }
    
    // Get Completed Processes History
    public List<Process> getCompletedProcessesHistory() {
        return new ArrayList<>(completedProcessesHistory); // Return a copy to prevent direct modification
    }
}

