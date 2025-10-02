#!/bin/bash

set -e

echo "🔨 Publishing aurasage-core to local Maven repository..."
cd /workspaces/aurasage/aurasage-core
./gradlew clean build publishToMavenLocal

echo "✅ Build completed successfully!"
echo "📦 aurasage-core published to ~/.m2/repository/"
