/**
 * OrbisGIS is a java GIS application dedicated to research in GIScience.
 * OrbisGIS is developed by the GIS group of the DECIDE team of the 
 * Lab-STICC CNRS laboratory, see <http://www.lab-sticc.fr/>.
 *
 * The GIS group of the DECIDE team is located at :
 *
 * Laboratoire Lab-STICC – CNRS UMR 6285
 * Equipe DECIDE
 * UNIVERSITÉ DE BRETAGNE-SUD
 * Institut Universitaire de Technologie de Vannes
 * 8, Rue Montaigne - BP 561 56017 Vannes Cedex
 * 
 * OrbisGIS is distributed under GPL 3 license.
 *
 * Copyright (C) 2007-2014 CNRS (IRSTV FR CNRS 2488)
 * Copyright (C) 2015-2017 CNRS (Lab-STICC UMR CNRS 6285)
 *
 * This file is part of OrbisGIS.
 *
 * OrbisGIS is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * OrbisGIS is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * OrbisGIS. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult: <http://www.orbisgis.org/>
 * or contact directly:
 * info_at_ orbisgis.org
 */
package org.orbisgis.legend.structure.categorize;

import org.junit.Test;
import org.orbisgis.coremap.renderer.se.parameter.real.RealAttribute;
import org.orbisgis.coremap.renderer.se.parameter.real.RealLiteral;
import org.orbisgis.coremap.renderer.se.parameter.real.RealParameter;
import org.orbisgis.coremap.renderer.se.parameter.real.Recode2Real;
import org.orbisgis.coremap.renderer.se.parameter.string.Categorize2String;
import org.orbisgis.coremap.renderer.se.parameter.string.StringAttribute;
import org.orbisgis.coremap.renderer.se.parameter.string.StringLiteral;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author alexis
 */
public class CategorizedLegendTest {

    @Test
    public void testValueReference(){
        RealAttribute vf = new RealAttribute("height");
        Categorize2String c2s = new Categorize2String(new StringLiteral("youhou"),new StringLiteral("fallback"), vf);
        CategorizedString cs = new CategorizedString(c2s);
        assertTrue(cs.getValueReference() == vf);
    }

    @Test
    public void testNullValueReference(){
        CategorizedString cs = new CategorizedString(new StringLiteral("youhou"));
        assertNull(cs.getValueReference());
    }

    @Test
    public void testFailingInstanciation(){
        RealParameter vf = new Recode2Real(new RealLiteral(2.0), new StringAttribute("potato"));
        Categorize2String c2s = new Categorize2String(new StringLiteral("youhou"),new StringLiteral("fallback"), vf);
        try{
            CategorizedString cs = new CategorizedString(c2s);
            fail();
        } catch(IllegalArgumentException iae){
            assertTrue(true);
        }
    }

    @Test
    public void testSetField(){
        CategorizedString cs = new CategorizedString(new StringLiteral("youhou"));
        assertTrue(cs.getField().equals(""));
        cs.setField("potato");
        assertTrue(cs.getField().equals("potato"));
        RealAttribute vf = new RealAttribute("height");
        Categorize2String c2s = new Categorize2String(new StringLiteral("youhou"),new StringLiteral("fallback"), vf);
        cs = new CategorizedString(c2s);
        assertTrue(cs.getField().equals("height"));
        cs.setField("new");
        assertTrue(cs.getField().equals("new"));
        assertTrue(vf.getColumnName().equals("new"));
    }
}
