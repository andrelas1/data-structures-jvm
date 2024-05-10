package com.bide1.dts

data class Graph<T>(val nodes: List<Node<T>>) {
    val root = nodes[0]

    fun traverseGraph(predicate: (n: Node<T>) -> Unit) {
        predicate(root)
        root.setVisited()
        traverseGraph(predicate, root.getConnections())
        nodes.forEach { n -> n.resetVisited() }
    }

    private fun traverseGraph(predicate: (n: Node<T>) -> Unit, nodes: List<Node<T>>) {
        nodes
            .filter { n -> !n.visitedBefore() }
            .forEach { n ->
                predicate(n)
                n.setVisited()
                traverseGraph(predicate, n.getConnections())
            }
    }

    fun findValueInGraph(valueToBeFound: T): Node<T>? {
        var foundVal: Node<T>? = null

        traverseGraph { n -> if (n.getVal() == valueToBeFound) foundVal = n }

        return foundVal
    }
}
