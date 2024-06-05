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

public val Icons.Filled.Lesson: ImageVector
    get() {
        if (_lesson != null) {
            return _lesson!!
        }
        _lesson = Builder(name = "Lesson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.237f, 10.359f)
                lineToRelative(5.763f, 3.641f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.736f)
                lineToRelative(-3.763f, 2.378f)
                curveToRelative(-0.757f, 0.478f, -1.717f, 0.478f, -2.473f, 0.0f)
                lineToRelative(-5.763f, -3.641f)
                lineToRelative(5.763f, -3.641f)
                curveToRelative(0.757f, -0.478f, 1.717f, -0.478f, 2.473f, 0.0f)
                close()
                moveTo(14.305f, 19.333f)
                lineToRelative(1.695f, -1.071f)
                verticalLineToRelative(4.284f)
                reflectiveCurveToRelative(-1.143f, 1.455f, -4.0f, 1.455f)
                reflectiveCurveToRelative(-4.0f, -1.455f, -4.0f, -1.455f)
                verticalLineToRelative(-4.284f)
                lineToRelative(1.696f, 1.072f)
                curveToRelative(0.7f, 0.441f, 1.502f, 0.662f, 2.304f, 0.662f)
                reflectiveCurveToRelative(1.604f, -0.221f, 2.305f, -0.663f)
                close()
                moveTo(3.0f, 15.102f)
                lineToRelative(3.0f, 1.896f)
                verticalLineToRelative(5.002f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(9.169f)
                lineToRelative(-6.169f, 3.898f)
                verticalLineToRelative(2.204f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.103f)
                lineToRelative(-6.169f, -3.897f)
                horizontalLineToRelative(9.169f)
                close()
            }
        }
        .build()
        return _lesson!!
    }

private var _lesson: ImageVector? = null
