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

public val Icons.Bold.CommentAltMiddle: ImageVector
    get() {
        if (_commentAltMiddle != null) {
            return _commentAltMiddle!!
        }
        _commentAltMiddle = Builder(name = "CommentAltMiddle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.014f, 23.666f)
                curveToRelative(-0.595f, 0.0f, -1.196f, -0.21f, -1.675f, -0.636f)
                lineToRelative(-3.598f, -3.03f)
                horizontalLineToRelative(-1.241f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(-0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                lineTo(24.0f, 14.5f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.171f)
                lineToRelative(-3.708f, 3.065f)
                curveToRelative(-0.448f, 0.399f, -1.024f, 0.601f, -1.606f, 0.601f)
                close()
                moveTo(11.696f, 20.765f)
                lineToRelative(-0.028f, 0.023f)
                lineToRelative(0.028f, -0.023f)
                close()
                moveTo(12.286f, 20.748f)
                lineToRelative(0.016f, 0.014f)
                lineToRelative(-0.016f, -0.014f)
                close()
                moveTo(5.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                lineTo(3.0f, 14.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.789f)
                curveToRelative(0.354f, 0.0f, 0.696f, 0.125f, 0.966f, 0.353f)
                lineToRelative(3.749f, 3.158f)
                lineToRelative(3.829f, -3.167f)
                curveToRelative(0.27f, -0.222f, 0.607f, -0.344f, 0.956f, -0.344f)
                horizontalLineToRelative(1.711f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                close()
            }
        }
        .build()
        return _commentAltMiddle!!
    }

private var _commentAltMiddle: ImageVector? = null
