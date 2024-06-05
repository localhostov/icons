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

public val Icons.Bold.BagShoppingMinus: ImageVector
    get() {
        if (_bagShoppingMinus != null) {
            return _bagShoppingMinus!!
        }
        _bagShoppingMinus = Builder(name = "BagShoppingMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(6.0f, 2.691f, 6.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(13.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(3.0f)
                lineTo(15.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bagShoppingMinus!!
    }

private var _bagShoppingMinus: ImageVector? = null
