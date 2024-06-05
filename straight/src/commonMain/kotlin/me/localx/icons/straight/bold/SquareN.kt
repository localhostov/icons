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

public val Icons.Bold.SquareN: ImageVector
    get() {
        if (_squareN != null) {
            return _squareN!!
        }
        _squareN = Builder(name = "SquareN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.876f)
                curveToRelative(0.0f, 0.951f, -0.613f, 1.77f, -1.525f, 2.037f)
                curveToRelative(-0.202f, 0.06f, -0.406f, 0.088f, -0.607f, 0.088f)
                curveToRelative(-0.707f, 0.0f, -1.377f, -0.354f, -1.777f, -0.978f)
                lineToRelative(-5.091f, -7.915f)
                verticalLineToRelative(8.892f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 7.125f)
                curveToRelative(0.0f, -0.951f, 0.613f, -1.769f, 1.525f, -2.037f)
                curveToRelative(0.911f, -0.267f, 1.87f, 0.089f, 2.384f, 0.888f)
                lineToRelative(5.091f, 7.916f)
                lineTo(15.0f, 5.0f)
                close()
            }
        }
        .build()
        return _squareN!!
    }

private var _squareN: ImageVector? = null
