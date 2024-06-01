package me.localx.icons.rounded.filled

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

public val Icons.Filled.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.492f, 7.9694f)
                    lineTo(10.954f, 0.9754f)
                    curveTo(10.209f, 0.4299f, 9.3275f, 0.1013f, 8.4073f, 0.0261f)
                    curveTo(7.487f, -0.0491f, 6.5638f, 0.132f, 5.7402f, 0.5493f)
                    curveTo(4.9165f, 0.9667f, 4.2245f, 1.6039f, 3.7408f, 2.3904f)
                    curveTo(3.2572f, 3.177f, 3.0008f, 4.0821f, 3.0f, 5.0054f)
                    verticalLineTo(19.0004f)
                    curveTo(2.9986f, 19.9247f, 3.2536f, 20.8312f, 3.7369f, 21.6191f)
                    curveTo(4.2201f, 22.407f, 4.9124f, 23.0453f, 5.7369f, 23.463f)
                    curveTo(6.5614f, 23.8808f, 7.4856f, 24.0615f, 8.4067f, 23.9851f)
                    curveTo(9.3278f, 23.9087f, 10.2096f, 23.5783f, 10.954f, 23.0304f)
                    lineTo(20.492f, 16.0364f)
                    curveTo(21.1249f, 15.572f, 21.6395f, 14.965f, 21.9942f, 14.2647f)
                    curveTo(22.349f, 13.5644f, 22.5338f, 12.7905f, 22.5338f, 12.0054f)
                    curveTo(22.5338f, 11.2204f, 22.349f, 10.4464f, 21.9942f, 9.7461f)
                    curveTo(21.6395f, 9.0458f, 21.1249f, 8.4389f, 20.492f, 7.9744f)
                    verticalLineTo(7.9694f)
                    close()
                }
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
