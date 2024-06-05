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

public val Icons.Filled.FaceThermometer: ImageVector
    get() {
        if (_faceThermometer != null) {
            return _faceThermometer!!
        }
        _faceThermometer = Builder(name = "FaceThermometer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 10.525f)
                curveToRelative(-0.113f, 0.396f, -0.333f, 0.767f, -0.655f, 1.05f)
                lineToRelative(-0.435f, 0.383f)
                lineToRelative(-0.834f, -0.956f)
                curveToRelative(-0.365f, -0.415f, -0.997f, -0.455f, -1.411f, -0.089f)
                curveToRelative(-0.414f, 0.365f, -0.454f, 0.997f, -0.089f, 1.411f)
                lineToRelative(0.834f, 0.956f)
                lineToRelative(-1.646f, 1.45f)
                lineToRelative(-0.819f, -0.939f)
                curveToRelative(-0.365f, -0.415f, -0.997f, -0.455f, -1.411f, -0.089f)
                curveToRelative(-0.414f, 0.365f, -0.454f, 0.997f, -0.089f, 1.411f)
                lineToRelative(0.819f, 0.939f)
                lineToRelative(-1.162f, 1.077f)
                curveToRelative(-0.376f, 0.349f, -0.939f, 0.384f, -1.367f, 0.102f)
                curveToRelative(-0.782f, -0.515f, -2.138f, -1.23f, -3.637f, -1.23f)
                curveToRelative(-2.331f, 0.0f, -4.316f, 1.73f, -4.336f, 1.748f)
                curveToRelative(-0.19f, 0.168f, -0.427f, 0.251f, -0.663f, 0.251f)
                curveToRelative(-0.275f, 0.0f, -0.55f, -0.113f, -0.747f, -0.335f)
                curveToRelative(-0.366f, -0.412f, -0.331f, -1.042f, 0.08f, -1.409f)
                curveToRelative(0.103f, -0.092f, 2.559f, -2.254f, 5.666f, -2.254f)
                curveToRelative(0.741f, 0.0f, 1.44f, 0.128f, 2.084f, 0.316f)
                lineToRelative(6.598f, -5.81f)
                curveToRelative(0.85f, -0.747f, 2.144f, -0.636f, 2.866f, 0.249f)
                curveTo(22.127f, 3.706f, 17.501f, 0.0f, 12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -0.5f, -0.04f, -0.991f, -0.1f, -1.475f)
                close()
                moveTo(15.496f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.496f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceThermometer!!
    }

private var _faceThermometer: ImageVector? = null
