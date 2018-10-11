public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(2,16);
        ll.remove(3);
        ll.add(4,9);
        System.out.println("Độ dài của List là: " + ll.size());
        ll.printList();
        ll.remove((Integer)13);
        System.out.println("Độ dài của List là: " + ll.size());
        ll.printList();
        MyLinkedList nn = ll.clonelist();
        System.out.println("List sau khi clone sang list nn: ");
        nn.printList();
        boolean bc = ll.contains(12);
        if(bc){
            System.out.println("Phần tử có trong list");
        }else{
            System.out.println("Phần tử không có trong mảng");
        }
        int inof = ll.indexOf(9);
        if(inof == 0){
            System.out.println("Giá trị không tồn tại");
        }
        else {
            System.out.println("Vị trí của giá trị cần tìm là: " + inof);
        }
        int g = (Integer) ll.get(3);
        System.out.println("Giá trị vừa get là: " + g);

        g = (Integer) nn.getFirst();
        System.out.println("Giá trị get first là: " + g);
        g = (Integer) nn.getLast();
        System.out.println("Giá trị get last là: " + g);
        nn.clear();
        nn.printList();
    }
}