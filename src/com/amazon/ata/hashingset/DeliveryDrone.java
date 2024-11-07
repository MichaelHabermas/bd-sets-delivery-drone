package com.amazon.ata.hashingset;

import java.util.Objects;

/**
 * An Amazon Delivery Drone.
 */
public class DeliveryDrone {
    
    private String registrationNumber;
    private String locationCode;

    /**
     * Construct an object representing an Amazon Delivery Drone.
     *
     * @param registrationNumber the registration number of this drone.
     * @param locationCode the location identifier of the jurisdiction that registered the drone.
     */
    public DeliveryDrone(String registrationNumber, String locationCode) {
        this.registrationNumber = registrationNumber;
        this.locationCode = locationCode;
    }

    /**
     * Return the registration number of this drone, as granted by
     *   the relevant jurisdiction.
     * @return the registration number of this drone.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Return the location code of the jurisdiction where the drone is registered.
     *
     * @return the jurisdiction location code.
     */
    public String getLocationCode() {
        return locationCode;
    }

    @Override
    public int hashCode() {
        return registrationNumber.hashCode() + locationCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(DeliveryDrone.class)) {
            return false;
        }

        DeliveryDrone drone = (DeliveryDrone) obj;
        return registrationNumber.equals(drone.getRegistrationNumber()) && locationCode.equals(drone.getLocationCode());
    }
}
