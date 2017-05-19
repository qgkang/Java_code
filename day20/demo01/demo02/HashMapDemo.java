package day20.demo01.demo02;

import java.util.HashMap;
import java.util.Map;

/*
 *  ʹ��HashMap����,�洢�Զ���Ķ���
 *  �Զ������,��Ϊ��,����,��Ϊֵ����
 */
public class HashMapDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * HashMap �洢�Զ������Person,��Ϊ������
	 * ���Ķ���,��Person����,ֵ���ַ���
	 * ��֤����Ψһ��,�洢�����Ķ���,��дhashCode equals
	 */
	public static void function_1(){
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person("a",20), "美国");
		map.put(new Person("b",18), "中国");
		map.put(new Person("b",18), "中国");
		map.put(new Person("c",19), "俄罗斯");
		for(Person key : map.keySet()){
			String value = map.get(key);
			System.out.println(key+"..."+value);
		}
		System.out.println("===================");
		for(Map.Entry<Person, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
	}
	
	/*
	 * HashMap �洢�Զ���Ķ���Person,��Ϊֵ����
	 * ���Ķ���,���ַ���,���Ա�֤Ψһ��
	 */
	public static void function(){
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("beijing", new Person("a",20));
		map.put("tianjin", new Person("b",18));
		map.put("shanghai", new Person("c",19));
		for(String key : map.keySet()){
			Person value = map.get(key);
			System.out.println(key+"..."+value);
		}
		System.out.println("=================");
		for(Map.Entry<String, Person> entry : map.entrySet()){
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key+"..."+value);
		}
	}
}
