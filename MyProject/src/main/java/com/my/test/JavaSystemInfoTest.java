/**
 * 
 */
package com.my.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author a
 *
 */
public class JavaSystemInfoTest {

	static{
		test();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaSystemInfoTest sadfsad = new JavaSystemInfoTest();
		sadfsad = new JavaSystemInfoTest();
		// TODO Auto-generated method stub
//		test1();
//		test2();
	}
	public static void test(){
		System.out.println("123");
	}

	public static void test1(){
		Properties props = System.getProperties();
		Set<String> names = props.stringPropertyNames();
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = props.getProperty(key);
			System.out.println(key+"\t\t\t"+value);
		}
	}

	/** properties µü´ú·½Ê½ */
	public static void test2() {
		Properties props = System.getProperties();
		for (Enumeration e = props.propertyNames(); e.hasMoreElements();) {
			String key = (String) e.nextElement();
			System.out.println(key + "****" + props.getProperty(key));
		}
	}
}

interface Test{
	public abstract void test();
}
