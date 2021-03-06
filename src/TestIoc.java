import com.springdemo1.ioc.User;
import com.xiaoli.AnnotaionAspect;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

    public static void main(String[] args) {
        //1.从类路径classsPath中寻找指定的xml配置文件，找到并装载完成ApplicationContext实例
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2。根据id从SpringIoc容器中获取指定的bean实例
        User user =(User)applicationContext.getBean("User");
        user.add();
        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotaionAspect annotaionAspect=(AnnotaionAspect)applicationContext1.getBean("AnnotaionAspect");
        annotaionAspect.saveAccount();
    }

    public void pt1(){

    }
}
