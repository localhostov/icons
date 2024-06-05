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

public val Icons.Bold.FaceGlasses: ImageVector
    get() {
        if (_faceGlasses != null) {
            return _faceGlasses!!
        }
        _faceGlasses = Builder(name = "FaceGlasses", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.657f, 0.0f, 5.041f, 1.164f, 6.689f, 3.0f)
                horizontalLineToRelative(-2.189f)
                curveToRelative(-0.953f, 0.0f, -1.816f, 0.385f, -2.448f, 1.005f)
                curveToRelative(-0.018f, 0.0f, -0.034f, -0.005f, -0.052f, -0.005f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.018f, 0.0f, -0.034f, 0.005f, -0.052f, 0.005f)
                curveToRelative(-0.632f, -0.62f, -1.495f, -1.005f, -2.448f, -1.005f)
                horizontalLineToRelative(-2.189f)
                curveToRelative(1.649f, -1.836f, 4.033f, -3.0f, 6.689f, -3.0f)
                close()
                moveTo(19.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.834f, 0.0f, -8.779f, -3.834f, -8.981f, -8.62f)
                curveToRelative(0.564f, 0.389f, 1.245f, 0.62f, 1.981f, 0.62f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.758f, 0.0f, 3.204f, -1.308f, 3.449f, -3.0f)
                horizontalLineToRelative(2.101f)
                curveToRelative(0.245f, 1.692f, 1.691f, 3.0f, 3.449f, 3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.735f, 0.0f, 1.417f, -0.23f, 1.981f, -0.62f)
                curveToRelative(-0.202f, 4.786f, -4.146f, 8.62f, -8.981f, 8.62f)
                close()
                moveTo(16.771f, 15.703f)
                curveToRelative(0.44f, 0.701f, 0.229f, 1.627f, -0.474f, 2.067f)
                curveToRelative(-1.018f, 0.639f, -2.242f, 1.229f, -4.297f, 1.229f)
                curveToRelative(-1.378f, 0.0f, -2.799f, -0.399f, -4.226f, -1.187f)
                curveToRelative(-0.725f, -0.401f, -0.988f, -1.313f, -0.588f, -2.039f)
                curveToRelative(0.401f, -0.726f, 1.312f, -0.987f, 2.039f, -0.588f)
                curveToRelative(0.99f, 0.548f, 1.897f, 0.813f, 2.774f, 0.813f)
                curveToRelative(1.233f, 0.0f, 1.925f, -0.282f, 2.703f, -0.771f)
                curveToRelative(0.699f, -0.439f, 1.626f, -0.229f, 2.067f, 0.474f)
                close()
            }
        }
        .build()
        return _faceGlasses!!
    }

private var _faceGlasses: ImageVector? = null
