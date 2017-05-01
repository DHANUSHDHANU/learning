package action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
/**
 * Created by User on 4/28/2017.
 */
public class LoginAction extends Action {

    private final String SUCCESS="pass";
    private final String FAILURE="fail";
    public LoginAction(){
        System.out.println("inside constructor");
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        FormLogin formLogin = (FormLogin) form;
        if(formLogin.getUsername().equals("java") && formLogin.getPassword().equals("1234")) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
    }
}




