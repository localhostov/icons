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

public val Icons.Outline.MoneyBillsSimple: ImageVector
    get() {
        if (_moneyBillsSimple != null) {
            return _moneyBillsSimple!!
        }
        _moneyBillsSimple = Builder(name = "MoneyBillsSimple", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                lineTo(24.0f, 17.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                lineTo(22.0f, 15.0f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 10.0f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f)
                verticalLineToRelative(11.82f)
                close()
                moveTo(14.0f, 7.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _moneyBillsSimple!!
    }

private var _moneyBillsSimple: ImageVector? = null
