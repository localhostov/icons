package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(12.112f)
                curveToRelative(0.0f, 5.197f, -3.337f, 8.355f, -3.479f, 8.487f)
                curveToRelative(-0.289f, 0.268f, -0.655f, 0.401f, -1.02f, 0.401f)
                curveToRelative(-0.403f, 0.0f, -0.804f, -0.161f, -1.1f, -0.479f)
                curveToRelative(-0.564f, -0.607f, -0.529f, -1.556f, 0.079f, -2.12f)
                curveToRelative(0.019f, -0.019f, 2.521f, -2.438f, 2.521f, -6.289f)
                verticalLineTo(3.0f)
                curveToRelative(-3.786f, 0.0f, -3.996f, 2.912f, -4.0f, 3.496f)
                curveToRelative(-0.005f, 0.823f, -0.673f, 1.495f, -1.497f, 1.497f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.822f, 0.0f, -1.491f, -0.654f, -1.5f, -1.477f)
                curveToRelative(-0.003f, -0.276f, 0.024f, -2.747f, 1.871f, -4.614f)
                curveTo(3.119f, 0.64f, 4.845f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
