package ru.itis.inform;


public class HumansSorter {

    ArrayList<LinkedList<Human>> arrayList = new ArrayList<>();

   public void initArrayByLinked() {

        for (int i = 0; i < 26; i++) {
            LinkedList<Human> current = this.arrayList.get(i);
            if (current == null)
                this.arrayList.set(i, new LinkedList<Human>());

        }
   }



    public LinkedList<Human> sort(LinkedList<Human> humanLinkedList) {
        Iterator<Human> iterator = humanLinkedList.iterator();
        String element = iterator.pickNext().getName();
        int length = element.length();


        for (int i = length - 1; i >= 0; i--) {


            while (iterator.hasNext()) {
                char[] nameByArray = iterator.pickNext().getName().toCharArray();

                int j = toCode(nameByArray[i]);
                if (arrayList.get(j) == null) {
                    arrayList.set(j, new LinkedList<Human>());
                }
                arrayList.get(j).addToEnd(iterator.pickNext());

                iterator.next();
            }

            LinkedList<Human> m = new LinkedList<Human>();
            m.add(null);
            for (int e = 25; e>=0; e--) {
                if (arrayList.get(e)!= null) {
                    m.append(arrayList.get(e));
                }
                arrayList.set(e, new LinkedList<Human>());
            }

            humanLinkedList = m;
            iterator.back(humanLinkedList);

        }

        return humanLinkedList;
    }


    public int toCode(char sign) {
        int code = sign - 97;
        return code;
    }
}
