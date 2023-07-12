package Questão_2;

import java.time.LocalDate;

public class Usuario {

		private String email;
		private String nomeCompleto;
		private LocalDate dataNascimento;
		
		public Usuario(String nomeCompleto, String email, LocalDate dataNascimento) {
			this.nomeCompleto = nomeCompleto;
			this.email = email;
			this.dataNascimento = dataNascimento;
		}

		public String getNome() {
			return nomeCompleto;
		}
		
		public String getEmail() {
			return email;
		}
		
		
		public LocalDate getData_de_nascimento() {
			return dataNascimento;
		}
		
		
}
	



