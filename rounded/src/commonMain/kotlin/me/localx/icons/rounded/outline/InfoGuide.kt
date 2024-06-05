package me.localx.icons.rounded.outline

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

public val Icons.Outline.InfoGuide: ImageVector
    get() {
        if (_infoGuide != null) {
            return _infoGuide!!
        }
        _infoGuide = Builder(name = "InfoGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 8.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(6.0f, 8.5f)
                lineTo(6.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.89f, -1.506f, 3.436f, -3.382f, 3.498f)
                lineToRelative(-1.589f, 1.574f)
                curveToRelative(-0.29f, 0.284f, -0.668f, 0.426f, -1.045f, 0.426f)
                curveToRelative(-0.381f, 0.0f, -0.761f, -0.145f, -1.05f, -0.433f)
                lineToRelative(-1.557f, -1.567f)
                curveToRelative(-1.873f, -0.065f, -3.376f, -1.609f, -3.376f, -3.498f)
                close()
                moveTo(8.0f, 8.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.295f)
                curveToRelative(0.267f, 0.0f, 0.521f, 0.106f, 0.709f, 0.295f)
                lineToRelative(1.483f, 1.493f)
                lineToRelative(1.514f, -1.499f)
                curveToRelative(0.188f, -0.185f, 0.44f, -0.289f, 0.704f, -0.289f)
                horizontalLineToRelative(0.295f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                lineTo(16.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.502f, 1.671f)
                curveToRelative(-0.48f, -0.277f, -1.09f, -0.113f, -1.367f, 0.364f)
                curveToRelative(-0.277f, 0.478f, -0.114f, 1.09f, 0.364f, 1.367f)
                curveToRelative(0.94f, 0.545f, 1.501f, 1.517f, 1.501f, 2.6f)
                verticalLineToRelative(10.792f)
                curveToRelative(0.0f, 1.451f, -1.036f, 2.692f, -2.463f, 2.952f)
                lineToRelative(-6.285f, 1.143f)
                curveToRelative(-0.084f, 0.015f, -0.168f, 0.011f, -0.252f, 0.023f)
                verticalLineToRelative(-3.91f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.91f)
                curveToRelative(-0.084f, -0.012f, -0.169f, -0.008f, -0.252f, -0.023f)
                lineToRelative(-6.285f, -1.143f)
                curveToRelative(-1.427f, -0.259f, -2.463f, -1.501f, -2.463f, -2.952f)
                lineTo(2.0f, 6.001f)
                curveToRelative(0.0f, -1.083f, 0.561f, -2.055f, 1.501f, -2.6f)
                curveToRelative(0.478f, -0.277f, 0.641f, -0.889f, 0.364f, -1.367f)
                curveToRelative(-0.277f, -0.477f, -0.889f, -0.641f, -1.367f, -0.364f)
                curveTo(0.958f, 2.564f, 0.0f, 4.224f, 0.0f, 6.001f)
                verticalLineToRelative(10.792f)
                curveTo(0.0f, 19.211f, 1.727f, 21.28f, 4.106f, 21.712f)
                lineToRelative(6.284f, 1.143f)
                curveToRelative(0.534f, 0.097f, 1.072f, 0.146f, 1.61f, 0.146f)
                reflectiveCurveToRelative(1.076f, -0.049f, 1.61f, -0.146f)
                lineToRelative(6.284f, -1.143f)
                curveToRelative(2.379f, -0.433f, 4.106f, -2.501f, 4.106f, -4.919f)
                lineTo(24.0f, 6.001f)
                curveToRelative(0.0f, -1.778f, -0.958f, -3.437f, -2.499f, -4.33f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _infoGuide!!
    }

private var _infoGuide: ImageVector? = null
