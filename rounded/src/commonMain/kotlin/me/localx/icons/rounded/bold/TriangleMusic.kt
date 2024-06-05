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

public val Icons.Bold.TriangleMusic: ImageVector
    get() {
        if (_triangleMusic != null) {
            return _triangleMusic!!
        }
        _triangleMusic = Builder(name = "TriangleMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.377f, 21.482f)
                curveToRelative(-0.876f, 1.576f, -2.477f, 2.518f, -4.28f, 2.518f)
                lineTo(4.903f, 24.0f)
                curveToRelative(-1.804f, 0.0f, -3.404f, -0.941f, -4.28f, -2.518f)
                reflectiveCurveToRelative(-0.832f, -3.432f, 0.121f, -4.965f)
                lineToRelative(7.625f, -11.508f)
                curveToRelative(0.499f, -0.804f, 1.253f, -1.409f, 2.132f, -1.734f)
                verticalLineToRelative(-1.775f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.777f)
                curveToRelative(0.331f, 0.123f, 0.646f, 0.286f, 0.939f, 0.488f)
                curveToRelative(0.682f, 0.471f, 0.853f, 1.404f, 0.382f, 2.086f)
                curveToRelative(-0.469f, 0.683f, -1.402f, 0.855f, -2.086f, 0.383f)
                curveToRelative(-0.216f, -0.148f, -0.474f, -0.229f, -0.746f, -0.23f)
                curveToRelative(-0.199f, 0.0f, -0.748f, 0.065f, -1.097f, 0.626f)
                lineToRelative(-7.625f, 11.508f)
                curveToRelative(-0.345f, 0.558f, -0.363f, 1.276f, -0.023f, 1.887f)
                curveToRelative(0.339f, 0.611f, 0.959f, 0.976f, 1.658f, 0.976f)
                horizontalLineToRelative(14.194f)
                curveToRelative(0.699f, 0.0f, 1.319f, -0.364f, 1.658f, -0.976f)
                curveToRelative(0.34f, -0.61f, 0.322f, -1.329f, -0.046f, -1.923f)
                lineToRelative(-1.838f, -2.773f)
                curveToRelative(-0.458f, -0.69f, -0.269f, -1.621f, 0.422f, -2.078f)
                curveToRelative(0.691f, -0.458f, 1.621f, -0.271f, 2.079f, 0.422f)
                lineToRelative(1.862f, 2.81f)
                curveToRelative(0.976f, 1.569f, 1.021f, 3.425f, 0.144f, 5.001f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.529f, -0.137f, -1.025f, -0.377f, -1.456f)
                lineToRelative(6.163f, -10.272f)
                curveToRelative(0.426f, -0.71f, 0.196f, -1.632f, -0.514f, -2.058f)
                curveToRelative(-0.71f, -0.428f, -1.632f, -0.195f, -2.058f, 0.515f)
                lineToRelative(-6.164f, 10.273f)
                curveToRelative(-0.017f, 0.0f, -0.033f, -0.001f, -0.05f, -0.001f)
                close()
            }
        }
        .build()
        return _triangleMusic!!
    }

private var _triangleMusic: ImageVector? = null
