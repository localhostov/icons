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

public val Icons.Outline.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.71f, 12.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineTo(13.0f, 16.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                lineTo(7.71f, 12.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.41f)
                lineToRelative(4.3f, 4.29f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.4f, -0.59f)
                lineToRelative(4.3f, -4.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.71f, 12.71f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
