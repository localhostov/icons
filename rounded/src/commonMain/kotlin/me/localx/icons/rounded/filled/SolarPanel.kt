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

public val Icons.Filled.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.621f)
                lineToRelative(0.5f, -8.0f)
                horizontalLineToRelative(6.242f)
                lineToRelative(0.5f, 8.0f)
                horizontalLineToRelative(-2.621f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(14.5f, 0.062f)
                curveToRelative(-0.001f, -0.021f, -0.002f, -0.042f, -0.002f, -0.062f)
                horizontalLineToRelative(-4.996f)
                curveToRelative(0.0f, 0.021f, 0.0f, 0.042f, -0.002f, 0.062f)
                lineToRelative(-0.496f, 7.938f)
                horizontalLineToRelative(5.992f)
                lineTo(14.5f, 0.062f)
                close()
                moveTo(23.424f, 8.0f)
                lineToRelative(-0.464f, -3.634f)
                curveToRelative(-0.318f, -2.489f, -2.45f, -4.366f, -4.96f, -4.366f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(0.5f, 8.0f)
                horizontalLineToRelative(6.424f)
                close()
                moveTo(23.981f, 12.366f)
                lineToRelative(-0.302f, -2.366f)
                horizontalLineToRelative(-6.554f)
                reflectiveCurveToRelative(0.498f, 7.979f, 0.498f, 8.0f)
                horizontalLineToRelative(1.399f)
                curveToRelative(1.436f, 0.0f, 2.804f, -0.618f, 3.752f, -1.696f)
                curveToRelative(0.949f, -1.077f, 1.389f, -2.513f, 1.207f, -3.938f)
                close()
                moveTo(7.5f, 0.0f)
                horizontalLineToRelative(-1.478f)
                curveTo(3.513f, 0.0f, 1.381f, 1.877f, 1.063f, 4.366f)
                lineToRelative(-0.464f, 3.634f)
                horizontalLineToRelative(6.401f)
                lineTo(7.5f, 0.0f)
                close()
                moveTo(6.875f, 10.0f)
                lineTo(0.343f, 10.0f)
                lineTo(0.041f, 12.366f)
                curveToRelative(-0.182f, 1.425f, 0.258f, 2.86f, 1.208f, 3.938f)
                curveToRelative(0.949f, 1.078f, 2.316f, 1.696f, 3.752f, 1.696f)
                horizontalLineToRelative(1.377f)
                curveToRelative(0.0f, -0.021f, 0.498f, -8.0f, 0.498f, -8.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
