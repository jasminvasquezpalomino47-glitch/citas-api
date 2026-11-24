package pe.edu.senati.citas_api.auth.dto;

/** Datos que devuelve la API cuando el inicio de sesión es correcto. */
public record SesionDTO(Long usuarioId, String email, String rol) { }