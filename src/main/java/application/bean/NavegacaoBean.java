package application.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "navegacaoBean")
@ViewScoped
public class NavegacaoBean implements Serializable {
    private static final long serialVersionUID = 1L;

    public String irMoveis() {
        return "/pages/moveis.xhtml?faces-redirect=true";
    }
}