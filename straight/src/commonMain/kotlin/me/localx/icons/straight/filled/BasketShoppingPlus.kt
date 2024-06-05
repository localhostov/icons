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

public val Icons.Filled.BasketShoppingPlus: ImageVector
    get() {
        if (_basketShoppingPlus != null) {
            return _basketShoppingPlus!!
        }
        _basketShoppingPlus = Builder(name = "BasketShoppingPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.941f, 8.0f)
                curveTo(20.441f, 3.507f, 16.624f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.559f, 3.507f, 3.059f, 8.0f)
                lineTo(0.047f, 8.0f)
                lineToRelative(1.954f, 13.305f)
                curveToRelative(0.226f, 1.537f, 1.567f, 2.695f, 3.12f, 2.695f)
                horizontalLineToRelative(13.795f)
                curveToRelative(1.553f, 0.0f, 2.895f, -1.159f, 3.121f, -2.695f)
                lineToRelative(1.954f, -13.305f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(5.08f, 8.0f)
                curveToRelative(0.488f, -3.387f, 3.401f, -6.0f, 6.92f, -6.0f)
                reflectiveCurveToRelative(6.432f, 2.613f, 6.92f, 6.0f)
                lineTo(5.08f, 8.0f)
                close()
            }
        }
        .build()
        return _basketShoppingPlus!!
    }

private var _basketShoppingPlus: ImageVector? = null
