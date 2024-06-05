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

public val Icons.Filled.MoneyBillTransfer: ImageVector
    get() {
        if (_moneyBillTransfer != null) {
            return _moneyBillTransfer!!
        }
        _moneyBillTransfer = Builder(name = "MoneyBillTransfer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 8.605f)
                verticalLineToRelative(11.395f)
                lineTo(3.052f, 20.0f)
                lineToRelative(1.571f, 1.571f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.659f, -2.659f)
                curveToRelative(-0.731f, -0.731f, -0.731f, -1.92f, 0.0f, -2.651f)
                lineToRelative(2.659f, -2.659f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.571f, 1.571f)
                horizontalLineToRelative(2.829f)
                lineToRelative(1.571f, -1.571f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(-3.208f, 3.209f)
                lineTo(0.001f, 7.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(17.948f)
                lineToRelative(-1.571f, -1.571f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.659f, 2.659f)
                curveToRelative(0.731f, 0.731f, 0.731f, 1.92f, 0.0f, 2.651f)
                lineToRelative(-2.659f, 2.659f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.571f, -1.571f)
                horizontalLineToRelative(-2.829f)
                lineToRelative(-1.571f, 1.571f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(3.208f, -3.209f)
                close()
                moveTo(17.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(7.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _moneyBillTransfer!!
    }

private var _moneyBillTransfer: ImageVector? = null
