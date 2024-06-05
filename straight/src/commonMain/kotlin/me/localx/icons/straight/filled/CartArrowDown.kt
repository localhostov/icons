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

public val Icons.Filled.CartArrowDown: ImageVector
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
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(23.99f, 3.0f)
                lineTo(15.0f, 3.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(1.68f, -1.68f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.68f, 2.68f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.69f, 1.69f)
                lineTo(13.0f, 3.0f)
                lineTo(5.24f, 3.0f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 2.0f)
                lineTo(2.22f, 2.0f)
                curveToRelative(0.51f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.58f, 13.47f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(12.22f)
                verticalLineToRelative(-2.0f)
                lineTo(7.78f, 17.0f)
                curveToRelative(-0.51f, 0.0f, -0.93f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.13f, -1.12f)
                horizontalLineToRelative(14.94f)
                lineToRelative(2.4f, -12.0f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
