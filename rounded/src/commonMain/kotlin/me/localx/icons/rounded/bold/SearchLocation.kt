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

public val Icons.Bold.SearchLocation: ImageVector
    get() {
        if (_searchLocation != null) {
            return _searchLocation!!
        }
        _searchLocation = Builder(name = "SearchLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.599f, 21.555f)
                lineToRelative(-5.561f, -5.561f)
                curveToRelative(1.246f, -1.668f, 1.984f, -3.735f, 1.984f, -5.972f)
                curveTo(20.021f, 4.508f, 15.535f, 0.021f, 10.021f, 0.021f)
                reflectiveCurveTo(0.021f, 4.508f, 0.021f, 10.021f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.197f, 0.0f, 4.231f, -0.713f, 5.883f, -1.919f)
                lineToRelative(5.573f, 5.573f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(3.021f, 10.021f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                close()
                moveTo(10.0f, 5.007f)
                curveToRelative(-1.135f, 0.0f, -2.271f, 0.433f, -3.137f, 1.299f)
                curveToRelative(-1.733f, 1.733f, -1.733f, 4.542f, 0.0f, 6.274f)
                lineToRelative(2.011f, 1.967f)
                curveToRelative(0.626f, 0.612f, 1.626f, 0.612f, 2.252f, 0.0f)
                lineToRelative(2.011f, -1.967f)
                curveToRelative(1.733f, -1.733f, 1.733f, -4.542f, 0.0f, -6.274f)
                curveToRelative(-0.866f, -0.866f, -2.002f, -1.299f, -3.137f, -1.299f)
                close()
                moveTo(10.0f, 10.986f)
                curveToRelative(-0.825f, 0.0f, -1.493f, -0.669f, -1.493f, -1.493f)
                reflectiveCurveToRelative(0.669f, -1.493f, 1.493f, -1.493f)
                reflectiveCurveToRelative(1.493f, 0.669f, 1.493f, 1.493f)
                reflectiveCurveToRelative(-0.669f, 1.493f, -1.493f, 1.493f)
                close()
            }
        }
        .build()
        return _searchLocation!!
    }

private var _searchLocation: ImageVector? = null
