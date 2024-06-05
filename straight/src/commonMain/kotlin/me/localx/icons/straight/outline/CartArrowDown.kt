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

public val Icons.Outline.CartArrowDown: ImageVector
    get() {
        if (_cartArrowDown != null) {
            return _cartArrowDown!!
        }
        _cartArrowDown = Builder(name = "CartArrowDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.59f, 15.0f)
                lineTo(6.65f, 15.0f)
                lineToRelative(0.13f, 1.12f)
                curveToRelative(0.06f, 0.5f, 0.49f, 0.88f, 0.99f, 0.88f)
                horizontalLineToRelative(12.22f)
                verticalLineToRelative(2.0f)
                lineTo(7.78f, 19.0f)
                curveToRelative(-1.52f, 0.0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineTo(3.21f, 2.88f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 0.0f)
                lineTo(2.22f, 0.0f)
                curveToRelative(1.52f, 0.0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                horizontalLineToRelative(4.76f)
                verticalLineToRelative(2.0f)
                lineTo(5.48f, 5.0f)
                lineToRelative(0.94f, 8.0f)
                horizontalLineToRelative(13.54f)
                lineToRelative(1.6f, -8.0f)
                horizontalLineToRelative(-5.55f)
                lineTo(16.01f, 3.0f)
                horizontalLineToRelative(7.99f)
                lineToRelative(-2.4f, 12.0f)
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
                moveTo(8.89f, 7.72f)
                lineToRelative(2.69f, 2.69f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(2.68f, -2.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.68f, 1.68f)
                lineTo(13.99f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.99f, 8.0f)
                lineToRelative(-1.69f, -1.69f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
