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

public val Icons.Filled.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.056f, 11.211f)
                lineToRelative(8.039f, 6.718f)
                lineToRelative(-5.694f, 4.271f)
                curveToRelative(-1.422f, 1.067f, -3.378f, 1.067f, -4.8f, 0.0f)
                lineToRelative(-6.133f, -4.6f)
                curveToRelative(-0.519f, -0.389f, -1.151f, -0.6f, -1.8f, -0.6f)
                horizontalLineToRelative(-0.667f)
                curveTo(0.448f, 17.0f, 0.0f, 16.552f, 0.0f, 16.0f)
                verticalLineTo(4.937f)
                curveToRelative(0.0f, -0.508f, 0.379f, -0.931f, 0.884f, -0.988f)
                curveToRelative(1.357f, -0.151f, 2.579f, -0.696f, 3.829f, -1.424f)
                curveToRelative(1.798f, -0.925f, 4.157f, -0.595f, 5.616f, 0.772f)
                lineToRelative(0.617f, 0.593f)
                lineToRelative(-4.007f, 3.911f)
                curveToRelative(-1.073f, 1.072f, -1.244f, 2.767f, -0.398f, 3.938f)
                curveToRelative(0.52f, 0.723f, 1.461f, 1.259f, 2.444f, 1.259f)
                curveToRelative(0.793f, 0.0f, 1.554f, -0.312f, 2.104f, -0.863f)
                lineToRelative(0.967f, -0.925f)
                close()
                moveTo(19.954f, 2.525f)
                curveToRelative(-1.69f, -0.845f, -3.798f, -0.625f, -5.308f, 0.548f)
                lineToRelative(-6.303f, 6.152f)
                curveToRelative(-0.371f, 0.372f, -0.455f, 0.967f, -0.181f, 1.347f)
                curveToRelative(0.18f, 0.25f, 0.441f, 0.4f, 0.739f, 0.425f)
                curveToRelative(0.295f, 0.025f, 0.581f, -0.082f, 0.788f, -0.29f)
                lineToRelative(3.618f, -3.429f)
                curveToRelative(0.949f, -0.901f, 2.324f, 0.537f, 1.383f, 1.445f)
                lineToRelative(-1.181f, 1.097f)
                lineToRelative(8.593f, 7.181f)
                horizontalLineToRelative(0.897f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineTo(4.903f)
                curveToRelative(0.0f, -0.49f, -0.358f, -0.895f, -0.841f, -0.982f)
                curveToRelative(-1.694f, -0.306f, -3.205f, -1.395f, -3.205f, -1.395f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
