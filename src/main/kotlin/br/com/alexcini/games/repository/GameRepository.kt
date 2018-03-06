package br.com.alexcini.games.repository

import br.com.alexcini.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//Esta interface se comunica com o banco de dados para fazer as chamadas aos bancos de dados
@Repository
interface GameRepository : MongoRepository<Game, String> {

    fun findByNomeIgnoreCaseContaining(nome: String): List<Game>

}
