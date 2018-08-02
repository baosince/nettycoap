/**
 * Copyright (c) 2016, Oliver Kleine, Institute of Telematics, University of Luebeck
 * All rights reserved
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *  - Redistributions of source messageCode must retain the above copyright notice, this list of conditions and the following
 *    disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *  - Neither the name of the University of Luebeck nor the names of its contributors may be used to endorse or promote
 *    products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.uzl.itm.ncoap.communication.events;

import de.uzl.itm.ncoap.communication.dispatching.Token;

import java.net.InetSocketAddress;

/**
 * Abstract base class for internal events that are caused within an ongoing or aspired message exchange
 *
 * @author Oliver Kleine
 */
public abstract class AbstractMessageTransferEvent extends AbstractMessageExchangeEvent{

    private int messageID;

    /**
     * Creates a new instance of {@link AbstractMessageTransferEvent}
     * @param remoteSocket the remote socket of the transfer that caused this event
     * @param messageID the message ID of the transfer that caused this event
     * @param token the {@link Token} of the of the transfer that caused this event
     */
    public AbstractMessageTransferEvent(InetSocketAddress remoteSocket, int messageID, Token token) {
        super(remoteSocket, token);
        this.messageID = messageID;
    }


    /**
     * Returns the message ID of the message that caused this events
     * @return the message ID of the message that caused this events
     */
    public int getMessageID() {
        return messageID;
    }

//    /**
//     * Returns <code>true</code> if this events causes the related message exchange to stop and <code>false</code>
//     * otherwise
//     * @return <code>true</code> if this events causes the related message exchange to stop and <code>false</code>
//     * otherwise
//     */
//    public abstract boolean stopsMessageExchange();
}
