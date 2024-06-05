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

public val Icons.Filled.CommentAltMiddle: ImageVector
    get() {
        if (_commentAltMiddle != null) {
            return _commentAltMiddle!!
        }
        _commentAltMiddle = Builder(name = "CommentAltMiddle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.009f, 23.665f)
                curveToRelative(-0.476f, 0.0f, -0.956f, -0.168f, -1.338f, -0.508f)
                lineToRelative(-3.748f, -3.156f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineTo(21.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-6.853f)
                lineToRelative(-3.847f, 3.18f)
                curveToRelative(-0.361f, 0.322f, -0.825f, 0.485f, -1.292f, 0.485f)
                close()
            }
        }
        .build()
        return _commentAltMiddle!!
    }

private var _commentAltMiddle: ImageVector? = null
