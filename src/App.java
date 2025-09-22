public class App {

    private Node nodeFour = new Node(10, null, null);
    private Node nodeTwo = new Node(15, nodeFour, null);
    private Node nodeThree = new Node(21, null, null);
    private Node nodeOne = new Node(20, nodeTwo, nodeThree);
    
    private BST bst = new BST(nodeOne);

    public static void main(String[] args) throws Exception {
        App appOne = new App();
        Node result = appOne.bst.lookUp(10);
        System.out.println(result.getData());
        System.out.println(result.hashCode());

        App appTwo = new App();
        Node resultOne = appTwo.bst.lookUp(15);
        System.out.println(resultOne.getData());
        System.out.println(resultOne.hashCode());

        App appThree = new App();
        Node resultTwo = appThree.bst.lookUp(21);
        System.out.println(resultTwo.getData());
        System.out.println(resultTwo.hashCode());

        App appFour = new App();
        Node resultThree = appFour.bst.lookUp(20);
        System.out.println(resultThree.getData());
        System.out.println(resultThree.hashCode());

        App appFive = new App();
        Node resultFour = appFive.bst.lookUp(9);
        System.out.println(resultFour);


    }
}
