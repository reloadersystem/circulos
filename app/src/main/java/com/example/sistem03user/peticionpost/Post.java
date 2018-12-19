package com.example.sistem03user.peticionpost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {


    @SerializedName("turno_nombre")
    @Expose
    private String turnoNombre;
    @SerializedName("grado_id")
    @Expose
    private String gradoId;
    @SerializedName("turno_id")
    @Expose
    private String turnoId;
    @SerializedName("sede_nombre")
    @Expose
    private String sedeNombre;
    @SerializedName("nivel_nombre")
    @Expose
    private String nivelNombre;
    @SerializedName("matricula_id")
    @Expose
    private String matriculaId;
    @SerializedName("persona_apellido_materno")
    @Expose
    private String personaApellidoMaterno;
    @SerializedName("anio_id")
    @Expose
    private String anioId;
    @SerializedName("persona_nombre")
    @Expose
    private String personaNombre;
    @SerializedName("anio_nombre")
    @Expose
    private String anioNombre;
    @SerializedName("grado_nombre")
    @Expose
    private String gradoNombre;
    @SerializedName("sede_id")
    @Expose
    private String sedeId;
    @SerializedName("nivel_id")
    @Expose
    private String nivelId;
    @SerializedName("persona_id")
    @Expose
    private String personaId;
    @SerializedName("matricula_retirado")
    @Expose
    private String matriculaRetirado;
    @SerializedName("persona_apellido_paterno")
    @Expose
    private String personaApellidoPaterno;

    public String getTurnoNombre() {
        return turnoNombre;
    }

    public void setTurnoNombre(String turnoNombre) {
        this.turnoNombre = turnoNombre;
    }

    public String getGradoId() {
        return gradoId;
    }

    public void setGradoId(String gradoId) {
        this.gradoId = gradoId;
    }

    public String getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(String turnoId) {
        this.turnoId = turnoId;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public String getNivelNombre() {
        return nivelNombre;
    }

    public void setNivelNombre(String nivelNombre) {
        this.nivelNombre = nivelNombre;
    }

    public String getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(String matriculaId) {
        this.matriculaId = matriculaId;
    }

    public String getPersonaApellidoMaterno() {
        return personaApellidoMaterno;
    }

    public void setPersonaApellidoMaterno(String personaApellidoMaterno) {
        this.personaApellidoMaterno = personaApellidoMaterno;
    }

    public String getAnioId() {
        return anioId;
    }

    public void setAnioId(String anioId) {
        this.anioId = anioId;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public String getAnioNombre() {
        return anioNombre;
    }

    public void setAnioNombre(String anioNombre) {
        this.anioNombre = anioNombre;
    }

    public String getGradoNombre() {
        return gradoNombre;
    }

    public void setGradoNombre(String gradoNombre) {
        this.gradoNombre = gradoNombre;
    }

    public String getSedeId() {
        return sedeId;
    }

    public void setSedeId(String sedeId) {
        this.sedeId = sedeId;
    }

    public String getNivelId() {
        return nivelId;
    }

    public void setNivelId(String nivelId) {
        this.nivelId = nivelId;
    }

    public String getPersonaId() {
        return personaId;
    }

    public void setPersonaId(String personaId) {
        this.personaId = personaId;
    }

    public String getMatriculaRetirado() {
        return matriculaRetirado;
    }

    public void setMatriculaRetirado(String matriculaRetirado) {
        this.matriculaRetirado = matriculaRetirado;
    }

    public String getPersonaApellidoPaterno() {
        return personaApellidoPaterno;
    }

    public void setPersonaApellidoPaterno(String personaApellidoPaterno) {
        this.personaApellidoPaterno = personaApellidoPaterno;
    }


    @Override
    public String toString() {
        return "Post{" +
                "turnoNombre='" + turnoNombre + '\'' +
                ", gradoId='" + gradoId + '\'' +
                ", turnoId='" + turnoId + '\'' +
                ", sedeNombre='" + sedeNombre + '\'' +
                ", nivelNombre='" + nivelNombre + '\'' +
                ", matriculaId='" + matriculaId + '\'' +
                ", personaApellidoMaterno='" + personaApellidoMaterno + '\'' +
                ", anioId='" + anioId + '\'' +
                ", personaNombre='" + personaNombre + '\'' +
                ", anioNombre='" + anioNombre + '\'' +
                ", gradoNombre='" + gradoNombre + '\'' +
                ", sedeId='" + sedeId + '\'' +
                ", nivelId='" + nivelId + '\'' +
                ", personaId='" + personaId + '\'' +
                ", matriculaRetirado='" + matriculaRetirado + '\'' +
                ", personaApellidoPaterno='" + personaApellidoPaterno + '\'' +
                '}';
    }
}

