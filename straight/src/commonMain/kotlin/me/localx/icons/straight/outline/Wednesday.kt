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

public val Icons.Outline.Wednesday: ImageVector
    get() {
        if (_wednesday != null) {
            return _wednesday!!
        }
        _wednesday = Builder(name = "Wednesday", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.7f, 16.0f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.269f, 0.0f, 2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(22.4f, 21.7f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0.0f, -0.7f, 0.0f)
                verticalLineToRelative(-4.802f)
                reflectiveCurveToRelative(0.314f, 0.0f, 0.7f, 0.0f)
                reflectiveCurveToRelative(0.7f, 0.314f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.551f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(12.396f, 16.0f)
                horizontalLineToRelative(1.604f)
                lineToRelative(-0.508f, 7.0f)
                curveToRelative(-0.043f, 0.705f, -0.472f, 1.0f, -0.988f, 1.0f)
                curveToRelative(-0.342f, 0.0f, -0.66f, -0.242f, -0.841f, -0.64f)
                lineToRelative(-1.164f, -2.56f)
                lineToRelative(-1.164f, 2.56f)
                curveToRelative(-0.181f, 0.398f, -0.499f, 0.64f, -0.841f, 0.64f)
                curveToRelative(-0.516f, 0.0f, -0.945f, -0.295f, -0.988f, -1.0f)
                lineToRelative(-0.508f, -7.0f)
                horizontalLineToRelative(1.604f)
                lineToRelative(0.319f, 4.402f)
                lineToRelative(1.577f, -3.468f)
                lineToRelative(1.577f, 3.469f)
                lineToRelative(0.319f, -4.402f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(5.678f)
                curveToRelative(-0.091f, -0.273f, -0.148f, -0.567f, -0.167f, -0.878f)
                lineToRelative(-0.081f, -1.122f)
                horizontalLineToRelative(-3.43f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 8.0f)
                close()
            }
        }
        .build()
        return _wednesday!!
    }

private var _wednesday: ImageVector? = null
