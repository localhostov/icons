package me.localx.icons.rounded.outline

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

public val Icons.Outline.BasketShoppingMinus: ImageVector
    get() {
        if (_basketShoppingMinus != null) {
            return _basketShoppingMinus!!
        }
        _basketShoppingMinus = Builder(name = "BasketShoppingMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.297f, 9.035f)
                curveToRelative(-0.57f, -0.658f, -1.396f, -1.035f, -2.267f, -1.035f)
                horizontalLineToRelative(-0.089f)
                curveTo(20.441f, 3.507f, 16.624f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.559f, 3.507f, 3.059f, 8.0f)
                horizontalLineToRelative(-0.059f)
                curveToRelative(-0.871f, 0.0f, -1.697f, 0.377f, -2.267f, 1.035f)
                curveTo(0.164f, 9.692f, -0.093f, 10.563f, 0.031f, 11.424f)
                lineToRelative(1.061f, 7.424f)
                curveToRelative(0.419f, 2.937f, 2.973f, 5.151f, 5.939f, 5.151f)
                horizontalLineToRelative(9.969f)
                curveToRelative(2.966f, 0.0f, 5.52f, -2.215f, 5.939f, -5.151f)
                lineToRelative(1.061f, -7.424f)
                curveToRelative(0.124f, -0.861f, -0.133f, -1.732f, -0.703f, -2.39f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.519f, 0.0f, 6.432f, 2.613f, 6.92f, 6.0f)
                lineTo(5.08f, 8.0f)
                curveToRelative(0.488f, -3.387f, 3.401f, -6.0f, 6.92f, -6.0f)
                close()
                moveTo(20.96f, 18.565f)
                curveToRelative(-0.28f, 1.958f, -1.982f, 3.435f, -3.96f, 3.435f)
                lineTo(7.031f, 22.0f)
                curveToRelative(-1.978f, 0.0f, -3.68f, -1.477f, -3.96f, -3.435f)
                lineToRelative(-1.061f, -7.424f)
                curveToRelative(-0.042f, -0.291f, 0.042f, -0.574f, 0.234f, -0.796f)
                curveToRelative(0.193f, -0.223f, 0.461f, -0.345f, 0.756f, -0.345f)
                lineTo(21.03f, 10.0f)
                curveToRelative(0.294f, 0.0f, 0.563f, 0.123f, 0.756f, 0.345f)
                curveToRelative(0.193f, 0.222f, 0.276f, 0.505f, 0.234f, 0.796f)
                lineToRelative(-1.061f, 7.424f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _basketShoppingMinus!!
    }

private var _basketShoppingMinus: ImageVector? = null
