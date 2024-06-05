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

public val Icons.Bold.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 21.439f)
                lineToRelative(-1.205f, -1.205f)
                curveToRelative(0.42f, -0.772f, 0.645f, -1.642f, 0.645f, -2.534f)
                verticalLineToRelative(-5.406f)
                curveToRelative(0.0f, -3.425f, -1.499f, -6.634f, -4.111f, -8.805f)
                curveTo(16.379f, 1.404f, 13.21f, 0.587f, 9.963f, 1.194f)
                curveToRelative(-1.675f, 0.312f, -3.242f, 1.013f, -4.599f, 2.048f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineTo(21.439f, 23.561f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(10.513f, 4.144f)
                curveToRelative(2.354f, -0.438f, 4.647f, 0.147f, 6.46f, 1.653f)
                curveToRelative(1.896f, 1.575f, 3.028f, 4.004f, 3.028f, 6.497f)
                verticalLineToRelative(5.406f)
                curveToRelative(0.0f, 0.058f, -0.003f, 0.115f, -0.007f, 0.172f)
                lineTo(7.511f, 5.39f)
                curveToRelative(0.906f, -0.621f, 1.924f, -1.046f, 3.001f, -1.247f)
                close()
                moveTo(16.0f, 21.499f)
                curveToRelative(0.0f, 0.828f, -0.67f, 1.5f, -1.499f, 1.501f)
                horizontalLineToRelative(-1.564f)
                curveToRelative(-3.755f, 0.0f, -7.188f, -1.503f, -9.421f, -4.126f)
                curveTo(1.474f, 16.476f, 0.633f, 13.401f, 1.148f, 10.217f)
                curveToRelative(0.061f, -0.377f, 0.142f, -0.749f, 0.241f, -1.112f)
                curveToRelative(0.218f, -0.8f, 1.043f, -1.271f, 1.842f, -1.052f)
                curveToRelative(0.799f, 0.219f, 1.27f, 1.044f, 1.051f, 1.843f)
                curveToRelative(-0.071f, 0.262f, -0.129f, 0.528f, -0.173f, 0.799f)
                curveToRelative(-0.373f, 2.304f, 0.228f, 4.518f, 1.69f, 6.235f)
                curveToRelative(1.662f, 1.952f, 4.263f, 3.071f, 7.136f, 3.071f)
                horizontalLineToRelative(1.564f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.67f, 1.5f, 1.498f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
