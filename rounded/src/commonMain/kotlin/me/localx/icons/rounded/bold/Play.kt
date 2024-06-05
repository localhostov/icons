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

public val Icons.Bold.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.463f, 7.713f)
                lineToRelative(-9.1f, -6.677f)
                arcTo(5.317f, 5.317f, 0.0f, false, false, 2.9f, 5.323f)
                lineTo(2.9f, 18.677f)
                arcToRelative(5.311f, 5.311f, 0.0f, false, false, 8.46f, 4.287f)
                lineToRelative(9.105f, -6.677f)
                arcToRelative(5.315f, 5.315f, 0.0f, false, false, 0.0f, -8.574f)
                close()
                moveTo(18.689f, 13.868f)
                lineTo(9.589f, 20.545f)
                arcTo(2.317f, 2.317f, 0.0f, false, true, 5.9f, 18.677f)
                lineTo(5.9f, 5.323f)
                arcToRelative(2.276f, 2.276f, 0.0f, false, true, 1.27f, -2.066f)
                arcTo(2.328f, 2.328f, 0.0f, false, true, 8.223f, 3.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 1.362f, 0.455f)
                lineToRelative(9.1f, 6.677f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, true, 0.0f, 3.736f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
