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

public val Icons.Bold.CameraMovie: ImageVector
    get() {
        if (_cameraMovie != null) {
            return _cameraMovie!!
        }
        _cameraMovie = Builder(name = "CameraMovie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                lineToRelative(-3.0f, 2.237f)
                verticalLineToRelative(-0.737f)
                curveToRelative(0.0f, -1.33f, -0.746f, -2.489f, -1.841f, -3.081f)
                curveToRelative(0.532f, -0.847f, 0.841f, -1.847f, 0.841f, -2.919f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-1.575f, 0.0f, -2.996f, 0.665f, -4.0f, 1.729f)
                curveToRelative(-1.004f, -1.064f, -2.425f, -1.729f, -4.0f, -1.729f)
                curveTo(3.467f, 0.0f, 1.0f, 2.467f, 1.0f, 5.5f)
                curveToRelative(0.0f, 1.072f, 0.308f, 2.073f, 0.841f, 2.919f)
                curveToRelative(-1.095f, 0.592f, -1.841f, 1.751f, -1.841f, 3.081f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-4.237f)
                lineToRelative(3.0f, 2.237f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(14.5f, 3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(6.5f, 3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                close()
            }
        }
        .build()
        return _cameraMovie!!
    }

private var _cameraMovie: ImageVector? = null
