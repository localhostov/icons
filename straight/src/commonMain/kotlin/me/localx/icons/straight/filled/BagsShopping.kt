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

public val Icons.Filled.BagsShopping: ImageVector
    get() {
        if (_bagsShopping != null) {
            return _bagsShopping!!
        }
        _bagsShopping = Builder(name = "BagsShopping", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(24.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(15.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(5.0f, 2.019f, 5.0f, 4.5f)
                verticalLineToRelative(0.5f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(7.0f, 4.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _bagsShopping!!
    }

private var _bagsShopping: ImageVector? = null
