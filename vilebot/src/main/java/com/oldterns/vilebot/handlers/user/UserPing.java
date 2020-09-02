/**
 * Copyright (C) 2013 Oldterns
 *
 * This file may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package com.oldterns.vilebot.handlers.user;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;

public class UserPing
    extends ListenerAdapter
{
    /**
     * Reply to user !ping command with "nickname, pong"
     */
    @Override
    public void onGenericMessage( final GenericMessageEvent event )
    {
        String text = event.getMessage();

        if ( text.startsWith( "!ping" ) )
        {
            String user = event.getUser().getNick();
            event.respondWith( user + ", pong" );
        }
    }
}
