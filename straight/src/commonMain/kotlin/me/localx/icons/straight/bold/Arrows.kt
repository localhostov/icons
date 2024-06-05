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

public val Icons.Bold.Arrows: ImageVector
    get() {
        if (_arrows != null) {
            return _arrows!!
        }
        _arrows = Builder(name = "Arrows", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 10.232f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(17.4f, 8.6f)
                lineToRelative(1.94f, 1.939f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.707f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(2.122f, -2.122f)
                lineTo(13.768f, 0.732f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                lineToRelative(-3.75f, 3.75f)
                lineTo(8.6f, 6.6f)
                lineToRelative(1.9f, -1.9f)
                verticalLineToRelative(5.836f)
                horizontalLineTo(4.707f)
                lineToRelative(1.9f, -1.9f)
                lineTo(4.482f, 6.525f)
                lineTo(0.733f, 10.274f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.537f)
                lineToRelative(3.75f, 3.75f)
                lineTo(6.6f, 15.439f)
                lineToRelative(-1.9f, -1.9f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(5.75f)
                lineTo(8.6f, 17.4f)
                lineTo(6.482f, 19.518f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.536f, 0.0f)
                lineToRelative(3.75f, -3.75f)
                lineTo(15.4f, 17.4f)
                lineToRelative(-1.9f, 1.9f)
                verticalLineToRelative(-5.75f)
                horizontalLineToRelative(5.75f)
                lineTo(17.4f, 15.4f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.75f, -3.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 23.268f, 10.232f)
                close()
            }
        }
        .build()
        return _arrows!!
    }

private var _arrows: ImageVector? = null
