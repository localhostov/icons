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
                moveToRelative(22.772f, 11.125f)
                curveToRelative(-0.647f, -0.256f, -1.387f, -0.102f, -1.945f, 0.314f)
                lineToRelative(-0.982f, 0.789f)
                curveToRelative(-0.33f, -1.384f, -1.18f, -2.566f, -2.336f, -3.326f)
                curveToRelative(0.919f, -0.946f, 1.491f, -2.232f, 1.491f, -3.652f)
                curveToRelative(0.0f, -2.895f, -2.355f, -5.25f, -5.25f, -5.25f)
                curveToRelative(-1.47f, 0.0f, -2.796f, 0.611f, -3.75f, 1.587f)
                curveToRelative(-0.954f, -0.976f, -2.28f, -1.587f, -3.75f, -1.587f)
                curveTo(3.355f, 0.0f, 1.0f, 2.355f, 1.0f, 5.25f)
                curveToRelative(0.0f, 1.42f, 0.572f, 2.706f, 1.491f, 3.652f)
                curveToRelative(-1.498f, 0.984f, -2.491f, 2.676f, -2.491f, 4.598f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.565f, 0.0f, 4.72f, -1.768f, 5.325f, -4.148f)
                lineToRelative(1.088f, 0.763f)
                curveToRelative(0.342f, 0.255f, 0.746f, 0.385f, 1.153f, 0.385f)
                curveToRelative(0.394f, 0.0f, 0.791f, -0.122f, 1.137f, -0.369f)
                curveToRelative(0.525f, -0.374f, 0.797f, -1.015f, 0.797f, -1.66f)
                verticalLineToRelative(-6.047f)
                curveToRelative(0.0f, -0.794f, -0.476f, -1.502f, -1.228f, -1.8f)
                close()
                moveTo(13.75f, 3.0f)
                curveToRelative(1.241f, 0.0f, 2.25f, 1.009f, 2.25f, 2.25f)
                reflectiveCurveToRelative(-1.009f, 2.25f, -2.25f, 2.25f)
                reflectiveCurveToRelative(-2.25f, -1.009f, -2.25f, -2.25f)
                reflectiveCurveToRelative(1.009f, -2.25f, 2.25f, -2.25f)
                close()
                moveTo(6.25f, 3.0f)
                curveToRelative(1.241f, 0.0f, 2.25f, 1.009f, 2.25f, 2.25f)
                reflectiveCurveToRelative(-1.009f, 2.25f, -2.25f, 2.25f)
                reflectiveCurveToRelative(-2.25f, -1.009f, -2.25f, -2.25f)
                reflectiveCurveToRelative(1.009f, -2.25f, 2.25f, -2.25f)
                close()
                moveTo(17.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _cameraMovie!!
    }

private var _cameraMovie: ImageVector? = null
