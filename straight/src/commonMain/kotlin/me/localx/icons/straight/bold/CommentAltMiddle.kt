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
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24.0f, 20.0f)
                horizontalLineToRelative(-6.671f)
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
                moveTo(3.0f, 16.999f)
                lineTo(7.836f, 16.999f)
                lineToRelative(4.167f, 3.511f)
                lineToRelative(4.245f, -3.511f)
                horizontalLineToRelative(4.751f)
                lineTo(20.999f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
            }
        }
        .build()
        return _commentAltMiddle!!
    }

private var _commentAltMiddle: ImageVector? = null
