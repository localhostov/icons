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

public val Icons.Outline.FaceWorried: ImageVector
    get() {
        if (_faceWorried != null) {
            return _faceWorried!!
        }
        _faceWorried = Builder(name = "FaceWorried", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.893f, 6.624f)
                curveToRelative(-1.3f, 0.554f, -2.354f, 1.426f, -3.048f, 2.521f)
                lineToRelative(-1.689f, -1.07f)
                curveToRelative(0.912f, -1.439f, 2.278f, -2.577f, 3.952f, -3.291f)
                lineToRelative(0.785f, 1.84f)
                close()
                moveTo(19.764f, 7.949f)
                lineToRelative(-1.668f, 1.103f)
                curveToRelative(-0.695f, -1.051f, -1.729f, -1.89f, -2.988f, -2.428f)
                lineToRelative(0.785f, -1.84f)
                curveToRelative(1.621f, 0.692f, 2.96f, 1.786f, 3.871f, 3.165f)
                close()
                moveTo(8.5f, 10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 19.0f)
                reflectiveCurveToRelative(-2.501f, -1.0f, -5.0f, -1.0f)
                reflectiveCurveToRelative(-5.0f, 1.001f, -5.0f, 1.0f)
                curveToRelative(0.512f, -1.899f, 2.221f, -3.997f, 4.999f, -4.0f)
                curveToRelative(2.778f, 0.003f, 4.488f, 2.101f, 5.001f, 4.0f)
                close()
            }
        }
        .build()
        return _faceWorried!!
    }

private var _faceWorried: ImageVector? = null
