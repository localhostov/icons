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
                moveTo(20.941f, 8.0f)
                curveTo(20.441f, 3.507f, 16.624f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.559f, 3.507f, 3.059f, 8.0f)
                lineTo(-0.02f, 8.0f)
                lineToRelative(1.917f, 13.424f)
                curveToRelative(0.21f, 1.468f, 1.487f, 2.576f, 2.97f, 2.576f)
                horizontalLineToRelative(14.266f)
                curveToRelative(1.483f, 0.0f, 2.76f, -1.107f, 2.97f, -2.576f)
                lineToRelative(1.917f, -13.424f)
                horizontalLineToRelative(-3.079f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.519f, 0.0f, 6.432f, 2.613f, 6.92f, 6.0f)
                lineTo(5.08f, 8.0f)
                curveToRelative(0.488f, -3.387f, 3.401f, -6.0f, 6.92f, -6.0f)
                close()
                moveTo(20.123f, 21.141f)
                curveToRelative(-0.07f, 0.49f, -0.496f, 0.859f, -0.99f, 0.859f)
                lineTo(4.867f, 22.0f)
                curveToRelative(-0.494f, 0.0f, -0.92f, -0.369f, -0.99f, -0.859f)
                lineToRelative(-1.591f, -11.141f)
                lineTo(21.714f, 10.0f)
                lineToRelative(-1.591f, 11.141f)
                close()
                moveTo(16.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _basketShoppingMinus!!
    }

private var _basketShoppingMinus: ImageVector? = null
