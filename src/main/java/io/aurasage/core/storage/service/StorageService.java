package io.aurasage.core.storage.service;

public interface StorageService {

    String generatePresignedUploadUrl(String userId, String objectKey, String fileName, int expiryInSeconds);

    String generatePresignedDownloadUrl(String objectKey, int expiryInSeconds);

    void deleteObject(String objectKey);

}
