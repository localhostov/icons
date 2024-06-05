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

public val Icons.Bold.FaceDisappointed: ImageVector
    get() {
        if (_faceDisappointed != null) {
            return _faceDisappointed!!
        }
        _faceDisappointed = Builder(name = "FaceDisappointed", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(9.975f, 12.923f)
                lineToRelative(-3.0f, 1.0f)
                curveToRelative(-0.157f, 0.053f, -0.317f, 0.077f, -0.475f, 0.077f)
                curveToRelative(-0.628f, 0.0f, -1.214f, -0.397f, -1.423f, -1.025f)
                curveToRelative(-0.262f, -0.786f, 0.162f, -1.636f, 0.948f, -1.897f)
                lineToRelative(3.0f, -1.0f)
                curveToRelative(0.787f, -0.262f, 1.637f, 0.163f, 1.897f, 0.948f)
                curveToRelative(0.262f, 0.786f, -0.162f, 1.636f, -0.948f, 1.897f)
                close()
                moveTo(18.923f, 12.975f)
                curveToRelative(-0.209f, 0.628f, -0.795f, 1.025f, -1.423f, 1.025f)
                curveToRelative(-0.157f, 0.0f, -0.317f, -0.024f, -0.475f, -0.077f)
                lineToRelative(-3.0f, -1.0f)
                curveToRelative(-0.786f, -0.262f, -1.21f, -1.111f, -0.948f, -1.897f)
                curveToRelative(0.261f, -0.785f, 1.11f, -1.212f, 1.897f, -0.948f)
                lineToRelative(3.0f, 1.0f)
                curveToRelative(0.786f, 0.262f, 1.21f, 1.111f, 0.948f, 1.897f)
                close()
                moveTo(15.842f, 17.671f)
                curveToRelative(-0.263f, 0.525f, -0.793f, 0.829f, -1.343f, 0.829f)
                curveToRelative(-0.226f, 0.0f, -0.454f, -0.051f, -0.67f, -0.158f)
                curveToRelative(0.0f, 0.0f, -0.743f, -0.342f, -1.829f, -0.342f)
                curveToRelative(-1.092f, 0.0f, -1.837f, 0.346f, -1.844f, 0.349f)
                curveToRelative(-0.746f, 0.355f, -1.638f, 0.043f, -1.997f, -0.697f)
                curveToRelative(-0.359f, -0.738f, -0.065f, -1.625f, 0.67f, -1.993f)
                curveToRelative(0.135f, -0.067f, 1.369f, -0.658f, 3.171f, -0.658f)
                reflectiveCurveToRelative(3.036f, 0.591f, 3.171f, 0.658f)
                curveToRelative(0.741f, 0.371f, 1.041f, 1.271f, 0.671f, 2.013f)
                close()
            }
        }
        .build()
        return _faceDisappointed!!
    }

private var _faceDisappointed: ImageVector? = null
