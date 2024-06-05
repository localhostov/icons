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

public val Icons.Bold.MoneyBillTransfer: ImageVector
    get() {
        if (_moneyBillTransfer != null) {
            return _moneyBillTransfer!!
        }
        _moneyBillTransfer = Builder(name = "MoneyBillTransfer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(4.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-3.65f, 3.157f)
                curveToRelative(-0.494f, 0.443f, -0.494f, 1.217f, 0.0f, 1.66f)
                lineToRelative(3.65f, 3.183f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(20.0f)
                lineTo(24.0f, 7.666f)
                lineToRelative(-3.0f, 2.595f)
                verticalLineToRelative(7.738f)
                close()
                moveTo(3.0f, 6.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(16.479f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.65f, -3.157f)
                curveToRelative(0.494f, -0.443f, 0.494f, -1.217f, 0.0f, -1.66f)
                lineToRelative(-3.65f, -3.183f)
                verticalLineToRelative(2.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9.834f)
                lineToRelative(3.0f, -2.595f)
                verticalLineToRelative(-7.238f)
                close()
            }
        }
        .build()
        return _moneyBillTransfer!!
    }

private var _moneyBillTransfer: ImageVector? = null
