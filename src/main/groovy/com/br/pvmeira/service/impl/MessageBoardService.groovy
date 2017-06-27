package com.br.pvmeira.service.impl

import com.br.pvmeira.entity.MessageBoard
import com.br.pvmeira.repository.MessageBoardRepository
import com.br.pvmeira.service.MessageBoardServiceLocal
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by pvmeira on 26/06/17.
 */
@Service
class MessageBoardService implements MessageBoardServiceLocal {

    @Autowired
    MessageBoardRepository repository

    @Override
    void addMessageToPoll(MessageBoard m) {
        repository.addMessageToPoll(m)
    }

    @Override
    List<MessageBoard> getPoll() {
        return repository.getPoolMessage()
    }
}
