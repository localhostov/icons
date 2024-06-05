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

public val Icons.Outline.SquareV: ImageVector
    get() {
        if (_squareV != null) {
            return _squareV!!
        }
        _squareV = Builder(name = "SquareV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(18.939f, 6.326f)
                lineToRelative(-3.83f, 10.5f)
                curveToRelative(-0.471f, 1.327f, -1.692f, 2.19f, -3.109f, 2.19f)
                reflectiveCurveToRelative(-2.639f, -0.863f, -3.112f, -2.198f)
                lineToRelative(-3.827f, -10.492f)
                curveToRelative(-0.189f, -0.519f, 0.078f, -1.093f, 0.597f, -1.282f)
                curveToRelative(0.518f, -0.187f, 1.092f, 0.078f, 1.282f, 0.597f)
                lineToRelative(3.83f, 10.5f)
                curveToRelative(0.289f, 0.813f, 1.015f, 0.876f, 1.23f, 0.876f)
                reflectiveCurveToRelative(0.941f, -0.062f, 1.228f, -0.868f)
                lineToRelative(3.833f, -10.508f)
                curveToRelative(0.189f, -0.519f, 0.764f, -0.784f, 1.282f, -0.597f)
                curveToRelative(0.519f, 0.189f, 0.786f, 0.764f, 0.597f, 1.282f)
                close()
            }
        }
        .build()
        return _squareV!!
    }

private var _squareV: ImageVector? = null
