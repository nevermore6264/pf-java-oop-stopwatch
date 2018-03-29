
public class App {
    //Thuật toán sắp xếp tăng dần
    public static void sortASC(int[] listNumber) {
        int temp = listNumber[0];
        for (int i = 0; i < listNumber.length - 1; i++) {
            for (int j = i + 1; j < listNumber.length; j++) {
                if (listNumber[i] > listNumber[j]) {
                    temp = listNumber[j];
                    listNumber[j] = listNumber[i];
                    listNumber[i] = temp;
                }
            }
        }
    }

    //Phương thức hiển thị danh sách
    public static void showListNumber(int[] listNumber) {
        for (int i = 0; i < listNumber.length; i++) {
            System.out.print(listNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Tạo mảng chứ 50 phần tử
        int listNumber[] = new int[100000];

        //Random 0 - 100000
        for (int i = 0; i < 100000; i++) {
            listNumber[i] = (int) Math.round(Math.random() * 100000);
        }

        //Sắp xếp và hiển thị
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        System.out.println("Started");

        sortASC(listNumber);
        showListNumber(listNumber);

        System.out.println("Stopped");

        stopwatch.stop();

        double totalTime = (double) stopwatch.getElapsedTime() / 1000;
        System.out.println("Total time is: " + totalTime + " seconds ");


    }
}