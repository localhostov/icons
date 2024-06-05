package me.localx.icons.straight.outline

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

public val Icons.Outline.CameraMovie: ImageVector
    get() {
        if (_cameraMovie != null) {
            return _cameraMovie!!
        }
        _cameraMovie = Builder(name = "CameraMovie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.086f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineToRelative(-1.086f)
                curveToRelative(0.0f, -1.344f, -0.888f, -2.484f, -2.108f, -2.865f)
                curveToRelative(0.693f, -0.858f, 1.108f, -1.949f, 1.108f, -3.135f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-1.634f, 0.0f, -3.087f, 0.788f, -4.0f, 2.003f)
                curveToRelative(-0.913f, -1.216f, -2.366f, -2.003f, -4.0f, -2.003f)
                curveTo(3.243f, 0.0f, 1.0f, 2.243f, 1.0f, 5.0f)
                curveToRelative(0.0f, 1.186f, 0.416f, 2.277f, 1.108f, 3.135f)
                curveToRelative(-1.22f, 0.381f, -2.108f, 1.521f, -2.108f, 2.865f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-4.086f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-15.828f)
                close()
                moveTo(14.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(6.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(22.0f, 19.086f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-2.172f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(6.172f)
                close()
            }
        }
        .build()
        return _cameraMovie!!
    }

private var _cameraMovie: ImageVector? = null
