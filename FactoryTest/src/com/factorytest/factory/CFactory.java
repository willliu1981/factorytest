package com.factorytest.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public interface CFactory<T> {
	default public T getInstance(Class type) {
		T t = getSingletonInstance();
		if (t == null) {
			Properties prop = new Properties();
			try {
				prop.load(new FileInputStream(getClassNameMapPropertiesPath()));
				String className = prop.getProperty(type.getSimpleName());
				Class<?> cls = Class.forName(className);
				Constructor<?> c = cls.getConstructor();
				t = (T) c.newInstance();
				setSingletonInstance(t);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.getStackTrace();
			}
		}
		return t;
	}

	void setSingletonInstance(T t);

	T getSingletonInstance();

	String getClassNameMapPropertiesPath();
}
