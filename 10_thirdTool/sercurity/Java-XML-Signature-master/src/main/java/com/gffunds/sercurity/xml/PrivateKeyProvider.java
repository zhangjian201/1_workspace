package com.gffunds.sercurity.xml;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.security.PrivateKey;

public interface PrivateKeyProvider {

    KeyInfo loadKeyInfo();

    PrivateKey loadPrivateKey();
}
