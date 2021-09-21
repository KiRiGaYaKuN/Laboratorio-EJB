/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBean.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cristian-patino
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    private String ecuacion = "";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String label = request.getParameter("ecuacion");
            String accion = request.getParameter("action");
            String valor = request.getParameter("valor");
            
                      
            if(!(valor.equals("=") || valor.equals("C"))){
                ecuacion = ecuacion + valor;
                request.setAttribute("label", ecuacion);                
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            if((valor.equals("C"))){
                ecuacion = "";
                request.setAttribute("label", ecuacion);                
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            if(valor.equals("=")){
                
                for (int i = 0; i < ecuacion.length(); i++) {
                    System.out.println(ecuacion.charAt(i)+"");
                    if("^".equals(String.valueOf(ecuacion.charAt(i)))){
                        ecuacion = String.valueOf(calcBean.Cuadrado(Integer.parseInt(ecuacion.substring(0, i)), Integer.parseInt(ecuacion.substring(i+1, ecuacion.length()))));
                    }else{
                        if("*".equals(String.valueOf(ecuacion.charAt(i)))){
                            ecuacion = String.valueOf(calcBean.Multiplicar(Integer.parseInt(ecuacion.substring(0, i)), Integer.parseInt(ecuacion.substring(i+1, ecuacion.length()))));
                        }else{
                                if("/".equals(String.valueOf(ecuacion.charAt(i)))){
                                    ecuacion = String.valueOf(calcBean.Dividir(Integer.parseInt(ecuacion.substring(0, i)), Integer.parseInt(ecuacion.substring(i+1, ecuacion.length()))));
                                }else{                                    
                                    if("%".equals(String.valueOf(ecuacion.charAt(i)))){
                                        ecuacion = String.valueOf(calcBean.Modulo(Integer.parseInt(ecuacion.substring(0, i)), Integer.parseInt(ecuacion.substring(i+1, ecuacion.length()))));
                                    }else{
                                        if("+".equals(String.valueOf(ecuacion.charAt(i)))){
                                            ecuacion = String.valueOf(calcBean.sumar(Integer.parseInt(ecuacion.substring(0, i)), Integer.parseInt(ecuacion.substring(i+1, ecuacion.length()))));
                                        }else{
                                            if("-".equals(ecuacion.charAt(i)+"")){
                                                ecuacion = String.valueOf(calcBean.Resta(Integer.parseInt(ecuacion.substring(0, i)), Integer.parseInt(ecuacion.substring(i+1, ecuacion.length()))));
                                            }
                                        }
                                    }
                                }        
                        }
                    }
                    
                }
                
                request.setAttribute("label", ecuacion);                
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hay un fallo "+"</h1>");
            out.println("</body>");
            out.println("</html>");
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
    }// </editor-fold>

}
