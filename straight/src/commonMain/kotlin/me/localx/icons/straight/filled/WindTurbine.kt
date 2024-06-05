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

public val Icons.Filled.WindTurbine: ImageVector
    get() {
        if (_windTurbine != null) {
            return _windTurbine!!
        }
        _windTurbine = Builder(name = "WindTurbine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.196f, 13.948f)
                curveToRelative(-0.159f, -0.131f, -3.756f, -3.087f, -6.674f, -4.978f)
                curveToRelative(-0.392f, -3.456f, -1.433f, -7.995f, -1.479f, -8.195f)
                lineToRelative(-0.179f, -0.775f)
                horizontalLineToRelative(-3.729f)
                lineToRelative(-0.179f, 0.775f)
                curveToRelative(-0.046f, 0.2f, -1.087f, 4.739f, -1.479f, 8.195f)
                curveToRelative(-2.918f, 1.891f, -6.516f, 4.847f, -6.674f, 4.978f)
                lineToRelative(-0.614f, 0.506f)
                lineToRelative(1.663f, 3.336f)
                lineToRelative(0.773f, -0.186f)
                curveToRelative(0.193f, -0.046f, 4.196f, -1.013f, 7.387f, -2.116f)
                verticalLineToRelative(6.512f)
                horizontalLineToRelative(-4.022f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.045f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.023f)
                verticalLineToRelative(-6.503f)
                curveToRelative(3.187f, 1.1f, 7.167f, 2.061f, 7.36f, 2.107f)
                lineToRelative(0.773f, 0.186f)
                lineToRelative(1.663f, -3.336f)
                lineToRelative(-0.614f, -0.506f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _windTurbine!!
    }

private var _windTurbine: ImageVector? = null
