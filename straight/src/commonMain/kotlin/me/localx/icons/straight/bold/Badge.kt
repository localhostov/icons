package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0002f, 7.9999f)
                    curveTo(20.0031f, 6.7048f, 19.6914f, 5.4283f, 19.092f, 4.2802f)
                    curveTo(18.4927f, 3.1321f, 17.6235f, 2.1467f, 16.5592f, 1.4086f)
                    curveTo(15.495f, 0.6705f, 14.2674f, 0.2019f, 12.9821f, 0.0429f)
                    curveTo(11.6967f, -0.1161f, 10.392f, 0.0394f, 9.18f, 0.496f)
                    curveTo(7.968f, 0.9526f, 6.885f, 1.6966f, 6.024f, 2.6641f)
                    curveTo(5.163f, 3.6316f, 4.5498f, 4.7937f, 4.237f, 6.0505f)
                    curveTo(3.9242f, 7.3074f, 3.9213f, 8.6213f, 4.2284f, 9.8795f)
                    curveTo(4.5356f, 11.1377f, 5.1436f, 12.3025f, 6.0002f, 13.2739f)
                    verticalLineTo(21.1469f)
                    curveTo(5.999f, 21.6842f, 6.1499f, 22.2109f, 6.4354f, 22.6661f)
                    curveTo(6.7209f, 23.1213f, 7.1294f, 23.4864f, 7.6136f, 23.7192f)
                    curveTo(8.0979f, 23.9521f, 8.6381f, 24.0431f, 9.1719f, 23.9818f)
                    curveTo(9.7058f, 23.9205f, 10.2113f, 23.7094f, 10.6302f, 23.3729f)
                    lineTo(12.0002f, 22.2729f)
                    lineTo(13.3692f, 23.3729f)
                    curveTo(13.7885f, 23.7085f, 14.294f, 23.9188f, 14.8275f, 23.9796f)
                    curveTo(15.3611f, 24.0404f, 15.9009f, 23.9492f, 16.3849f, 23.7166f)
                    curveTo(16.8689f, 23.484f, 17.2773f, 23.1193f, 17.5631f, 22.6647f)
                    curveTo(17.8489f, 22.21f, 18.0004f, 21.6839f, 18.0002f, 21.1469f)
                    verticalLineTo(13.2739f)
                    curveTo(19.2885f, 11.8191f, 19.9999f, 9.9431f, 20.0002f, 7.9999f)
                    close()
                    moveTo(12.0002f, 2.9999f)
                    curveTo(12.9891f, 2.9999f, 13.9558f, 3.2931f, 14.7781f, 3.8426f)
                    curveTo(15.6003f, 4.392f, 16.2412f, 5.1729f, 16.6196f, 6.0865f)
                    curveTo(16.9981f, 7.0001f, 17.0971f, 8.0055f, 16.9042f, 8.9754f)
                    curveTo(16.7112f, 9.9453f, 16.235f, 10.8362f, 15.5358f, 11.5354f)
                    curveTo(14.8365f, 12.2347f, 13.9456f, 12.7109f, 12.9757f, 12.9038f)
                    curveTo(12.0058f, 13.0968f, 11.0004f, 12.9977f, 10.0868f, 12.6193f)
                    curveTo(9.1732f, 12.2409f, 8.3923f, 11.6f, 7.8429f, 10.7778f)
                    curveTo(7.2935f, 9.9555f, 7.0002f, 8.9888f, 7.0002f, 7.9999f)
                    curveTo(7.0018f, 6.6743f, 7.5291f, 5.4035f, 8.4664f, 4.4661f)
                    curveTo(9.4038f, 3.5288f, 10.6746f, 3.0015f, 12.0002f, 2.9999f)
                    close()
                    moveTo(12.0002f, 18.4359f)
                    lineTo(9.0002f, 20.8359f)
                    verticalLineTo(15.4109f)
                    curveTo(10.9231f, 16.1962f, 13.0773f, 16.1962f, 15.0002f, 15.4109f)
                    verticalLineTo(20.8349f)
                    lineTo(12.0002f, 18.4359f)
                    close()
                }
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
