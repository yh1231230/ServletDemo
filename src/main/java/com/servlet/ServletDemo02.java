package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*手动创建Servlet
    1.创建servletDemo类继承HttpServlet并重写doGet和doPost方法
    2.创建MyRegister实现ServletContainerInitializer接口并重写onStartup方法，注册配置servlet
    3.在源路径下创建META-INF文件夹
    4.在META-INF文件夹中创建services文件夹
    5.在services文件夹中创建javax.servlet.ServletContainerInitializer文件，并写上MyRegister的完整路径
    6.在MyRegister类中创建继承类的对象
      ServletDemo servletDemo=new ServletDemo();
    7.在ServletContext队形中添加Servlet，并得到Servlet的动态配置对象
      ServletRegistration.Dynamic registration = servletContext.addServlet("servletDemo", servletDemo);
    8.配置Servlet
      registration.addMapping("/servletDemo");//映射访问资源路径
 */
public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo02执行了");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
