package processmanagement;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcessManager manager = new ProcessManager();
        
        // Adding processes
        manager.addProcess(new Process(1, "Process A", "Pending"));
        manager.addProcess(new Process(2, "Process B", "Running"));
        
        // Listing all processes
        List<Process> allProcesses = manager.listAllProcesses();
        System.out.println("All Processes:");
        for (Process process : allProcesses) {
            System.out.println(process);
        }
        
        // Searching for a process
        Process processById = manager.searchProcess(1);
        if (processById != null) {
            System.out.println("\nProcess found by ID 1:");
            System.out.println(processById);
        } else {
            System.out.println("\nProcess with ID 1 not found.");
        }
        
        // Updating process status
        boolean statusUpdated = manager.updateProcessStatus(1, "Completed");
        if (statusUpdated) {
            System.out.println("\nProcess status updated successfully.");
        } else {
            System.out.println("\nFailed to update process status.");
        }
        
        // Removing a process
        boolean removed = manager.removeProcess(2);
        if (removed) {
            System.out.println("\nProcess with ID 2 removed successfully.");
        } else {
            System.out.println("\nFailed to remove process with ID 2.");
        }
        
        // Adding to completed processes history
        manager.addCompletedProcess(new Process(1, "Process A", "Completed"));
        
        // Listing completed processes history
        List<Process> completedHistory = manager.getCompletedProcessesHistory();
        System.out.println("\nCompleted Processes History:");
        for (Process process : completedHistory) {
            System.out.println(process);
        }
        
        // Adding to pending processes history
        manager.addPendingProcess(new Process(3, "Process C", "Pending"));
        
        // Listing pending processes history
        List<Process> pendingHistory = manager.getPendingProcessesHistory();
        System.out.println("\nPending Processes History:");
        for (Process process : pendingHistory) {
            System.out.println(process);
        }
    }
}
