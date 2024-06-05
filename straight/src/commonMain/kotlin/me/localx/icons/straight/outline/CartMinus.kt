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

public val Icons.Outline.CartMinus: ImageVector
    get() {
        if (_cartMinus != null) {
            return _cartMinus!!
        }
        _cartMinus = Builder(name = "CartMinus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(20.17f, 13.0f)
                lineTo(5.42f, 13.0f)
                lineToRelative(-0.94f, -8.0f)
                lineTo(14.0f, 5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(4.24f, 3.0f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 2.0f)
                lineTo(1.22f, 2.0f)
                curveToRelative(0.51f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.58f, 13.47f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(13.22f)
                verticalLineToRelative(-2.0f)
                lineTo(6.78f, 17.0f)
                curveToRelative(-0.51f, 0.0f, -0.93f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.13f, -1.12f)
                lineTo(21.83f, 15.0f)
                lineToRelative(1.27f, -7.0f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.91f, 5.0f)
                close()
            }
        }
        .build()
        return _cartMinus!!
    }

private var _cartMinus: ImageVector? = null
