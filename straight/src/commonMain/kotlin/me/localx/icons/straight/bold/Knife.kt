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
                moveTo(22.363f, 0.19f)
                arcToRelative(2.721f, 2.721f, 0.0f, false, false, -3.0f, 0.685f)
                lineTo(0.022f, 21.858f)
                lineToRelative(2.206f, 2.034f)
                lineToRelative(4.441f, -4.819f)
                arcTo(17.31f, 17.31f, 0.0f, false, false, 24.0f, 3.0f)
                verticalLineTo(2.645f)
                arcTo(2.584f, 2.584f, 0.0f, false, false, 22.363f, 0.19f)
                close()
                moveTo(9.739f, 15.743f)
                lineTo(20.959f, 3.571f)
                curveTo(20.635f, 6.276f, 18.225f, 14.036f, 9.739f, 15.743f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
