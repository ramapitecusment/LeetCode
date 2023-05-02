package concurrency

import java.util.concurrent.LinkedBlockingQueue

private class Handler(private val looper: Looper) {

    fun post(value: Runnable) {
        looper.enqueue(value)
    }

    fun remove(value: Runnable) {
        looper.dequeue(value)
    }

}

private class Looper : Thread() {

    private val queue = LinkedBlockingQueue<Runnable>()

    override fun run() {
        super.run()
        while (true) {
            val element = queue.take()
            element.run()
        }
    }

    fun enqueue(value: Runnable) {
        queue.put(value)
    }

    fun dequeue(value: Runnable) {
        queue.remove(value)
    }

}