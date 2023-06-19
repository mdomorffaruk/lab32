    #include<stdio.h>
    #include<conio.h>
    #include<graphics.h>
    main()
    {
      int gd=DETECT, gm, x1, y1, angle1, angle2, xr, yr;
      initgraph(&gd, &gm, "C:\\TC\\BGI");
      printf("Enter the centre coordinate(x1, y1):");
      scanf("%d%d", &x1, &y1);
      printf("Enter the semi-major axis:");
      scanf("%d", &xr);
      printf("Enter the semi-minor axis:");
      scanf("%d", &yr);
      angle1=0;
      angle2=360;
      setcolor(BROWN);
      ellipse(x1,y1,angle1,angle2,xr,yr);
      setfillstyle(LTBKSLASH_FILL, MAGENTA);
      floodfill(x1, y1, BROWN);
      outtextxy(20, 450, "Press any key to continue...");
      getch();
    closegraph();
    }
