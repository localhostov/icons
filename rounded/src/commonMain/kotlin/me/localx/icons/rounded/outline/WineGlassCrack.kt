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

public val Icons.Outline.WineGlassCrack: ImageVector
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
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(8.0f, 0.0f)
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
                moveTo(7.0f, 9.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.069f)
                reflectiveCurveToRelative(-1.968f, 2.814f, -1.999f, 2.917f)
                curveToRelative(-0.147f, 0.486f, -0.055f, 1.021f, 0.249f, 1.431f)
                curveToRelative(0.303f, 0.408f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(2.068f)
                lineToRelative(-1.533f, 2.473f)
                curveToRelative(-0.291f, 0.47f, -0.146f, 1.086f, 0.323f, 1.377f)
                curveToRelative(0.164f, 0.102f, 0.346f, 0.15f, 0.526f, 0.15f)
                curveToRelative(0.334f, 0.0f, 0.662f, -0.168f, 0.851f, -0.473f)
                lineToRelative(1.882f, -3.037f)
                curveToRelative(0.327f, -0.493f, 0.356f, -1.124f, 0.076f, -1.646f)
                curveToRelative(-0.28f, -0.521f, -0.821f, -0.845f, -1.413f, -0.845f)
                horizontalLineToRelative(-1.998f)
                lineToRelative(2.121f, -3.0f)
                horizontalLineToRelative(2.482f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _wineGlassCrack!!
    }

private var _wineGlassCrack: ImageVector? = null
