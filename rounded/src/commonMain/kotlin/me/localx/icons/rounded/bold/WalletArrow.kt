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
                moveToRelative(19.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-9.105f)
                curveToRelative(0.758f, 0.386f, 1.607f, 0.605f, 2.5f, 0.605f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.801f, 0.0f, -1.527f, -0.378f, -1.992f, -0.995f)
                curveToRelative(0.457f, -0.607f, 1.176f, -1.005f, 1.992f, -1.005f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.0f)
                curveTo(2.462f, 2.0f, 0.0f, 4.462f, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.437f, 4.999f)
                horizontalLineToRelative(1.563f)
                verticalLineToRelative(2.501f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.501f)
                horizontalLineToRelative(1.563f)
                curveToRelative(0.863f, 0.0f, 1.295f, -1.043f, 0.685f, -1.653f)
                lineToRelative(-3.063f, -3.063f)
                curveToRelative(-0.378f, -0.378f, -0.991f, -0.378f, -1.369f, 0.0f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.61f, 0.61f, -0.178f, 1.653f, 0.685f, 1.653f)
                close()
            }
        }
        .build()
        return _walletArrow!!
    }

private var _walletArrow: ImageVector? = null
