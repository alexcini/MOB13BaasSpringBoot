package br.com.alexcini.games.service

import br.com.alexcini.games.model.Game
import br.com.alexcini.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices {

    @Autowired

    lateinit var gameRepository : GameRepository

    fun buscarTodos() : List<Game> {
        return gameRepository.findAll()
    }

    fun salvar(game: Game)  {
        gameRepository.save(game)
    }

    fun buscarPor(nome: String) : List<Game> {
        return gameRepository.findByNomeIgnoreCaseContaining(nome)
    }

    fun apagarPor(nome: String) : List<Game> {
        return gameRepository.deleteById.equals(toString(id))
    }
}