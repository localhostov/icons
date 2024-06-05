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

public val Icons.Outline.FaceTissue: ImageVector
    get() {
        if (_faceTissue != null) {
            return _faceTissue!!
        }
        _faceTissue = Builder(name = "FaceTissue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-0.26f, 0.0f, -0.514f, -0.023f, -0.77f, -0.039f)
                lineToRelative(0.362f, -1.982f)
                curveToRelative(0.136f, 0.006f, 0.27f, 0.021f, 0.408f, 0.021f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 0.14f, 0.015f, 0.276f, 0.021f, 0.414f)
                lineTo(0.039f, 12.778f)
                curveToRelative(-0.017f, -0.258f, -0.039f, -0.515f, -0.039f, -0.778f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(16.375f, 6.219f)
                lineToRelative(-3.476f, 2.781f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(1.25f, -1.562f)
                lineToRelative(-1.524f, -1.219f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.25f, -1.562f)
                close()
                moveTo(7.625f, 11.781f)
                lineToRelative(3.476f, -2.781f)
                lineToRelative(-3.476f, -2.781f)
                lineToRelative(-1.25f, 1.562f)
                lineToRelative(1.524f, 1.219f)
                lineToRelative(-1.524f, 1.219f)
                lineToRelative(1.25f, 1.562f)
                close()
                moveTo(11.244f, 12.755f)
                lineToRelative(-2.062f, 11.288f)
                lineToRelative(-3.184f, -2.548f)
                lineToRelative(-5.009f, 1.501f)
                lineToRelative(1.548f, -5.005f)
                lineTo(0.0f, 14.818f)
                lineToRelative(11.244f, -2.063f)
                close()
                moveTo(8.756f, 15.245f)
                lineToRelative(-5.104f, 0.937f)
                lineToRelative(1.11f, 1.388f)
                lineToRelative(-0.753f, 2.434f)
                lineToRelative(2.419f, -0.725f)
                lineToRelative(1.389f, 1.11f)
                lineToRelative(0.938f, -5.144f)
                close()
                moveTo(14.017f, 16.411f)
                lineToRelative(2.004f, 2.003f)
                lineToRelative(3.066f, -3.067f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.652f, 1.653f)
                lineToRelative(-1.996f, -1.997f)
                lineToRelative(-1.098f, 1.086f)
                lineToRelative(-0.628f, 3.435f)
                lineToRelative(1.717f, -1.7f)
                close()
            }
        }
        .build()
        return _faceTissue!!
    }

private var _faceTissue: ImageVector? = null
