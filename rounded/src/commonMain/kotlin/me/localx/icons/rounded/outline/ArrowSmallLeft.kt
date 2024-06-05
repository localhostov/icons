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

public val Icons.Outline.ArrowSmallLeft: ImageVector
    get() {
        if (_arrowSmallLeft != null) {
            return _arrowSmallLeft!!
        }
        _arrowSmallLeft = Builder(name = "ArrowSmallLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineTo(9.0f)
                lineToRelative(3.29f, -3.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineToRelative(-4.29f, 4.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 12.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.59f, 1.4f)
                lineToRelative(4.29f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.41f, -1.42f)
                lineTo(9.0f, 13.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowSmallLeft!!
    }

private var _arrowSmallLeft: ImageVector? = null
