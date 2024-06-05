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

public val Icons.Filled.SquareA: ImageVector
    get() {
        if (_squareA != null) {
            return _squareA!!
        }
        _squareA = Builder(name = "SquareA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.134f, 7.727f)
                lineToRelative(1.813f, 5.273f)
                horizontalLineToRelative(-5.82f)
                lineToRelative(1.739f, -5.273f)
                curveToRelative(0.318f, -0.691f, 0.549f, -0.727f, 1.135f, -0.727f)
                curveToRelative(0.584f, 0.0f, 0.816f, 0.037f, 1.134f, 0.727f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(21.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineToRelative(-4.0f, -12.0f)
                curveToRelative(-0.673f, -1.531f, -1.642f, -2.0f, -3.0f, -2.0f)
                curveToRelative(-1.358f, 0.0f, -2.327f, 0.469f, -3.0f, 2.0f)
                lineToRelative(-4.0f, 12.0f)
                horizontalLineToRelative(2.149f)
                lineToRelative(1.319f, -4.0f)
                horizontalLineToRelative(7.168f)
                lineToRelative(1.376f, 4.0f)
                horizontalLineToRelative(1.989f)
                close()
            }
        }
        .build()
        return _squareA!!
    }

private var _squareA: ImageVector? = null
