package com.br.pvmeira.entity

/**
 * Created by pvmeira on 26/06/17.
 */
class MessageBoard {
    String name
    String message

    MessageBoard() {
    }

    MessageBoard(String name, String message) {
        this.name = name
        this.message = message
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getMessage() {
        return message
    }

    void setMessage(String message) {
        this.message = message
    }
}
