/*******************************************************************************
 * OpenEMS - Open Source Energy Management System
 * Copyright (c) 2016 FENECON GmbH and contributors
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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *   FENECON GmbH - initial API and implementation and initial documentation
 *******************************************************************************/
package io.openems.core.utilities;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author FENECON GmbH
 *
 */
public class Mutex {

	private final Semaphore semaphore;

	public Mutex(boolean initiallyPermitted) {
		if (initiallyPermitted) {
			semaphore = new Semaphore(1);
		} else {
			semaphore = new Semaphore(0);
		}
	}

	public void await() throws InterruptedException {
		int permits = semaphore.drainPermits();
		if (permits == 0) {
			semaphore.acquire();
		}
	}

	public void awaitOrTimeout(int timeout, TimeUnit unit) throws InterruptedException {
		int permits = semaphore.drainPermits();
		if (permits == 0) {
			semaphore.tryAcquire(timeout, unit);
		}
	}

	public void release() {
		semaphore.release();
	}
}
