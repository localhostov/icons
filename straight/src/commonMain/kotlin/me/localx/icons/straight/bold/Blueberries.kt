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

public val Icons.Bold.Blueberries: ImageVector
    get() {
        if (_blueberries != null) {
            return _blueberries!!
        }
        _blueberries = Builder(name = "Blueberries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 12.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(16.886f, 16.886f)
                curveToRelative(-0.664f, 4.03f, -4.171f, 7.114f, -8.386f, 7.114f)
                curveTo(3.813f, 24.0f, 0.0f, 20.187f, 0.0f, 15.5f)
                curveToRelative(0.0f, -4.215f, 3.084f, -7.722f, 7.114f, -8.386f)
                curveTo(7.778f, 3.084f, 11.285f, 0.0f, 15.5f, 0.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                curveToRelative(0.0f, 4.215f, -3.084f, 7.722f, -7.114f, 8.386f)
                close()
                moveTo(14.0f, 15.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-2.572f, 0.0f, -4.737f, 1.775f, -5.336f, 4.164f)
                curveToRelative(3.354f, 0.669f, 6.003f, 3.317f, 6.672f, 6.672f)
                curveToRelative(2.389f, -0.598f, 4.164f, -2.763f, 4.164f, -5.336f)
                close()
                moveTo(16.5f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _blueberries!!
    }

private var _blueberries: ImageVector? = null
