/* Multithreading allows a program to execute multiple threads concurrently/simulatenously to perform multiple tasks efficiently.

2.Ways to create a thread in Java:
1. By extending the Thread class: You can create a new class that extends the Thread class and override the run() method to define the code that will be executed by the thread. Then, you can create an instance of your thread class and call the start() method to begin execution.
2. By implementing the Runnable interface: You can create a new class that implements the Runnable interface and override the run() method to define the code that will be executed by the thread. Then, you can create an instance of your Runnable class, pass it to a Thread object, and call the start() method on the Thread object to begin execution.

3.Thread lifecycle:
5main states of a thread's lifecycle are: New,Runnable,Running,Blocked,Waiting,Terminated.
1. New: A thread is in the new state when it is created but has not yet started.
2. Runnable: A thread is in the runnable state when it is ready to run but is waiting for the CPU to be available.
3. Running: A thread is in the running state when it is executing its run() method.
4. Blocked: A thread is in the blocked state when it is waiting for a resource or another thread to release a lock.
5. Waiting: A thread is in the waiting state when it is waiting indefinitely for another thread to perform a specific action.

sleep(),run(),wait(),join() are some of the methods that can cause a thread to enter the waiting state. 
The sleep() method causes the thread to pause for a specified amount of time, 
while the wait() method causes the thread to wait until another thread calls notify() or notifyAll() on the same object. 
The join() method causes the current thread to wait until another thread has finished executing.

6. Timed Waiting: A thread is in the timed waiting state when it is waiting for a specified amount of time for another thread to perform a specific action.
7. Terminated: A thread is in the terminated state when it has completed its execution or has been terminated by another thread.

---------------------------

4.Thread synchronization: Thread synchronization is the process of coordinating the execution of multiple threads to ensure that they do not interfere with each other when accessing shared resources. This can be achieved using various synchronization mechanisms such as synchronized blocks, locks, and semaphores.
5.Thread communication: Thread communication is the process of allowing threads to communicate with each other to coordinate their actions. This can be achieved using various communication mechanisms such as wait(), notify(), and notifyAll() methods.
6.Thread safety: Thread safety is the property of a program or code that ensures that it can be safely executed by multiple threads without causing any unintended side effects or errors. This can be achieved by using synchronization mechanisms to protect shared resources and ensuring that the code is designed to handle concurrent access properly.