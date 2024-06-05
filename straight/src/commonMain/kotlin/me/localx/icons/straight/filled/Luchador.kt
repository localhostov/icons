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

public val Icons.Filled.Luchador: ImageVector
    get() {
        if (_luchador != null) {
            return _luchador!!
        }
        _luchador = Builder(name = "Luchador", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 13.0f)
                close()
                moveTo(24.0f, 12.0f)
                lineTo(24.0f, 24.0f)
                lineTo(16.727f, 24.0f)
                lineToRelative(-1.769f, -3.245f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, false, -5.916f, 0.0f)
                lineTo(7.273f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 12.365f)
                arcTo(12.248f, 12.248f, 0.0f, false, true, 11.775f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(11.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
                moveTo(15.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(18.0f, 12.0f)
                lineTo(16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 13.0f)
                close()
            }
        }
        .build()
        return _luchador!!
    }

private var _luchador: ImageVector? = null
