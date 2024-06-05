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

public val Icons.Filled.WalletArrow: ImageVector
    get() {
        if (_walletArrow != null) {
            return _walletArrow!!
        }
        _walletArrow = Builder(name = "WalletArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 6.5f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.24f, -1.416f, 1.466f, -2.5f, 2.949f, -2.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(22.961f, 3.106f)
                lineToRelative(-2.49f, -2.491f)
                curveToRelative(-0.821f, -0.819f, -2.154f, -0.818f, -2.974f, 0.0f)
                lineToRelative(-2.448f, 2.449f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.537f, -1.537f)
                verticalLineToRelative(7.058f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 2.973f)
                lineToRelative(1.547f, 1.547f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _walletArrow!!
    }

private var _walletArrow: ImageVector? = null
