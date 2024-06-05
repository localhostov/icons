package me.localx.icons.rounded.bold

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

public val Icons.Bold.PortalEnter: ImageVector
    get() {
        if (_portalEnter != null) {
            return _portalEnter!!
        }
        _portalEnter = Builder(name = "PortalEnter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.393f, 18.801f)
                curveToRelative(-0.535f, 1.336f, -1.81f, 2.199f, -3.25f, 2.199f)
                lineTo(1.5f, 21.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.643f)
                curveToRelative(0.206f, 0.0f, 0.388f, -0.123f, 0.464f, -0.314f)
                curveToRelative(0.308f, -0.769f, 1.18f, -1.144f, 1.95f, -0.835f)
                curveToRelative(0.769f, 0.308f, 1.143f, 1.181f, 0.835f, 1.95f)
                close()
                moveTo(13.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21.077f, 0.0f)
                curveToRelative(-1.532f, 0.0f, -2.789f, 4.841f, -2.913f, 11.0f)
                horizontalLineToRelative(-2.164f)
                curveToRelative(-0.177f, 0.0f, -0.337f, -0.091f, -0.428f, -0.242f)
                lineToRelative(-1.843f, -3.062f)
                curveToRelative(-0.629f, -1.046f, -1.778f, -1.695f, -3.0f, -1.695f)
                horizontalLineToRelative(-3.993f)
                curveToRelative(-1.334f, 0.0f, -2.534f, 0.741f, -3.13f, 1.935f)
                lineToRelative(-1.447f, 2.895f)
                curveToRelative(-0.37f, 0.741f, -0.07f, 1.642f, 0.671f, 2.013f)
                curveToRelative(0.741f, 0.37f, 1.642f, 0.07f, 2.013f, -0.671f)
                lineToRelative(1.447f, -2.895f)
                curveToRelative(0.085f, -0.171f, 0.256f, -0.276f, 0.447f, -0.276f)
                horizontalLineToRelative(1.268f)
                lineToRelative(-1.265f, 3.084f)
                curveToRelative(-0.646f, 1.573f, -0.07f, 3.375f, 1.428f, 4.322f)
                lineToRelative(4.081f, 2.322f)
                curveToRelative(0.156f, 0.089f, 0.252f, 0.255f, 0.252f, 0.435f)
                verticalLineToRelative(3.337f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-3.337f)
                curveToRelative(0.0f, -1.256f, -0.678f, -2.422f, -1.769f, -3.042f)
                lineToRelative(-2.614f, -1.486f)
                lineToRelative(1.332f, -3.247f)
                lineToRelative(0.552f, 0.917f)
                curveToRelative(0.629f, 1.046f, 1.778f, 1.695f, 2.999f, 1.695f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.676f)
                curveToRelative(0.402f, 4.658f, 1.481f, 8.0f, 2.753f, 8.0f)
                curveToRelative(1.614f, 0.0f, 2.923f, -5.373f, 2.923f, -12.0f)
                reflectiveCurveTo(22.691f, 0.0f, 21.077f, 0.0f)
                close()
            }
        }
        .build()
        return _portalEnter!!
    }

private var _portalEnter: ImageVector? = null
