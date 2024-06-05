package me.localx.icons.rounded.outline

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

public val Icons.Outline.CommentSlash: ImageVector
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
                lineToRelative(-1.536f, -1.536f)
                curveToRelative(0.538f, -0.813f, 0.829f, -1.771f, 0.829f, -2.757f)
                verticalLineToRelative(-5.69f)
                curveToRelative(0.0f, -3.433f, -1.501f, -6.648f, -4.119f, -8.822f)
                curveTo(16.373f, 1.403f, 13.204f, 0.594f, 9.962f, 1.195f)
                curveToRelative(-1.838f, 0.343f, -3.547f, 1.154f, -4.991f, 2.362f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(10.329f, 3.162f)
                curveToRelative(2.648f, -0.497f, 5.232f, 0.167f, 7.275f, 1.863f)
                curveToRelative(2.127f, 1.767f, 3.396f, 4.489f, 3.396f, 7.284f)
                verticalLineToRelative(5.69f)
                curveToRelative(0.0f, 0.451f, -0.102f, 0.893f, -0.293f, 1.293f)
                lineTo(6.393f, 4.978f)
                curveToRelative(1.151f, -0.925f, 2.496f, -1.548f, 3.936f, -1.816f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.015f)
                curveToRelative(-3.781f, 0.0f, -7.234f, -1.509f, -9.474f, -4.14f)
                curveTo(1.474f, 16.468f, 0.635f, 13.396f, 1.149f, 10.215f)
                curveToRelative(0.125f, -0.775f, 0.337f, -1.54f, 0.631f, -2.272f)
                curveToRelative(0.204f, -0.513f, 0.787f, -0.764f, 1.3f, -0.557f)
                curveToRelative(0.513f, 0.206f, 0.762f, 0.788f, 0.557f, 1.301f)
                curveToRelative(-0.238f, 0.596f, -0.411f, 1.217f, -0.513f, 1.847f)
                curveToRelative(-0.419f, 2.595f, 0.259f, 5.092f, 1.91f, 7.031f)
                curveToRelative(1.859f, 2.184f, 4.757f, 3.436f, 7.951f, 3.436f)
                horizontalLineToRelative(3.015f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
