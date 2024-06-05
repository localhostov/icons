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

public val Icons.Bold.Luchador: ImageVector
    get() {
        if (_luchador != null) {
            return _luchador!!
        }
        _luchador = Builder(name = "Luchador", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(8.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 10.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 11.776f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.241f, 12.241f, 0.0f, false, false, 0.0f, 12.348f)
                lineTo(0.0f, 24.0f)
                lineTo(8.933f, 24.0f)
                lineToRelative(1.56f, -3.106f)
                arcTo(1.719f, 1.719f, 0.0f, false, true, 12.0f, 20.0f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 1.483f, 0.85f)
                lineTo(15.067f, 24.0f)
                lineTo(24.0f, 24.0f)
                close()
                moveTo(16.14f, 19.458f)
                arcToRelative(4.715f, 4.715f, 0.0f, false, false, -8.3f, 0.044f)
                lineTo(7.083f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 12.348f)
                arcTo(9.226f, 9.226f, 0.0f, false, true, 11.831f, 3.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.034f, 9.034f, 0.0f, false, true, 6.474f, 2.577f)
                arcTo(8.932f, 8.932f, 0.0f, false, true, 21.0f, 12.0f)
                verticalLineToRelative(9.0f)
                lineTo(16.916f, 21.0f)
                close()
            }
        }
        .build()
        return _luchador!!
    }

private var _luchador: ImageVector? = null
