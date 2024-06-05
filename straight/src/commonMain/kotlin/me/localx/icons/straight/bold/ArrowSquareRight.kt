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

public val Icons.Bold.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) {
            return _arrowSquareRight!!
        }
        _arrowSquareRight = Builder(name = "ArrowSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 0.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(10.922f, 8.128f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(4.243f, 4.243f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 3.535f)
                lineToRelative(-4.243f, 4.242f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.39f, -2.389f)
                horizontalLineTo(5.983f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.329f)
                close()
            }
        }
        .build()
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
