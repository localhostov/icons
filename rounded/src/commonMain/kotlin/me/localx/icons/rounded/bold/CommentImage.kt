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

public val Icons.Bold.CommentImage: ImageVector
    get() {
        if (_commentImage != null) {
            return _commentImage!!
        }
        _commentImage = Builder(name = "CommentImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 18.5f)
                verticalLineToRelative(-6.175f)
                curveToRelative(0.0f, -3.713f, -1.618f, -7.201f, -4.438f, -9.569f)
                curveTo(16.853f, 0.482f, 13.425f, -0.427f, 9.908f, 0.188f)
                curveTo(4.614f, 1.12f, 0.562f, 5.518f, 0.056f, 10.884f)
                curveToRelative(-0.313f, 3.311f, 0.733f, 6.474f, 2.946f, 8.905f)
                curveToRelative(2.435f, 2.676f, 6.091f, 4.21f, 10.032f, 4.21f)
                horizontalLineToRelative(5.466f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                close()
                moveTo(17.633f, 5.054f)
                curveToRelative(2.14f, 1.796f, 3.367f, 4.446f, 3.367f, 7.271f)
                verticalLineToRelative(6.175f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.466f)
                curveToRelative(-3.098f, 0.0f, -5.945f, -1.177f, -7.813f, -3.229f)
                curveToRelative(-1.637f, -1.799f, -2.411f, -4.145f, -2.179f, -6.604f)
                curveToRelative(0.375f, -3.962f, 3.48f, -7.336f, 7.385f, -8.023f)
                curveToRelative(0.539f, -0.095f, 1.074f, -0.142f, 1.603f, -0.142f)
                curveToRelative(2.051f, 0.0f, 3.998f, 0.705f, 5.602f, 2.052f)
                close()
                moveTo(16.768f, 15.354f)
                lineToRelative(1.793f, -1.793f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-2.232f, -2.232f)
                curveToRelative(-0.975f, -0.975f, -2.561f, -0.975f, -3.535f, 0.0f)
                lineToRelative(-2.793f, 2.793f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.586f, 0.586f, 1.535f, 0.586f, 2.121f, 0.0f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(2.232f, 2.232f)
                curveToRelative(0.487f, 0.487f, 1.127f, 0.731f, 1.768f, 0.731f)
                reflectiveCurveToRelative(1.28f, -0.244f, 1.768f, -0.731f)
                close()
            }
        }
        .build()
        return _commentImage!!
    }

private var _commentImage: ImageVector? = null
