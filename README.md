[![Build Status](https://secure.travis-ci.org/xipki/pkcs11wrapper.svg)](http://travis-ci.org/xipki/pkcs11wrapper)
[![GitHub release](https://img.shields.io/github/release/xipki/pkcs11wrapper.svg)](https://github.com/xipki/pkcs11wrapper/releases)
[![Github forks](https://img.shields.io/github/forks/xipki/pkcs11wrapper.svg)](https://github.com/xipki/pkcs11wrapper/network)
[![Github stars](https://img.shields.io/github/stars/xipki/pkcs11wrapper.svg)](https://github.com/xipki/pkcs11wrapper/stargazers)

Changes of current branch sunpkcs11 compared to master
=============================================

- No external library is required

- Require OpenJDK or Oracle Java Runtime 1.8 or higher

- Support PKCS#11 version 2.40


IAIK PKCS#11 Wrapper for Java, Version 1.3
=============================================

The PKCS#11 API is specified in the ANSI-C programming 
language. This library maps the complete PKCS#11 API to 
an equivalent Java API in a straight forward style. 
This allows to access PKCS#11 modules from Java.

It does not contain a JCA/JCE provider implementation. 
This means that the PKCS#11 Wrapper alone is not 
compatible with the Java cryptographic APIs like JCA 
and JCE.
There is a different product which provides this - the 
IAIK PKCS#11 Provider. 

The current version of this package is available from

http://jce.iaik.tugraz.at/download/

After the installation has finished use your favorite 
browser to view the Readme.html for further information.


Your SIC/IAIK JavaSecurity Team
