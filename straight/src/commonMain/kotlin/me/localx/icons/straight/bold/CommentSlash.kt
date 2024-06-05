package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(23.0f, 20.879f)
                lineTo(23.0f, 12.0f)
                curveToRelative(0.0f, -6.065f, -4.935f, -11.0f, -11.0f, -11.0f)
                curveToRelative(-2.405f, 0.0f, -4.744f, 0.8f, -6.643f, 2.236f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineTo(21.839f, 23.961f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-0.96f, -0.961f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(5.879f)
                lineTo(7.502f, 5.38f)
                curveToRelative(1.313f, -0.898f, 2.862f, -1.38f, 4.498f, -1.38f)
                close()
                moveTo(15.05f, 20.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-6.05f)
                curveToRelative(-6.065f, 0.0f, -11.0f, -4.935f, -11.0f, -11.0f)
                curveToRelative(0.0f, -1.722f, 0.399f, -3.394f, 1.15f, -4.901f)
                lineToRelative(2.287f, 2.287f)
                curveToRelative(-0.287f, 0.832f, -0.437f, 1.713f, -0.437f, 2.614f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(3.05f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
