# To learn more about how to use Nix to configure your environment
# see: https://developers.google.com/idx/guides/customize-idx-env
{ pkgs, ... }: {
  # Which nixpkgs channel to use.
  channel = "stable-23.11"; # or "unstable"
  # Use https://search.nixos.org/packages to find packages
  packages = [
    pkgs.zulu17
    pkgs.gradle
  ];
  # Sets environment variables in the workspace
  services.mysql = {
    enable = true;
  };
  
  env = {

  };
  idx = {
    # Search for the extensions you want on https://open-vsx.org/ and use "publisher.id"
    extensions = [
      "vscjava.vscode-java-pack"
      "rangav.vscode-thunder-client"
    ];
    
    previews = {
      enable = true;
      previews = {
        web = {
          command = ["./gradlew" "bootRun"];
          manager = "web";
          env = {
            SERVER_PORT = "$PORT";
          };
        };
      };
    };

    workspace = {
      # Runs when a workspace is first created with this `dev.nix` file
      onCreate = {
        install = "./gradlew clean build";
      };
      # Runs when a workspace is (re)started
    };
  };
}
