/*
 * Copyright (c) Ovidiu Serban, ovidiu@roboslang.org
 *               web:http://ovidiu.roboslang.org/
 * All Rights Reserved. Use is subject to license terms.
 *
 * This file is part of AgentSlang Project (http://agent.roboslang.org/).
 *
 * AgentSlang is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License and CECILL-B.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * The CECILL-B license file should be a part of this project. If not,
 * it could be obtained at  <http://www.cecill.info/>.
 *
 * The usage of this project makes mandatory the authors citation in
 * any scientific publication or technical reports. For websites or
 * research projects the AgentSlang website and logo needs to be linked
 * in a visible area.
 */

package org.agent.slang.service.km.cismef.data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ovidiu Serban, ovidiu@roboslang.org
 * @version 1, 2/23/13
 */
public class RelatedConcept {
    private String type;
    private String source;
    private final Map<String, String> values = new HashMap<String, String>();

    public RelatedConcept(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getValue(String label) {
        return values.get(label);
    }

    public void setValue(String label, String value) {
        values.put(label, value);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String toString() {
        return "[" + "type='" + getType() + '\'' + ", source='" + getSource() + '\'' + ", values=" + values + ']';
    }
}
