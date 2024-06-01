package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.AngleDoubleLeft: ImageVector
    get() {
        if (_angleDoubleLeft != null) {
            return _angleDoubleLeft!!
        }
        _angleDoubleLeft = Builder(name = "AngleDoubleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.6199f, 11.654f)
                    lineTo(13.1479f, 2.126f)
                    lineTo(11.0269f, 0.005f)
                    lineTo(1.4999f, 9.533f)
                    curveTo(0.8464f, 10.1877f, 0.4793f, 11.075f, 0.4793f, 12.0f)
                    curveTo(0.4793f, 12.9251f, 0.8464f, 13.8123f, 1.4999f, 14.467f)
                    lineTo(11.0269f, 24.0f)
                    lineTo(13.1479f, 21.879f)
                    lineTo(3.6199f, 12.346f)
                    curveTo(3.5744f, 12.3006f, 3.5383f, 12.2467f, 3.5137f, 12.1873f)
                    curveTo(3.4891f, 12.1279f, 3.4764f, 12.0643f, 3.4764f, 12.0f)
                    curveTo(3.4764f, 11.9358f, 3.4891f, 11.8721f, 3.5137f, 11.8127f)
                    curveTo(3.5383f, 11.7534f, 3.5744f, 11.6994f, 3.6199f, 11.654f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0901f, 2.126f)
                    lineTo(20.9691f, 0.005f)
                    lineTo(10.0341f, 10.939f)
                    curveTo(9.8947f, 11.0783f, 9.7841f, 11.2437f, 9.7087f, 11.4258f)
                    curveTo(9.6333f, 11.6078f, 9.5944f, 11.803f, 9.5944f, 12.0f)
                    curveTo(9.5944f, 12.1971f, 9.6333f, 12.3922f, 9.7087f, 12.5743f)
                    curveTo(9.7841f, 12.7563f, 9.8947f, 12.9217f, 10.0341f, 13.061f)
                    lineTo(20.9691f, 24.0f)
                    lineTo(23.0901f, 21.879f)
                    lineTo(13.2161f, 12.0f)
                    lineTo(23.0901f, 2.126f)
                    close()
                }
            }
        }
        .build()
        return _angleDoubleLeft!!
    }

private var _angleDoubleLeft: ImageVector? = null
