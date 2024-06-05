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

public val Icons.Bold.WalletBuyer: ImageVector
    get() {
        if (_walletBuyer != null) {
            return _walletBuyer!!
        }
        _walletBuyer = Builder(name = "WalletBuyer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.0f)
                curveToRelative(0.0f, -2.045f, -1.237f, -3.803f, -3.0f, -4.576f)
                verticalLineToRelative(-2.387f)
                lineToRelative(-17.003f, -0.037f)
                curveToRelative(-0.346f, 0.0f, -0.676f, -0.058f, -0.997f, -0.141f)
                verticalLineToRelative(10.141f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.026f)
                curveToRelative(-0.635f, 0.838f, -1.026f, 1.87f, -1.026f, 3.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 1.778f, 1.781f, 0.021f, 4.056f, 0.0f)
                horizontalLineToRelative(19.944f)
                verticalLineToRelative(3.0f)
                lineTo(4.069f, 3.0f)
                curveToRelative(-0.604f, 0.005f, -1.069f, 0.436f, -1.069f, 1.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineToRelative(20.003f, 0.043f)
                lineToRelative(-0.003f, 9.957f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 15.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _walletBuyer!!
    }

private var _walletBuyer: ImageVector? = null
