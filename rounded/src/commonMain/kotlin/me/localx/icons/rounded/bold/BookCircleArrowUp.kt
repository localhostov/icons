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

public val Icons.Bold.BookCircleArrowUp: ImageVector
    get() {
        if (_bookCircleArrowUp != null) {
            return _bookCircleArrowUp!!
        }
        _bookCircleArrowUp = Builder(name = "BookCircleArrowUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 21.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.526f, 0.0f, -1.031f, 0.091f, -1.5f, 0.257f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.5f, 11.0f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(20.563f, 17.999f)
                horizontalLineToRelative(-1.563f)
                verticalLineToRelative(2.501f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.501f)
                horizontalLineToRelative(-1.563f)
                curveToRelative(-0.863f, 0.0f, -1.295f, -1.043f, -0.685f, -1.653f)
                lineToRelative(3.063f, -3.063f)
                curveToRelative(0.378f, -0.378f, 0.991f, -0.378f, 1.369f, 0.0f)
                lineToRelative(3.063f, 3.063f)
                curveToRelative(0.61f, 0.61f, 0.178f, 1.653f, -0.685f, 1.653f)
                close()
            }
        }
        .build()
        return _bookCircleArrowUp!!
    }

private var _bookCircleArrowUp: ImageVector? = null
