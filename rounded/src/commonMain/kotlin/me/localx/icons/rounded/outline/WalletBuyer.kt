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

public val Icons.Outline.WalletBuyer: ImageVector
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
                moveTo(21.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                curveToRelative(-0.856f, 0.0f, -1.653f, -0.381f, -2.216f, -1.004f)
                curveToRelative(0.549f, -0.607f, 1.335f, -0.996f, 2.216f, -0.996f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                reflectiveCurveToRelative(0.002f, -0.001f, 0.005f, -0.002f)
                curveToRelative(0.853f, 0.638f, 1.901f, 1.002f, 2.995f, 1.002f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(-2.333f, 0.0f, -4.375f, 1.538f, -4.966f, 3.741f)
                curveToRelative(-0.143f, 0.533f, 0.173f, 1.082f, 0.707f, 1.225f)
                curveToRelative(0.534f, 0.143f, 1.081f, -0.173f, 1.225f, -0.707f)
                curveToRelative(0.357f, -1.33f, 1.605f, -2.259f, 3.034f, -2.259f)
                reflectiveCurveToRelative(2.677f, 0.929f, 3.034f, 2.259f)
                curveToRelative(0.12f, 0.447f, 0.524f, 0.741f, 0.965f, 0.741f)
                curveToRelative(0.085f, 0.0f, 0.173f, -0.011f, 0.26f, -0.035f)
                curveToRelative(0.533f, -0.143f, 0.85f, -0.692f, 0.707f, -1.225f)
                curveToRelative(-0.591f, -2.203f, -2.633f, -3.741f, -4.966f, -3.741f)
                close()
            }
        }
        .build()
        return _walletBuyer!!
    }

private var _walletBuyer: ImageVector? = null
