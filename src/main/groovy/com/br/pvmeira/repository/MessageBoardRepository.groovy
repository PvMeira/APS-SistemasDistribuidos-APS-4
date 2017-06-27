package com.br.pvmeira.repository

import com.br.pvmeira.entity.MessageBoard
import org.springframework.stereotype.Repository

/**
 * Created by pvmeira on 26/06/17.
 */
@Repository
class MessageBoardRepository {
    List<MessageBoard> poolMessage

    MessageBoardRepository() {
        this.poolMessage = new ArrayList<>()
    }

    void addMessageToPoll(MessageBoard m) {
        this.poolMessage.add(m)
    }

    List<MessageBoard> getPoll() {
        return this.poolMessage;
    }
}
