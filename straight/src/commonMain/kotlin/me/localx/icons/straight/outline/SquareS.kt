package me.localx.icons.straight.outline

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

public val Icons.Outline.SquareS: ImageVector
    get() {
        if (_squareS != null) {
            return _squareS!!
        }
        _squareS = Builder(name = "SquareS", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(18.0f, 8.626f)
                verticalLineToRelative(0.374f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.374f)
                curveToRelative(0.0f, -0.896f, -0.729f, -1.626f, -1.626f, -1.626f)
                horizontalLineToRelative(-4.752f)
                curveToRelative(-0.895f, 0.0f, -1.622f, 0.728f, -1.622f, 1.622f)
                curveToRelative(0.0f, 0.722f, 0.485f, 1.363f, 1.179f, 1.561f)
                lineToRelative(6.186f, 1.704f)
                curveToRelative(1.556f, 0.446f, 2.635f, 1.88f, 2.635f, 3.487f)
                curveToRelative(0.0f, 1.999f, -1.626f, 3.626f, -3.626f, 3.626f)
                horizontalLineToRelative(-4.748f)
                curveToRelative(-2.0f, 0.0f, -3.626f, -1.627f, -3.626f, -3.626f)
                verticalLineToRelative(-0.374f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.374f)
                curveToRelative(0.0f, 0.896f, 0.729f, 1.626f, 1.626f, 1.626f)
                horizontalLineToRelative(4.748f)
                curveToRelative(0.896f, 0.0f, 1.626f, -0.729f, 1.626f, -1.626f)
                curveToRelative(0.0f, -0.721f, -0.484f, -1.363f, -1.176f, -1.562f)
                lineToRelative(-6.183f, -1.703f)
                curveToRelative(-1.558f, -0.442f, -2.641f, -1.875f, -2.641f, -3.486f)
                curveToRelative(0.0f, -1.997f, 1.625f, -3.622f, 3.622f, -3.622f)
                horizontalLineToRelative(4.752f)
                curveToRelative(2.0f, 0.0f, 3.626f, 1.627f, 3.626f, 3.626f)
                close()
            }
        }
        .build()
        return _squareS!!
    }

private var _squareS: ImageVector? = null
