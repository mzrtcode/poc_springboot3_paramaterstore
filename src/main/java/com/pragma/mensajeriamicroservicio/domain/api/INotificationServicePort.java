package com.pragma.mensajeriamicroservicio.domain.api;

import com.pragma.mensajeriamicroservicio.infrastructure.exception.NotificationFailedException;

public interface INotificationServicePort {

    void enviarSMS(String mensaje, String destino) throws NotificationFailedException;
}
