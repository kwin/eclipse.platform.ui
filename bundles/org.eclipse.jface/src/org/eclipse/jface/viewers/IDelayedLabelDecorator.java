/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.viewers;

/**
 * A delayed label decorator is a label decorator that may not have a
 * decoration available immidiately. This interface defines the methods for
 * requesting the preparation of a decorator for an object and for querying
 * if the decorator is ready. Interested parties should register an
 * ILabelProviderListener with a delyaed label decorator in order to be informed
 * when the decoration is ready.
 * @param element. The element to be decorated
 * @param originalText The text that is to be decorated
 * @since 3.0
 */
public interface IDelayedLabelDecorator extends ILabelDecorator {
	
	/**
	 * Prepare the element for decoration. If it is already decorated and ready for update
	 * return true. If decoration is pending return false.
	 * @param element The element to be decorated
	 * @param originalText The starting text. 
	 * @return boolean true if the decoration is ready for this element
	 */
	
	public boolean prepareDecoration(Object element, String originalText);

}
