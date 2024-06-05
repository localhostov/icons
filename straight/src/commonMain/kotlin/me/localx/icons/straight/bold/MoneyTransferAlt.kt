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

public val Icons.Bold.MoneyTransferAlt: ImageVector
    get() {
        if (_moneyTransferAlt != null) {
            return _moneyTransferAlt!!
        }
        _moneyTransferAlt = Builder(name = "MoneyTransferAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 7.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3.0f, 5.05f)
                curveToRelative(-1.69f, 0.25f, -3.0f, 1.69f, -3.0f, 3.45f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 5.05f)
                close()
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.979f, 15.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.979f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.979f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.65f, -3.157f)
                curveToRelative(0.494f, -0.443f, 0.494f, -1.217f, 0.0f, -1.66f)
                lineToRelative(-3.65f, -3.183f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(11.5f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(13.0f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _moneyTransferAlt!!
    }

private var _moneyTransferAlt: ImageVector? = null
