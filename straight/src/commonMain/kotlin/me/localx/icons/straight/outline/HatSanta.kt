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
                moveToRelative(21.806f, 17.121f)
                curveToRelative(-0.392f, -2.743f, -1.037f, -5.113f, -1.86f, -7.128f)
                curveToRelative(0.018f, 0.0f, 0.036f, 0.004f, 0.054f, 0.004f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.211f, 0.0f, -0.417f, 0.019f, -0.619f, 0.051f)
                lineToRelative(-0.159f, -0.107f)
                curveTo(17.802f, 0.986f, 16.333f, -0.003f, 14.0f, -0.003f)
                curveTo(10.662f, -0.003f, 3.968f, 3.612f, 2.106f, 17.151f)
                curveToRelative(-1.216f, 0.383f, -2.106f, 1.508f, -2.106f, 2.849f)
                verticalLineToRelative(4.0f)
                lineToRelative(24.0f, -0.003f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.373f, -0.933f, -2.521f, -2.194f, -2.876f)
                close()
                moveTo(22.0f, 5.997f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 1.997f)
                curveToRelative(1.364f, 0.0f, 2.308f, 0.447f, 3.302f, 1.076f)
                curveToRelative(-0.355f, 0.332f, -0.657f, 0.722f, -0.875f, 1.162f)
                curveToRelative(-0.386f, -0.138f, -0.807f, -0.238f, -1.284f, -0.238f)
                curveToRelative(-0.291f, 0.0f, -0.772f, 0.106f, -1.361f, 0.356f)
                curveToRelative(2.503f, 2.22f, 5.002f, 6.185f, 5.997f, 12.644f)
                lineToRelative(-15.634f, 0.002f)
                curveTo(5.952f, 4.73f, 11.826f, 1.997f, 14.0f, 1.997f)
                close()
                moveTo(22.0f, 21.997f)
                lineToRelative(-20.0f, 0.003f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                lineToRelative(18.0f, -0.002f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _hatSanta!!
    }

private var _hatSanta: ImageVector? = null
