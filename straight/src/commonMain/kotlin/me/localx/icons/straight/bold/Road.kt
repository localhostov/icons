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

public val Icons.Bold.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.55f, 2.906f)
                lineTo(0.0f, 24.0f)
                lineTo(24.033f, 24.0f)
                lineTo(20.451f, 2.892f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.0f, 0.0f)
                close()
                moveTo(3.543f, 21.0f)
                lineTo(6.506f, 3.414f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 3.0f)
                lineTo(17.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.491f, 0.4f)
                lineTo(20.48f, 21.0f)
                close()
                moveTo(10.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 8.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
