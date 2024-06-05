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

public val Icons.Bold.WalletArrow: ImageVector
    get() {
        if (_walletArrow != null) {
            return _walletArrow!!
        }
        _walletArrow = Builder(name = "WalletArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 14.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.979f)
                horizontalLineToRelative(2.484f)
                lineToRelative(-3.157f, -3.65f)
                curveToRelative(-0.443f, -0.494f, -1.217f, -0.494f, -1.66f, 0.0f)
                lineToRelative(-3.183f, 3.65f)
                horizontalLineToRelative(2.516f)
                verticalLineToRelative(5.979f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(14.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-10.142f)
                curveToRelative(0.322f, 0.084f, 0.653f, 0.142f, 1.0f, 0.142f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.977f)
                lineToRelative(2.616f, -3.0f)
                lineTo(4.0f, 2.0f)
                curveTo(1.794f, 2.0f, 0.0f, 3.794f, 0.0f, 6.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(24.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _walletArrow!!
    }

private var _walletArrow: ImageVector? = null
