package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.24f, 24.0f)
                arcToRelative(2.262f, 2.262f, 0.0f, false, true, -0.948f, -0.212f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, true, -1.2f, -2.622f)
                lineTo(10.653f, 16.0f)
                horizontalLineTo(6.975f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.1f, 12.131f)
                lineToRelative(3.024f, -10.0f)
                arcTo(2.983f, 2.983f, 0.0f, false, true, 10.0f, 0.0f)
                horizontalLineToRelative(3.693f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.433f, 3.511f)
                lineTo(14.443f, 8.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.483f, 4.684f)
                lineToRelative(-6.4f, 10.3f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 11.24f, 24.0f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
