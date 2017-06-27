package com.br.pvmeira.resource

import com.br.pvmeira.entity.MessageBoard
import com.br.pvmeira.service.MessageBoardServiceLocal
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pvmeira on 26/06/17.
 */
@RestController
@RequestMapping("/aps/messagePoll/")
@CrossOrigin(origins = "/*")
class MessageBoardResource {
    @Autowired
    MessageBoardServiceLocal service

    @RequestMapping(method = RequestMethod.POST)
    void postMessage(@RequestBody MessageBoard m) {
        this.service.addMessageToPoll(m)
    }

    @RequestMapping(method = RequestMethod.GET)
    List<String> list() {
        List<String> reponse = new ArrayList<>()

        List<MessageBoard> poll = this.service.getPoll()
        for (int i = 0; i < poll.size(); i++) {
            String d = " " + poll.get(i).name + " --> " + poll.get(i).getMessage()
            reponse.add(d)
        }
        return reponse
    }

}
