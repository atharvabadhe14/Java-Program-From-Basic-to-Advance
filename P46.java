class Student {
    int rollno[], mob[];
    String sname[], address[];
    static int i = 0;
    static Scanner sc = new Scanner(System.in);

    public void inputData() {
        System.out.println("Enter rollno: ");
        rollno[i] = sc.nextInt();

        System.out.println("Enter name: ");
        sname[i] = sc.next();
         i++;
    }
    public void showInfo() {
        System.out.println("rollno\tsname\tmob\taddress");
        System.out.println("----------------------------------------------");
        for (int k = 0; k < i; k++) {
            System.out.println(rollno[k] + "\t" + sname[k] + "\t" + mob[k] + "\t" + address[k]);
        }
    }
    public void update() {
        System.out.println("Enter rollno to update: ");
        int rno = sc.nextInt();
        for (int k = 0; k < i; k++) {
            if (rno == rollno[k]) {
                System.out.println("Enter new name: ");
                sname[k] = sc.next();

                System.out.println("Record updated successfully!");
                return;
            }
        }
        System.out.println("Roll number not found!");
    }
    public static void main(String[] args) {
        Student m = new Student();
        int ch;

        do {
            System.out.println("1. inputData\n2. showInfo\n3. Update\n4. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    m.inputData();
                    break;
                case 2:
                    m.showInfo();
                    break;
                case 3:
                    m.update();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (ch != 0);
    }
}
