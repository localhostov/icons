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

public val Icons.Bold.Sushi: ImageVector
    get() {
        if (_sushi != null) {
            return _sushi!!
        }
        _sushi = Builder(name = "Sushi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 12.0f)
                arcTo(5.729f, 5.729f, 0.0f, false, true, 5.0f, 11.0f)
                arcToRelative(5.729f, 5.729f, 0.0f, false, true, 3.5f, -1.0f)
                arcTo(5.729f, 5.729f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(5.729f, 5.729f, 0.0f, false, true, 8.5f, 12.0f)
                close()
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, 3.027f, -3.026f, 5.458f, -7.1f, 5.916f)
                curveTo(16.286f, 21.829f, 12.823f, 24.0f, 8.5f, 24.0f)
                curveTo(3.733f, 24.0f, 0.0f, 21.364f, 0.0f, 18.0f)
                lineTo(0.0f, 11.0f)
                curveTo(0.0f, 7.973f, 3.026f, 5.542f, 7.105f, 5.084f)
                curveTo(7.714f, 2.171f, 11.177f, 0.0f, 15.5f, 0.0f)
                curveTo(20.267f, 0.0f, 24.0f, 2.636f, 24.0f, 6.0f)
                close()
                moveTo(10.292f, 5.13f)
                arcToRelative(10.93f, 10.93f, 0.0f, false, true, 2.2f, 0.553f)
                arcTo(6.305f, 6.305f, 0.0f, false, true, 15.5f, 5.0f)
                arcTo(5.729f, 5.729f, 0.0f, false, true, 19.0f, 6.0f)
                arcToRelative(5.729f, 5.729f, 0.0f, false, true, -3.5f, 1.0f)
                curveToRelative(-0.231f, 0.0f, -0.452f, -0.01f, -0.662f, -0.028f)
                arcTo(5.91f, 5.91f, 0.0f, false, true, 16.493f, 8.94f)
                curveTo(19.19f, 8.657f, 21.0f, 7.268f, 21.0f, 6.0f)
                curveToRelative(0.0f, -1.419f, -2.259f, -3.0f, -5.5f, -3.0f)
                curveTo(12.918f, 3.0f, 10.982f, 4.005f, 10.292f, 5.13f)
                close()
                moveTo(3.0f, 11.0f)
                curveToRelative(0.0f, 1.419f, 2.259f, 3.0f, 5.5f, 3.0f)
                reflectiveCurveTo(14.0f, 12.419f, 14.0f, 11.0f)
                reflectiveCurveTo(11.741f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(3.0f, 9.581f, 3.0f, 11.0f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(14.0f, 15.606f)
                arcTo(10.852f, 10.852f, 0.0f, false, true, 8.5f, 17.0f)
                arcTo(10.852f, 10.852f, 0.0f, false, true, 3.0f, 15.606f)
                lineTo(3.0f, 18.0f)
                curveToRelative(0.0f, 1.419f, 2.259f, 3.0f, 5.5f, 3.0f)
                reflectiveCurveTo(14.0f, 19.419f, 14.0f, 18.0f)
                close()
                moveTo(21.0f, 13.0f)
                lineTo(21.0f, 10.606f)
                arcToRelative(10.31f, 10.31f, 0.0f, false, true, -4.0f, 1.3f)
                verticalLineToRelative(3.962f)
                curveTo(19.41f, 15.472f, 21.0f, 14.186f, 21.0f, 13.0f)
                close()
            }
        }
        .build()
        return _sushi!!
    }

private var _sushi: ImageVector? = null
