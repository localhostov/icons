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

public val Icons.Bold.RotateExclamation: ImageVector
    get() {
        if (_rotateExclamation != null) {
            return _rotateExclamation!!
        }
        _rotateExclamation = Builder(name = "RotateExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.43f, 12.998f)
                curveToRelative(-0.828f, -0.038f, -1.467f, -0.74f, -1.428f, -1.568f)
                curveTo(0.302f, 5.021f, 5.572f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.967f, 0.0f, 5.796f, 1.1f, 7.97f, 3.03f)
                lineToRelative(1.323f, -1.323f)
                curveToRelative(0.63f, -0.63f, 1.707f, -0.184f, 1.707f, 0.707f)
                verticalLineToRelative(4.586f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.586f)
                curveToRelative(-0.891f, 0.0f, -1.337f, -1.077f, -0.707f, -1.707f)
                lineToRelative(1.137f, -1.137f)
                curveToRelative(-1.612f, -1.375f, -3.679f, -2.156f, -5.844f, -2.156f)
                curveTo(7.177f, 3.0f, 3.224f, 6.765f, 2.999f, 11.57f)
                curveToRelative(-0.038f, 0.804f, -0.701f, 1.43f, -1.498f, 1.43f)
                curveToRelative(-0.023f, 0.0f, -0.047f, 0.0f, -0.071f, -0.002f)
                close()
                moveTo(22.571f, 11.002f)
                curveToRelative(-0.834f, -0.026f, -1.53f, 0.601f, -1.569f, 1.428f)
                curveToRelative(-0.225f, 4.806f, -4.179f, 8.57f, -9.001f, 8.57f)
                curveToRelative(-2.165f, 0.0f, -4.232f, -0.781f, -5.844f, -2.156f)
                lineToRelative(1.137f, -1.137f)
                curveToRelative(0.63f, -0.63f, 0.184f, -1.707f, -0.707f, -1.707f)
                lineTo(2.0f, 16.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.586f)
                curveToRelative(0.0f, 0.891f, 1.077f, 1.337f, 1.707f, 0.707f)
                lineToRelative(1.323f, -1.323f)
                curveToRelative(2.174f, 1.93f, 5.003f, 3.03f, 7.97f, 3.03f)
                curveToRelative(6.428f, 0.0f, 11.698f, -5.021f, 11.999f, -11.43f)
                curveToRelative(0.039f, -0.828f, -0.601f, -1.53f, -1.428f, -1.568f)
                close()
                moveTo(13.501f, 7.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(12.001f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _rotateExclamation!!
    }

private var _rotateExclamation: ImageVector? = null
