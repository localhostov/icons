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
                moveToRelative(18.0f, 3.0f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 5.197f, -3.337f, 8.355f, -3.479f, 8.487f)
                lineToRelative(-2.041f, -2.198f)
                curveToRelative(0.019f, -0.019f, 2.521f, -2.438f, 2.521f, -6.289f)
                verticalLineTo(3.0f)
                curveToRelative(-3.796f, 0.0f, -3.998f, 3.327f, -4.0f, 3.994f)
                lineToRelative(-3.0f, 0.021f)
                curveToRelative(-0.003f, -0.312f, 0.027f, -3.112f, 2.023f, -5.128f)
                curveTo(3.263f, 0.635f, 4.937f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
