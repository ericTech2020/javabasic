**剑指Java面试-Offer直通车
https://coding.imooc.com/learn/list/303.html**

-----
如何查看java 字节码

javac com/dfa/..../CASCase.java
javap -verbose com/.../CASCase.java
-----

**1 Interface vs Abstract**
抽象类允许有自己的方法实现和字段， 接口更抽象， 一个类只可以继承一个抽象类 但是可以继承多个接口

https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/

Consider using abstract classes if any of these statements apply to your situation:

In java application, there are some related classes that need to share some lines of code then you can put these lines of code within abstract class and this abstract class should be extended by all these related classes.
You can define non-static or non-final field(s) in abstract class, so that via a method you can access and modify the state of Object to which they belong.
You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
Consider using interfaces if any of these statements apply to your situation:

It is total abstraction, All methods declared within an interface must be implemented by the class(es) that implements this interface.
A class can implement more than one interface. It is called multiple inheritance.
You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.

**2 Thread**
2.1 线程传参给run方法
构造函数传参
成员变量传参
回调函数传参

2.2 线程返回值
主线程等待法
-CycleWait-代码不简洁，无法精准控制
-join 
-Callable-FutureTask or线程池获取 - FutureTaskDemo
-ThreadPool                      - ThreadPoolDemo

2.3 sleep vs wait --TODO
- sleep是Thread类方法，wait 是Object类方法
- sleep()可以在任何地方使用
- wait()只能在synchronized 方法或synchronized块中使用(wait需要释放锁，所以只有获取锁了之后才会释放锁)
- wait会释放cpu和锁资源，sleep仅仅让出CPU，不会干涉锁的使用
2.4 notify vs notifyAll

2.5 synchronized vs ReentrantLock
- rtl 把锁对象化
- 感知有没有获取锁

2.6 JMM
主内存 vs 工作内存
- 方法里的基本数据类型本地变量直接存储在工作内存的栈结构中
- 引用类型的本地变量：引用存储在工作内存中，实例存储在主内存中
- 成员变量，static 变量 类信息存储在主内存
- 主内存共享方式：各个线程拷贝一份数据到工作内存，操作完成后刷新回主内存

2.7 happens-before 八大原则 --TODO

2.8 悲观锁 vs 乐观锁
- 悲观锁 （synchronized, ReentrantLock）
- 乐观锁  (CAS- Atomicxxx ）

2.9 volatile vs Atomicxxx  --TODO (WHY)-- 请测试volatile 线程不安全的例子
-- volatile 只能保证变量更新对其他线程可见 但是无法保证线程安全，必须与悲观锁SYNCHRONIZED结合使用

2.11 CAS 缺点
-- 若循环时间长，开销大
-- 只能保证一个共享变量的原始操作
-- ABA 问题， 被改变后有改回来 true->false->true, CAS 会认为没有被改变，解决 AtomicStampedReference





