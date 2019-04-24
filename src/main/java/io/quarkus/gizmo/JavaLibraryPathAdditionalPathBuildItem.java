package io.quarkus.gizmo;

public final class JavaLibraryPathAdditionalPathBuildItem {

    private final String path;

    public JavaLibraryPathAdditionalPathBuildItem(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
