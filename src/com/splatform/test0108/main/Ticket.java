/**
 * 
 */
package com.splatform.test0108.main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * ���߳�  forѭ��  ��ȫ����
 * @author 
 * 
 */
public class Ticket extends Thread {

	private volatile static int ticket = 3000;

	private Lock lock = new ReentrantLock();

	public void run() {
		synchronized (this){
			for (; ticket > 0; ticket--) {
				System.out.println(getName() + "--sale" + ticket);
			}
		}
//		lock.lock(); // �����ͼ�����û������ȴ�
//		try {
//			
//		} finally {
//			lock.unlock();// �ͷ���
//		}
	}

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		t1.start();
		try {
            Thread.sleep(10);//�̼߳�������һ�����ӳپ�ok��
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		t2.start();
		try {
            Thread.sleep(100);//�̼߳�������һ�����ӳپ�ok��
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		t3.start();
		try {
            Thread.sleep(100);//�̼߳�������һ�����ӳپ�ok��
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		t4.start();
	}
}
