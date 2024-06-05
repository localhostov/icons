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

public val Icons.Bold.CommentAltEdit: ImageVector
    get() {
        if (_commentAltEdit != null) {
            return _commentAltEdit!!
        }
        _commentAltEdit = Builder(name = "CommentAltEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.24f)
                lineToRelative(3.6f, 3.031f)
                curveToRelative(0.479f, 0.425f, 1.079f, 0.635f, 1.674f, 0.635f)
                curveToRelative(0.582f, 0.0f, 1.158f, -0.202f, 1.606f, -0.6f)
                lineToRelative(3.708f, -3.066f)
                horizontalLineToRelative(1.172f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 14.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.349f, 0.0f, -0.687f, 0.122f, -0.956f, 0.344f)
                lineToRelative(-3.828f, 3.167f)
                lineToRelative(-3.749f, -3.158f)
                curveToRelative(-0.271f, -0.228f, -0.613f, -0.353f, -0.967f, -0.353f)
                horizontalLineToRelative(-1.788f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(16.512f, 5.849f)
                curveToRelative(0.761f, 0.93f, 0.598f, 2.317f, -0.252f, 3.167f)
                lineToRelative(-4.728f, 4.728f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.269f, -3.064f, 1.269f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.955f)
                curveToRelative(0.0f, -1.149f, 0.457f, -2.252f, 1.269f, -3.064f)
                lineToRelative(4.82f, -4.82f)
                curveToRelative(0.953f, -0.953f, 2.534f, -0.894f, 3.409f, 0.176f)
                close()
            }
        }
        .build()
        return _commentAltEdit!!
    }

private var _commentAltEdit: ImageVector? = null
