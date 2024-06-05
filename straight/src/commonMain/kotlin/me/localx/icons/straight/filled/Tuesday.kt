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

public val Icons.Filled.Tuesday: ImageVector
    get() {
        if (_tuesday != null) {
            return _tuesday!!
        }
        _tuesday = Builder(name = "Tuesday", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.757f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.751f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.649f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(20.5f, 24.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.551f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(17.739f, 21.73f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.314f, -0.7f, -0.7f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.73f)
                curveToRelative(0.0f, 1.269f, 1.031f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.73f)
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
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(8.406f)
                verticalLineToRelative(-4.4f)
                horizontalLineToRelative(-1.649f)
                verticalLineToRelative(-5.6f)
                horizontalLineToRelative(17.243f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _tuesday!!
    }

private var _tuesday: ImageVector? = null
