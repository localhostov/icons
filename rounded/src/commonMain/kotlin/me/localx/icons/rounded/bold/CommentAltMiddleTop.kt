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

public val Icons.Bold.CommentAltMiddleTop: ImageVector
    get() {
        if (_commentAltMiddleTop != null) {
            return _commentAltMiddleTop!!
        }
        _commentAltMiddleTop = Builder(name = "CommentAltMiddleTop", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                curveTo(2.467f, 24.0f, 0.0f, 21.533f, 0.0f, 18.5f)
                lineTo(0.0f, 9.5f)
                curveTo(0.0f, 6.467f, 2.467f, 4.0f, 5.5f, 4.0f)
                horizontalLineToRelative(1.241f)
                lineTo(10.369f, 0.943f)
                curveToRelative(0.918f, -0.816f, 2.346f, -0.816f, 3.293f, 0.026f)
                lineToRelative(3.667f, 3.031f)
                horizontalLineToRelative(1.171f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(5.5f, 7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 9.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.711f)
                curveToRelative(-0.349f, 0.0f, -0.687f, -0.122f, -0.956f, -0.344f)
                lineToRelative(-3.83f, -3.167f)
                lineToRelative(-3.747f, 3.158f)
                curveToRelative(-0.271f, 0.228f, -0.613f, 0.353f, -0.967f, 0.353f)
                horizontalLineToRelative(-1.789f)
                close()
                moveTo(11.709f, 3.247f)
                lineToRelative(0.021f, 0.016f)
                lineToRelative(-0.021f, -0.016f)
                close()
                moveTo(12.333f, 3.212f)
                lineToRelative(-0.021f, 0.017f)
                lineToRelative(0.021f, -0.017f)
                close()
            }
        }
        .build()
        return _commentAltMiddleTop!!
    }

private var _commentAltMiddleTop: ImageVector? = null
