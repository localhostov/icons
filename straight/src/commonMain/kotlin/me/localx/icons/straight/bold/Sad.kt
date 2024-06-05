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

public val Icons.Bold.Sad: ImageVector
    get() {
        if (_sad != null) {
            return _sad!!
        }
        _sad = Builder(name = "Sad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, 9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(17.5f, 15.181f)
                arcTo(9.162f, 9.162f, 0.0f, false, false, 12.0f, 13.0f)
                arcToRelative(9.162f, 9.162f, 0.0f, false, false, -5.5f, 2.181f)
                lineToRelative(1.993f, 2.242f)
                arcTo(6.151f, 6.151f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(6.151f, 6.151f, 0.0f, false, true, 3.506f, 1.423f)
                close()
                moveTo(6.0f, 9.667f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 8.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 6.0f, 9.667f)
                close()
                moveTo(13.0f, 9.667f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(18.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 13.0f, 9.667f)
                close()
            }
        }
        .build()
        return _sad!!
    }

private var _sad: ImageVector? = null
