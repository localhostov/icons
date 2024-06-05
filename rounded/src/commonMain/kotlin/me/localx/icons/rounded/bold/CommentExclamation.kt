package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CommentExclamation: ImageVector
    get() {
        if (_commentExclamation != null) {
            return _commentExclamation!!
        }
        _commentExclamation = Builder(name = "CommentExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.5f)
                verticalLineToRelative(-6.176f)
                curveToRelative(0.0f, -3.713f, -1.618f, -7.2f, -4.438f, -9.567f)
                curveTo(16.854f, 0.483f, 13.427f, -0.43f, 9.908f, 0.188f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 7.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineTo(7.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            }
        }
        .build()
        return _commentExclamation!!
    }

private var _commentExclamation: ImageVector? = null
