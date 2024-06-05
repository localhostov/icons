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

public val Icons.Filled.FaceDisappointed: ImageVector
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
                moveTo(6.0f, 14.5f)
                curveToRelative(-0.409f, 0.0f, -0.794f, -0.253f, -0.94f, -0.661f)
                curveToRelative(-0.188f, -0.52f, 0.082f, -1.092f, 0.602f, -1.279f)
                lineToRelative(4.0f, -1.442f)
                curveToRelative(0.518f, -0.189f, 1.093f, 0.081f, 1.279f, 0.602f)
                curveToRelative(0.188f, 0.52f, -0.082f, 1.092f, -0.602f, 1.279f)
                lineToRelative(-4.0f, 1.442f)
                curveToRelative(-0.111f, 0.041f, -0.227f, 0.06f, -0.339f, 0.06f)
                close()
                moveTo(15.802f, 18.598f)
                curveToRelative(-0.196f, 0.264f, -0.497f, 0.402f, -0.803f, 0.402f)
                curveToRelative(-0.207f, 0.0f, -0.417f, -0.064f, -0.597f, -0.198f)
                curveToRelative(-0.007f, -0.005f, -1.113f, -0.802f, -2.402f, -0.802f)
                reflectiveCurveToRelative(-2.396f, 0.797f, -2.406f, 0.805f)
                curveToRelative(-0.447f, 0.324f, -1.072f, 0.229f, -1.396f, -0.213f)
                curveToRelative(-0.327f, -0.442f, -0.236f, -1.065f, 0.205f, -1.394f)
                curveToRelative(0.066f, -0.049f, 1.632f, -1.198f, 3.598f, -1.198f)
                reflectiveCurveToRelative(3.531f, 1.149f, 3.598f, 1.198f)
                curveToRelative(0.442f, 0.33f, 0.534f, 0.956f, 0.204f, 1.399f)
                close()
                moveTo(18.941f, 13.839f)
                curveToRelative(-0.146f, 0.408f, -0.531f, 0.661f, -0.94f, 0.661f)
                curveToRelative(-0.112f, 0.0f, -0.228f, -0.019f, -0.339f, -0.06f)
                lineToRelative(-4.0f, -1.442f)
                curveToRelative(-0.52f, -0.188f, -0.789f, -0.76f, -0.602f, -1.279f)
                curveToRelative(0.187f, -0.521f, 0.763f, -0.791f, 1.279f, -0.602f)
                lineToRelative(4.0f, 1.442f)
                curveToRelative(0.52f, 0.188f, 0.789f, 0.76f, 0.602f, 1.279f)
                close()
            }
        }
        .build()
        return _faceDisappointed!!
    }

private var _faceDisappointed: ImageVector? = null
