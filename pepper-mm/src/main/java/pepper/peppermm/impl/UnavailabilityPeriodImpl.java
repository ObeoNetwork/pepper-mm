/**
 * Copyright (c) 2024, 2026 CEA LIST and Others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 */
package pepper.peppermm.impl;

import java.time.LocalDate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pepper.peppermm.PepperPackage;
import pepper.peppermm.UnavailabilityPeriod;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Unavailability Period</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class UnavailabilityPeriodImpl extends MinimalEObjectImpl.Container implements UnavailabilityPeriod {
    protected static final LocalDate START_DATE_EDEFAULT = null;

    protected LocalDate startDate = START_DATE_EDEFAULT;

    protected static final LocalDate END_DATE_EDEFAULT = null;

    protected LocalDate endDate = END_DATE_EDEFAULT;

    protected static final String DESCRIPTION_EDEFAULT = null;

    protected String description = DESCRIPTION_EDEFAULT;

    protected UnavailabilityPeriodImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return PepperPackage.Literals.UNAVAILABILITY_PERIOD;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(LocalDate newStartDate) {
        LocalDate oldStartDate = startDate;
        startDate = newStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PepperPackage.UNAVAILABILITY_PERIOD__START_DATE, oldStartDate, startDate));
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public void setEndDate(LocalDate newEndDate) {
        LocalDate oldEndDate = endDate;
        endDate = newEndDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PepperPackage.UNAVAILABILITY_PERIOD__END_DATE, oldEndDate, endDate));
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PepperPackage.UNAVAILABILITY_PERIOD__DESCRIPTION, oldDescription, description));
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PepperPackage.UNAVAILABILITY_PERIOD__START_DATE:
                return getStartDate();
            case PepperPackage.UNAVAILABILITY_PERIOD__END_DATE:
                return getEndDate();
            case PepperPackage.UNAVAILABILITY_PERIOD__DESCRIPTION:
                return getDescription();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PepperPackage.UNAVAILABILITY_PERIOD__START_DATE:
                setStartDate((LocalDate) newValue);
                return;
            case PepperPackage.UNAVAILABILITY_PERIOD__END_DATE:
                setEndDate((LocalDate) newValue);
                return;
            case PepperPackage.UNAVAILABILITY_PERIOD__DESCRIPTION:
                setDescription((String) newValue);
                return;
            default:
                super.eSet(featureID, newValue);
                return;
        }
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PepperPackage.UNAVAILABILITY_PERIOD__START_DATE:
                setStartDate(START_DATE_EDEFAULT);
                return;
            case PepperPackage.UNAVAILABILITY_PERIOD__END_DATE:
                setEndDate(END_DATE_EDEFAULT);
                return;
            case PepperPackage.UNAVAILABILITY_PERIOD__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            default:
                super.eUnset(featureID);
                return;
        }
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PepperPackage.UNAVAILABILITY_PERIOD__START_DATE:
                return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
            case PepperPackage.UNAVAILABILITY_PERIOD__END_DATE:
                return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
            case PepperPackage.UNAVAILABILITY_PERIOD__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            default:
                return super.eIsSet(featureID);
        }
    }

    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (startDate: ");
        result.append(startDate);
        result.append(", endDate: ");
        result.append(endDate);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} // UnavailabilityPeriodImpl
