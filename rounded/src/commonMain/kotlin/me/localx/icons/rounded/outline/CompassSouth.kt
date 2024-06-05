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

public val Icons.Outline.CompassSouth: ImageVector
    get() {
        if (_compassSouth != null) {
            return _compassSouth!!
        }
        _compassSouth = Builder(name = "CompassSouth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.402f, 7.221f)
                curveToRelative(-0.688f, -0.304f, -1.47f, -0.294f, -2.226f, 0.071f)
                curveToRelative(-0.153f, 0.091f, -1.248f, 0.66f, -2.178f, 1.139f)
                curveToRelative(-0.777f, -0.397f, -2.29f, -1.17f, -2.464f, -1.256f)
                curveToRelative(-0.901f, -0.374f, -1.993f, -0.136f, -2.727f, 0.6f)
                curveToRelative(-0.759f, 0.777f, -0.962f, 1.906f, -0.519f, 2.876f)
                curveToRelative(0.008f, 0.019f, 3.393f, 6.392f, 3.393f, 6.392f)
                curveToRelative(0.443f, 0.886f, 1.328f, 1.456f, 2.317f, 1.458f)
                curveToRelative(0.986f, 0.0f, 1.89f, -0.563f, 2.32f, -1.413f)
                curveToRelative(0.113f, -0.204f, 2.773f, -5.013f, 3.396f, -6.453f)
                curveToRelative(0.281f, -0.634f, 0.299f, -1.338f, 0.051f, -1.982f)
                curveToRelative(-0.249f, -0.645f, -0.733f, -1.153f, -1.364f, -1.432f)
                close()
                moveTo(15.883f, 9.834f)
                curveToRelative(-0.587f, 1.358f, -3.286f, 6.236f, -3.33f, 6.316f)
                curveToRelative(-0.152f, 0.299f, -0.427f, 0.332f, -0.54f, 0.332f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.112f, 0.0f, -0.389f, -0.034f, -0.552f, -0.357f)
                curveToRelative(-2.515f, -4.735f, -3.169f, -5.967f, -3.352f, -6.306f)
                curveToRelative(-0.097f, -0.213f, -0.045f, -0.467f, 0.125f, -0.642f)
                curveToRelative(0.181f, -0.182f, 0.426f, -0.203f, 0.467f, -0.187f)
                curveToRelative(0.168f, 0.084f, 2.845f, 1.454f, 2.845f, 1.454f)
                curveToRelative(0.286f, 0.147f, 0.626f, 0.146f, 0.912f, 0.0f)
                curveToRelative(0.405f, -0.208f, 2.44f, -1.255f, 2.66f, -1.389f)
                curveToRelative(0.148f, -0.071f, 0.321f, -0.073f, 0.478f, -0.004f)
                curveToRelative(0.141f, 0.062f, 0.249f, 0.176f, 0.306f, 0.321f)
                curveToRelative(0.056f, 0.147f, 0.052f, 0.309f, -0.017f, 0.462f)
                close()
            }
        }
        .build()
        return _compassSouth!!
    }

private var _compassSouth: ImageVector? = null
