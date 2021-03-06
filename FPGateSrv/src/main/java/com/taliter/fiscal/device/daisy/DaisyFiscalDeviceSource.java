/*
 * Copyright (C) 2015 nikolabintev@edabg.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.taliter.fiscal.device.daisy;

import com.taliter.fiscal.device.icl.ICLFiscalDevice;
import com.taliter.fiscal.device.icl.ICLFiscalDeviceSource;
import com.taliter.fiscal.port.FiscalPortSource;

/**
 *
 * @author nikolabintev@edabg.com
 */
public class DaisyFiscalDeviceSource extends ICLFiscalDeviceSource {
    
    public DaisyFiscalDeviceSource(FiscalPortSource portSource) {
        super(portSource);
    }
    
    @Override
    public ICLFiscalDevice getFiscalDevice() throws Exception {
        return new DaisyFiscalDevice(getPortSource() != null ? getPortSource().getFiscalPort() : null, getTimeout(), getMaxTries(), getEncoding());
    }
}
