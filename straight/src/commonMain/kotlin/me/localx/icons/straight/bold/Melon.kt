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

public val Icons.Bold.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.005f, 1.0f)
                lineTo(18.949f, -0.061f)
                lineTo(-0.064f, 18.947f)
                lineTo(0.992f, 20.0f)
                arcTo(13.442f, 13.442f, 0.0f, true, false, 20.005f, 1.0f)
                close()
                moveTo(17.894f, 17.9f)
                arcToRelative(10.464f, 10.464f, 0.0f, false, true, -13.661f, 0.981f)
                lineToRelative(3.64f, -3.64f)
                arcToRelative(5.379f, 5.379f, 0.0f, false, false, 7.361f, -7.359f)
                lineToRelative(3.64f, -3.639f)
                arcTo(10.471f, 10.471f, 0.0f, false, true, 17.894f, 17.892f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
