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

public val Icons.Bold.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.363f, 0.191f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, false, -3.0f, 0.686f)
                lineTo(0.4f, 21.484f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.6f, 23.515f)
                lineToRelative(4.09f, -4.442f)
                arcTo(17.308f, 17.308f, 0.0f, false, false, 24.0f, 3.0f)
                verticalLineTo(2.645f)
                arcTo(2.583f, 2.583f, 0.0f, false, false, 22.363f, 0.191f)
                close()
                moveTo(9.762f, 15.738f)
                lineToRelative(11.2f, -12.165f)
                curveTo(20.634f, 6.277f, 18.228f, 14.022f, 9.762f, 15.738f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
