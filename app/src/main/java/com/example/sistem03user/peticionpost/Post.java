package com.example.sistem03user.peticionpost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {


    @SerializedName("turno_nombre")
    @Expose
    private String turnoNombre;
    @SerializedName("grado_id")
    @Expose
    private Integer gradoId;
    @SerializedName("turno_id")
    @Expose
    private Integer turnoId;
    @SerializedName("sede_nombre")
    @Expose
    private String sedeNombre;
    @SerializedName("nivel_nombre")
    @Expose
    private String nivelNombre;
    @SerializedName("matricula_id")
    @Expose
    private Integer matriculaId;
    @SerializedName("persona_apellido_materno")
    @Expose
    private String personaApellidoMaterno;
    @SerializedName("anio_id")
    @Expose
    private Integer anioId;
    @SerializedName("persona_nombre")
    @Expose
    private String personaNombre;
    @SerializedName("anio_nombre")
    @Expose
    private String anioNombre;
    @SerializedName("persona_correo_direccion")
    @Expose
    private String personaCorreoDireccion;
    @SerializedName("grado_nombre")
    @Expose
    private String gradoNombre;
    @SerializedName("sede_id")
    @Expose
    private Integer sedeId;
    @SerializedName("nivel_id")
    @Expose
    private Integer nivelId;
    @SerializedName("persona_id")
    @Expose
    private Integer personaId;
    @SerializedName("matricula_retirado")
    @Expose
    private Boolean matriculaRetirado;
    @SerializedName("persona_apellido_paterno")
    @Expose
    private String personaApellidoPaterno;

    public String getTurnoNombre() {
        return turnoNombre;
    }

    public void setTurnoNombre(String turnoNombre) {
        this.turnoNombre = turnoNombre;
    }

    public Integer getGradoId() {
        return gradoId;
    }

    public void setGradoId(Integer gradoId) {
        this.gradoId = gradoId;
    }

    public Integer getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(Integer turnoId) {
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

    public Integer getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(Integer matriculaId) {
        this.matriculaId = matriculaId;
    }

    public String getPersonaApellidoMaterno() {
        return personaApellidoMaterno;
    }

    public void setPersonaApellidoMaterno(String personaApellidoMaterno) {
        this.personaApellidoMaterno = personaApellidoMaterno;
    }

    public Integer getAnioId() {
        return anioId;
    }

    public void setAnioId(Integer anioId) {
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

    public String getPersonaCorreoDireccion() {
        return personaCorreoDireccion;
    }

    public void setPersonaCorreoDireccion(String personaCorreoDireccion) {
        this.personaCorreoDireccion = personaCorreoDireccion;
    }

    public String getGradoNombre() {
        return gradoNombre;
    }

    public void setGradoNombre(String gradoNombre) {
        this.gradoNombre = gradoNombre;
    }

    public Integer getSedeId() {
        return sedeId;
    }

    public void setSedeId(Integer sedeId) {
        this.sedeId = sedeId;
    }

    public Integer getNivelId() {
        return nivelId;
    }

    public void setNivelId(Integer nivelId) {
        this.nivelId = nivelId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Boolean getMatriculaRetirado() {
        return matriculaRetirado;
    }

    public void setMatriculaRetirado(Boolean matriculaRetirado) {
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
                ", gradoId=" + gradoId +
                ", turnoId=" + turnoId +
                ", sedeNombre='" + sedeNombre + '\'' +
                ", nivelNombre='" + nivelNombre + '\'' +
                ", matriculaId=" + matriculaId +
                ", personaApellidoMaterno='" + personaApellidoMaterno + '\'' +
                ", anioId=" + anioId +
                ", personaNombre='" + personaNombre + '\'' +
                ", anioNombre='" + anioNombre + '\'' +
                ", personaCorreoDireccion='" + personaCorreoDireccion + '\'' +
                ", gradoNombre='" + gradoNombre + '\'' +
                ", sedeId=" + sedeId +
                ", nivelId=" + nivelId +
                ", personaId=" + personaId +
                ", matriculaRetirado=" + matriculaRetirado +
                ", personaApellidoPaterno='" + personaApellidoPaterno + '\'' +
                '}';
    }
}

