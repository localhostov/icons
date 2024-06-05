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

public val Icons.Outline.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.4f)
                lineToRelative(-4.29f, -4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(15.0f)
                lineToRelative(-3.29f, 3.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 1.42f)
                lineToRelative(4.29f, -4.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
