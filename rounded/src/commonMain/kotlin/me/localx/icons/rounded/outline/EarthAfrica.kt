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

public val Icons.Outline.EarthAfrica: ImageVector
    get() {
        if (_earthAfrica != null) {
            return _earthAfrica!!
        }
        _earthAfrica = Builder(name = "EarthAfrica", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -3.474f, 1.781f, -6.539f, 4.477f, -8.332f)
                lineToRelative(1.247f, 1.091f)
                curveToRelative(0.175f, 0.153f, 0.276f, 0.375f, 0.276f, 0.608f)
                verticalLineToRelative(0.826f)
                curveToRelative(0.0f, 0.446f, 0.362f, 0.808f, 0.808f, 0.808f)
                horizontalLineToRelative(0.726f)
                curveToRelative(0.305f, 0.0f, 0.605f, -0.083f, 0.867f, -0.24f)
                lineToRelative(1.546f, -0.928f)
                curveToRelative(0.325f, -0.195f, 0.742f, -0.144f, 1.01f, 0.124f)
                lineToRelative(0.801f, 0.801f)
                curveToRelative(0.155f, 0.155f, 0.242f, 0.365f, 0.242f, 0.585f)
                verticalLineToRelative(0.831f)
                curveToRelative(0.0f, 0.457f, -0.37f, 0.827f, -0.827f, 0.827f)
                horizontalLineToRelative(-2.633f)
                curveToRelative(-0.352f, 0.0f, -0.697f, 0.104f, -0.99f, 0.3f)
                lineToRelative(-1.756f, 1.17f)
                curveToRelative(-0.497f, 0.331f, -0.795f, 0.888f, -0.795f, 1.485f)
                verticalLineToRelative(1.045f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.427f)
                curveToRelative(0.337f, 0.0f, 0.63f, 0.229f, 0.712f, 0.556f)
                lineToRelative(0.693f, 2.774f)
                curveToRelative(0.099f, 0.394f, 0.453f, 0.671f, 0.859f, 0.671f)
                horizontalLineToRelative(0.807f)
                curveToRelative(0.311f, 0.0f, 0.599f, -0.163f, 0.759f, -0.43f)
                lineToRelative(2.495f, -4.159f)
                curveToRelative(0.161f, -0.269f, 0.247f, -0.577f, 0.247f, -0.891f)
                verticalLineToRelative(-1.303f)
                curveToRelative(0.0f, -0.459f, -0.182f, -0.9f, -0.507f, -1.224f)
                lineToRelative(-0.993f, -0.993f)
                horizontalLineToRelative(2.257f)
                curveToRelative(0.796f, 0.0f, 1.559f, -0.316f, 2.121f, -0.879f)
                lineToRelative(1.235f, -1.235f)
                curveToRelative(0.569f, 1.255f, 0.886f, 2.648f, 0.886f, 4.114f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _earthAfrica!!
    }

private var _earthAfrica: ImageVector? = null
