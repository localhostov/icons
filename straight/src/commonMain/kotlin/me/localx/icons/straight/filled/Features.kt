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

public val Icons.Filled.Features: ImageVector
    get() {
        if (_features != null) {
            return _features!!
        }
        _features = Builder(name = "Features", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.24f, 24.0f)
                curveToRelative(0.48f, -0.716f, 0.76f, -1.576f, 0.76f, -2.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(18.015f, 9.857f)
                lineToRelative(3.261f, 2.521f)
                lineToRelative(0.75f, -0.523f)
                lineToRelative(-1.326f, -4.029f)
                lineToRelative(3.3f, -1.909f)
                verticalLineToRelative(-0.917f)
                horizontalLineToRelative(-4.326f)
                lineToRelative(-1.176f, -4.5f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.177f, 4.5f)
                horizontalLineToRelative(-4.35f)
                verticalLineToRelative(0.923f)
                lineToRelative(3.322f, 1.848f)
                lineToRelative(-1.303f, 4.076f)
                lineToRelative(0.722f, 0.543f)
                lineToRelative(3.275f, -2.532f)
                close()
                moveTo(10.582f, 10.0f)
                horizontalLineToRelative(-6.582f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.062f)
                curveToRelative(-0.041f, -0.328f, -0.062f, -0.661f, -0.062f, -1.0f)
                reflectiveCurveToRelative(0.021f, -0.672f, 0.062f, -1.0f)
                horizontalLineToRelative(-6.062f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.582f)
                curveTo(11.271f, 2.298f, 12.529f, 0.887f, 14.12f, 0.003f)
                curveToRelative(-0.04f, -0.002f, -0.08f, -0.003f, -0.12f, -0.003f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(18.357f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.5f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.062f)
                curveToRelative(-2.92f, -0.364f, -5.351f, -2.302f, -6.418f, -4.938f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _features!!
    }

private var _features: ImageVector? = null
