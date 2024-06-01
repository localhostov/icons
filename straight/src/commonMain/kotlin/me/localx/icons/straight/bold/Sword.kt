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

public val Icons.Bold.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.2682f, 0.7336f)
                    curveTo(22.9717f, 0.4358f, 22.6047f, 0.2179f, 22.2013f, 0.1003f)
                    curveTo(21.7979f, -0.0174f, 21.3713f, -0.031f, 20.9612f, 0.0606f)
                    lineTo(16.9892f, 1.3546f)
                    lineTo(5.4222f, 12.9226f)
                    curveTo(4.096f, 12.2484f, 2.6773f, 11.7743f, 1.2122f, 11.5156f)
                    lineTo(0.7832f, 14.4846f)
                    curveTo(2.457f, 14.8024f, 4.0466f, 15.4643f, 5.4512f, 16.4286f)
                    lineTo(3.2072f, 18.6726f)
                    lineTo(2.1522f, 17.6176f)
                    lineTo(0.0312f, 19.7386f)
                    lineTo(4.2712f, 23.9796f)
                    lineTo(6.3922f, 21.8586f)
                    lineTo(5.3282f, 20.7936f)
                    lineTo(7.5712f, 18.5506f)
                    curveTo(8.5361f, 19.9546f, 9.1984f, 21.544f, 9.5162f, 23.2176f)
                    lineTo(12.4852f, 22.7886f)
                    curveTo(12.2266f, 21.3239f, 11.7525f, 19.9054f, 11.0782f, 18.5796f)
                    lineTo(22.6462f, 7.0126f)
                    lineTo(23.9412f, 3.0396f)
                    curveTo(24.0325f, 2.6297f, 24.0187f, 2.2033f, 23.901f, 1.8002f)
                    curveTo(23.7834f, 1.397f, 23.5657f, 1.0301f, 23.2682f, 0.7336f)
                    close()
                    moveTo(20.0182f, 5.4006f)
                    lineTo(9.4002f, 16.0156f)
                    curveTo(9.1892f, 15.7626f, 8.9682f, 15.5156f, 8.7272f, 15.2726f)
                    curveTo(8.4862f, 15.0296f, 8.2382f, 14.8116f, 7.9862f, 14.6006f)
                    lineTo(18.6002f, 3.9816f)
                    lineTo(20.7002f, 3.2926f)
                    lineTo(20.0182f, 5.4006f)
                    close()
                }
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
