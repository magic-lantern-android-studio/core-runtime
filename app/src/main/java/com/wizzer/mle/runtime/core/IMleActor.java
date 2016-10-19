/**
 * @file IMleActor.java
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

/**
 * An interface for implementing Magic Lantern Actors.
 */
public interface IMleActor
{
    /**
     * Get the actor's associated role.
     * <p>
     * Returns a reference to the actor's role, if any.
     * Use getRole() to get the actor's role instance,
     * if any. When loading an actor instance using MleDppLoader.loadGroup()
     * or MleLaod.loadScene(), the role, if any, will be set
     * after the actor's constructor is called and before
     * the actor's init() function is called. Therefore,
     * the result of calling getRole() before init()
     * is called is undefined.
     * </p>
     *
     * @return The actor's associated role is returned.
     */
    IMleRole getRole();

    /**
     * Attach a role to the actor.
     * <p>
     * A role can only be added if the actor currently does not have one.
     * Note that only the role instance should call this method.
     * </p>
     *
     * @param role The role to be attached to this actor.
     */
    void attachRole(IMleRole role);

    /**
     * Remove the role from the actor.
     * <p>
     * The attached role provides notification when it is destroyed.
     * This method is made protected to allow sub-class to provide
     * notification to other classes, or for the actor to possibly
     * delete self.
     * </p><p>
     * Note that only the role instance should call this method
     * since it can clean-up the actor/role relationship.
     * </p>
     */
    void removeRole();
}
