package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cz.czechitas.java2webapps.lekce6.controller.alkohol.Objem;

/**
 *
 */
public class CokoladaForm {
    @NotBlank
    private String zbozi;

    @NotBlank
    @Size(max = 300)
    private String jmeno;

    @Email
    @NotBlank
    private String email;

    @AssertTrue
    private boolean obchodniPodminky;


    public String getZbozi() {
        return zbozi;
    }

    public void setZbozi(String zbozi) {
        this.zbozi = zbozi;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isObchodniPodminky() {
        return obchodniPodminky;
    }

    public void setObchodniPodminky(boolean obchodniPodminky) {
        this.obchodniPodminky = obchodniPodminky;
    }
}
