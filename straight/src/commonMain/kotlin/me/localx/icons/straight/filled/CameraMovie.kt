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

public val Icons.Filled.CameraMovie: ImageVector
    get() {
        if (_cameraMovie != null) {
            return _cameraMovie!!
        }
        _cameraMovie = Builder(name = "CameraMovie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 4.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveTo(1.0f, 6.209f, 1.0f, 4.0f)
                reflectiveCurveTo(2.791f, 0.0f, 5.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                close()
                moveTo(14.0f, 0.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveTo(16.209f, 0.0f, 14.0f, 0.0f)
                close()
                moveTo(19.0f, 13.0f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 13.244f)
                verticalLineToRelative(7.513f)
                lineToRelative(3.0f, 2.236f)
                verticalLineToRelative(-11.985f)
                lineToRelative(-3.0f, 2.236f)
                close()
            }
        }
        .build()
        return _cameraMovie!!
    }

private var _cameraMovie: ImageVector? = null
