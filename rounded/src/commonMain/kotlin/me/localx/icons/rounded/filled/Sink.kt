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

public val Icons.Filled.Sink: ImageVector
    get() {
        if (_sink != null) {
            return _sink!!
        }
        _sink = Builder(name = "Sink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.75f, 13.0f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                curveToRelative(1.389f, 0.0f, 2.414f, 0.85f, 2.494f, 2.066f)
                curveToRelative(0.036f, 0.551f, 0.547f, 0.962f, 1.063f, 0.932f)
                curveToRelative(0.552f, -0.037f, 0.969f, -0.513f, 0.933f, -1.064f)
                curveToRelative(-0.15f, -2.28f, -2.039f, -3.934f, -4.49f, -3.934f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.458f, -3.25f, 3.25f)
                curveToRelative(0.0f, 4.273f, 3.477f, 7.75f, 7.75f, 7.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(4.273f, 0.0f, 7.75f, -3.477f, 7.75f, -7.75f)
                curveToRelative(0.0f, -1.792f, -1.458f, -3.25f, -3.25f, -3.25f)
                close()
            }
        }
        .build()
        return _sink!!
    }

private var _sink: ImageVector? = null
