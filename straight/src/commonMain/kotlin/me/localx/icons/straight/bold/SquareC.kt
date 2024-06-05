package me.localx.icons.straight.bold

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
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(9.015f, 11.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.682f, 1.297f, 3.0f, 2.953f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.127f, 0.0f, 2.149f, -0.623f, 2.667f, -1.625f)
                lineToRelative(2.665f, 1.378f)
                curveToRelative(-1.036f, 2.003f, -3.079f, 3.248f, -5.333f, 3.248f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.283f, 0.0f, -5.953f, -2.691f, -5.953f, -6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, 2.67f, -6.0f, 5.953f, -6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.294f, 0.0f, 4.354f, 1.277f, 5.375f, 3.333f)
                lineToRelative(-2.687f, 1.335f)
                curveToRelative(-0.511f, -1.028f, -1.542f, -1.667f, -2.689f, -1.667f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.656f, 0.0f, -2.953f, 1.318f, -2.953f, 3.0f)
                close()
            }
        }
        .build()
        return _squareC!!
    }

private var _squareC: ImageVector? = null
