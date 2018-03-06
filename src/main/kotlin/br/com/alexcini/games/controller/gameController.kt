package br.com.alexcini.games.controller

import br.com.alexcini.games.model.Game
import br.com.alexcini.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin

//Endereço de chamada http://localhost:8090/game
@RequestMapping(value = "/game")

class GameController {

    @Autowired
    lateinit var gameService: GameServices

    //Função Get
    @GetMapping
    fun buscarTodos(): List<Game> {

        return gameService.buscarTodos()
    }

    //Função Post
    @PostMapping
    fun salvar(@RequestBody game: Game) {
        gameService.salvar(game)
    }

    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value =  "titulo") titulo: String) : List<Game> {
        return gameService.buscarPor(nome = titulo)
    }

    @DeleteMapping( "{id}")

    fun apagar(@PathVariable( "id") id : String)
    {
        gameService.apagarPor(id)

    }
}