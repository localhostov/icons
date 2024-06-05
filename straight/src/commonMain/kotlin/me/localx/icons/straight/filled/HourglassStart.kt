package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.HourglassStart: ImageVector
    get() {
        if (_hourglassStart != null) {
            return _hourglassStart!!
        }
        _hourglassStart = Builder(name = "HourglassStart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.383f, 5.0f)
                horizontalLineToRelative(7.241f)
                curveToRelative(-0.726f, 1.911f, -2.361f, 3.379f, -3.609f, 4.274f)
                curveToRelative(-1.254f, -0.902f, -2.898f, -2.374f, -3.632f, -4.274f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -4.006f, 2.24f, -7.013f, 4.442f, -9.0f)
                curveToRelative(-2.202f, -1.987f, -4.442f, -4.994f, -4.442f, -9.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 4.005f, -2.231f, 7.012f, -4.425f, 9.0f)
                curveToRelative(2.193f, 1.988f, 4.425f, 4.995f, 4.425f, 9.0f)
                close()
                moveTo(17.91f, 4.155f)
                lineToRelative(0.182f, -1.155f)
                lineTo(5.907f, 3.0f)
                lineToRelative(0.186f, 1.158f)
                curveToRelative(0.567f, 3.54f, 3.61f, 6.009f, 5.373f, 7.165f)
                lineToRelative(0.547f, 0.359f)
                lineToRelative(0.548f, -0.358f)
                curveToRelative(1.757f, -1.146f, 4.788f, -3.604f, 5.35f, -7.169f)
                close()
            }
        }
        .build()
        return _hourglassStart!!
    }

private var _hourglassStart: ImageVector? = null
