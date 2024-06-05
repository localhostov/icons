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

public val Icons.Filled.FaceConfounded: ImageVector
    get() {
        if (_faceConfounded != null) {
            return _faceConfounded!!
        }
        _faceConfounded = Builder(name = "FaceConfounded", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(13.445f, 8.168f)
                lineToRelative(3.0f, -2.0f)
                curveToRelative(0.46f, -0.307f, 1.08f, -0.183f, 1.387f, 0.277f)
                reflectiveCurveToRelative(0.183f, 1.08f, -0.277f, 1.387f)
                lineToRelative(-1.752f, 1.168f)
                lineToRelative(1.752f, 1.168f)
                curveToRelative(0.46f, 0.307f, 0.584f, 0.927f, 0.277f, 1.387f)
                curveToRelative(-0.192f, 0.289f, -0.51f, 0.445f, -0.833f, 0.445f)
                curveToRelative(-0.19f, 0.0f, -0.383f, -0.055f, -0.554f, -0.168f)
                lineToRelative(-3.0f, -2.0f)
                curveToRelative(-0.278f, -0.186f, -0.445f, -0.498f, -0.445f, -0.832f)
                reflectiveCurveToRelative(0.167f, -0.646f, 0.445f, -0.832f)
                close()
                moveTo(6.445f, 7.832f)
                curveToRelative(-0.46f, -0.307f, -0.584f, -0.927f, -0.277f, -1.387f)
                curveToRelative(0.306f, -0.46f, 0.925f, -0.584f, 1.387f, -0.277f)
                lineToRelative(3.0f, 2.0f)
                curveToRelative(0.278f, 0.186f, 0.445f, 0.498f, 0.445f, 0.832f)
                reflectiveCurveToRelative(-0.167f, 0.646f, -0.445f, 0.832f)
                lineToRelative(-3.0f, 2.0f)
                curveToRelative(-0.171f, 0.113f, -0.363f, 0.168f, -0.554f, 0.168f)
                curveToRelative(-0.323f, 0.0f, -0.641f, -0.156f, -0.833f, -0.445f)
                curveToRelative(-0.307f, -0.46f, -0.183f, -1.08f, 0.277f, -1.387f)
                lineToRelative(1.752f, -1.168f)
                lineToRelative(-1.752f, -1.168f)
                close()
                moveTo(19.72f, 15.695f)
                lineToRelative(-1.786f, 1.845f)
                curveToRelative(-0.283f, 0.291f, -0.66f, 0.451f, -1.062f, 0.455f)
                horizontalLineToRelative(-0.013f)
                curveToRelative(-0.398f, 0.0f, -0.772f, -0.154f, -1.056f, -0.435f)
                lineToRelative(-1.371f, -1.357f)
                lineToRelative(-1.376f, 1.363f)
                curveToRelative(-0.283f, 0.279f, -0.658f, 0.434f, -1.057f, 0.434f)
                reflectiveCurveToRelative(-0.771f, -0.154f, -1.054f, -0.434f)
                lineToRelative(-1.377f, -1.363f)
                lineToRelative(-1.371f, 1.357f)
                curveToRelative(-0.283f, 0.28f, -0.657f, 0.435f, -1.056f, 0.435f)
                horizontalLineToRelative(-0.013f)
                curveToRelative(-0.402f, -0.004f, -0.779f, -0.164f, -1.06f, -0.452f)
                lineToRelative(-1.789f, -1.848f)
                curveToRelative(-0.384f, -0.396f, -0.374f, -1.029f, 0.023f, -1.414f)
                curveToRelative(0.397f, -0.383f, 1.03f, -0.374f, 1.414f, 0.023f)
                lineToRelative(1.432f, 1.479f)
                lineToRelative(1.364f, -1.35f)
                curveToRelative(0.582f, -0.574f, 1.527f, -0.572f, 2.109f, -0.002f)
                lineToRelative(1.377f, 1.364f)
                lineToRelative(1.375f, -1.362f)
                curveToRelative(0.584f, -0.574f, 1.528f, -0.572f, 2.11f, -0.002f)
                lineToRelative(1.365f, 1.352f)
                lineToRelative(1.432f, -1.479f)
                curveToRelative(0.385f, -0.398f, 1.018f, -0.406f, 1.414f, -0.023f)
                curveToRelative(0.397f, 0.385f, 0.407f, 1.018f, 0.023f, 1.414f)
                close()
            }
        }
        .build()
        return _faceConfounded!!
    }

private var _faceConfounded: ImageVector? = null
