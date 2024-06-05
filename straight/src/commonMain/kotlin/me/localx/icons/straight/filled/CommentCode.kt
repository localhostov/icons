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

public val Icons.Filled.CommentCode: ImageVector
    get() {
        if (_commentCode != null) {
            return _commentCode!!
        }
        _commentCode = Builder(name = "CommentCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.294f, 15.291f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.298f, -3.298f)
                curveToRelative(-0.775f, -0.775f, -0.775f, -2.037f, 0.0f, -2.812f)
                lineToRelative(3.298f, -3.298f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.298f, 3.298f)
                lineToRelative(3.298f, 3.283f)
                close()
                moveTo(18.418f, 13.407f)
                lineToRelative(-3.298f, 3.298f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.298f)
                lineToRelative(-3.298f, -3.283f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.298f, 3.298f)
                curveToRelative(0.775f, 0.775f, 0.775f, 2.037f, 0.0f, 2.812f)
                close()
            }
        }
        .build()
        return _commentCode!!
    }

private var _commentCode: ImageVector? = null
