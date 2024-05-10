package com.bide1.impl

import com.bide1.dts.Graph
import com.bide1.dts.Node

fun main() {
    val nodes = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(::Node)

    nodes[0].setConnection(nodes[1])

    nodes[1].setConnection(nodes[2], nodes[3])

    nodes[2].setConnection(nodes[4])

    nodes[3].setConnection(nodes[4])

    nodes[4].setConnection(nodes[6], nodes[7])

    nodes[6].setConnection(nodes[9])

    nodes[7].setConnection(nodes[5], nodes[8])

    nodes[9].setConnection(nodes[10])

    val graph = Graph(nodes)
    graph.traverseGraph { n -> println("NODE: ${n.getVal()}") }

    val foundNode = graph.findValueInGraph(7)

    println("FOUND VALUE >>>> NODE: $foundNode |||| VALUE: ${foundNode?.getVal()}")
}

