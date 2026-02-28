class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }
}

public class NewState{
    public static void main(String[] args){
        MyThread t = new MyThread();
        //System.out.println("State: "+t.getState()); //NEW
        t.start();
        System.out.println("State: "+t.getState()); //RUNNABLE

        //t.run(); //RUNNABLE
        //System.out.println(t.getState()); //TERMINATED

    }
}


/*3.Thread lifecycle:
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
*/