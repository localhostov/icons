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

public val Icons.Bold.InsertCreditCard: ImageVector
    get() {
        if (_insertCreditCard != null) {
            return _insertCreditCard!!
        }
        _insertCreditCard = Builder(name = "InsertCreditCard", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.927f, 3.682f)
                curveToRelative(-0.385f, -2.169f, -2.386f, -3.682f, -4.589f, -3.682f)
                lineTo(4.5f, 0.0f)
                curveTo(2.015f, 0.0f, 0.0f, 2.015f, 0.0f, 4.5f)
                curveToRelative(0.0f, 1.953f, 1.258f, 3.602f, 3.0f, 4.224f)
                verticalLineToRelative(9.776f)
                curveToRelative(0.0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.038f, 0.0f, 5.5f, -2.462f, 5.5f, -5.5f)
                lineTo(21.0f, 8.724f)
                curveToRelative(1.981f, -0.706f, 3.336f, -2.742f, 2.927f, -5.041f)
                close()
                moveTo(8.0f, 20.949f)
                curveToRelative(-1.14f, -0.232f, -2.0f, -1.242f, -2.0f, -2.449f)
                lineTo(6.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 20.949f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4.5f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(13.0f, 17.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _insertCreditCard!!
    }

private var _insertCreditCard: ImageVector? = null
