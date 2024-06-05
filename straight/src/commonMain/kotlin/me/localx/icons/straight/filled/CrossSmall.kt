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

public val Icons.Filled.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.707f, 6.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-5.293f, 5.293f)
                lineToRelative(-5.293f, -5.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(5.293f, 5.293f)
                lineToRelative(-5.293f, 5.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.293f, -5.293f)
                lineToRelative(5.293f, 5.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.293f, -5.293f)
                lineToRelative(5.293f, -5.293f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
