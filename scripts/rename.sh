#/bin/sh

for file in */*
do 
  echo $file
  filebase=`basename $file $1`
  dir=`dirname $file`
  echo "mv $file $dir/$filebase$2"
  mv $file $dir/$filebase$2
done
