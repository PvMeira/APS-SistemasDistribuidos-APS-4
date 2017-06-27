package com.br.pvmeira.service

import com.br.pvmeira.entity.MessageBoard
import org.springframework.stereotype.Service

/**
 * Created by pvmeira on 26/06/17.
 */
@Service
interface MessageBoardServiceLocal {
    void addMessageToPoll(MessageBoard m)

    List<MessageBoard> getPoll()

}