package bankaccount;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/account")  
public class AccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String accountNo = request.getParameter("accountNo");
        String name = request.getParameter("name");
        double balance = 0;
        try {
            balance = Double.parseDouble(request.getParameter("balance"));
        } catch (NumberFormatException e) {
            
        }
        String accountType = request.getParameter("accountType");

        
        AccountBean account = new AccountBean();
        account.setAccountNo(accountNo);
        account.setName(name);
        account.setBalance(balance);

        
        request.setAttribute("account", account);

       
        HttpSession session = request.getSession();
        session.setAttribute("accountType", accountType);

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
        dispatcher.forward(request, response);
    }
}
