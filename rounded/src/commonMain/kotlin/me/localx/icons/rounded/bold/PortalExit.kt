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

public val Icons.Bold.PortalExit: ImageVector
    get() {
        if (_portalExit != null) {
            return _portalExit!!
        }
        _portalExit = Builder(name = "PortalExit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.221f, 0.0f, -2.37f, -0.649f, -2.999f, -1.695f)
                lineToRelative(-0.552f, -0.917f)
                lineToRelative(-1.332f, 3.247f)
                lineToRelative(2.614f, 1.486f)
                curveToRelative(1.091f, 0.62f, 1.769f, 1.786f, 1.769f, 3.042f)
                verticalLineToRelative(3.337f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.337f)
                curveToRelative(0.0f, -0.18f, -0.097f, -0.346f, -0.252f, -0.435f)
                lineToRelative(-4.081f, -2.322f)
                curveToRelative(-1.498f, -0.947f, -2.073f, -2.749f, -1.428f, -4.322f)
                lineToRelative(1.265f, -3.084f)
                horizontalLineToRelative(-1.268f)
                curveToRelative(-0.19f, 0.0f, -0.362f, 0.105f, -0.447f, 0.276f)
                lineToRelative(-1.447f, 2.895f)
                curveToRelative(-0.371f, 0.741f, -1.271f, 1.041f, -2.013f, 0.671f)
                curveToRelative(-0.741f, -0.371f, -1.041f, -1.271f, -0.671f, -2.013f)
                lineToRelative(1.447f, -2.895f)
                curveToRelative(0.597f, -1.193f, 1.796f, -1.935f, 3.13f, -1.935f)
                horizontalLineToRelative(3.993f)
                curveToRelative(1.221f, 0.0f, 2.37f, 0.649f, 3.0f, 1.695f)
                lineToRelative(1.843f, 3.062f)
                curveToRelative(0.091f, 0.151f, 0.251f, 0.242f, 0.428f, 0.242f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.558f, 16.851f)
                curveToRelative(-0.771f, -0.309f, -1.642f, 0.066f, -1.95f, 0.835f)
                curveToRelative(-0.077f, 0.191f, -0.259f, 0.314f, -0.464f, 0.314f)
                horizontalLineToRelative(-4.143f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.826f)
                curveToRelative(0.111f, -1.253f, 0.174f, -2.595f, 0.174f, -4.0f)
                curveTo(6.0f, 5.373f, 4.657f, 0.0f, 3.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(1.343f, 12.0f, 3.0f, 12.0f)
                curveToRelative(0.76f, 0.0f, 1.453f, -1.134f, 1.981f, -3.0f)
                horizontalLineToRelative(4.162f)
                curveToRelative(1.439f, 0.0f, 2.715f, -0.863f, 3.25f, -2.199f)
                curveToRelative(0.308f, -0.77f, -0.066f, -1.643f, -0.835f, -1.95f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _portalExit!!
    }

private var _portalExit: ImageVector? = null
