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

public val Icons.Filled.CheckDouble: ImageVector
    get() {
        if (_checkDouble != null) {
            return _checkDouble!!
        }
        _checkDouble = Builder(name = "CheckDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.283f, 7.697f)
                curveToRelative(-0.385f, -0.396f, -0.375f, -1.029f, 0.021f, -1.414f)
                curveToRelative(0.396f, -0.385f, 1.03f, -0.376f, 1.414f, 0.021f)
                lineToRelative(4.089f, 4.211f)
                curveToRelative(0.307f, 0.31f, 0.727f, 0.485f, 1.173f, 0.486f)
                curveToRelative(0.445f, 0.0f, 0.867f, -0.173f, 1.182f, -0.488f)
                lineTo(18.29f, 1.296f)
                curveToRelative(0.388f, -0.394f, 1.021f, -0.396f, 1.414f, -0.007f)
                curveToRelative(0.393f, 0.389f, 0.396f, 1.022f, 0.007f, 1.414f)
                lineToRelative(-9.131f, 9.219f)
                curveToRelative(-0.696f, 0.696f, -1.624f, 1.078f, -2.604f, 1.078f)
                curveToRelative(-0.982f, -0.002f, -1.904f, -0.387f, -2.596f, -1.085f)
                lineTo(1.283f, 7.697f)
                close()
                moveTo(23.706f, 7.292f)
                curveToRelative(-0.391f, -0.391f, -1.025f, -0.389f, -1.414f, 0.002f)
                lineToRelative(-13.087f, 13.12f)
                curveToRelative(-0.378f, 0.378f, -0.884f, 0.586f, -1.418f, 0.586f)
                curveToRelative(-0.536f, 0.0f, -1.039f, -0.212f, -1.423f, -0.599f)
                lineTo(1.699f, 15.784f)
                curveToRelative(-0.394f, -0.388f, -1.026f, -0.386f, -1.415f, 0.008f)
                curveToRelative(-0.388f, 0.393f, -0.385f, 1.025f, 0.007f, 1.414f)
                lineToRelative(4.659f, 4.61f)
                curveToRelative(0.755f, 0.761f, 1.761f, 1.181f, 2.833f, 1.184f)
                curveToRelative(1.068f, 0.0f, 2.081f, -0.416f, 2.837f, -1.173f)
                lineToRelative(13.088f, -13.121f)
                curveToRelative(0.39f, -0.391f, 0.389f, -1.024f, -0.002f, -1.414f)
                close()
            }
        }
        .build()
        return _checkDouble!!
    }

private var _checkDouble: ImageVector? = null
