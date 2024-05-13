public class ArrayWithExtension {
    public static void main(String[] args) {
        ElementsInsertion i = new ElementsInsertion();
        i.AddElem(20);
        i.AddElem(340);
        i.AddElem(45);
        i.AddElem(245);
        i.AddElem(24);
        i.AddElem(80);
        i.AddElem(803);
        i.AddElem(805);
        i.AddElem(804);
        i.AddElem(80);
        i.AddElem(80);
        i.AddElem(80);
        i.AddElem(80);
        i.AddElem(80);

        i.show();

    }
}

class ElementsInsertion {
    int pos;
    int size;
    int[] arr = new int[5];

    public void AddElem(int data) {
        arr[(pos + 1) % 5] = data;
        pos++;
        size++;

    }

    public void show() {
        for (int j = 0; j < size; j++) {
            System.out.print(arr[(j + pos) % 5] + " ");
        }
    }
}