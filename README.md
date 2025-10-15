# AuraSage Core Library

Shared library for AuraSage platform.

## Components

- **AsDocument** - Document entity with metadata and status tracking
- **DocumentRepository** - Reactive repository interface for document persistence
- **StorageService** - Interface for storage operations and presigned URL generation
- **ErrorResponse** - Standard error response structure

## Usage

Add dependency to your project:

```gradle
dependencies {
    implementation 'io.github.h3yzack:aurasage-core:${latest.version}'
}
```

## Build

```bash
./gradlew clean build
```