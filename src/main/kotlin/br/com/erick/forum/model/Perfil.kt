package br.com.erick.forum.model

import org.springframework.security.core.GrantedAuthority
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Perfil(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    private val nome: String = ""
) : GrantedAuthority{
    override fun getAuthority(): String {
        return nome
    }

}
