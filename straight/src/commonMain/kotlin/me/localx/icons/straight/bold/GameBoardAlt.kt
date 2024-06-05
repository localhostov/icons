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

public val Icons.Bold.GameBoardAlt: ImageVector
    get() {
        if (_gameBoardAlt != null) {
            return _gameBoardAlt!!
        }
        _gameBoardAlt = Builder(name = "GameBoardAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _gameBoardAlt!!
    }

private var _gameBoardAlt: ImageVector? = null
