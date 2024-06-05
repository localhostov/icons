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

public val Icons.Outline.FaceThermometer: ImageVector
    get() {
        if (_faceThermometer != null) {
            return _faceThermometer!!
        }
        _faceThermometer = Builder(name = "FaceThermometer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.496f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.996f, 9.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(20.677f, 8.506f)
                lineToRelative(-6.593f, 5.806f)
                curveToRelative(-0.644f, -0.189f, -1.348f, -0.312f, -2.089f, -0.312f)
                curveToRelative(-3.107f, 0.0f, -5.563f, 2.162f, -5.666f, 2.254f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(0.02f, -0.018f, 2.005f, -1.748f, 4.336f, -1.748f)
                reflectiveCurveToRelative(4.316f, 1.73f, 4.336f, 1.748f)
                lineToRelative(0.013f, -0.014f)
                lineToRelative(0.025f, 0.036f)
                lineToRelative(1.793f, -1.718f)
                lineToRelative(-1.262f, -1.433f)
                lineToRelative(1.5f, -1.322f)
                lineToRelative(1.263f, 1.434f)
                lineToRelative(1.646f, -1.45f)
                lineToRelative(-1.277f, -1.45f)
                lineToRelative(1.5f, -1.322f)
                lineToRelative(1.277f, 1.451f)
                lineToRelative(0.512f, -0.451f)
                curveToRelative(0.828f, -0.73f, 0.909f, -1.994f, 0.179f, -2.823f)
                curveToRelative(-0.731f, -0.83f, -1.993f, -0.91f, -2.823f, -0.179f)
                close()
                moveTo(11.996f, 22.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.482f, 2.0f, 11.996f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.446f, 0.0f, 6.491f, 1.752f, 8.289f, 4.412f)
                curveToRelative(0.667f, -0.318f, 1.394f, -0.444f, 2.111f, -0.373f)
                curveTo(20.324f, 2.437f, 16.443f, 0.0f, 11.996f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.379f, 0.0f, -0.004f, 5.383f, -0.004f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(6.039f, 0.0f, 11.036f, -4.489f, 11.866f, -10.302f)
                lineToRelative(-2.775f, 2.444f)
                curveToRelative(-1.579f, 3.451f, -5.055f, 5.858f, -9.091f, 5.858f)
                close()
            }
        }
        .build()
        return _faceThermometer!!
    }

private var _faceThermometer: ImageVector? = null
