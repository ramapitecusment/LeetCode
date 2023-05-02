package concurrency

import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue

fun main() {

    val queue = ArrayBlockingQueue<String>(3)

    val producer = Producer(queue)
    val consumer1 = Consumer(queue)
    val consumer2 = Consumer(queue)

    val producerThread = Thread(producer)
    val consumerThread1 = Thread(consumer1)
    val consumerThread2 = Thread(consumer2)

    producerThread.start()
    consumerThread1.start()
    consumerThread2.start()

}

private class Producer(private val queue: BlockingQueue<String>) : Runnable {

    override fun run() {
        while (true) {
            val mills = System.currentTimeMillis()
            try {
                queue.put(mills.toString())
            } catch (e: InterruptedException) {
                println("Producer was interrupted")
            }
            sleep(1000)
        }
    }

    private fun sleep(mills: Long) {
        try {
            Thread.sleep(mills)
        } catch (e: InterruptedException) {
            println(e)
        }
    }

}

private class Consumer(private val queue: BlockingQueue<String>) : Runnable {

    override fun run() {
        while (true) {
            try {
                val element = queue.take()
                println("${Thread.currentThread().name} consumed $element")
            } catch (e: InterruptedException) {
                println("Consumer was interrupted")
            }
        }
    }

}