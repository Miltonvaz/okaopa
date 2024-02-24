package com.milton.concesionaria.models;

public class Usuario {
    private String usuario;
    private Integer contraseña;

    public Usuario(String usuario, Integer contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsername() {
        return usuario;
    }

    public Integer getPassword() {
        return contraseña;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
        result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        if (contraseña == null) {
            if (other.contraseña != null)
                return false;
        } else if (!contraseña.equals(other.contraseña))
            return false;
        return true;
    }
}

