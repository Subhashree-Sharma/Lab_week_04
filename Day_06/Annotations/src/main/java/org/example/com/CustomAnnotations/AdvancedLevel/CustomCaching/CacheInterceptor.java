package org.example.com.CustomAnnotations.AdvancedLevel.CustomCaching;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

//CacheInterceptor class
public class CacheInterceptor implements InvocationHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    //constructor
    public CacheInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = method.getName() + "_" + args[0]; // Unique key for cache
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + args[0]);
                return cache.get(key);
            }

            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        }
        return method.invoke(target, args);
    }

    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target, Class<T> interfaceClass) {
        return (T) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class<?>[]{interfaceClass},
                new CacheInterceptor(target)
        );
    }
}
