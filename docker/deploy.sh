echo "build custom rclone image"
docker build -t custom-rclone:v1 -f ./rclone/dockerfile ./rclone
