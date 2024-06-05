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

public val Icons.Bold.SquareC: ImageVector
    get() {
        if (_squareC != null) {
            return _squareC!!
        }
        _squareC = Builder(name = "SquareC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(9.015f, 11.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.682f, 1.297f, 3.0f, 2.953f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.003f, 0.0f, 1.936f, -0.499f, 2.496f, -1.334f)
                curveToRelative(0.46f, -0.688f, 1.394f, -0.873f, 2.081f, -0.411f)
                curveToRelative(0.688f, 0.461f, 0.873f, 1.393f, 0.411f, 2.081f)
                curveToRelative(-1.118f, 1.668f, -2.982f, 2.665f, -4.988f, 2.665f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.283f, 0.0f, -5.953f, -2.691f, -5.953f, -6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, 2.67f, -6.0f, 5.953f, -6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.007f, 0.0f, 3.872f, 0.997f, 4.989f, 2.666f)
                curveToRelative(0.461f, 0.688f, 0.276f, 1.62f, -0.412f, 2.081f)
                curveToRelative(-0.69f, 0.46f, -1.621f, 0.276f, -2.081f, -0.412f)
                curveToRelative(-0.559f, -0.835f, -1.492f, -1.334f, -2.496f, -1.334f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.656f, 0.0f, -2.953f, 1.318f, -2.953f, 3.0f)
                close()
            }
        }
        .build()
        return _squareC!!
    }

private var _squareC: ImageVector? = null
