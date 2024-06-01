package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.6803f, 24.0f)
                    curveTo(8.2535f, 24.0031f, 5.9222f, 23.0545f, 4.187f, 21.3579f)
                    curveTo(0.5561f, 17.5848f, 0.627f, 11.5957f, 4.3462f, 7.9096f)
                    lineTo(10.1805f, 2.0762f)
                    curveTo(12.5644f, -0.3762f, 16.3916f, -0.6953f, 19.1487f, 1.3286f)
                    curveTo(22.086f, 3.5837f, 22.639f, 7.7928f, 20.3839f, 10.7301f)
                    curveTo(20.2078f, 10.9595f, 20.017f, 11.1773f, 19.8128f, 11.3821f)
                    lineTo(13.7073f, 17.4874f)
                    curveTo(13.0202f, 18.2059f, 12.1083f, 18.668f, 11.1227f, 18.7974f)
                    curveTo(9.7867f, 18.9438f, 8.4641f, 18.4243f, 7.5848f, 17.4078f)
                    curveTo(6.2368f, 15.681f, 6.3809f, 13.2217f, 7.9213f, 11.6641f)
                    lineTo(12.5757f, 7.0138f)
                    curveTo(13.166f, 6.4237f, 14.1228f, 6.4237f, 14.713f, 7.0138f)
                    curveTo(15.303f, 7.604f, 15.303f, 8.5608f, 14.713f, 9.151f)
                    lineTo(9.9155f, 13.9496f)
                    curveTo(9.4934f, 14.372f, 9.4936f, 15.0566f, 9.916f, 15.4787f)
                    curveTo(10.3385f, 15.9008f, 11.0231f, 15.9006f, 11.4451f, 15.4782f)
                    lineTo(17.606f, 9.3183f)
                    curveTo(18.8708f, 8.0885f, 19.1047f, 6.1423f, 18.1673f, 4.6478f)
                    curveTo(17.0603f, 2.9427f, 14.7806f, 2.4577f, 13.0755f, 3.5647f)
                    curveTo(12.862f, 3.7033f, 12.6635f, 3.8637f, 12.483f, 4.0432f)
                    lineTo(6.4028f, 10.1285f)
                    curveTo(4.1046f, 12.36f, 3.8061f, 15.9454f, 5.7035f, 18.5264f)
                    curveTo(7.814f, 21.275f, 11.7531f, 21.7923f, 14.5017f, 19.6819f)
                    curveTo(14.7165f, 19.517f, 14.9204f, 19.3383f, 15.112f, 19.1471f)
                    lineTo(19.9105f, 14.3496f)
                    curveTo(20.5007f, 13.7595f, 21.4575f, 13.7595f, 22.0478f, 14.3496f)
                    curveTo(22.6378f, 14.9398f, 22.6378f, 15.8966f, 22.0478f, 16.4868f)
                    lineTo(17.2493f, 21.2843f)
                    curveTo(15.5082f, 23.0275f, 13.1441f, 24.0049f, 10.6803f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
