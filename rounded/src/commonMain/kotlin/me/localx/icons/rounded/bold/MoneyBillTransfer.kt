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
                moveToRelative(0.0f, 12.5f)
                verticalLineToRelative(-4.0f)
                curveTo(0.0f, 5.467f, 2.467f, 3.0f, 5.5f, 3.0f)
                horizontalLineToRelative(13.501f)
                verticalLineToRelative(-1.563f)
                curveToRelative(0.0f, -0.863f, 1.043f, -1.295f, 1.653f, -0.685f)
                lineToRelative(3.063f, 3.063f)
                curveToRelative(0.378f, 0.378f, 0.378f, 0.991f, 0.0f, 1.369f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.61f, 0.61f, -1.653f, 0.178f, -1.653f, -0.685f)
                verticalLineToRelative(-1.563f)
                lineTo(5.5f, 5.999f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 10.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(4.999f, 18.0f)
                verticalLineToRelative(-1.563f)
                curveToRelative(0.0f, -0.863f, -1.043f, -1.295f, -1.653f, -0.685f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.378f, 0.378f, -0.378f, 0.991f, 0.0f, 1.369f)
                lineToRelative(3.063f, 3.063f)
                curveToRelative(0.61f, 0.61f, 1.653f, 0.178f, 1.653f, -0.685f)
                verticalLineToRelative(-1.563f)
                horizontalLineToRelative(13.501f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                close()
                moveTo(5.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(16.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _moneyBillTransfer!!
    }

private var _moneyBillTransfer: ImageVector? = null
