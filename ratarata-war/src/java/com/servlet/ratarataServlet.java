package com.servlet;
import com.session.ratarata_;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HIROMI
 */
public class ratarataServlet extends HttpServlet {

    @EJB
    private ratarata_ ratarata_;
    
protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();

            try {            
            out.println("<html>");
            out.println("<body");
            out.println("<h1><b><center>PERHITUNGAN RATA - RATA NILAI</center></b></h1>");
            String nilai1 = request.getParameter("nilai1");
            String nilai2 = request.getParameter("nilai2");
            String nilai3 = request.getParameter("nilai3");
            
            if ((nilai1 != null) && (nilai1.length() > 0) && (nilai2 != null) && (nilai2.length() > 0) && (nilai3 != null) && (nilai3.length() > 0)){
                double a = Double.parseDouble(nilai1);
                double b = Double.parseDouble(nilai2);
                double c = Double.parseDouble(nilai3);
                if (request.getParameter("hasil") != null){ 
                String hasil = ratarata_.rata2(a,b,c); 
                out.println("<p><center> HASIL RATA - RATA: "+hasil+" </center></p>");            
            }
            }     
            else {
            out.println("<center>");
            out.println("<p>Masukkan Nilai 1:</p>");
            out.println("<form method=\"get\">");
            out.println("<p><input type=\"text\" name=\"nilai1\" size=\"25\"></p>");
            out.println("<p>Masukkan Nilai 2:</p>");
            out.println("<form method=\"get\">");
            out.println("<p><input type=\"text\" name=\"nilai2\" size=\"25\"></p>");
            out.println("<p>Masukkan Nilai 3:</p>");
            out.println("<form method=\"get\">");
            out.println("<p><input type=\"text\" name=\"nilai3\" size=\"25\"></p>");
            out.println("<input type=\"submit\" name=\"hasil\" value=\"HASIL\">");
            }
            }
            finally {
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.close();
            }
            }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>// 
    }