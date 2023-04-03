package OOP.Module0.Bai9;

import java.util.ArrayList;

public class WorkerLists {
    private ArrayList<Worker> workers = new ArrayList<>();
    private int maximum;

    public WorkerLists(int n) throws Exception {
        if (n > 0) {
            workers.ensureCapacity(n);
            maximum = n;
        } else {
            throw new Exception("Failed to create workers list!!!");
        }
    }

    public boolean addWorker(Worker worker) {
        if (workers.size() == maximum) {
            return false;
        } else {
            workers.add(worker);
            return true;
        }
    }

    @Override
    public String toString() {
        String workersInfo = "";

        for (Worker worker : workers) {
            workersInfo += worker.toString() + "\n";
        }
        return workersInfo;
    }

    public int workersQuantity() {
//        int totalWorkers = 0;
//
//        for (Worker worker : workers) {
//            totalWorkers += 1;
//        }
//
//        return totalWorkers;

        return workers.size();
    }

    public void workersWithMoreThan200Products() {
        for (Worker worker: workers) {
            if (worker.getwProductQuantity() > 200) {
                System.out.println(worker);
            }
        }
    }

    public void sortWorkersByProductsQuantity() {
        workers.sort((s1, s2) -> {
            if (s1.getwProductQuantity() < s2.getwProductQuantity()) {
                return -1;
            } else {
                return 1;
            }
        });
    }
}
