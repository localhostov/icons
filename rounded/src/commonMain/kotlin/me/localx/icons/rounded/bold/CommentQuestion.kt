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

public val Icons.Bold.CommentQuestion: ImageVector
    get() {
        if (_commentQuestion != null) {
            return _commentQuestion!!
        }
        _commentQuestion = Builder(name = "CommentQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.405f, 13.023f)
                curveToRelative(0.005f, -0.012f, 0.131f, -0.284f, 0.567f, -0.543f)
                curveToRelative(1.486f, -0.884f, 2.258f, -2.529f, 1.966f, -4.192f)
                curveToRelative(-0.283f, -1.616f, -1.61f, -2.943f, -3.225f, -3.226f)
                curveToRelative(-2.165f, -0.373f, -4.198f, 1.0f, -4.633f, 3.139f)
                curveToRelative(-0.165f, 0.812f, 0.36f, 1.604f, 1.171f, 1.769f)
                curveToRelative(0.813f, 0.166f, 1.604f, -0.359f, 1.769f, -1.171f)
                curveToRelative(0.095f, -0.469f, 0.559f, -0.891f, 1.175f, -0.781f)
                curveToRelative(0.382f, 0.066f, 0.721f, 0.405f, 0.788f, 0.789f)
                curveToRelative(0.114f, 0.648f, -0.388f, 1.003f, -0.543f, 1.095f)
                curveToRelative(-1.396f, 0.828f, -1.802f, 1.934f, -1.87f, 2.146f)
                curveToRelative(-0.25f, 0.79f, 0.175f, 1.668f, 0.965f, 1.918f)
                curveToRelative(0.158f, 0.05f, 0.317f, 0.073f, 0.473f, 0.073f)
                curveToRelative(0.625f, 0.0f, 1.197f, -0.384f, 1.397f, -1.016f)
                close()
                moveTo(24.0f, 18.5f)
                verticalLineToRelative(-6.176f)
                curveToRelative(0.0f, -3.713f, -1.618f, -7.2f, -4.438f, -9.567f)
                curveTo(16.854f, 0.483f, 13.428f, -0.428f, 9.908f, 0.188f)
                curveTo(4.614f, 1.119f, 0.562f, 5.518f, 0.056f, 10.885f)
                curveToRelative(-0.313f, 3.311f, 0.733f, 6.473f, 2.946f, 8.904f)
                curveToRelative(2.435f, 2.676f, 6.092f, 4.211f, 10.032f, 4.211f)
                horizontalLineToRelative(5.466f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                close()
                moveTo(17.633f, 5.054f)
                curveToRelative(2.14f, 1.797f, 3.367f, 4.446f, 3.367f, 7.271f)
                verticalLineToRelative(6.176f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.466f)
                curveToRelative(-3.097f, 0.0f, -5.945f, -1.177f, -7.813f, -3.229f)
                curveToRelative(-1.637f, -1.8f, -2.411f, -4.145f, -2.179f, -6.604f)
                curveToRelative(0.375f, -3.962f, 3.48f, -7.336f, 7.385f, -8.022f)
                curveToRelative(0.539f, -0.095f, 1.074f, -0.142f, 1.603f, -0.142f)
                curveToRelative(2.052f, 0.0f, 3.999f, 0.705f, 5.603f, 2.052f)
                close()
            }
        }
        .build()
        return _commentQuestion!!
    }

private var _commentQuestion: ImageVector? = null
