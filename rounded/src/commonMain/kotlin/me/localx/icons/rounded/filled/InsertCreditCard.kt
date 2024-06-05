package me.localx.icons.rounded.filled

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

public val Icons.Filled.InsertCreditCard: ImageVector
    get() {
        if (_insertCreditCard != null) {
            return _insertCreditCard!!
        }
        _insertCreditCard = Builder(name = "InsertCreditCard", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.84f, 0.0f)
                curveToRelative(-3.813f, 0.0f, -11.867f, 0.0f, -15.681f, 0.0f)
                curveTo(2.176f, 0.0f, 0.375f, 1.375f, 0.055f, 3.333f)
                curveToRelative(-0.287f, 1.75f, 0.579f, 3.314f, 1.945f, 4.111f)
                verticalLineToRelative(-3.444f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                lineTo(20.0f, 2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(3.444f)
                curveToRelative(1.366f, -0.797f, 2.232f, -2.361f, 1.945f, -4.111f)
                curveTo(23.625f, 1.375f, 21.824f, 0.0f, 19.84f, 0.0f)
                close()
                moveTo(15.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _insertCreditCard!!
    }

private var _insertCreditCard: ImageVector? = null
