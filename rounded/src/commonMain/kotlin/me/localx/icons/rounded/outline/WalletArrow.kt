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

public val Icons.Outline.WalletArrow: ImageVector
    get() {
        if (_walletArrow != null) {
            return _walletArrow!!
        }
        _walletArrow = Builder(name = "WalletArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 16.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 8.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                reflectiveCurveToRelative(0.0f, -0.004f, 0.0f, -0.005f)
                curveToRelative(0.854f, 0.64f, 1.903f, 1.005f, 2.999f, 1.005f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 8.0f)
                curveToRelative(-0.856f, 0.0f, -1.653f, -0.381f, -2.217f, -1.004f)
                curveToRelative(0.549f, -0.607f, 1.335f, -0.996f, 2.217f, -0.996f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.0f, 0.0f, -5.0f, 2.5f, -5.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.703f, 4.211f)
                lineToRelative(1.297f, -1.281f)
                verticalLineToRelative(6.07f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(20.0f, 2.948f)
                lineToRelative(1.303f, 1.268f)
                curveToRelative(0.194f, 0.189f, 0.445f, 0.284f, 0.697f, 0.284f)
                curveToRelative(0.261f, 0.0f, 0.521f, -0.101f, 0.717f, -0.302f)
                curveToRelative(0.385f, -0.396f, 0.377f, -1.029f, -0.02f, -1.414f)
                lineToRelative(-2.227f, -2.168f)
                curveToRelative(-0.821f, -0.819f, -2.152f, -0.818f, -2.97f, -0.004f)
                lineToRelative(-2.204f, 2.177f)
                curveToRelative(-0.393f, 0.388f, -0.396f, 1.021f, -0.009f, 1.414f)
                curveToRelative(0.39f, 0.394f, 1.021f, 0.396f, 1.415f, 0.009f)
                close()
            }
        }
        .build()
        return _walletArrow!!
    }

private var _walletArrow: ImageVector? = null
