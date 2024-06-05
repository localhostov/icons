package me.localx.icons.rounded.filled

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

public val Icons.Filled.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-1.536f, -1.536f)
                curveToRelative(0.538f, -0.813f, 0.829f, -1.771f, 0.829f, -2.757f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(6.414f, 5.0f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(16.804f, 15.39f)
                lineToRelative(-6.194f, -6.194f)
                curveToRelative(0.45f, -0.13f, 0.915f, -0.196f, 1.39f, -0.196f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.474f, -0.066f, 0.94f, -0.196f, 1.39f)
                close()
                moveTo(16.619f, 3.0f)
                lineTo(7.381f, 3.0f)
                lineToRelative(0.471f, -0.69f)
                curveToRelative(0.559f, -0.82f, 1.485f, -1.31f, 2.479f, -1.31f)
                horizontalLineToRelative(3.34f)
                curveToRelative(0.993f, 0.0f, 1.92f, 0.489f, 2.479f, 1.31f)
                lineToRelative(0.471f, 0.69f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.284f, 0.041f, -0.559f, 0.115f, -0.82f)
                lineToRelative(3.698f, 3.707f)
                curveToRelative(-0.259f, 0.073f, -0.531f, 0.113f, -0.812f, 0.113f)
                close()
                moveTo(17.208f, 21.294f)
                curveToRelative(0.285f, 0.286f, 0.37f, 0.716f, 0.216f, 1.089f)
                curveToRelative(-0.155f, 0.374f, -0.52f, 0.617f, -0.924f, 0.617f)
                lineTo(6.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.881f, 0.231f, -1.745f, 0.67f, -2.502f)
                curveToRelative(0.156f, -0.269f, 0.428f, -0.449f, 0.736f, -0.489f)
                curveToRelative(0.304f, -0.042f, 0.617f, 0.064f, 0.837f, 0.285f)
                lineToRelative(4.345f, 4.356f)
                curveToRelative(-0.375f, 0.701f, -0.588f, 1.501f, -0.588f, 2.35f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.845f, 0.0f, 1.641f, -0.211f, 2.339f, -0.582f)
                lineToRelative(2.869f, 2.876f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
