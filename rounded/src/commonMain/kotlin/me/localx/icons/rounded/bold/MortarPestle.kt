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

public val Icons.Bold.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 20.0f)
                curveToRelative(0.0f, 0.486f, -0.349f, 0.937f, -0.795f, 1.029f)
                curveToRelative(-0.687f, 0.137f, -1.205f, 0.743f, -1.205f, 1.471f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.727f, -0.518f, -1.334f, -1.205f, -1.471f)
                curveToRelative(-0.446f, -0.092f, -0.795f, -0.543f, -0.795f, -1.029f)
                curveToRelative(0.0f, -0.513f, 0.826f, -0.927f, 0.862f, -0.952f)
                curveToRelative(1.832f, -1.287f, 4.19f, -3.489f, 5.022f, -6.668f)
                curveToRelative(0.276f, -1.059f, 0.052f, -2.163f, -0.617f, -3.029f)
                reflectiveCurveToRelative(-1.68f, -1.364f, -2.774f, -1.364f)
                horizontalLineToRelative(-1.729f)
                reflectiveCurveToRelative(4.504f, -3.719f, 4.504f, -3.719f)
                curveToRelative(0.976f, -0.976f, 0.976f, -2.559f, 0.0f, -3.536f)
                reflectiveCurveToRelative(-2.559f, -0.976f, -3.536f, 0.0f)
                lineToRelative(-5.997f, 7.26f)
                lineToRelative(-10.235f, 0.008f)
                curveToRelative(-1.094f, 0.0f, -2.104f, 0.497f, -2.773f, 1.364f)
                reflectiveCurveToRelative(-0.894f, 1.971f, -0.617f, 3.029f)
                curveToRelative(0.827f, 3.162f, 3.191f, 5.364f, 5.028f, 6.655f)
                curveToRelative(0.036f, 0.025f, 0.862f, 0.414f, 0.862f, 0.952f)
                moveToRelative(14.982f, -8.38f)
                curveToRelative(-0.466f, 1.781f, -1.812f, 3.533f, -3.796f, 4.938f)
                curveToRelative(-1.266f, 0.752f, -1.816f, 1.673f, -2.041f, 2.441f)
                horizontalLineToRelative(-6.29f)
                curveToRelative(-0.226f, -0.768f, -0.775f, -1.689f, -2.041f, -2.441f)
                curveToRelative(-1.419f, -1.006f, -3.211f, -2.668f, -3.802f, -4.925f)
                curveToRelative(-0.055f, -0.208f, 0.033f, -0.363f, 0.09f, -0.437f)
                curveToRelative(0.057f, -0.073f, 0.184f, -0.197f, 0.399f, -0.197f)
                lineToRelative(16.993f, -0.013f)
                curveToRelative(0.215f, 0.0f, 0.342f, 0.124f, 0.398f, 0.197f)
                curveToRelative(0.057f, 0.074f, 0.145f, 0.229f, 0.09f, 0.437f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
