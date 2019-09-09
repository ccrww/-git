package day02;

import java.util.concurrent.TimeUnit;

class Phone {
	public static synchronized void sendEmail() throws Exception {
		System.out.println("发送邮件哈哈哈哈");
	}

	
	 public static synchronized void sendMSN() { System.out.println("发送短信"); }
	 
	public void hello() {
		System.out.println("hello");
	}
}

/**
*
* 题目：多线程8锁
* 1    标准访问，请问先打印邮件还是短信？
* 2    邮件方法新增暂停4秒钟，请问先打印邮件还是短信？
* 3    新增普通hello方法，，请问先打印邮件还是hello？
* 4    两部手机，，请请问先打印邮件还是短信？
* 5    两个静态同步方法，1部手机，请请问先打印邮件还是短信？
* 6    两个静态同步方法，2部手机，请请问先打印邮件还是短信？
* 7    1个静态同步方法，1个普通同步方法,1部手机，请请问先打印邮件还是短信？
* 8    1个静态同步方法，1个普通同步方法,2部手机，请请问先打印邮件还是短信？
*/
public class Lock8 {
	public static void main(String[] args) throws Exception {
		Phone phone = new Phone();//this01
        Phone phone2 = new Phone();//this02
	system.out.println("你好,这里是git")
        new Thread(() -> {
            try
            {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"A").start();


        Thread.sleep(200);

        new Thread(() -> {
            try
            {
                phone.sendMSN();
                //phone.hello();
                //phone2.sendMSN();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"B").start();

	}
}
	




