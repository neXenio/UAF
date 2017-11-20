[![Build Status](https://secure.travis-ci.org/neXenio/UAF.svg?branch=master)](https://travis-ci.org/neXenio/UAF)

# FIDO UAF - Universal Authentication Framework

This project provides a Java implementation of the [UAF protocol][uaf-protocol-overview] (as defined per [specification][uaf-specification-v1.0]) that can be used by [UAF Clients][uaf-client-overview] and [UAF Servers][uaf-server-overview]. The repository is forked from [eBay UAF][ebay-uaf-repo] because of the lack of maintenance.


## What is UAF?

The goal of the Universal Authentication Framework is to provide a unified and extensible authentication mechanism that supplants passwords while avoiding the shortcomings of current alternative authentication approaches. Read more at the [UAF Specification][uaf-specification-v1.0].

# Usage

## Integration

Get the latest release [from Bintray](https://bintray.com/nexenio/UAF-Java/UAF-Core) as Jar or as Maven/Gradle dependency.

## Publishing Artifacts

### Prerequisites

Make sure you are a member of the Bintray organization. Get an API key and overwrite `bintrayUser` and `bintrayApiKey`.  

### Release new Versions

- merge your changes to `master`
- run the gradle task `release`. That will
  - bump the release version
  - publish the jar to bintray


[releases]: https://github.com/neXenio/UAF/releases
[bintray]: https://bintray.com/nexenio/UAF-Java/

[fido]: https://fidoalliance.org/
[fido-specifications-overview]: https://fidoalliance.org/specifications/overview/
[uaf-architectural-overview]: https://fidoalliance.org/specs/fido-uaf-v1.0-ps-20141208/fido-uaf-overview-v1.0-ps-20141208.html
[uaf-specification-v1.0]: https://fidoalliance.org/specs/fido-uaf-v1.0-ps-20141208/fido-uaf-protocol-v1.0-ps-20141208.html
[uaf-client-overview]: https://fidoalliance.org/specs/fido-uaf-v1.0-ps-20141208/fido-uaf-overview-v1.0-ps-20141208.html#fido-uaf-client
[uaf-server-overview]: https://fidoalliance.org/specs/fido-uaf-v1.0-ps-20141208/fido-uaf-overview-v1.0-ps-20141208.html#fido-uaf-server
[uaf-protocol-overview]: https://fidoalliance.org/specs/fido-uaf-v1.0-ps-20141208/fido-uaf-overview-v1.0-ps-20141208.html#fido-uaf-protocols
[tizen-uaf-guide]: https://developer.tizen.org/development/guides/native-application/personal-data/authentication-and-authorization/fido-universal-authentication-framework
[ebay-uaf-repo]: https://github.com/eBay/UAF