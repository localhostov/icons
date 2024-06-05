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

public val Icons.Outline.MoneyBillTransfer: ImageVector
    get() {
        if (_moneyBillTransfer != null) {
            return _moneyBillTransfer!!
        }
        _moneyBillTransfer = Builder(name = "MoneyBillTransfer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.5f, 13.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(2.0f, 13.395f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(17.948f)
                lineToRelative(-1.571f, -1.571f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.659f, 2.659f)
                curveToRelative(0.731f, 0.731f, 0.731f, 1.92f, 0.0f, 2.651f)
                lineToRelative(-2.659f, 2.659f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.571f, -1.571f)
                lineTo(3.0f, 5.999f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(6.395f)
                close()
                moveTo(24.0f, 8.604f)
                verticalLineToRelative(11.395f)
                lineTo(3.052f, 19.999f)
                lineToRelative(1.571f, 1.571f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.659f, -2.659f)
                curveToRelative(-0.731f, -0.731f, -0.731f, -1.92f, 0.0f, -2.651f)
                lineToRelative(2.659f, -2.659f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.571f, 1.571f)
                horizontalLineToRelative(18.948f)
                verticalLineToRelative(-7.395f)
                lineToRelative(2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _moneyBillTransfer!!
    }

private var _moneyBillTransfer: ImageVector? = null
