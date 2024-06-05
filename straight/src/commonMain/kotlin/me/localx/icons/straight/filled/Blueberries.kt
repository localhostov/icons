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

public val Icons.Filled.Blueberries: ImageVector
    get() {
        if (_blueberries != null) {
            return _blueberries!!
        }
        _blueberries = Builder(name = "Blueberries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 7.0f)
                curveTo(3.813f, 7.0f, 0.0f, 10.813f, 0.0f, 15.5f)
                reflectiveCurveToRelative(3.813f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.813f, 8.5f, -8.5f)
                reflectiveCurveToRelative(-3.813f, -8.5f, -8.5f, -8.5f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 3.454f, -2.074f, 6.427f, -5.038f, 7.756f)
                curveToRelative(0.018f, -0.251f, 0.038f, -0.501f, 0.038f, -0.756f)
                curveToRelative(0.0f, -2.455f, -0.853f, -4.71f, -2.27f, -6.5f)
                horizontalLineToRelative(1.27f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.573f)
                curveToRelative(-1.602f, -0.991f, -3.482f, -1.573f, -5.5f, -1.573f)
                curveToRelative(-0.255f, 0.0f, -0.505f, 0.02f, -0.756f, 0.038f)
                curveTo(9.073f, 2.074f, 12.046f, 0.0f, 15.5f, 0.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
            }
        }
        .build()
        return _blueberries!!
    }

private var _blueberries: ImageVector? = null
