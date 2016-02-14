package ru.itis.inform;


public class FareyGenerate {
    RationalNumber array[] = new RationalNumber[100];

    private int n;

    private int end;
    private int index;

    public void Generate(int n) {
        Initialize();
        this.n = n;
        this.end = 2;
        do {
            if (array[index].getB() + array[index+1].getB()<=this.n) {
                array[end] = new RationalNumber(array[index].getA() + array[index + 1].getA(),array[index].getB() + array[index + 1].getB());
                end++;
                Shift(end, array, index);
            } else {
                index++;
            }

        } while (this.index< end -1);
    }

    public void Print() {
        for (int i = 0; i < this.end; i++) {
            System.out.print(array[i].getA()+"/"+array[i].getB()+"  ");
        }
    }

    private void Initialize() {
        array[0] = new RationalNumber(0,1);
        array[1] = new RationalNumber(1,1);
        for (int i = 2; i < 100; i++) {
            array[i] = new RationalNumber();
        }
    }

    private void Shift(int fixCount, RationalNumber array[], int index) {
        int changeNum = array[fixCount-1].getA();
        int changeDem = array[fixCount-1].getB();
        for (int i = fixCount-1; i>index+1; i--) {
            array[i] = new RationalNumber(array[i-1].getA(), array[i - 1].getB());
        }
        array[index+1] = new RationalNumber(changeNum, changeDem);
    }
}
