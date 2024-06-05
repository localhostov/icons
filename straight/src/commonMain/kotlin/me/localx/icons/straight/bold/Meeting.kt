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

public val Icons.Bold.Meeting: ImageVector
    get() {
        if (_meeting != null) {
            return _meeting!!
        }
        _meeting = Builder(name = "Meeting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(4.0f, 18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-3.934f)
                lineToRelative(-1.737f, 1.502f)
                curveToRelative(-0.374f, 0.332f, -0.848f, 0.499f, -1.324f, 0.499f)
                curveToRelative(-0.48f, 0.0f, -0.964f, -0.17f, -1.35f, -0.513f)
                lineToRelative(-1.689f, -1.489f)
                horizontalLineToRelative(-3.966f)
                lineTo(5.0f, 2.548f)
                curveToRelative(0.0f, -1.405f, 1.143f, -2.548f, 2.548f, -2.548f)
                horizontalLineToRelative(8.904f)
                curveToRelative(1.405f, 0.0f, 2.548f, 1.143f, 2.548f, 2.548f)
                verticalLineToRelative(8.452f)
                close()
                moveTo(16.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.099f)
                lineToRelative(1.907f, 1.68f)
                lineToRelative(1.943f, -1.68f)
                horizontalLineToRelative(2.051f)
                lineTo(16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _meeting!!
    }

private var _meeting: ImageVector? = null
