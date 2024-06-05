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

public val Icons.Filled.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.998f, 19.0f)
                curveToRelative(1.17f, 0.0f, 2.099f, 1.003f, 1.993f, 2.168f)
                curveToRelative(-0.014f, 0.156f, -0.03f, 0.275f, -0.047f, 0.332f)
                curveToRelative(-0.43f, 1.446f, -1.77f, 2.5f, -3.355f, 2.5f)
                horizontalLineToRelative(-9.35f)
                curveToRelative(0.48f, -0.716f, 0.76f, -1.576f, 0.76f, -2.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.498f)
                close()
                moveTo(1.5f, 0.0f)
                curveTo(0.672f, 0.0f, 0.0f, 0.672f, 0.0f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                lineTo(3.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.662f, 0.0f)
                curveToRelative(0.217f, 0.455f, 0.338f, 0.964f, 0.338f, 1.5f)
                verticalLineToRelative(19.857f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.499f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5.5f)
                lineTo(20.0f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                lineTo(4.662f, 0.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
