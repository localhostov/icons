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

public val Icons.Bold.G: ImageVector
    get() {
        if (_g != null) {
            return _g!!
        }
        _g = Builder(name = "G", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 23.999f)
                curveToRelative(-0.976f, 0.0f, -1.958f, -0.139f, -2.915f, -0.423f)
                curveToRelative(-4.169f, -1.237f, -7.082f, -5.255f, -7.082f, -9.771f)
                verticalLineToRelative(-3.473f)
                curveToRelative(0.0f, -2.812f, 1.166f, -5.553f, 3.198f, -7.52f)
                curveTo(7.16f, 0.914f, 9.699f, -0.095f, 12.359f, 0.006f)
                curveToRelative(3.711f, 0.123f, 7.046f, 2.268f, 8.701f, 5.599f)
                lineToRelative(-2.687f, 1.335f)
                curveToRelative(-1.164f, -2.341f, -3.506f, -3.85f, -6.114f, -3.936f)
                curveToRelative(-1.832f, -0.056f, -3.604f, 0.637f, -4.976f, 1.964f)
                curveToRelative(-1.451f, 1.404f, -2.284f, 3.359f, -2.284f, 5.363f)
                verticalLineToRelative(3.473f)
                curveToRelative(0.0f, 3.198f, 2.029f, 6.033f, 4.935f, 6.895f)
                curveToRelative(2.263f, 0.67f, 4.617f, 0.235f, 6.462f, -1.197f)
                curveToRelative(1.473f, -1.143f, 2.379f, -2.748f, 2.57f, -4.503f)
                horizontalLineToRelative(-5.968f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.114f, 3.039f, -1.257f, 5.929f, -3.764f, 7.874f)
                curveToRelative(-1.796f, 1.394f, -4.001f, 2.125f, -6.24f, 2.125f)
                close()
            }
        }
        .build()
        return _g!!
    }

private var _g: ImageVector? = null
