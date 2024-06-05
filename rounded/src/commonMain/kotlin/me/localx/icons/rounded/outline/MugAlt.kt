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

public val Icons.Outline.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 23.0f)
                close()
                moveTo(24.0f, 8.0f)
                curveToRelative(0.0f, 2.774f, -2.185f, 6.0f, -5.0f, 6.0f)
                horizontalLineTo(17.388f)
                lineToRelative(-0.3f, 1.821f)
                arcTo(4.984f, 4.984f, 0.0f, false, true, 12.152f, 20.0f)
                horizontalLineToRelative(-5.3f)
                arcToRelative(4.984f, 4.984f, 0.0f, false, true, -4.932f, -4.179f)
                lineTo(0.056f, 4.657f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                horizontalLineTo(15.0f)
                arcToRelative(3.968f, 3.968f, 0.0f, false, true, 3.983f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(22.131f, 4.0f, 24.0f, 5.5f, 24.0f, 8.0f)
                close()
                moveTo(16.972f, 4.329f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.028f, 4.328f)
                lineTo(3.889f, 15.493f)
                arcTo(2.991f, 2.991f, 0.0f, false, false, 6.848f, 18.0f)
                horizontalLineToRelative(5.3f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, false, 2.959f, -2.507f)
                close()
                moveTo(22.0f, 8.0f)
                curveToRelative(0.0f, -0.5f, 0.0f, -2.0f, -3.0f, -2.0f)
                horizontalLineToRelative(-0.279f)
                lineToRelative(-1.0f, 6.0f)
                horizontalLineTo(19.0f)
                curveTo(20.545f, 12.0f, 22.0f, 9.746f, 22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null
