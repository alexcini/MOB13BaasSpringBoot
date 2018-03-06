package br.com.alexcini.games.model

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id

@Document
data class Game(@Id val id: String? = null,
                var nome: String,
                var urlImage: String,
                var anoLancamento: Integer)