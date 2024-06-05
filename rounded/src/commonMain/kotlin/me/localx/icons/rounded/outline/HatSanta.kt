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

public val Icons.Outline.HatSanta: ImageVector
    get() {
        if (_hatSanta != null) {
            return _hatSanta!!
        }
        _hatSanta = Builder(name = "HatSanta", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.942f, 17.311f)
                curveToRelative(-0.289f, -2.708f, -1.18f, -5.231f, -2.173f, -7.318f)
                curveToRelative(0.077f, 0.004f, 0.154f, 0.007f, 0.232f, 0.007f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.212f, 0.0f, -0.42f, 0.017f, -0.623f, 0.049f)
                lineToRelative(-0.153f, -0.103f)
                curveToRelative(-1.421f, -0.957f, -2.891f, -1.946f, -5.224f, -1.946f)
                curveTo(10.649f, 0.0f, 3.913f, 3.635f, 2.081f, 17.303f)
                curveToRelative(-1.225f, 0.546f, -2.081f, 1.774f, -2.081f, 3.199f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.501f, 3.5f)
                lineToRelative(16.999f, -0.002f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.571f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.416f, -0.846f, -2.639f, -2.058f, -3.189f)
                close()
                moveTo(22.0f, 6.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 2.0f)
                curveToRelative(1.357f, 0.0f, 2.297f, 0.439f, 3.286f, 1.064f)
                curveToRelative(-0.41f, 0.379f, -0.74f, 0.842f, -0.964f, 1.362f)
                curveToRelative(-0.027f, -0.033f, -0.045f, -0.055f, -0.054f, -0.066f)
                curveToRelative(-0.354f, -0.424f, -0.982f, -0.481f, -1.409f, -0.128f)
                curveToRelative(-0.424f, 0.354f, -0.481f, 0.984f, -0.128f, 1.408f)
                curveToRelative(0.045f, 0.055f, 4.296f, 5.217f, 5.158f, 11.36f)
                lineToRelative(-15.745f, 0.002f)
                curveTo(5.951f, 4.732f, 11.825f, 2.0f, 14.0f, 2.0f)
                close()
                moveTo(20.5f, 22.0f)
                lineToRelative(-16.999f, 0.002f)
                curveToRelative(-0.827f, 0.0f, -1.501f, -0.673f, -1.501f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                lineToRelative(17.0f, -0.002f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hatSanta!!
    }

private var _hatSanta: ImageVector? = null
