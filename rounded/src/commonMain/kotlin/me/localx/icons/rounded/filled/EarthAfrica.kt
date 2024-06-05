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

public val Icons.Filled.EarthAfrica: ImageVector
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
                moveTo(19.879f, 9.121f)
                curveToRelative(-0.563f, 0.563f, -1.326f, 0.879f, -2.121f, 0.879f)
                horizontalLineToRelative(-2.257f)
                lineToRelative(0.993f, 0.993f)
                curveToRelative(0.325f, 0.325f, 0.507f, 0.765f, 0.507f, 1.224f)
                verticalLineToRelative(1.303f)
                curveToRelative(0.0f, 0.314f, -0.085f, 0.622f, -0.247f, 0.891f)
                lineToRelative(-2.495f, 4.159f)
                curveToRelative(-0.16f, 0.267f, -0.448f, 0.43f, -0.759f, 0.43f)
                horizontalLineToRelative(-0.807f)
                curveToRelative(-0.406f, 0.0f, -0.76f, -0.276f, -0.859f, -0.671f)
                lineToRelative(-0.693f, -2.774f)
                curveToRelative(-0.082f, -0.327f, -0.375f, -0.556f, -0.712f, -0.556f)
                horizontalLineToRelative(-1.427f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.045f)
                curveToRelative(0.0f, -0.597f, 0.298f, -1.154f, 0.795f, -1.485f)
                lineToRelative(1.756f, -1.17f)
                curveToRelative(0.293f, -0.195f, 0.638f, -0.3f, 0.99f, -0.3f)
                horizontalLineToRelative(2.633f)
                curveToRelative(0.457f, 0.0f, 0.827f, -0.37f, 0.827f, -0.827f)
                verticalLineToRelative(-0.831f)
                curveToRelative(0.0f, -0.219f, -0.087f, -0.43f, -0.242f, -0.585f)
                lineToRelative(-0.801f, -0.801f)
                curveToRelative(-0.268f, -0.268f, -0.685f, -0.32f, -1.01f, -0.124f)
                lineToRelative(-1.546f, 0.928f)
                curveToRelative(-0.262f, 0.157f, -0.561f, 0.24f, -0.867f, 0.24f)
                horizontalLineToRelative(-0.726f)
                curveToRelative(-0.446f, 0.0f, -0.808f, -0.362f, -0.808f, -0.808f)
                verticalLineToRelative(-0.826f)
                curveToRelative(0.0f, -0.233f, -0.101f, -0.454f, -0.276f, -0.608f)
                lineToRelative(-1.245f, -1.089f)
                curveToRelative(1.583f, -1.053f, 3.481f, -1.67f, 5.52f, -1.67f)
                curveToRelative(4.049f, 0.0f, 7.536f, 2.424f, 9.107f, 5.893f)
                lineToRelative(-1.229f, 1.229f)
                close()
            }
        }
        .build()
        return _earthAfrica!!
    }

private var _earthAfrica: ImageVector? = null
