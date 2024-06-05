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

public val Icons.Outline.Monday: ImageVector
    get() {
        if (_monday != null) {
            return _monday!!
        }
        _monday = Builder(name = "Monday", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.992f, 17.0f)
                lineToRelative(0.508f, 7.0f)
                horizontalLineToRelative(-1.604f)
                lineToRelative(-0.319f, -4.402f)
                lineToRelative(-1.577f, 3.469f)
                lineToRelative(-1.577f, -3.468f)
                lineToRelative(-0.319f, 4.402f)
                horizontalLineToRelative(-1.604f)
                lineToRelative(0.508f, -7.0f)
                curveToRelative(0.043f, -0.705f, 0.472f, -1.0f, 0.988f, -1.0f)
                curveToRelative(0.342f, 0.0f, 0.66f, 0.242f, 0.841f, 0.64f)
                lineToRelative(1.164f, 2.56f)
                lineToRelative(1.164f, -2.56f)
                curveToRelative(0.181f, -0.398f, 0.499f, -0.64f, 0.841f, -0.64f)
                curveToRelative(0.516f, 0.0f, 0.945f, 0.295f, 0.988f, 1.0f)
                close()
                moveTo(22.4f, 20.063f)
                lineToRelative(-1.8f, -4.054f)
                verticalLineToRelative(-0.009f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-4.054f)
                lineToRelative(1.8f, 4.054f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(4.063f)
                close()
                moveTo(18.0f, 18.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 1.269f, -1.031f, 2.3f, -2.3f, 2.3f)
                reflectiveCurveToRelative(-2.3f, -1.031f, -2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.269f, 1.031f, -2.3f, 2.3f, -2.3f)
                reflectiveCurveToRelative(2.3f, 1.031f, 2.3f, 2.3f)
                close()
                moveTo(16.4f, 18.3f)
                curveToRelative(0.0f, -0.386f, -0.314f, -0.7f, -0.7f, -0.7f)
                reflectiveCurveToRelative(-0.7f, 0.314f, -0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 0.386f, 0.314f, 0.7f, 0.7f, 0.7f)
                reflectiveCurveToRelative(0.7f, -0.314f, 0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(1.64f)
                lineToRelative(-0.145f, 2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _monday!!
    }

private var _monday: ImageVector? = null
