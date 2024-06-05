package me.localx.icons.straight.filled

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
                moveTo(8.001f, 21.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.001f, 24.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(21.001f, 9.0f)
                curveToRelative(0.0f, 2.59f, -1.118f, 5.055f, -3.068f, 6.763f)
                curveToRelative(-0.923f, 0.81f, -1.55f, 1.949f, -1.804f, 3.237f)
                lineTo(7.876f, 19.0f)
                curveToRelative(-0.264f, -1.251f, -0.951f, -2.435f, -2.007f, -3.417f)
                curveToRelative(-2.149f, -2.001f, -3.167f, -4.83f, -2.793f, -7.761f)
                curveTo(3.591f, 3.782f, 6.905f, 0.517f, 10.957f, 0.059f)
                curveToRelative(2.567f, -0.289f, 5.13f, 0.522f, 7.038f, 2.227f)
                curveToRelative(1.91f, 1.707f, 3.006f, 4.154f, 3.006f, 6.714f)
                close()
                moveTo(10.0f, 8.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                close()
            }
        }
        .build()
        return _lightbulbDollar!!
    }

private var _lightbulbDollar: ImageVector? = null
