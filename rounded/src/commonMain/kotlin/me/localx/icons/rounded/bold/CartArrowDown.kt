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

public val Icons.Bold.CartArrowDown: ImageVector
    get() {
        if (_cartArrowDown != null) {
            return _cartArrowDown!!
        }
        _cartArrowDown = Builder(name = "CartArrowDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(12.83f, 12.87f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(3.16f, -3.16f)
                curveToRelative(0.63f, -0.63f, 0.18f, -1.71f, -0.71f, -1.71f)
                horizontalLineToRelative(-1.67f)
                curveToRelative(0.0f, -1.7f, -0.02f, -5.19f, -0.02f, -6.51f)
                curveToRelative(0.0f, -0.83f, -0.68f, -1.49f, -1.51f, -1.49f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.49f, 1.5f)
                curveToRelative(0.0f, 1.32f, 0.02f, 4.8f, 0.02f, 6.5f)
                horizontalLineToRelative(-1.65f)
                curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f)
                lineToRelative(3.16f, 3.16f)
                close()
                moveTo(23.32f, 6.34f)
                curveToRelative(-0.67f, -0.86f, -1.67f, -1.35f, -2.76f, -1.35f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.21f, 0.0f, 0.34f, 0.12f, 0.39f, 0.19f)
                curveToRelative(0.06f, 0.07f, 0.14f, 0.22f, 0.09f, 0.43f)
                lineToRelative(-1.12f, 4.49f)
                curveToRelative(-0.28f, 1.11f, -1.28f, 1.89f, -2.43f, 1.89f)
                lineTo(7.25f, 14.99f)
                curveToRelative(-0.25f, 0.0f, -0.46f, -0.19f, -0.5f, -0.43f)
                lineToRelative(-0.88f, -6.57f)
                horizontalLineToRelative(0.62f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(-0.26f, -1.96f)
                curveToRelative(-0.23f, -1.73f, -1.72f, -3.04f, -3.47f, -3.04f)
                horizontalLineToRelative(-0.25f)
                curveTo(0.67f, 0.0f, 0.0f, 0.67f, 0.0f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.25f, 0.0f, 0.46f, 0.19f, 0.5f, 0.43f)
                lineToRelative(1.54f, 11.53f)
                curveToRelative(0.23f, 1.73f, 1.72f, 3.04f, 3.47f, 3.04f)
                horizontalLineToRelative(10.25f)
                curveToRelative(2.53f, 0.0f, 4.72f, -1.71f, 5.34f, -4.17f)
                lineToRelative(1.12f, -4.49f)
                curveToRelative(0.26f, -1.05f, 0.03f, -2.15f, -0.64f, -3.0f)
                close()
                moveTo(17.0f, 19.99f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
