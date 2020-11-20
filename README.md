# NotificationSystem
NotificationSystem

## How to use it?

- Add this to your client's main class:
`
public final NotificationManager notificationManager = new NotificationManager();
`

- Next, we add this code for rendering on the screen.

`final ScaledResolution resolution = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
float y = (float)(resolution.getScaledHeight() - 18);
for (int i = 0; i < Main.getInstance().notificationManager.getNotifications().size(); ++i){
  Main.getInstance().notificationManager.getNotifications().get(i).draw(y);
y -= 18.0f;
}`

- To add a message write this:
`
Main.getInstance().notificationManager.addNotification(NotificationType.INFO, ("Hello, World!"), 2000);
`

## Done!
