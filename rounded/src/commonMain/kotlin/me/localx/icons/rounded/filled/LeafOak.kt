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

public val Icons.Filled.LeafOak: ImageVector
    get() {
        if (_leafOak != null) {
            return _leafOak!!
        }
        _leafOak = Builder(name = "LeafOak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.331f, 20.084f)
                lineToRelative(-3.623f, 3.623f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(3.623f, -3.623f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(22.643f, 7.242f)
                curveToRelative(0.03f, -0.039f, 0.076f, -0.092f, 0.142f, -0.158f)
                curveToRelative(0.784f, -0.783f, 1.216f, -1.825f, 1.216f, -2.934f)
                reflectiveCurveToRelative(-0.432f, -2.151f, -1.216f, -2.935f)
                curveToRelative(-0.783f, -0.784f, -1.825f, -1.216f, -2.935f, -1.216f)
                reflectiveCurveToRelative(-2.15f, 0.432f, -2.934f, 1.215f)
                curveToRelative(-0.065f, 0.066f, -0.118f, 0.112f, -0.158f, 0.143f)
                curveToRelative(-0.043f, -0.034f, -0.098f, -0.082f, -0.163f, -0.141f)
                curveToRelative(-0.905f, -0.819f, -1.901f, -1.217f, -3.045f, -1.217f)
                curveToRelative(-2.288f, 0.0f, -4.149f, 1.862f, -4.117f, 4.204f)
                curveToRelative(-0.204f, -0.019f, -0.901f, -0.004f, -0.901f, -0.004f)
                curveToRelative(-2.386f, 0.0f, -4.332f, 1.916f, -4.382f, 4.32f)
                curveToRelative(-0.051f, 0.017f, -0.316f, 0.092f, -0.384f, 0.116f)
                curveToRelative(-1.654f, 0.585f, -2.766f, 2.158f, -2.766f, 3.913f)
                curveToRelative(0.0f, 1.617f, 1.922f, 4.655f, 2.916f, 6.12f)
                lineToRelative(8.377f, -8.377f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-8.377f, 8.377f)
                curveToRelative(1.465f, 0.995f, 4.503f, 2.916f, 6.12f, 2.916f)
                curveToRelative(1.755f, 0.0f, 3.328f, -1.111f, 3.914f, -2.767f)
                curveToRelative(0.023f, -0.066f, 0.099f, -0.333f, 0.116f, -0.384f)
                curveToRelative(2.387f, -0.033f, 4.319f, -1.985f, 4.319f, -4.381f)
                curveToRelative(0.0f, -0.229f, 0.05f, -0.868f, 0.05f, -0.869f)
                curveToRelative(2.288f, 0.0f, 4.15f, -1.861f, 4.15f, -4.149f)
                curveToRelative(0.0f, -1.144f, -0.397f, -2.14f, -1.217f, -3.045f)
                curveToRelative(-0.06f, -0.065f, -0.106f, -0.12f, -0.141f, -0.163f)
                close()
            }
        }
        .build()
        return _leafOak!!
    }

private var _leafOak: ImageVector? = null
