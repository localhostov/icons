package me.localx.icons.straight.outline

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

public val Icons.Outline.HatChef: ImageVector
    get() {
        if (_hatChef != null) {
            return _hatChef!!
        }
        _hatChef = Builder(name = "HatChef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                arcToRelative(4.939f, 4.939f, 0.0f, false, false, -2.713f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.574f, 0.0f)
                arcTo(4.939f, 4.939f, 0.0f, false, false, 5.0f, 1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.0f, 9.9f)
                verticalLineTo(24.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.0f, 1.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                arcToRelative(2.972f, 2.972f, 0.0f, false, true, 2.14f, 0.9f)
                lineTo(8.0f, 4.777f)
                lineToRelative(0.686f, -1.013f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.634f, 0.0f)
                lineTo(16.0f, 4.777f)
                lineTo(16.86f, 3.9f)
                arcTo(2.972f, 2.972f, 0.0f, false, true, 19.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _hatChef!!
    }

private var _hatChef: ImageVector? = null
