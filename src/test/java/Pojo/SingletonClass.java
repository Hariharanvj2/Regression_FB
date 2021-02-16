package Pojo;

import org.apache.commons.text.similarity.EditDistance;

import BaseClass.Baseclass;

public class SingletonClass {
	private static SingletonClass instance;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;

	}
}
