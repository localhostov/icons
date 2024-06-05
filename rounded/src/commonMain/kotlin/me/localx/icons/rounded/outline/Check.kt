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

public val Icons.Outline.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.319f, 4.431f)
                lineTo(8.5f, 18.249f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.417f, 0.0f)
                lineTo(1.739f, 12.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.417f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.417f)
                lineToRelative(5.346f, 5.345f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 4.25f, 0.0f)
                lineTo(23.736f, 5.847f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.416f)
                horizontalLineToRelative(0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.319f, 4.431f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
