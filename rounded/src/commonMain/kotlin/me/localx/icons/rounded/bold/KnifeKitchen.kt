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

public val Icons.Bold.KnifeKitchen: ImageVector
    get() {
        if (_knifeKitchen != null) {
            return _knifeKitchen!!
        }
        _knifeKitchen = Builder(name = "KnifeKitchen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.828f, 7.823f)
                curveToRelative(0.756f, -0.755f, 1.172f, -1.76f, 1.172f, -2.829f)
                reflectiveCurveToRelative(-0.416f, -2.073f, -1.171f, -2.828f)
                curveToRelative(-1.511f, -1.512f, -4.147f, -1.511f, -5.656f, 0.0f)
                lineTo(1.538f, 17.785f)
                curveToRelative(-0.977f, 0.976f, -1.538f, 2.328f, -1.538f, 3.709f)
                curveToRelative(0.0f, 0.817f, 0.653f, 1.484f, 1.47f, 1.5f)
                curveToRelative(0.0f, 0.0f, 1.854f, 0.009f, 2.089f, 0.0f)
                curveToRelative(3.999f, -0.159f, 7.436f, -1.565f, 9.942f, -4.072f)
                lineToRelative(2.138f, -2.16f)
                reflectiveCurveToRelative(0.744f, 0.75f, 0.843f, 0.841f)
                curveToRelative(0.6f, 0.553f, 1.533f, 0.524f, 2.099f, -0.063f)
                curveToRelative(0.565f, -0.589f, 0.556f, -1.522f, -0.021f, -2.1f)
                lineToRelative(-0.193f, -0.193f)
                curveToRelative(-0.349f, -0.388f, -0.546f, -0.877f, -0.558f, -1.398f)
                curveToRelative(-0.014f, -0.591f, 0.211f, -1.152f, 0.633f, -1.58f)
                lineToRelative(4.385f, -4.446f)
                close()
                moveTo(11.375f, 16.805f)
                curveToRelative(-2.424f, 2.424f, -5.55f, 3.074f, -7.795f, 3.184f)
                curveToRelative(0.025f, -0.028f, 0.051f, -0.055f, 0.077f, -0.082f)
                lineToRelative(7.568f, -7.561f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(-2.143f, 2.166f)
                close()
                moveTo(16.307f, 10.162f)
                curveToRelative(-0.529f, 0.536f, -0.927f, 1.163f, -1.18f, 1.844f)
                lineToRelative(-1.779f, -1.78f)
                lineToRelative(5.945f, -5.939f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.3f, 0.714f)
                lineToRelative(-4.393f, 4.454f)
                close()
            }
        }
        .build()
        return _knifeKitchen!!
    }

private var _knifeKitchen: ImageVector? = null
