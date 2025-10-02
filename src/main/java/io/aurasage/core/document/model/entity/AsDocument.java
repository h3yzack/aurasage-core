package io.aurasage.core.document.model.entity;

import java.time.LocalDateTime;

import io.aurasage.core.document.model.enums.DocumentStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AsDocument {

    private String id;
    private String fileName;
    private String filePath;
    private String contentType;
    private Long sizeInBytes;
    private String ownerId;
    private LocalDateTime uploadDate;
    private java.util.Set<String> tags;
    private String fileHash;
    private DocumentStatus status;
}
