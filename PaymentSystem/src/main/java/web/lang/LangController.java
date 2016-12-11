package web.lang;

/**
 * Created by Dyvak on 11.12.2016.
 */

import web.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LangController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String lang = request.getParameter( "lang" );
        if( lang != null ){
            if( lang.equals( "ua" ) || lang.equals( "en" ) )
                session.setAttribute( "lang", lang );
        }
        return "Redirect:"+request.getContextPath();
    }

}
