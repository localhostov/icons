package me.localx.icons.straight.bold

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

public val Icons.Bold.SortSizeUp: ImageVector
    get() {
        if (_sortSizeUp != null) {
            return _sortSizeUp!!
        }
        _sortSizeUp = Builder(name = "SortSizeUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.0f, 1.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.74f, 0.72f)
                lineTo(0.45f, 4.93f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(2.45f, -2.4f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.71f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(2.12f, -2.12f)
                lineTo(8.27f, 0.73f)
                curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.52f, -0.01f)
                close()
            }
        }
        .build()
        return _sortSizeUp!!
    }

private var _sortSizeUp: ImageVector? = null
