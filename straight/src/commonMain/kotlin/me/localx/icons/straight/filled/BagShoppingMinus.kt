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

public val Icons.Filled.BagShoppingMinus: ImageVector
    get() {
        if (_bagShoppingMinus != null) {
            return _bagShoppingMinus!!
        }
        _bagShoppingMinus = Builder(name = "BagShoppingMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, -3.314f, 2.686f, -6.0f, 6.0f, -6.0f)
                curveToRelative(1.476f, 0.0f, 2.9f, 0.544f, 4.0f, 1.528f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(6.0f, 2.686f, 6.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.683f)
                curveToRelative(-1.677f, -1.111f, -2.684f, -2.989f, -2.683f, -5.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(23.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bagShoppingMinus!!
    }

private var _bagShoppingMinus: ImageVector? = null
