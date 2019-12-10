public class Main {
    public static void main(String[] args) {
        Node rootNode = new Node("Animals");
        Node vertebrates = new Node("Vertebrates");
        Node mammals = new Node("Mammals");
        Node birds = new Node("Birds");
        Node fish = new Node("Fish");
        rootNode.addEdge(vertebrates);
        vertebrates.addEdge(mammals);
        vertebrates.addEdge(birds);
        vertebrates.addEdge(fish);

        for (Node child : vertebrates.getEdges()) {

            System.out.println(child.getValue());

        }

    }
}

