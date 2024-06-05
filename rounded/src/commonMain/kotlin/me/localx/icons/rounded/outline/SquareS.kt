package me.localx.icons.rounded.outline

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
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(8.0f, 8.622f)
                curveToRelative(0.0f, 0.722f, 0.485f, 1.363f, 1.179f, 1.561f)
                lineToRelative(6.186f, 1.704f)
                curveToRelative(1.556f, 0.446f, 2.635f, 1.88f, 2.635f, 3.487f)
                curveToRelative(0.0f, 1.999f, -1.626f, 3.626f, -3.626f, 3.626f)
                horizontalLineToRelative(-4.786f)
                curveToRelative(-1.773f, 0.0f, -3.277f, -1.268f, -3.574f, -3.014f)
                curveToRelative(-0.093f, -0.545f, 0.273f, -1.061f, 0.818f, -1.153f)
                curveToRelative(0.546f, -0.093f, 1.061f, 0.273f, 1.154f, 0.817f)
                curveToRelative(0.133f, 0.782f, 0.807f, 1.35f, 1.603f, 1.35f)
                horizontalLineToRelative(4.786f)
                curveToRelative(0.896f, 0.0f, 1.626f, -0.729f, 1.626f, -1.626f)
                curveToRelative(0.0f, -0.721f, -0.484f, -1.363f, -1.176f, -1.562f)
                lineToRelative(-6.183f, -1.703f)
                curveToRelative(-1.558f, -0.442f, -2.641f, -1.875f, -2.641f, -3.486f)
                curveToRelative(0.0f, -1.997f, 1.625f, -3.622f, 3.622f, -3.622f)
                horizontalLineToRelative(4.79f)
                curveToRelative(1.773f, 0.0f, 3.277f, 1.268f, 3.574f, 3.014f)
                curveToRelative(0.093f, 0.545f, -0.273f, 1.061f, -0.818f, 1.153f)
                curveToRelative(-0.54f, 0.096f, -1.061f, -0.273f, -1.154f, -0.817f)
                curveToRelative(-0.133f, -0.782f, -0.807f, -1.35f, -1.603f, -1.35f)
                horizontalLineToRelative(-4.79f)
                curveToRelative(-0.895f, 0.0f, -1.622f, 0.728f, -1.622f, 1.622f)
                close()
            }
        }
        .build()
        return _squareS!!
    }

private var _squareS: ImageVector? = null
