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

public val Icons.Bold.ExitAlt: ImageVector
    get() {
        if (_exitAlt != null) {
            return _exitAlt!!
        }
        _exitAlt = Builder(name = "ExitAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 4.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.736f, 14.372f)
                lineToRelative(-1.106f, -2.397f)
                horizontalLineToRelative(1.388f)
                lineToRelative(1.214f, 2.629f)
                lineToRelative(2.724f, -1.258f)
                lineToRelative(-2.019f, -4.371f)
                horizontalLineToRelative(-5.529f)
                curveToRelative(-1.009f, 0.0f, -1.969f, 0.436f, -2.634f, 1.194f)
                lineToRelative(-1.643f, 2.806f)
                horizontalLineToRelative(-3.131f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.869f)
                lineToRelative(0.749f, -1.306f)
                lineToRelative(1.059f, 2.298f)
                lineToRelative(-3.677f, 2.604f)
                verticalLineToRelative(4.429f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.878f)
                lineToRelative(3.393f, -2.405f)
                curveToRelative(1.439f, -0.909f, 2.014f, -2.712f, 1.343f, -4.345f)
                close()
                moveTo(16.998f, 3.501f)
                lineToRelative(0.002f, 3.5f)
                lineToRelative(3.0f, -0.002f)
                lineToRelative(-0.002f, -3.499f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, -0.0f)
                curveTo(2.57f, 0.0f, 1.0f, 1.57f, 1.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(3.0f)
                lineTo(4.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.998f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.501f)
                close()
                moveTo(19.009f, 19.0f)
                lineToRelative(-0.019f, -0.046f)
                curveToRelative(-0.393f, 0.548f, -0.883f, 1.037f, -1.478f, 1.422f)
                lineToRelative(-0.914f, 0.648f)
                lineToRelative(0.402f, 0.976f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.991f)
                close()
            }
        }
        .build()
        return _exitAlt!!
    }

private var _exitAlt: ImageVector? = null
