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

public val Icons.Outline.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.0f)
                arcToRelative(8.022f, 8.022f, 0.0f, false, false, -6.21f, -7.791f)
                arcTo(7.989f, 7.989f, 0.0f, false, false, 4.557f, 3.143f)
                lineToRelative(-3.1f, -3.1f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.1f, -2.1f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 24.0f, 15.0f)
                close()
                moveTo(10.0f, 3.0f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, true, 5.939f, 5.2f)
                lineToRelative(0.1f, 0.758f)
                lineToRelative(0.759f, 0.1f)
                arcToRelative(5.985f, 5.985f, 0.0f, false, true, 3.64f, 9.965f)
                lineTo(5.973f, 4.559f)
                arcTo(5.987f, 5.987f, 0.0f, false, true, 10.0f, 3.0f)
                close()
                moveTo(16.7f, 20.94f)
                lineTo(18.387f, 22.628f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 23.0f)
                lineTo(5.5f, 23.0f)
                arcTo(5.49f, 5.49f, 0.0f, false, true, 2.9f, 12.671f)
                arcTo(7.912f, 7.912f, 0.0f, false, true, 2.0f, 9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.372f, -2.386f)
                lineTo(4.062f, 8.3f)
                arcTo(5.768f, 5.768f, 0.0f, false, false, 4.0f, 9.0f)
                arcToRelative(5.945f, 5.945f, 0.0f, false, false, 1.182f, 3.563f)
                lineToRelative(0.884f, 1.192f)
                lineToRelative(-1.438f, 0.371f)
                arcTo(3.491f, 3.491f, 0.0f, false, false, 5.5f, 21.0f)
                lineTo(16.0f, 21.0f)
                arcTo(6.029f, 6.029f, 0.0f, false, false, 16.7f, 20.94f)
                close()
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
