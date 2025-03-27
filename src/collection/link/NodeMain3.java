package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {

        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A"); //x01
        first.next = new Node("B"); //x02
        first.next.next = new Node("C"); //x03

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);
        System.out.println();

        //마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLsatNode(first);
        System.out.println("lastNode = " + lastNode);
        System.out.println();

        //특정 index의 노드 조회하기
        System.out.println("특정 index의 노드 조회하기");
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);
        System.out.println();

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println("first = " + first);
        add(first, "E");
        System.out.println("first = " + first);
        add(first, "F");
        System.out.println("first = " + first);


    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

    }

    private static Node getLsatNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    private static void add(Node node, String param) {
        Node lsatNode = getLsatNode(node);
        lsatNode.next = new Node(param);


    }
}
