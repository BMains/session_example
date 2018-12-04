import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CentralServlet")
public class CentralServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nextJsp = null;

        ArrayList<User> myUser = new ArrayList<>();
        myUser.add(new User("Mike", "mike123"));
        myUser.add(new User("Anna", "anna123"));

        String userName = request.getParameter("userName");
        String passwd = request.getParameter("passwd");

        User uFirst = new User(userName, passwd);

        String act = request.getParameter("hiddenA");

        if(myUser.contains(uFirst)){

            HttpSession myS = request.getSession(true);
            System.out.println(myS.getId());

            myS.setAttribute("userAllowed", uFirst);

            nextJsp = "/inside.jsp";
        }else{
            nextJsp = "/login.jsp";
        }
        getServletContext().getRequestDispatcher(nextJsp).forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
