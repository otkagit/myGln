@objects
   search   id ssearch
   page     id page
   content  id content
   desc     id pagedesc
   podium-* css .podium ul li
 


= Page =
  @on * 			
    page:
      width 96% of screen/width
      
    content:
      width 100% of page/width
      inside partly page  10 to 18px bottom
      aligned horizontally top page
      aligned vertically all page
      
    desc:
      width 75% of page/width
      inside content  14 to 20px left, 230 to 250px right, 1190 to 1230px bottom
      aligned horizontally top content

	podium-1:
	  width  ~ 15% of content/width
      height 128 to 132px
      inside content  ~ 15px left   
      #image file podium-1.png, error 1px
	  #image file podium-1.png, tolerance 80, error 4%
	  #image file podium-1.png, tolerance 80, error 4%, area 10 90 100 30
	  #image file podium-1.png, tolerance 80, error 10px, analyze-offset 2
      #image file podium-1.png, tolerance 80, error 1px, filter saturation 100
      #image file podium-1.png, error 1px, filter saturation 0
      #image file podium-1e.png, error 1px, analyze-offset 2
      #OK image file podium-1.png, tolerance 80, error 1px, analyze-offset 1, map-filter denoise 3
      #OK image file podium-1.png, tolerance 80, analyze-offset 1,  error 10px, map-filter denoise 2
      #OK image file podium-1e.png, tolerance 80, analyze-offset 1,  error 10px, map-filter denoise 3
      #image file podium-1ee.png, tolerance 80, analyze-offset 1,  error 10px, map-filter denoise 2
      image file soll.png, tolerance 80, analyze-offset 1,  error 10px, map-filter denoise 2