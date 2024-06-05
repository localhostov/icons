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
                moveTo(23.909f, 10.583f)
                curveToRelative(-0.104f, 0.345f, -0.297f, 0.668f, -0.587f, 0.924f)
                lineToRelative(-0.512f, 0.451f)
                lineToRelative(-1.277f, -1.451f)
                lineToRelative(-1.5f, 1.322f)
                lineToRelative(1.277f, 1.45f)
                lineToRelative(-1.646f, 1.45f)
                lineToRelative(-1.263f, -1.434f)
                lineToRelative(-1.5f, 1.322f)
                lineToRelative(1.262f, 1.433f)
                lineToRelative(-1.793f, 1.718f)
                lineToRelative(-0.025f, -0.036f)
                lineToRelative(-0.013f, 0.014f)
                curveToRelative(-0.02f, -0.018f, -2.005f, -1.748f, -4.336f, -1.748f)
                reflectiveCurveToRelative(-4.316f, 1.73f, -4.336f, 1.748f)
                lineToRelative(-1.33f, -1.493f)
                curveToRelative(0.103f, -0.092f, 2.559f, -2.254f, 5.666f, -2.254f)
                curveToRelative(0.741f, 0.0f, 1.44f, 0.128f, 2.084f, 0.316f)
                lineToRelative(6.598f, -5.81f)
                curveToRelative(0.83f, -0.73f, 2.093f, -0.65f, 2.823f, 0.179f)
                curveToRelative(0.015f, 0.017f, 0.024f, 0.036f, 0.038f, 0.054f)
                curveTo(22.117f, 3.698f, 17.495f, 0.0f, 12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -0.48f, -0.036f, -0.951f, -0.091f, -1.417f)
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
