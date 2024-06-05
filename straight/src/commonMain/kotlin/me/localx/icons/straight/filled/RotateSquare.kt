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

public val Icons.Filled.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = Builder(name = "RotateSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.022f, 0.0f, -5.64f, -1.697f, -7.0f, -4.177f)
                verticalLineToRelative(3.177f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.169f)
                curveToRelative(1.039f, 1.787f, 2.957f, 3.0f, 5.169f, 3.0f)
                curveToRelative(2.967f, 0.0f, 5.431f, -2.167f, 5.91f, -5.0f)
                horizontalLineToRelative(2.021f)
                curveToRelative(-0.495f, 3.94f, -3.859f, 7.0f, -7.931f, 7.0f)
                close()
                moveTo(21.0f, 9.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.185f)
                curveToRelative(-1.037f, -1.791f, -2.97f, -3.0f, -5.185f, -3.0f)
                curveToRelative(-2.967f, 0.0f, -5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(-2.021f)
                curveToRelative(0.495f, -3.94f, 3.859f, -7.0f, 7.931f, -7.0f)
                curveToRelative(3.015f, 0.0f, 5.639f, 1.679f, 7.0f, 4.15f)
                verticalLineToRelative(-3.15f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
