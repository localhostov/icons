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

public val Icons.Filled.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.124f, 0.876f)
                arcToRelative(2.958f, 2.958f, 0.0f, false, false, -2.4f, -0.861f)
                curveToRelative(-2.272f, 0.221f, -8.014f, 1.2f, -12.263f, 5.446f)
                arcToRelative(34.757f, 34.757f, 0.0f, false, false, -8.224f, 13.077f)
                lineToRelative(-0.237f, 0.608f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(13.866f, -13.866f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-13.866f, 13.866f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(0.609f, -0.238f)
                arcToRelative(34.746f, 34.746f, 0.0f, false, false, 13.076f, -8.223f)
                curveToRelative(4.248f, -4.248f, 5.225f, -9.991f, 5.446f, -12.263f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, false, -0.861f, -2.4f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
