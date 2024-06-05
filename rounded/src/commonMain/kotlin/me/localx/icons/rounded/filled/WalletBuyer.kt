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

public val Icons.Filled.WalletBuyer: ImageVector
    get() {
        if (_walletBuyer != null) {
            return _walletBuyer!!
        }
        _walletBuyer = Builder(name = "WalletBuyer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 18.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(23.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.311f, 0.0f, -0.604f, -0.145f, -0.793f, -0.392f)
                curveToRelative(-0.189f, -0.247f, -0.253f, -0.567f, -0.172f, -0.868f)
                curveToRelative(0.591f, -2.203f, 2.633f, -3.741f, 4.966f, -3.741f)
                reflectiveCurveToRelative(4.375f, 1.538f, 4.966f, 3.741f)
                curveToRelative(0.081f, 0.3f, 0.017f, 0.621f, -0.172f, 0.868f)
                curveToRelative(-0.189f, 0.247f, -0.482f, 0.392f, -0.793f, 0.392f)
                close()
                moveTo(24.0f, 15.5f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 4.0f)
                curveToRelative(-0.859f, 0.0f, -1.671f, -0.372f, -2.235f, -0.999f)
                curveToRelative(0.55f, -0.614f, 1.348f, -1.001f, 2.235f, -1.001f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, -0.0f)
                curveTo(3.178f, 0.0f, 1.58f, 0.98f, 0.706f, 2.44f)
                curveToRelative(-0.025f, 0.037f, -0.047f, 0.076f, -0.067f, 0.116f)
                curveToRelative(-0.407f, 0.723f, -0.639f, 1.557f, -0.639f, 2.444f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.162f)
                curveToRelative(0.567f, -0.795f, 1.297f, -1.453f, 2.133f, -1.955f)
                curveToRelative(-0.499f, -0.725f, -0.795f, -1.6f, -0.795f, -2.545f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                horizontalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _walletBuyer!!
    }

private var _walletBuyer: ImageVector? = null
