package me.localx.icons.rounded.bold

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

public val Icons.Bold.CartMinus: ImageVector
    get() {
        if (_cartMinus != null) {
            return _cartMinus!!
        }
        _cartMinus = Builder(name = "CartMinus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.95f, 9.89f)
                lineToRelative(-1.08f, 4.04f)
                curveToRelative(-0.64f, 2.4f, -2.83f, 4.08f, -5.31f, 4.08f)
                lineTo(7.25f, 18.01f)
                curveToRelative(-1.75f, 0.0f, -3.24f, -1.31f, -3.47f, -3.04f)
                lineTo(2.24f, 3.43f)
                curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
                horizontalLineToRelative(-0.25f)
                curveTo(0.67f, 3.0f, 0.0f, 2.33f, 0.0f, 1.5f)
                reflectiveCurveTo(0.67f, 0.0f, 1.5f, 0.0f)
                horizontalLineToRelative(0.25f)
                curveTo(3.5f, 0.0f, 4.99f, 1.31f, 5.22f, 3.04f)
                lineToRelative(0.26f, 1.96f)
                horizontalLineToRelative(6.02f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.88f, 8.0f)
                lineToRelative(0.88f, 6.57f)
                curveToRelative(0.03f, 0.25f, 0.25f, 0.43f, 0.5f, 0.43f)
                horizontalLineToRelative(10.3f)
                curveToRelative(1.13f, 0.0f, 2.12f, -0.76f, 2.41f, -1.85f)
                lineToRelative(1.08f, -4.04f)
                curveToRelative(0.21f, -0.8f, 1.04f, -1.28f, 1.84f, -1.06f)
                curveToRelative(0.8f, 0.21f, 1.27f, 1.04f, 1.06f, 1.84f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.5f, 6.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cartMinus!!
    }

private var _cartMinus: ImageVector? = null
