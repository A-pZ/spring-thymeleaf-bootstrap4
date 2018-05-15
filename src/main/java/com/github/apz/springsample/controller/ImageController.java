/**
 *
 */
package com.github.apz.springsample.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author A-pZ
 *
 */
@Controller
@RequestMapping("image")
@RequiredArgsConstructor
@Log4j2
public class ImageController {
	@GetMapping(value="/{id}",produces=MediaType.IMAGE_JPEG_VALUE )
	public @ResponseBody byte[] responseImage(@PathVariable String id) throws IOException {

		String filename = "/app/" + id + ".jpg";

		return FileUtils.readFileToByteArray(new File(filename));
	}
}
