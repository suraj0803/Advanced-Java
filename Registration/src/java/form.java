import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class form extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
 
    PrintWriter out = response.getWriter();
        out.print("<html><body background=\"hi.jpg\" style=\" background-repeat:no-repeat;background-size:100%\">"
                +"</html></body");
   
   
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
   
   
        String p = request.getParameter("username");
        String n = request.getParameter("password");
        
        if(p.equals("anushka")&n.equals("hello")){
        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!"); 
        out.print("  not a valid user");
        RequestDispatcher rd=request.getRequestDispatcher("/form.html");  
        rd.include(request, response);  
                      
        }  
    }  
  
}  
