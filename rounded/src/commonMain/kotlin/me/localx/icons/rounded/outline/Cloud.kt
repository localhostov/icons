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

public val Icons.Outline.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.792f, 7.212f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.0f, 9.0f)
                arcToRelative(7.915f, 7.915f, 0.0f, false, false, 0.9f, 3.671f)
                arcTo(5.49f, 5.49f, 0.0f, false, false, 5.5f, 23.0f)
                horizontalLineTo(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 17.792f, 7.212f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineTo(5.5f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -0.872f, -6.874f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.554f, -1.564f)
                arcTo(5.936f, 5.936f, 0.0f, false, true, 4.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.94f, -0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.858f, 0.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
