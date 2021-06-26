package minh.project.FixJobSpyder.Service;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class SpyderUnitStateTest {

    @Test
    void getSpyderUnitState() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        SpyderUnitState spyderUnitState= new SpyderUnitState();
        spyderUnitState.GetSpyderUnitState();
    }
}