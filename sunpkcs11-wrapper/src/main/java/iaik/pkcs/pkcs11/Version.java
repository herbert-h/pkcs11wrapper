// Copyright (c) 2002 Graz University of Technology. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice,
//    this list of conditions and the following disclaimer.
//
// 2. Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
//
// 3. The end-user documentation included with the redistribution, if any, must
//    include the following acknowledgment:
//
//    "This product includes software developed by IAIK of Graz University of
//     Technology."
//
//    Alternately, this acknowledgment may appear in the software itself, if and
//    wherever such third-party acknowledgments normally appear.
//
// 4. The names "Graz University of Technology" and "IAIK of Graz University of
//    Technology" must not be used to endorse or promote products derived from
//    this software without prior written permission.
//
// 5. Products derived from this software may not be called "IAIK PKCS Wrapper",
//    nor may "IAIK" appear in their name, without prior written permission of
//    Graz University of Technology.
//
// THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE LICENSOR BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
// OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
// OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
// ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
// OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package iaik.pkcs.pkcs11;

import sun.security.pkcs11.wrapper.CK_VERSION;

/**
 * Objects of this class represent a version. This consists of a major and a
 * minor version number.
 *
 * @author Karl Scheibelhofer
 * @version 1.0
 * @invariants
 */
@SuppressWarnings("restriction")
public class Version {

  /**
   * The major version number.
   */
  private byte major;

  /**
   * The minor version number.
   */
  private byte minor;

  /**
   * Create a new Version object with the given major and minor
   * version.
   *
   * @param major
   *          The major version number.
   * @param minor
   *          The minor version number.
   * @preconditions
   * @postconditions
   */
  public Version(byte major, byte minor) {
    this.major = major;
    this.minor = minor;
  }

  /**
   * Constructor taking a CK_VERSION object.
   *
   * @param ckVersion
   *          A CK_VERSION object.
   * @preconditions (ckVersion <> null)
   * @postconditions
   */
  public Version(CK_VERSION ckVersion) {
    Util.requireNonNull("ckVersion", ckVersion);
    this.major = ckVersion.major;
    this.minor = ckVersion.minor;
  }

  /**
   * Set the major version number.
   *
   * @param major
   *          The major version number.
   * @preconditions
   * @postconditions
   */
  public void setMajor(byte major) {
    this.major = major;
  }

  /**
   * Set the minor version number.
   *
   * @param minor
   *          The minor version number.
   * @preconditions
   * @postconditions
   */
  public void setMinor(byte minor) {
    this.minor = minor;
  }

  /**
   * Get the major version number.
   *
   * @return The major version number.
   * @preconditions
   * @postconditions
   */
  public byte getMajor() {
    return major;
  }

  /**
   * Get the minor version number.
   *
   * @return The minor version number.
   * @preconditions
   * @postconditions
   */
  public byte getMinor() {
    return minor;
  }

  /**
   * Returns the string representation of this object.
   *
   * @return the string representation of this object
   */
  @Override
  public String toString() {
    return Util.concatObjects(major & 0xff, ".",
        ((minor < 10) ? "0" : ""), minor & 0xff);
  }

  /**
   * Compares major and minor version number of this objects with the other
   * object. Returns only true, if both are equal in both objects.
   *
   * @param otherObject
   *          The other Version object.
   * @return True, if other is an instance of Info and all member variables of
   *         both objects are equal. False, otherwise.
   * @preconditions
   * @postconditions
   */
  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject) {
      return true;
    } else if (!(otherObject instanceof Version)) {
      return false;
    }

    Version other = (Version) otherObject;
    return (this.major == other.major) && (this.minor == other.minor);
  }

  /**
   * The overriding of this method should ensure that the objects of this
   * class work correctly in a hashtable.
   *
   * @return The hash code of this object. Gained from the slotID, state and
   *         deviceError.
   * @preconditions
   * @postconditions
   */
  @Override
  public int hashCode() {
    return major ^ minor;
  }

}
