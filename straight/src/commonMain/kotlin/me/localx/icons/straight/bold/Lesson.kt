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

public val Icons.Bold.Lesson: ImageVector
    get() {
        if (_lesson != null) {
            return _lesson!!
        }
        _lesson = Builder(name = "Lesson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.237f, 11.359f)
                lineToRelative(5.763f, 3.641f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.736f)
                lineToRelative(-3.763f, 2.378f)
                curveToRelative(-0.757f, 0.478f, -1.717f, 0.478f, -2.473f, 0.0f)
                lineToRelative(-5.763f, -3.641f)
                lineToRelative(5.763f, -3.641f)
                curveToRelative(0.757f, -0.478f, 1.717f, -0.478f, 2.473f, 0.0f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 20.995f)
                curveToRelative(-0.802f, 0.0f, -1.604f, -0.221f, -2.304f, -0.662f)
                lineToRelative(-1.696f, -1.072f)
                verticalLineToRelative(3.284f)
                reflectiveCurveToRelative(1.143f, 1.455f, 4.0f, 1.455f)
                reflectiveCurveToRelative(4.0f, -1.455f, 4.0f, -1.455f)
                verticalLineToRelative(-3.284f)
                lineToRelative(-1.695f, 1.071f)
                curveToRelative(-0.7f, 0.442f, -1.502f, 0.663f, -2.305f, 0.663f)
                close()
            }
        }
        .build()
        return _lesson!!
    }

private var _lesson: ImageVector? = null
