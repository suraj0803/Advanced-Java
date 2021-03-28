import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/form1")
public class form1 extends HttpServlet {
    private int hitCount;
 public void init()
 {
     hitCount=0;
 }

   public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
   
            hitCount++; 
     String title = "Total Number of Hits";
     
 
        try(PrintWriter out = response.getWriter()){
        out.print("<html><body background=\"image.jpeg\" style=\" background-repeat:no-repeat;background-size:100%\">"
                +"<h1> REGISTRATION FORM</h1><hr>"
        +"<h3> Enter the details</h3>"
        +"<input type='text' placeholder='Name' name='name' required/><br><br>"
        +"<input type='number' placeholder='Age' name='age' required/><br><br>"
        +"<input type='text' placeholder='gender' name='gender' required/><br><br>"
        +"<form name='loginform' method='post' action='form.html'>"
        +" <input type='submit' value='submit'/>"        
        +"<h1 align = \"center\">" + title + "</h1>\n"
        +"<h2 align = \"center\">" + hitCount + "</h2>\n" 
        +"</body></html>");
        }}}
