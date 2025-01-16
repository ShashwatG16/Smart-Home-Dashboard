package com.example.SHD_backend.SHD_backend.repository;

import com.example.SHD_backend.SHD_backend.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, String> {
}
