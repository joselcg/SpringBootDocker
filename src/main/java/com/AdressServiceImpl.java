package main.java.com;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by joseluisdelacruz 
 */
@Service
public class AddressServiceImpl implements AddressService {

    public String getServerAddress() throws Exception {

        final String serverAddress = InetAddress.getLocalHost().getHostAddress();

        return serverAddress;

    }

}