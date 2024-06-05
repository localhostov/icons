package me.localx.icons.straight.bold

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

public val Icons.Bold.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.268f, 0.733f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, false, -2.307f, -0.673f)
                lineToRelative(-3.972f, 1.294f)
                lineToRelative(-11.567f, 11.568f)
                arcToRelative(15.07f, 15.07f, 0.0f, false, false, -4.21f, -1.407f)
                lineToRelative(-0.429f, 2.969f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 4.668f, 1.944f)
                lineToRelative(-2.244f, 2.244f)
                lineToRelative(-1.055f, -1.055f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(4.24f, 4.241f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.064f, -1.065f)
                lineToRelative(2.243f, -2.243f)
                arcToRelative(12.286f, 12.286f, 0.0f, false, true, 1.945f, 4.667f)
                lineToRelative(2.969f, -0.429f)
                arcToRelative(15.058f, 15.058f, 0.0f, false, false, -1.407f, -4.209f)
                lineToRelative(11.568f, -11.567f)
                lineToRelative(1.295f, -3.973f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, false, -0.673f, -2.306f)
                close()
                moveTo(20.018f, 5.4f)
                lineTo(9.4f, 16.015f)
                curveToRelative(-0.211f, -0.253f, -0.432f, -0.5f, -0.673f, -0.743f)
                reflectiveCurveToRelative(-0.489f, -0.461f, -0.741f, -0.672f)
                lineToRelative(10.614f, -10.619f)
                lineToRelative(2.1f, -0.689f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
