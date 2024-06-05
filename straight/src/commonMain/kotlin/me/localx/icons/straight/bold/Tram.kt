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

public val Icons.Bold.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 9.0f, 4.732f)
                lineTo(9.0f, 9.0f)
                lineTo(3.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 12.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 9.0f)
                close()
                moveTo(21.0f, 12.5f)
                lineTo(21.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 12.0f)
                horizontalLineToRelative(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.0f, 12.5f)
                close()
                moveTo(14.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(10.0f, 16.0f)
                lineTo(10.0f, 12.0f)
                close()
                moveTo(3.5f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 12.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 12.0f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(3.0f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 2.0f)
                close()
                moveTo(7.233f, 5.876f)
                lineTo(0.0f, 7.1f)
                lineTo(0.0f, 4.056f)
                lineTo(6.0f, 3.041f)
                arcTo(3.978f, 3.978f, 0.0f, false, false, 7.233f, 5.876f)
                close()
                moveTo(24.0f, 0.0f)
                lineTo(24.0f, 3.043f)
                lineToRelative(-5.546f, 0.937f)
                arcTo(3.946f, 3.946f, 0.0f, false, false, 19.0f, 2.0f)
                arcTo(3.946f, 3.946f, 0.0f, false, false, 18.819f, 0.876f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
