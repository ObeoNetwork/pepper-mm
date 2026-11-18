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
package pepper.peppermm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pepper.peppermm.PepperPackage;
import pepper.peppermm.UnavailabilityPeriod;

/**
 * This is the item provider adapter for a {@link pepper.peppermm.UnavailabilityPeriod} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnavailabilityPeriodItemProvider extends ItemProviderAdapter
        implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    public UnavailabilityPeriodItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addStartDatePropertyDescriptor(object);
            addEndDatePropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    protected void addStartDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_UnavailabilityPeriod_startDate_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_UnavailabilityPeriod_startDate_feature", "_UI_UnavailabilityPeriod_type"),
                PepperPackage.Literals.UNAVAILABILITY_PERIOD__START_DATE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    protected void addEndDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_UnavailabilityPeriod_endDate_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_UnavailabilityPeriod_endDate_feature", "_UI_UnavailabilityPeriod_type"),
                PepperPackage.Literals.UNAVAILABILITY_PERIOD__END_DATE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    protected void addDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_UnavailabilityPeriod_description_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_UnavailabilityPeriod_description_feature", "_UI_UnavailabilityPeriod_type"),
                PepperPackage.Literals.UNAVAILABILITY_PERIOD__DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    @Override
    public Object getImage(Object object) {
        return overlayImage(object, this.getClass().getClassLoader().getResource("icons/full/obj16/UnavailabilityPeriod.svg"));
    }

    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    @Override
    public String getText(Object object) {
        UnavailabilityPeriod period = (UnavailabilityPeriod) object;
        String label = period.getStartDate() == null ? null : period.getStartDate().toString();
        return label == null || label.length() == 0 ? getString("_UI_UnavailabilityPeriod_type") : getString("_UI_UnavailabilityPeriod_type") + " " + label;
    }

    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(UnavailabilityPeriod.class)) {
            case PepperPackage.UNAVAILABILITY_PERIOD__START_DATE:
            case PepperPackage.UNAVAILABILITY_PERIOD__END_DATE:
            case PepperPackage.UNAVAILABILITY_PERIOD__DESCRIPTION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            default:
                super.notifyChanged(notification);
                return;
        }
    }

    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    @Override
    public ResourceLocator getResourceLocator() {
        return PepperEditPlugin.INSTANCE;
    }
}
