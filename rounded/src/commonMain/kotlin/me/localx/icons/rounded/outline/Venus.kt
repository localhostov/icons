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

public val Icons.Outline.Venus: ImageVector
    get() {
        if (_venus != null) {
            return _venus!!
        }
        _venus = Builder(name = "Venus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.0f, 7.931f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.931f)
                arcTo(8.008f, 8.008f, 0.0f, false, false, 20.0f, 8.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _venus!!
    }

private var _venus: ImageVector? = null
