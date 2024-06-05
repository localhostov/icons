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
                moveToRelative(24.0f, 8.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(4.0f, 8.0f)
                curveToRelative(-0.347f, 0.0f, -0.678f, -0.058f, -1.0f, -0.142f)
                verticalLineToRelative(10.142f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 1.778f, 1.781f, 0.021f, 4.056f, 0.0f)
                horizontalLineToRelative(18.444f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(4.069f, 3.0f)
                curveToRelative(-0.604f, 0.005f, -1.069f, 0.436f, -1.069f, 1.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(22.0f, 15.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(-2.28f, 0.0f, -4.218f, 1.403f, -4.927f, 3.358f)
                curveToRelative(-0.29f, 0.801f, 0.316f, 1.642f, 1.2f, 1.642f)
                horizontalLineToRelative(7.453f)
                curveToRelative(0.884f, 0.0f, 1.49f, -0.841f, 1.2f, -1.642f)
                curveToRelative(-0.708f, -1.955f, -2.647f, -3.358f, -4.927f, -3.358f)
                close()
            }
        }
        .build()
        return _walletBuyer!!
    }

private var _walletBuyer: ImageVector? = null
