/**
 * @file IMleSet.java
 * Created on July 11, 2007. (msm@wizzerworks.com)
 */

// COPYRIGHT_BEGIN
//
//  Copyright (C) 2000-2007  Wizzer Works
//
//  Wizzer Works makes available all content in this file ("Content").
//  Unless otherwise indicated below, the Content is provided to you
//  under the terms and conditions of the Common Public License Version 1.0
//  ("CPL"). A copy of the CPL is available at
//
//      http://opensource.org/licenses/cpl1.0.php
//
//  For purposes of the CPL, "Program" will mean the Content.
//
//  For information concerning this Makefile, contact Mark S. Millard,
//  of Wizzer Works at msm@wizzerworks.com.
//
//  More information concerning Wizzer Works may be found at
//
//      http://www.wizzerworks.com
//
// COPYRIGHT_END


// Declare package.
package com.wizzer.mle.runtime.core;

public interface IMleSet
{
    /**
     * Initialize rendering. This is usually called just once.
     *
     * @throws MleRuntimeException this exception is thrown if an error occurs while
     * initializing rendering.
     */
    public void initRender() throws MleRuntimeException;

    /**
     * Tell the set to render itself.
     *
     * @throws MleRuntimeException This exception is thrown if an error occurs while
     * rendering the Set.
     */
    public void render() throws MleRuntimeException;
}
