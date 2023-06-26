package com.example.restfulwebservice.helloWord;

import com.example.restfulwebservice.helloWord.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody를 입력하지 않아도 JSON형태로 반환함.
public class HelloWorldController {
    /**
     * @method: GET
     * @endpoint: /hello-world
     */
    //@RequestMapping(method=RequestMethod.GET,path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    /**
     * @method: GET
     * @endpoint: /hello-world-bean
     */
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World!!");
    }

    /**
     * @method: GET
     * @param name
     * @return
     */
    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        //@PathVariable(value="name") String title로 다른 값으로 받을 수 있음
        return new HelloWorldBean(String.format("Hello World!!, %s",name));
    }
}
