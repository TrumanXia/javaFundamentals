package xyg.study.forInterview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyForPerson implements InvocationHandler
{

    IPerson person = null;

    // 关联代理类和接口
    public IPerson getProxyInterface(IPerson person) {
        this.person = person;
        return (IPerson) Proxy.newProxyInstance(person.getClass()
                .getClassLoader(),
                person.getClass()
                        .getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("say".equals(method.getName())){
            method.invoke(person, args);
        }
        return null;
    }

}
