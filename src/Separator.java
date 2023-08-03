public class Separator {

    int[] array = new int[]{};


    public Separator(int[] array) {

        this.array = array;
    }

    void even() {
        int[] o = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                o[i] = array[i];
                System.out.println(o[i]);
            }


        }


    }

    public void odd() {
        int[] e = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                e[i] = array[i];
                System.out.println(e[i]);
            }


        }


    }


}
