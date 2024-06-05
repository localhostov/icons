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

public val Icons.Outline.ArrowToRight: ImageVector
    get() {
        if (_arrowToRight != null) {
            return _arrowToRight!!
        }
        _arrowToRight = Builder(name = "ArrowToRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.985f, 6.015f)
                verticalLineToRelative(4.518f)
                arcToRelative(2.417f, 2.417f, 0.0f, false, false, -0.233f, -0.285f)
                lineTo(16.8f, 5.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(1.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(19.692f)
                lineToRelative(-4.3f, 4.3f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 16.8f, 18.733f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.233f, -0.285f)
                verticalLineToRelative(4.517f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowToRight!!
    }

private var _arrowToRight: ImageVector? = null
