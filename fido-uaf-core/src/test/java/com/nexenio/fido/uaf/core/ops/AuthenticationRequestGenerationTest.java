package com.nexenio.fido.uaf.core.ops;

import static org.junit.Assert.*;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.nexenio.fido.uaf.core.crypto.*;
import com.nexenio.fido.uaf.core.message.*;
import com.nexenio.fido.uaf.core.operation.authentication.*;
import java.util.List;
import java.util.logging.Logger;
import org.junit.*;

public class AuthenticationRequestGenerationTest {

    private Logger logger = Logger.getLogger(this.getClass().getName());
    private static final String TEST_SIGNATURE = "test_signature";
    Gson gson = new Gson();

    @Test
    public void notNull() {
        AuthenticationRequest authReq = new AuthenticationRequestGeneration().createAuthenticationRequest(new NotaryImpl());
        assertNotNull(authReq);
        logger.info(gson.toJson(authReq));
    }

    @Test
    public void withPolicy() {
        List<String> aaids = Lists.newArrayList("ABCD#ABCD");
        AuthenticationRequest authReq = new AuthenticationRequestGeneration("https://uaf.ebay.com/uaf/facets", aaids).createAuthenticationRequest(new NotaryImpl());
        assertNotNull(authReq);
        logger.info(gson.toJson(authReq));
    }

    class NotaryImpl implements Notary {

        public boolean verify(String dataToSign, String signature) {
            return signature.startsWith(TEST_SIGNATURE);
        }

        public String sign(String dataToSign) {
            // For testing
            return TEST_SIGNATURE;
        }
    }

}
