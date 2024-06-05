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

public val Icons.Filled.ChessPawnAlt: ImageVector
    get() {
        if (_chessPawnAlt != null) {
            return _chessPawnAlt!!
        }
        _chessPawnAlt = Builder(name = "ChessPawnAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 6.0f)
                horizontalLineToRelative(0.537f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.926f, 0.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 7.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(15.067f, 10.0f)
                horizontalLineTo(8.933f)
                curveTo(8.569f, 15.261f, 6.775f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(19.0f)
                curveTo(17.225f, 18.0f, 15.431f, 15.261f, 15.067f, 10.0f)
                close()
            }
        }
        .build()
        return _chessPawnAlt!!
    }

private var _chessPawnAlt: ImageVector? = null
