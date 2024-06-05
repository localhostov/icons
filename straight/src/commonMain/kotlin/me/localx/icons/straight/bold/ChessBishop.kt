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

public val Icons.Bold.ChessBishop: ImageVector
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
                curveToRelative(0.0f, -4.962f, -6.408f, -10.206f, -7.879f, -11.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.262f, -0.014f)
                curveTo(9.28f, 4.707f, 3.0f, 9.3f, 3.0f, 15.0f)
                arcToRelative(8.963f, 8.963f, 0.0f, false, false, 2.3f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.7f)
                arcTo(8.963f, 8.963f, 0.0f, false, false, 21.0f, 15.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -3.413f, 3.726f, -6.842f, 5.935f, -8.453f)
                arcToRelative(29.557f, 29.557f, 0.0f, false, true, 2.469f, 2.3f)
                lineToRelative(-3.375f, 4.218f)
                lineToRelative(2.342f, 1.876f)
                lineToRelative(3.0f, -3.755f)
                arcTo(7.207f, 7.207f, 0.0f, false, true, 18.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 15.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
