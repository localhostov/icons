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

public val Icons.Bold.StationaryBike: ImageVector
    get() {
        if (_stationaryBike != null) {
            return _stationaryBike!!
        }
        _stationaryBike = Builder(name = "StationaryBike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.125f, 12.377f)
                curveToRelative(-0.413f, -0.138f, -0.805f, -0.27f, -1.183f, -0.399f)
                curveToRelative(1.023f, -3.076f, 1.57f, -5.556f, 1.833f, -6.978f)
                horizontalLineToRelative(2.929f)
                lineToRelative(1.297f, -5.0f)
                horizontalLineToRelative(-3.119f)
                lineToRelative(-0.584f, 2.0f)
                horizontalLineToRelative(-1.797f)
                reflectiveCurveToRelative(-1.322f, 0.0f, -1.322f, 0.0f)
                lineToRelative(-0.166f, 1.312f)
                curveToRelative(-0.004f, 0.035f, -0.421f, 3.203f, -1.903f, 7.678f)
                curveToRelative(-0.109f, -0.039f, -0.226f, -0.08f, -0.331f, -0.117f)
                curveToRelative(-3.407f, -1.208f, -5.284f, -1.873f, -7.777f, -1.873f)
                curveToRelative(-0.347f, 0.0f, -0.686f, 0.034f, -1.02f, 0.083f)
                lineToRelative(-0.949f, -3.083f)
                horizontalLineToRelative(1.969f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.892f)
                lineToRelative(1.276f, 4.149f)
                curveToRelative(-1.906f, 1.252f, -3.169f, 3.406f, -3.169f, 5.851f)
                curveToRelative(0.0f, 2.785f, 1.639f, 5.188f, 4.0f, 6.315f)
                verticalLineToRelative(1.685f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.194f)
                curveToRelative(2.294f, -0.602f, 4.0f, -2.675f, 4.0f, -5.156f)
                curveToRelative(0.0f, -2.93f, -2.423f, -4.295f, -4.875f, -5.273f)
                close()
                moveTo(18.65f, 20.0f)
                lineTo(7.0f, 20.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(1.977f, 0.0f, 3.48f, 0.533f, 6.775f, 1.7f)
                curveToRelative(1.214f, 0.431f, 2.646f, 0.938f, 4.318f, 1.492f)
                curveToRelative(2.907f, 1.164f, 2.907f, 1.974f, 2.907f, 2.458f)
                curveToRelative(0.0f, 1.296f, -1.054f, 2.35f, -2.35f, 2.35f)
                close()
                moveTo(8.723f, 15.0f)
                horizontalLineToRelative(2.277f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.738f, 0.0f, 1.376f, 0.405f, 1.723f, 1.0f)
                close()
            }
        }
        .build()
        return _stationaryBike!!
    }

private var _stationaryBike: ImageVector? = null
