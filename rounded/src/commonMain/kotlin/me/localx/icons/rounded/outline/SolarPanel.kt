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

public val Icons.Outline.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.981f, 12.366f)
                lineToRelative(-1.021f, -8.0f)
                curveToRelative(-0.318f, -2.489f, -2.45f, -4.366f, -4.96f, -4.366f)
                lineTo(6.022f, 0.0f)
                curveTo(3.513f, 0.0f, 1.381f, 1.877f, 1.063f, 4.366f)
                lineTo(0.041f, 12.366f)
                curveToRelative(-0.182f, 1.425f, 0.258f, 2.86f, 1.208f, 3.938f)
                curveToRelative(0.949f, 1.078f, 2.316f, 1.696f, 3.752f, 1.696f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.022f)
                curveToRelative(1.436f, 0.0f, 2.804f, -0.618f, 3.752f, -1.696f)
                curveToRelative(0.949f, -1.077f, 1.389f, -2.513f, 1.207f, -3.938f)
                close()
                moveTo(20.976f, 4.62f)
                lineToRelative(0.432f, 3.38f)
                horizontalLineToRelative(-4.968f)
                lineToRelative(-0.375f, -6.0f)
                horizontalLineToRelative(1.936f)
                curveToRelative(1.506f, 0.0f, 2.785f, 1.126f, 2.976f, 2.62f)
                close()
                moveTo(9.064f, 16.0f)
                lineToRelative(0.375f, -6.0f)
                horizontalLineToRelative(5.121f)
                lineToRelative(0.375f, 6.0f)
                horizontalLineToRelative(-5.871f)
                close()
                moveTo(9.564f, 8.0f)
                lineToRelative(0.375f, -6.0f)
                horizontalLineToRelative(4.121f)
                lineToRelative(0.375f, 6.0f)
                horizontalLineToRelative(-4.871f)
                close()
                moveTo(6.022f, 2.0f)
                horizontalLineToRelative(1.913f)
                lineToRelative(-0.375f, 6.0f)
                lineTo(2.615f, 8.0f)
                lineToRelative(0.432f, -3.38f)
                curveToRelative(0.191f, -1.494f, 1.471f, -2.62f, 2.976f, -2.62f)
                close()
                moveTo(2.749f, 14.982f)
                curveToRelative(-0.569f, -0.646f, -0.833f, -1.508f, -0.725f, -2.362f)
                lineToRelative(0.335f, -2.62f)
                horizontalLineToRelative(5.076f)
                lineToRelative(-0.375f, 6.0f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.861f, 0.0f, -1.682f, -0.371f, -2.251f, -1.018f)
                close()
                moveTo(21.273f, 14.982f)
                curveToRelative(-0.569f, 0.646f, -1.39f, 1.018f, -2.251f, 1.018f)
                horizontalLineToRelative(-2.083f)
                lineToRelative(-0.375f, -6.0f)
                horizontalLineToRelative(5.099f)
                lineToRelative(0.335f, 2.62f)
                curveToRelative(0.109f, 0.854f, -0.155f, 1.716f, -0.724f, 2.362f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
