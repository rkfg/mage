/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

package mage.sets.mirrodinbesieged;

import java.util.UUID;
import mage.Constants.CardType;
import mage.Constants.Rarity;
import mage.MageInt;
import mage.ObjectColor;
import mage.abilities.dynamicvalue.common.ManacostVariableValue;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.ShuffleSpellEffect;
import mage.cards.CardImpl;
import mage.game.permanent.token.EldraziSpawnToken;
import mage.game.permanent.token.Token;

/**
 *
 * @author Loki
 */
public class WhiteSunsZenith extends CardImpl<WhiteSunsZenith> {
    public WhiteSunsZenith (UUID ownerId) {
        super(ownerId, 19, "White Sun's Zenith", Rarity.RARE, new CardType[]{CardType.INSTANT}, "{X}{W}{W}{W}");
        this.expansionSetCode = "MBS";
		this.color.setWhite(true);
        this.getSpellAbility().addEffect(new CreateTokenEffect(new CatToken(), new ManacostVariableValue()));
        this.getSpellAbility().addEffect(ShuffleSpellEffect.getInstance());
    }

    public WhiteSunsZenith (final WhiteSunsZenith card) {
        super(card);
    }

    @Override
    public WhiteSunsZenith copy() {
        return new WhiteSunsZenith(this);
    }
}

class CatToken extends Token {
    public CatToken() {
        super("Cat", "2/2 white Cat creature token");
        cardType.add(CardType.CREATURE);
		color = ObjectColor.WHITE;
		subtype.add("Cat");
		power = new MageInt(2);
		toughness = new MageInt(2);
    }
}