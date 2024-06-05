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

public val Icons.Filled.SleepingBag: ImageVector
    get() {
        if (_sleepingBag != null) {
            return _sleepingBag!!
        }
        _sleepingBag = Builder(name = "SleepingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.793f, 13.293f)
                curveToRelative(5.209f, -5.209f, 13.786f, -5.77f, 14.148f, -5.791f)
                lineToRelative(1.003f, -0.059f)
                curveToRelative(-0.131f, -2.03f, -0.486f, -3.871f, -0.796f, -5.158f)
                curveToRelative(-0.324f, -1.345f, -1.521f, -2.285f, -2.914f, -2.285f)
                lineTo(7.766f, 0.0f)
                curveToRelative(-1.393f, 0.0f, -2.59f, 0.939f, -2.913f, 2.284f)
                curveToRelative(-0.389f, 1.61f, -0.853f, 4.083f, -0.853f, 6.716f)
                curveToRelative(0.0f, 1.418f, 0.142f, 3.071f, 0.347f, 4.739f)
                lineToRelative(0.446f, -0.446f)
                close()
                moveTo(12.0f, 2.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12.633f, 15.323f)
                lineToRelative(-5.165f, -1.722f)
                curveToRelative(3.022f, -2.331f, 6.888f, -3.357f, 9.302f, -3.795f)
                lineToRelative(-4.137f, 5.517f)
                close()
                moveTo(19.997f, 8.838f)
                curveToRelative(0.0f, 0.054f, 0.003f, 0.108f, 0.003f, 0.162f)
                curveToRelative(0.0f, 5.29f, -1.942f, 13.86f, -2.025f, 14.223f)
                lineToRelative(-0.177f, 0.777f)
                lineTo(6.202f, 24.0f)
                lineToRelative(-0.177f, -0.777f)
                curveToRelative(-0.056f, -0.246f, -0.971f, -4.287f, -1.552f, -8.51f)
                lineToRelative(8.894f, 2.964f)
                lineToRelative(6.629f, -8.839f)
                close()
            }
        }
        .build()
        return _sleepingBag!!
    }

private var _sleepingBag: ImageVector? = null
