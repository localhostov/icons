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

public val Icons.Filled.EarthAmericas: ImageVector
    get() {
        if (_earthAmericas != null) {
            return _earthAmericas!!
        }
        _earthAmericas = Builder(name = "EarthAmericas", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(15.534f, 13.511f)
                lineToRelative(-2.241f, 4.856f)
                curveToRelative(-0.178f, 0.386f, -0.564f, 0.633f, -0.989f, 0.633f)
                horizontalLineToRelative(-0.213f)
                curveToRelative(-0.602f, 0.0f, -1.09f, -0.488f, -1.09f, -1.09f)
                verticalLineToRelative(-2.365f)
                curveToRelative(0.0f, -0.349f, -0.139f, -0.684f, -0.386f, -0.931f)
                lineToRelative(-1.19f, -1.19f)
                curveToRelative(-0.272f, -0.272f, -0.425f, -0.641f, -0.425f, -1.025f)
                verticalLineToRelative(-0.963f)
                curveToRelative(0.0f, -0.279f, -0.111f, -0.547f, -0.309f, -0.745f)
                lineToRelative(-0.373f, -0.373f)
                curveToRelative(-0.204f, -0.204f, -0.48f, -0.318f, -0.768f, -0.318f)
                horizontalLineToRelative(-1.949f)
                curveToRelative(-0.384f, 0.0f, -0.751f, -0.157f, -1.016f, -0.436f)
                lineToRelative(-1.658f, -1.743f)
                curveToRelative(1.587f, -3.43f, 5.052f, -5.821f, 9.073f, -5.821f)
                curveToRelative(0.206f, 0.0f, 0.407f, 0.019f, 0.609f, 0.031f)
                curveToRelative(-0.533f, 0.808f, -1.016f, 1.551f, -1.309f, 2.005f)
                curveToRelative(-0.185f, 0.285f, -0.189f, 0.648f, -0.014f, 0.94f)
                lineToRelative(0.837f, 1.396f)
                curveToRelative(0.222f, 0.369f, 0.163f, 0.842f, -0.141f, 1.147f)
                lineToRelative(-0.003f, 0.003f)
                curveToRelative(-0.286f, 0.286f, -0.722f, 0.357f, -1.084f, 0.176f)
                lineToRelative(-0.88f, -0.44f)
                curveToRelative(-0.307f, -0.154f, -0.678f, -0.093f, -0.921f, 0.149f)
                lineToRelative(-0.529f, 0.529f)
                curveToRelative(-0.312f, 0.312f, -0.312f, 0.817f, 0.0f, 1.128f)
                lineToRelative(0.592f, 0.592f)
                curveToRelative(0.22f, 0.22f, 0.519f, 0.344f, 0.83f, 0.344f)
                horizontalLineToRelative(1.431f)
                curveToRelative(0.381f, 0.0f, 0.754f, 0.107f, 1.077f, 0.309f)
                lineToRelative(2.562f, 1.601f)
                curveToRelative(0.539f, 0.337f, 0.744f, 1.023f, 0.477f, 1.601f)
                close()
                moveTo(19.524f, 12.26f)
                curveToRelative(-0.332f, -0.165f, -0.575f, -0.467f, -0.665f, -0.827f)
                lineToRelative(-0.627f, -2.507f)
                curveToRelative(-0.137f, -0.548f, 0.106f, -1.121f, 0.595f, -1.403f)
                lineToRelative(1.583f, -0.913f)
                curveToRelative(1.002f, 1.557f, 1.59f, 3.405f, 1.59f, 5.39f)
                curveToRelative(0.0f, 0.488f, -0.047f, 0.963f, -0.115f, 1.432f)
                lineToRelative(-2.362f, -1.172f)
                close()
            }
        }
        .build()
        return _earthAmericas!!
    }

private var _earthAmericas: ImageVector? = null
