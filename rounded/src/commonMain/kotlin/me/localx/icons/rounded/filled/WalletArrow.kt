package me.localx.icons.rounded.filled

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
                moveToRelative(15.288f, 4.203f)
                curveToRelative(-0.388f, -0.393f, -0.384f, -1.026f, 0.009f, -1.414f)
                lineToRelative(2.204f, -2.177f)
                curveToRelative(0.817f, -0.814f, 2.148f, -0.815f, 2.97f, 0.004f)
                lineToRelative(2.227f, 2.168f)
                curveToRelative(0.396f, 0.385f, 0.404f, 1.018f, 0.02f, 1.414f)
                curveToRelative(-0.196f, 0.201f, -0.456f, 0.302f, -0.717f, 0.302f)
                curveToRelative(-0.252f, 0.0f, -0.503f, -0.094f, -0.697f, -0.284f)
                lineToRelative(-1.303f, -1.268f)
                verticalLineToRelative(6.052f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(18.001f, 2.93f)
                lineToRelative(-1.297f, 1.281f)
                curveToRelative(-0.394f, 0.388f, -1.025f, 0.385f, -1.415f, -0.009f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.887f, 0.232f, -1.721f, 0.639f, -2.444f)
                curveToRelative(0.02f, -0.04f, 0.042f, -0.079f, 0.067f, -0.116f)
                curveToRelative(0.874f, -1.46f, 2.472f, -2.44f, 4.294f, -2.44f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.887f, 0.0f, -1.686f, 0.387f, -2.235f, 1.001f)
                curveToRelative(0.563f, 0.627f, 1.376f, 0.999f, 2.235f, 0.999f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-0.816f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _walletArrow!!
    }

private var _walletArrow: ImageVector? = null
