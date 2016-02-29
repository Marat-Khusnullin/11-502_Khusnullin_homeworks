package ru.itis.inform;


public class HumansSorter {
    public void initArrayByLinked() {
        for (int i=0;i<)
    }
    public LinkedList<Human> sort(LinkedList<Human> humanLinkedList) {


        ArrayList<LinkedList<Human>> arrayList = new ArrayList<>();

        Node<Human> r = humanLinkedList.getFirst();

        while (r != null) {
            int currentAge = r.getValue().getAge();

            LinkedList <Human> linkedList = arrayList.get(currentAge);
            if (linkedList == null) {
                arrayList.set(currentAge,new LinkedList());
            }

            arrayList.get(currentAge).addToEnd(r.getValue());

            r = r.getNext();
        }
        LinkedList<Human> newHumanLinkedList = new LinkedList<Human>();

        //newHumanLinkedList = arrayList.append(newHumanLinkedList);

        return newHumanLinkedList;
    }


}
