package com.priyanshu.zeotap.WeatherMonitoring.Repository;

import com.priyanshu.zeotap.WeatherMonitoring.Model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherData, Long> {

}
