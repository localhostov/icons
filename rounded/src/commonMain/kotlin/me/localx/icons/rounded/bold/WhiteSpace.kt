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

public val Icons.Bold.WhiteSpace: ImageVector
    get() {
        if (_whiteSpace != null) {
            return _whiteSpace!!
        }
        _whiteSpace = Builder(name = "WhiteSpace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.5f)
                verticalLineTo(22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineTo(12.558f)
                curveToRelative(-0.064f, 0.136f, -0.141f, 0.268f, -0.254f, 0.379f)
                lineToRelative(-3.373f, 3.329f)
                curveToRelative(-0.51f, 0.503f, -1.373f, 0.142f, -1.373f, -0.574f)
                verticalLineToRelative(-2.192f)
                horizontalLineTo(7.999f)
                verticalLineToRelative(2.192f)
                curveToRelative(0.0f, 0.716f, -0.863f, 1.077f, -1.373f, 0.574f)
                lineToRelative(-3.373f, -3.329f)
                curveToRelative(-0.113f, -0.111f, -0.19f, -0.243f, -0.254f, -0.378f)
                verticalLineToRelative(9.941f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineTo(1.5f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineTo(11.441f)
                curveToRelative(0.064f, -0.135f, 0.141f, -0.267f, 0.254f, -0.378f)
                lineToRelative(3.373f, -3.329f)
                curveToRelative(0.51f, -0.503f, 1.373f, -0.142f, 1.373f, 0.574f)
                verticalLineToRelative(2.192f)
                horizontalLineToRelative(8.001f)
                verticalLineToRelative(-2.192f)
                curveToRelative(0.0f, -0.716f, 0.863f, -1.077f, 1.373f, -0.574f)
                lineToRelative(3.373f, 3.329f)
                curveToRelative(0.113f, 0.112f, 0.19f, 0.244f, 0.254f, 0.379f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _whiteSpace!!
    }

private var _whiteSpace: ImageVector? = null
