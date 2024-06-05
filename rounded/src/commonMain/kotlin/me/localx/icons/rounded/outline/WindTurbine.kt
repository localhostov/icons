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

public val Icons.Outline.WindTurbine: ImageVector
    get() {
        if (_windTurbine != null) {
            return _windTurbine!!
        }
        _windTurbine = Builder(name = "WindTurbine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.684f, 13.762f)
                curveToRelative(-1.37f, -1.095f, -3.907f, -3.071f, -6.064f, -4.468f)
                curveToRelative(-0.289f, -2.559f, -0.925f, -5.708f, -1.293f, -7.42f)
                curveToRelative(-0.237f, -1.104f, -1.193f, -1.874f, -2.326f, -1.874f)
                reflectiveCurveToRelative(-2.089f, 0.771f, -2.326f, 1.874f)
                curveToRelative(-0.368f, 1.713f, -1.005f, 4.862f, -1.293f, 7.421f)
                curveToRelative(-2.157f, 1.397f, -4.694f, 3.373f, -6.064f, 4.467f)
                curveToRelative(-0.882f, 0.705f, -1.145f, 1.905f, -0.64f, 2.918f)
                curveToRelative(0.504f, 1.013f, 1.62f, 1.526f, 2.714f, 1.246f)
                curveToRelative(1.587f, -0.406f, 4.315f, -1.141f, 6.611f, -1.936f)
                lineToRelative(0.01f, 6.01f)
                horizontalLineToRelative(-3.012f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.988f)
                lineToRelative(-0.01f, -6.009f)
                curveToRelative(2.294f, 0.795f, 5.021f, 1.528f, 6.608f, 1.935f)
                curveToRelative(0.199f, 0.051f, 0.399f, 0.076f, 0.597f, 0.076f)
                curveToRelative(0.883f, 0.0f, 1.705f, -0.494f, 2.118f, -1.322f)
                curveToRelative(0.505f, -1.013f, 0.242f, -2.213f, -0.64f, -2.917f)
                close()
                moveTo(20.534f, 15.788f)
                curveToRelative(-0.081f, 0.162f, -0.256f, 0.244f, -0.428f, 0.2f)
                curveToRelative(-1.873f, -0.479f, -5.367f, -1.423f, -7.737f, -2.361f)
                curveToRelative(-0.118f, -0.047f, -0.243f, -0.07f, -0.368f, -0.07f)
                reflectiveCurveToRelative(-0.25f, 0.023f, -0.368f, 0.07f)
                curveToRelative(-2.37f, 0.938f, -5.864f, 1.882f, -7.736f, 2.361f)
                curveToRelative(-0.173f, 0.043f, -0.349f, -0.04f, -0.429f, -0.201f)
                curveToRelative(-0.081f, -0.162f, -0.041f, -0.352f, 0.098f, -0.463f)
                curveToRelative(1.425f, -1.139f, 4.138f, -3.25f, 6.291f, -4.598f)
                curveToRelative(0.263f, -0.165f, 0.435f, -0.442f, 0.464f, -0.75f)
                curveToRelative(0.247f, -2.535f, 0.927f, -5.901f, 1.31f, -7.682f)
                curveToRelative(0.074f, -0.346f, 0.667f, -0.346f, 0.741f, 0.0f)
                curveToRelative(0.383f, 1.781f, 1.062f, 5.147f, 1.31f, 7.682f)
                curveToRelative(0.03f, 0.309f, 0.202f, 0.586f, 0.464f, 0.75f)
                curveToRelative(2.153f, 1.348f, 4.866f, 3.459f, 6.291f, 4.598f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.139f, 0.111f, 0.179f, 0.301f, 0.098f, 0.463f)
                close()
            }
        }
        .build()
        return _windTurbine!!
    }

private var _windTurbine: ImageVector? = null
