package me.localx.icons.straight.filled

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

public val Icons.Filled.CommentArrowDown: ImageVector
    get() {
        if (_commentArrowDown != null) {
            return _commentArrowDown!!
        }
        _commentArrowDown = Builder(name = "CommentArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.818f, 17.266f)
                curveToRelative(-0.491f, 0.491f, -1.135f, 0.737f, -1.777f, 0.737f)
                curveToRelative(-0.631f, 0.0f, -1.26f, -0.238f, -1.738f, -0.716f)
                lineToRelative(-3.91f, -3.91f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.192f, 3.193f)
                lineTo(10.999f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.999f, 15.256f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.889f, 3.889f)
                close()
            }
        }
        .build()
        return _commentArrowDown!!
    }

private var _commentArrowDown: ImageVector? = null
