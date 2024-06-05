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

public val Icons.Filled.LightbulbDollar: ImageVector
    get() {
        if (_lightbulbDollar != null) {
            return _lightbulbDollar!!
        }
        _lightbulbDollar = Builder(name = "LightbulbDollar", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.001f, 19.998f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 2.035f, -1.655f, 3.69f, -3.69f, 3.69f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-2.035f, 0.0f, -3.69f, -1.655f, -3.69f, -3.69f)
                verticalLineToRelative(-0.31f)
                close()
                moveTo(21.001f, 8.998f)
                curveToRelative(0.0f, 2.59f, -1.118f, 5.055f, -3.068f, 6.763f)
                curveToRelative(-0.739f, 0.648f, -1.275f, 1.413f, -1.594f, 2.237f)
                lineTo(7.564f, 17.998f)
                curveToRelative(-0.358f, -0.877f, -0.926f, -1.702f, -1.695f, -2.417f)
                curveToRelative(-2.149f, -2.001f, -3.167f, -4.83f, -2.793f, -7.761f)
                curveTo(3.591f, 3.78f, 6.905f, 0.515f, 10.957f, 0.057f)
                curveToRelative(2.567f, -0.289f, 5.13f, 0.522f, 7.038f, 2.227f)
                curveToRelative(1.91f, 1.707f, 3.006f, 4.154f, 3.006f, 6.714f)
                close()
                moveTo(16.0f, 11.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.356f, 0.0f, 0.688f, 0.192f, 0.867f, 0.5f)
                curveToRelative(0.275f, 0.478f, 0.886f, 0.642f, 1.366f, 0.365f)
                curveToRelative(0.478f, -0.277f, 0.642f, -0.888f, 0.364f, -1.366f)
                curveToRelative(-0.534f, -0.925f, -1.53f, -1.5f, -2.598f, -1.5f)
                horizontalLineToRelative(-0.268f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.192f, -0.867f, -0.5f)
                curveToRelative(-0.276f, -0.479f, -0.887f, -0.644f, -1.366f, -0.365f)
                curveToRelative(-0.478f, 0.277f, -0.642f, 0.888f, -0.364f, 1.366f)
                curveToRelative(0.534f, 0.925f, 1.53f, 1.499f, 2.598f, 1.499f)
                horizontalLineToRelative(0.268f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _lightbulbDollar!!
    }

private var _lightbulbDollar: ImageVector? = null
