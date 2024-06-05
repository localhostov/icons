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

public val Icons.Filled.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 22.293f)
                lineToRelative(-1.546f, -1.546f)
                curveToRelative(0.537f, -0.813f, 0.839f, -1.761f, 0.839f, -2.747f)
                verticalLineToRelative(-5.69f)
                curveToRelative(0.0f, -3.433f, -1.501f, -6.648f, -4.119f, -8.822f)
                curveTo(16.373f, 1.403f, 13.204f, 0.594f, 9.962f, 1.195f)
                curveToRelative(-1.838f, 0.343f, -3.545f, 1.156f, -4.989f, 2.364f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(18.726f, 22.968f)
                curveToRelative(-0.104f, 0.007f, -0.203f, 0.031f, -0.309f, 0.031f)
                horizontalLineToRelative(-5.423f)
                curveToRelative(-6.418f, 0.0f, -11.562f, -4.393f, -11.966f, -10.217f)
                curveToRelative(-0.15f, -2.161f, 0.35f, -4.284f, 1.38f, -6.133f)
                lineTo(18.726f, 22.968f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
