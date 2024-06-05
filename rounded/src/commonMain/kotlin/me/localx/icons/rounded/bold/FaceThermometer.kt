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

public val Icons.Bold.FaceThermometer: ImageVector
    get() {
        if (_faceThermometer != null) {
            return _faceThermometer!!
        }
        _faceThermometer = Builder(name = "FaceThermometer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.852f, 18.858f)
                curveToRelative(-2.246f, 3.219f, -5.928f, 5.142f, -9.848f, 5.142f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.412f, 0.0f, 6.672f, 1.458f, 8.947f, 4.0f)
                curveToRelative(0.553f, 0.617f, 0.501f, 1.565f, -0.117f, 2.118f)
                reflectiveCurveToRelative(-1.566f, 0.499f, -2.117f, -0.117f)
                curveToRelative(-1.707f, -1.907f, -4.152f, -3.0f, -6.709f, -3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.944f, 0.0f, 5.706f, -1.442f, 7.391f, -3.858f)
                curveToRelative(0.475f, -0.68f, 1.409f, -0.845f, 2.089f, -0.372f)
                curveToRelative(0.68f, 0.474f, 0.846f, 1.409f, 0.372f, 2.089f)
                close()
                moveTo(6.0f, 9.002f)
                curveToRelative(0.0f, 1.104f, 0.895f, 1.998f, 1.998f, 1.998f)
                reflectiveCurveToRelative(1.998f, -0.895f, 1.998f, -1.998f)
                reflectiveCurveToRelative(-0.895f, -1.998f, -1.998f, -1.998f)
                reflectiveCurveToRelative(-1.998f, 0.895f, -1.998f, 1.998f)
                close()
                moveTo(13.996f, 9.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(23.702f, 8.954f)
                curveToRelative(-0.677f, -1.074f, -2.112f, -1.251f, -3.024f, -0.448f)
                lineToRelative(-5.756f, 5.069f)
                curveToRelative(-0.98f, -0.374f, -1.959f, -0.575f, -2.922f, -0.575f)
                curveToRelative(-1.364f, 0.0f, -2.784f, 0.398f, -4.22f, 1.184f)
                curveToRelative(-0.727f, 0.397f, -0.994f, 1.309f, -0.597f, 2.036f)
                curveToRelative(0.273f, 0.499f, 0.787f, 0.781f, 1.317f, 0.781f)
                curveToRelative(0.244f, 0.0f, 0.49f, -0.06f, 0.719f, -0.185f)
                curveToRelative(0.99f, -0.541f, 1.924f, -0.815f, 2.779f, -0.816f)
                curveToRelative(0.003f, 0.0f, 0.005f, 0.0f, 0.008f, 0.0f)
                curveToRelative(1.993f, 0.0f, 3.485f, 1.137f, 3.626f, 1.23f)
                curveToRelative(0.428f, 0.282f, 0.991f, 0.247f, 1.367f, -0.102f)
                lineToRelative(1.162f, -1.077f)
                lineToRelative(-0.819f, -0.939f)
                curveToRelative(-0.365f, -0.414f, -0.325f, -1.046f, 0.089f, -1.411f)
                curveToRelative(0.414f, -0.365f, 1.046f, -0.325f, 1.411f, 0.089f)
                lineToRelative(0.819f, 0.939f)
                lineToRelative(1.646f, -1.45f)
                lineToRelative(-0.834f, -0.956f)
                curveToRelative(-0.365f, -0.414f, -0.325f, -1.046f, 0.089f, -1.411f)
                curveToRelative(0.414f, -0.365f, 1.046f, -0.325f, 1.411f, 0.089f)
                lineToRelative(0.834f, 0.956f)
                lineToRelative(0.435f, -0.383f)
                curveToRelative(0.747f, -0.658f, 0.988f, -1.779f, 0.457f, -2.622f)
                close()
            }
        }
        .build()
        return _faceThermometer!!
    }

private var _faceThermometer: ImageVector? = null
