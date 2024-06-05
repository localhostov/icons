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
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, -3.364f, -3.733f, -6.0f, -8.5f, -6.0f)
                curveTo(11.177f, 0.0f, 7.714f, 2.171f, 7.105f, 5.084f)
                curveTo(3.026f, 5.542f, 0.0f, 7.973f, 0.0f, 11.0f)
                verticalLineToRelative(7.682f)
                curveTo(0.0f, 21.714f, 3.654f, 24.0f, 8.5f, 24.0f)
                curveToRelative(4.716f, 0.0f, 8.294f, -2.168f, 8.482f, -5.079f)
                curveTo(21.07f, 18.506f, 24.0f, 16.4f, 24.0f, 13.682f)
                close()
                moveTo(15.5f, 3.0f)
                curveTo(18.741f, 3.0f, 21.0f, 4.581f, 21.0f, 6.0f)
                curveToRelative(0.0f, 1.268f, -1.81f, 2.657f, -4.507f, 2.94f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -1.646f, -1.961f)
                curveToRelative(0.211f, 0.012f, 0.426f, 0.021f, 0.653f, 0.021f)
                curveTo(17.563f, 7.0f, 19.0f, 6.473f, 19.0f, 6.0f)
                reflectiveCurveToRelative(-1.437f, -1.0f, -3.5f, -1.0f)
                arcToRelative(6.626f, 6.626f, 0.0f, false, false, -3.2f, 0.62f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -2.01f, -0.49f)
                curveTo(10.982f, 4.005f, 12.918f, 3.0f, 15.5f, 3.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveTo(11.741f, 8.0f, 14.0f, 9.581f, 14.0f, 11.0f)
                reflectiveCurveToRelative(-2.259f, 3.0f, -5.5f, 3.0f)
                reflectiveCurveTo(3.0f, 12.419f, 3.0f, 11.0f)
                reflectiveCurveTo(5.259f, 8.0f, 8.5f, 8.0f)
                close()
                moveTo(14.0f, 18.682f)
                curveTo(14.0f, 19.6f, 11.807f, 21.0f, 8.5f, 21.0f)
                reflectiveCurveTo(3.0f, 19.6f, 3.0f, 18.682f)
                lineTo(3.0f, 15.606f)
                arcTo(10.852f, 10.852f, 0.0f, false, false, 8.5f, 17.0f)
                arcTo(10.852f, 10.852f, 0.0f, false, false, 14.0f, 15.606f)
                close()
                moveTo(17.0f, 15.888f)
                lineTo(17.0f, 11.905f)
                arcToRelative(10.31f, 10.31f, 0.0f, false, false, 4.0f, -1.3f)
                verticalLineToRelative(3.076f)
                curveTo(21.0f, 14.455f, 19.446f, 15.55f, 17.0f, 15.888f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.0f, -0.473f, 1.437f, -1.0f, 3.5f, -1.0f)
                reflectiveCurveToRelative(3.5f, 0.527f, 3.5f, 1.0f)
                reflectiveCurveToRelative(-1.437f, 1.0f, -3.5f, 1.0f)
                reflectiveCurveTo(5.0f, 11.473f, 5.0f, 11.0f)
                close()
            }
        }
        .build()
        return _sushi!!
    }

private var _sushi: ImageVector? = null
