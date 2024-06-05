package me.localx.icons.straight.filled

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

public val Icons.Filled.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.855f, 20.441f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-22.498f, -22.498f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.1f, 3.1f)
                arcToRelative(7.989f, 7.989f, 0.0f, false, true, 13.233f, 4.066f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, 4.065f, 13.232f)
                close()
                moveTo(2.0f, 9.0f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(10.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.385f, -0.372f)
                lineToRelative(-16.013f, -16.014f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.372f, 2.386f)
                close()
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
