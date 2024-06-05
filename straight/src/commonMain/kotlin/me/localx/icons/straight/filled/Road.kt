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

public val Icons.Filled.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.276f, 2.48f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.321f, 0.0f)
                lineTo(6.681f, 0.0f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 3.726f, 2.483f)
                lineTo(-0.039f, 24.0f)
                horizontalLineToRelative(24.1f)
                close()
                moveTo(13.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
