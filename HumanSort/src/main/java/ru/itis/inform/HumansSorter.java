package ru.itis.inform;


public class HumansSorter {
    ArrayList s = new ArrayList();
    ArrayList<LinkedList<Human>> arrayList = new ArrayList<>();

    public void initArrayByLinked() {
        for (int i =0;i<=99;i++) {
            LinkedList<Human> otherList = this.arrayList.get(i);
            if (otherList == null) {
                this.arrayList.set(i,new LinkedList<Human>());
            }
        }

    }
    public LinkedList<Human> sort(LinkedList<Human> humanLinkedList) {

        Node<Human> r = humanLinkedList.getFirst();

        while (r != null) {
            int currentAge = r.getValue().getAge();

            LinkedList <Human> linkedList = this.arrayList.get(currentAge);
            if (linkedList == null) {
                this.arrayList.set(currentAge,new LinkedList());
            }

            this.arrayList.get(currentAge).add(r.getValue());

            r = r.getNext();
        }
        LinkedList<Human> newHumanLinkedList = new LinkedList<Human>();
        for (int i = 99; i >= 1; i--) {
            if (this.arrayList.get(i) != null) {
                this.arrayList.get(i - 1).append(this.arrayList.get(i));
            }
        }
        return this.arrayList.get(0);
    }


}
