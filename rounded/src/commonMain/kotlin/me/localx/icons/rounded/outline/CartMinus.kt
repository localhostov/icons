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
                moveTo(23.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.2f, 8.02f)
                curveToRelative(-0.55f, -0.11f, -1.07f, 0.24f, -1.18f, 0.78f)
                lineToRelative(-0.36f, 1.78f)
                curveToRelative(-0.28f, 1.4f, -1.52f, 2.41f, -2.94f, 2.41f)
                lineTo(5.42f, 12.99f)
                lineToRelative(-0.94f, -8.0f)
                horizontalLineToRelative(7.52f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(4.24f, 2.99f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                horizontalLineToRelative(-0.22f)
                curveTo(0.45f, 0.0f, 0.0f, 0.45f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.22f)
                curveToRelative(0.51f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.38f, 11.7f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(10.44f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(8.56f, 17.0f)
                curveToRelative(-1.29f, 0.0f, -2.41f, -0.82f, -2.83f, -2.0f)
                horizontalLineToRelative(11.99f)
                curveToRelative(2.38f, 0.0f, 4.44f, -1.69f, 4.9f, -4.02f)
                lineToRelative(0.36f, -1.78f)
                curveToRelative(0.11f, -0.54f, -0.24f, -1.07f, -0.78f, -1.18f)
                close()
            }
        }
        .build()
        return _cartMinus!!
    }

private var _cartMinus: ImageVector? = null
