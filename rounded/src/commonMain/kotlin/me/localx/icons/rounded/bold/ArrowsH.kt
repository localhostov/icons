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

public val Icons.Bold.ArrowsH: ImageVector
    get() {
        if (_arrowsH != null) {
            return _arrowsH!!
        }
        _arrowsH = Builder(name = "ArrowsH", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.008f, 9.566f)
                lineToRelative(-3.048f, -3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.141f, 2.1f)
                lineToRelative(1.9f, 1.933f)
                horizontalLineTo(4.264f)
                lineTo(6.18f, 8.551f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.14f, -2.1f)
                lineTo(0.991f, 9.55f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 12.0f)
                verticalLineToRelative(0.0f)
                horizontalLineTo(0.0f)
                arcToRelative(3.489f, 3.489f, 0.0f, false, false, 0.99f, 2.448f)
                curveToRelative(0.2f, 0.205f, 0.383f, 0.391f, 0.505f, 0.512f)
                lineTo(4.04f, 17.551f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.14f, -2.1f)
                lineTo(4.265f, 13.5f)
                horizontalLineTo(19.75f)
                lineToRelative(-1.931f, 1.964f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.141f, 2.1f)
                lineToRelative(3.047f, -3.1f)
                arcTo(3.52f, 3.52f, 0.0f, false, false, 23.008f, 9.566f)
                close()
            }
        }
        .build()
        return _arrowsH!!
    }

private var _arrowsH: ImageVector? = null
