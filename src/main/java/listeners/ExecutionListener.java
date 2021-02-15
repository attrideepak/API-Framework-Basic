package listeners;

import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        System.out.println("Execution started");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("Execution fineshed");
    }
}
