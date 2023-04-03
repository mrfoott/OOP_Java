package OOP.Module0.Bai9;

public class Main {
    public static void main(String[] args) throws Exception {
        Worker cn1 = new Worker(134632, "Tran", "Sang", 178);
        Worker cn2 = new Worker(254563, "Nguyen", "Ha", 341);
        Worker cn3 = new Worker(432685, "Le", "Cuong", 17);
        Worker cn4 = new Worker(334232, "Ho", "Trang", 233);
        Worker cn5 = new Worker(685489, "Dinh", "Thuy", 117);
        Worker cn6 = new Worker(457128, "Vo", "Diem", 457);

        WorkerLists workerLists = new WorkerLists(10);
        workerLists.addWorker(cn1);
        workerLists.addWorker(cn2);
        workerLists.addWorker(cn3);
        workerLists.addWorker(cn4);
        workerLists.addWorker(cn5);
        workerLists.addWorker(cn6);

        System.out.println(workerLists.toString());
        System.out.println("=======================================================");
        System.out.println("There are: " + workerLists.workersQuantity() + " workers");
        System.out.println("=======================================================");
        System.out.println("Workers with more than 200 products: ");
        workerLists.workersWithMoreThan200Products();
        System.out.println("=======================================================");
        System.out.println("Workers sorted by decrease products quantity");
        workerLists.sortWorkersByProductsQuantity();
        System.out.println(workerLists);
    }
}
