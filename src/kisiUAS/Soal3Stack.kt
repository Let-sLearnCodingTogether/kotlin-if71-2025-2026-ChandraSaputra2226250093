package kisiUAS

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
    fun peek(): Element?
}

class NilaiAkhir<T : Any> : Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString(): String {
        return storage.asReversed().toString()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (storage.isEmpty()) return null
        return storage.removeAt(storage.size - 1)
    }

    override fun peek(): T? {
        return if (storage.isEmpty()) null else storage[storage.size - 1]
    }

    fun cetak(){
        println(storage)
    }


}

fun main() {
    //stack fifo(first in first out)
    val stack = NilaiAkhir<Int>()

    stack.push(10)
    stack.push(20)
    stack.pop()
    stack.peek()

    println(stack)
    stack.cetak()
}