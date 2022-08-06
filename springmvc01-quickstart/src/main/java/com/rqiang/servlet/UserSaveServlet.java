package com.rqiang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//name = "UserSaveServlet", value =

@WebServlet("/user/save")
public class UserSaveServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接受请求参数
        String name = req.getParameter("name");
        System.out.println("servlet save name ==>" + name);
        //2.产生响应
        resp.setContentType("text/json;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.write("{'module':'servlet save'}");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
