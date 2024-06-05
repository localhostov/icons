package me.localx.icons.straight.outline

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

public val Icons.Outline.CommentAltMiddleTop: ImageVector
    get() {
        if (_commentAltMiddleTop != null) {
            return _commentAltMiddleTop!!
        }
        _commentAltMiddleTop = Builder(name = "CommentAltMiddleTop", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 24.0f, 0.0f, 22.654f, 0.0f, 21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.923f)
                lineTo(10.691f, 0.826f)
                curveToRelative(0.737f, -0.656f, 1.881f, -0.656f, 2.638f, 0.018f)
                lineToRelative(3.819f, 3.156f)
                horizontalLineToRelative(6.853f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(2.0f, 6.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(21.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-5.571f)
                lineToRelative(-4.401f, -3.639f)
                lineToRelative(-4.374f, 3.639f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _commentAltMiddleTop!!
    }

private var _commentAltMiddleTop: ImageVector? = null
