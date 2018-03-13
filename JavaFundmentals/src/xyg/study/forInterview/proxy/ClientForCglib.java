package xyg.study.forInterview.proxy;

public class ClientForCglib
{
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Person proxyson =  (Person)proxy.getProxy(Person.class);
        
        proxyson.say();
    }
}
