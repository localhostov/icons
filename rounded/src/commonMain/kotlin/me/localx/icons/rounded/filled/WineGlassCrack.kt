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

public val Icons.Filled.WineGlassCrack: ImageVector
    get() {
        if (_wineGlassCrack != null) {
            return _wineGlassCrack!!
        }
        _wineGlassCrack = Builder(name = "WineGlassCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.753f)
                lineToRelative(-2.846f, 4.0f)
                horizontalLineToRelative(1.994f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.845f)
                curveToRelative(0.28f, 0.521f, 0.251f, 1.152f, -0.076f, 1.646f)
                lineToRelative(-1.882f, 3.037f)
                curveToRelative(-0.189f, 0.305f, -0.517f, 0.473f, -0.851f, 0.473f)
                curveToRelative(-0.18f, 0.0f, -0.362f, -0.049f, -0.526f, -0.15f)
                curveToRelative(-0.469f, -0.291f, -0.614f, -0.907f, -0.323f, -1.377f)
                lineToRelative(1.533f, -2.473f)
                horizontalLineToRelative(-2.068f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.652f)
                curveToRelative(-0.303f, -0.409f, -0.396f, -0.944f, -0.249f, -1.431f)
                curveToRelative(0.031f, -0.104f, 2.722f, -3.917f, 2.722f, -3.917f)
                horizontalLineToRelative(-3.792f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.52f, 2.612f, 6.441f, 6.0f, 6.928f)
                verticalLineToRelative(6.072f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.072f)
                curveToRelative(3.388f, -0.487f, 6.0f, -3.408f, 6.0f, -6.928f)
                close()
            }
        }
        .build()
        return _wineGlassCrack!!
    }

private var _wineGlassCrack: ImageVector? = null
