package me.localx.icons.rounded.outline

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
                moveTo(20.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(8.0f, 15.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(6.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
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
