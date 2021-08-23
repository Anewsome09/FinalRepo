package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.model.Purchase;
import common.util.AppConstants;
import common.util.HttpUtil;
import manager.PurchaseManager;

@WebServlet("/shop/*")
public class PurchaseServlet extends HttpServlet {

	private PurchaseManager manager = new PurchaseManager();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String jsonInString = null;
		ObjectMapper mapper = new ObjectMapper();

		String[] pathVariables = HttpUtil.getPathVariables(req);
		
		if(pathVariables == null || pathVariables.length == 0) {
			//get data from backend
			List<Purchase> pu = manager.findAll();
			//transform java object to JSON string
			jsonInString = mapper.writeValueAsString(pu);
		} 
		// GET /menus/:id
		// fetch individual menu item
		if(pathVariables != null && pathVariables.length == 2) {
			//get data from backend
			int id = Integer.parseInt(pathVariables[1]);
			Purchase pi = manager.findById(id);
			//transform java object to JSON string
			if(pi != null)
				jsonInString = mapper.writeValueAsString(pi);
			else
				jsonInString = HttpUtil.getErrorMessage("No Record Found");
		}
		
		//send success response to client
		resp.getWriter().print(jsonInString);
		resp.setContentType(AppConstants.HTTP_JSON_CONTENT);
		resp.setStatus(AppConstants.HTTP_OK);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//get JSON data from HTTP body
			ObjectMapper mapper = new ObjectMapper();
			Purchase po = mapper.readValue(HttpUtil.getJSONData(req), Purchase.class);
			//persist data to backend
			manager.create(po);
			//send success response to client
			String jsonResponse = mapper.writeValueAsString(po);
			resp.getWriter().print(jsonResponse);
			resp.setStatus(AppConstants.HTTP_OK);
		} catch (Exception e) {
			//send failure response to client
			resp.getWriter().print(HttpUtil.getErrorMessage(e.getMessage()));
			resp.setStatus(AppConstants.HTTP_ERROR);
		}

		resp.setContentType(AppConstants.HTTP_JSON_CONTENT);

	}

}
