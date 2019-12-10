import java.util.LinkedList;

class Node {

        private String value;
        private LinkedList<Node> edges;  //children

        public Node(String value) {
            this.value = value;
            this.edges = new LinkedList<Node>();
        }

        public String getValue() {
            return this.value;
        }

        public LinkedList<Node> getEdges() {
            return new LinkedList<Node>(this.edges);
// uses copy constructor to preserve encapsulation
        }

        public void addEdge(Node target) {
            this.edges.add(target);
        }
}