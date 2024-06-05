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

public val Icons.Filled.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                curveToRelative(0.0f, -2.248f, -1.382f, -4.605f, -3.022f, -6.621f)
                lineToRelative(-5.0f, 6.246f)
                lineToRelative(-1.562f, -1.25f)
                lineToRelative(5.219f, -6.523f)
                arcToRelative(36.358f, 36.358f, 0.0f, false, false, -3.489f, -3.219f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 10.807f, 3.6f)
                curveTo(8.814f, 4.987f, 3.0f, 9.511f, 3.0f, 15.0f)
                arcToRelative(8.983f, 8.983f, 0.0f, false, false, 3.356f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.645f)
                arcTo(8.985f, 8.985f, 0.0f, false, false, 21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
