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

public val Icons.Outline.Blueberries: ImageVector
    get() {
        if (_blueberries != null) {
            return _blueberries!!
        }
        _blueberries = Builder(name = "Blueberries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
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
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 4.159f, -3.046f, 7.714f, -7.122f, 8.381f)
                curveToRelative(-0.663f, 4.031f, -4.162f, 7.119f, -8.378f, 7.119f)
                curveTo(3.813f, 24.0f, 0.0f, 20.187f, 0.0f, 15.5f)
                curveToRelative(0.0f, -4.213f, 3.084f, -7.71f, 7.112f, -8.376f)
                curveTo(7.774f, 3.069f, 11.312f, 0.0f, 15.5f, 0.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
                moveTo(15.0f, 15.5f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.916f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                close()
                moveTo(22.0f, 8.5f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-3.058f, 0.0f, -5.657f, 2.142f, -6.327f, 5.034f)
                curveToRelative(4.143f, 0.327f, 7.454f, 3.632f, 7.791f, 7.772f)
                curveToRelative(2.904f, -0.675f, 5.035f, -3.269f, 5.035f, -6.306f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _blueberries!!
    }

private var _blueberries: ImageVector? = null
