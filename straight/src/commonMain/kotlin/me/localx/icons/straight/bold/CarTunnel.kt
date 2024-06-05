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

public val Icons.Bold.CarTunnel: ImageVector
    get() {
        if (_carTunnel != null) {
            return _carTunnel!!
        }
        _carTunnel = Builder(name = "CarTunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -4.962f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.561f, 16.222f)
                curveToRelative(0.292f, 0.925f, 0.439f, 1.886f, 0.439f, 2.855f)
                verticalLineToRelative(2.923f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.923f)
                curveToRelative(0.0f, -0.969f, 0.148f, -1.93f, 0.439f, -2.855f)
                lineToRelative(1.189f, -3.773f)
                curveToRelative(0.462f, -1.465f, 1.804f, -2.448f, 3.338f, -2.448f)
                horizontalLineToRelative(4.066f)
                curveToRelative(1.535f, 0.0f, 2.876f, 0.983f, 3.338f, 2.448f)
                lineToRelative(1.189f, 3.774f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.655f, 16.0f)
                horizontalLineToRelative(6.691f)
                lineToRelative(-0.835f, -2.65f)
                curveToRelative(-0.066f, -0.209f, -0.258f, -0.35f, -0.477f, -0.35f)
                horizontalLineToRelative(-4.066f)
                curveToRelative(-0.219f, 0.0f, -0.411f, 0.141f, -0.477f, 0.35f)
                lineToRelative(-0.835f, 2.65f)
                close()
                moveTo(7.5f, 19.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _carTunnel!!
    }

private var _carTunnel: ImageVector? = null
