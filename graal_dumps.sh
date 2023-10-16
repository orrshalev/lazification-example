#!/bin/bash

# Get the list of *Call* files in the specified directory
for file_path in graal_dumps/2023.10.16.00.28.34.690/*Call*; do
  # Check if the path is a regular file
  if [[ -f "$file_path" ]]; then
    # Extract just the file name from the path
    file_name=$(basename "$file_path")

    # Construct the output file name by replacing the file extension with '.pdf'
    out_name="${file_name%.*}.pdf"

    # Call the seafoam command with the current file
    seafoam "$file_path:0" render --out "$out_name"
  else
    echo "'$file_path' is not a regular file."
  fi
done
