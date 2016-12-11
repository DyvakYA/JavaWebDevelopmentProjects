package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dyvak on 11.12.2016.
 */
public interface Controller {
    public String handleRequest( HttpServletRequest request, HttpServletResponse response) throws Exception;
}
