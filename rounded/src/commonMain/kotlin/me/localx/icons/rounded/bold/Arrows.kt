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
                moveTo(23.0f, 9.545f)
                lineTo(20.57f, 7.07f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.14f, 2.1f)
                lineToRelative(1.3f, 1.327f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.266f)
                lineToRelative(1.327f, 1.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.1f, -2.14f)
                lineTo(14.458f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.444f, -1.0f)
                horizontalLineTo(12.0f)
                arcTo(3.493f, 3.493f, 0.0f, false, false, 9.545f, 1.0f)
                lineTo(7.07f, 3.43f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.1f, 2.14f)
                lineTo(10.5f, 4.265f)
                verticalLineTo(10.5f)
                horizontalLineTo(4.266f)
                lineToRelative(1.3f, -1.327f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.14f, -2.1f)
                lineTo(1.0f, 9.542f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.0f, 2.444f)
                verticalLineTo(12.0f)
                horizontalLineTo(0.0f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, false, 1.0f, 2.454f)
                lineTo(3.43f, 16.93f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.14f, -2.1f)
                lineTo(4.265f, 13.5f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(6.239f)
                lineToRelative(-1.327f, -1.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.1f, 2.14f)
                lineToRelative(2.472f, 2.43f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, false, 4.913f, 0.0f)
                lineToRelative(2.475f, -2.433f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.1f, -2.14f)
                lineToRelative(-1.327f, 1.3f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(6.234f)
                lineToRelative(-1.3f, 1.327f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.14f, 2.1f)
                lineTo(23.0f, 14.458f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, false, 0.0f, -4.913f)
                close()
            }
        }
        .build()
        return _arrows!!
    }

private var _arrows: ImageVector? = null
