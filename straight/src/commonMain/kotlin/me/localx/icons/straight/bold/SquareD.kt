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

public val Icons.Bold.SquareD: ImageVector
    get() {
        if (_squareD != null) {
            return _squareD!!
        }
        _squareD = Builder(name = "SquareD", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(11.786f, 5.0f)
                horizontalLineToRelative(-3.286f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.286f)
                curveToRelative(3.427f, 0.0f, 6.214f, -2.788f, 6.214f, -6.214f)
                verticalLineToRelative(-1.571f)
                curveToRelative(0.0f, -3.427f, -2.787f, -6.214f, -6.214f, -6.214f)
                close()
                moveTo(15.0f, 12.786f)
                curveToRelative(0.0f, 1.772f, -1.441f, 3.214f, -3.214f, 3.214f)
                horizontalLineToRelative(-2.786f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.786f)
                curveToRelative(1.772f, 0.0f, 3.214f, 1.442f, 3.214f, 3.214f)
                verticalLineToRelative(1.571f)
                close()
            }
        }
        .build()
        return _squareD!!
    }

private var _squareD: ImageVector? = null
