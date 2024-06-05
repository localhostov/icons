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
                moveTo(16.0f, 23.0f)
                horizontalLineTo(5.5f)
                arcTo(5.49f, 5.49f, 0.0f, false, true, 2.9f, 12.671f)
                arcTo(7.915f, 7.915f, 0.0f, false, true, 2.0f, 9.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 17.792f, 7.212f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 23.0f)
                close()
                moveTo(10.0f, 3.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 4.0f, 9.0f)
                arcToRelative(5.936f, 5.936f, 0.0f, false, false, 1.182f, 3.562f)
                lineToRelative(0.882f, 1.193f)
                lineToRelative(-1.436f, 0.371f)
                arcTo(3.491f, 3.491f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.8f, -11.938f)
                lineToRelative(-0.757f, -0.1f)
                lineToRelative(-0.1f, -0.758f)
                arcTo(6.01f, 6.01f, 0.0f, false, false, 10.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
