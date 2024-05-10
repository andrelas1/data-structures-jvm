package com.bide1.dts

open class Node<T>(val value: T) {
    private val connections = mutableListOf<Node<T>>()
    private var visited: Boolean = false

    constructor(value: T, connections: List<Node<T>>) : this(value) {
        this.connections += connections
    }

    fun getVal(): T {
        return value
    }

    fun getConnections(): List<Node<T>> {
        return this.connections
    }

    fun setConnection(vararg connectedNodes: Node<T>): Unit {
        for (c in connectedNodes) {
            this.connections.add(c)
        }
    }

    fun setVisited(): Unit {
        this.visited = true
    }

    fun visitedBefore(): Boolean {
        return this.visited
    }

    fun resetVisited(): Unit {
        this.visited = false
    }
}


