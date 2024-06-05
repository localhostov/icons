package me.localx.icons.rounded.bold

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
                moveTo(19.5f, 21.0f)
                horizontalLineToRelative(-0.8f)
                arcTo(8.963f, 8.963f, 0.0f, false, false, 21.0f, 15.0f)
                curveToRelative(0.0f, -4.962f, -6.408f, -10.206f, -7.879f, -11.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.262f, -0.014f)
                curveTo(9.28f, 4.707f, 3.0f, 9.3f, 3.0f, 15.0f)
                arcToRelative(8.963f, 8.963f, 0.0f, false, false, 2.3f, 6.0f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -3.413f, 3.726f, -6.842f, 5.935f, -8.453f)
                arcTo(29.75f, 29.75f, 0.0f, false, true, 14.38f, 8.818f)
                lineToRelative(-3.043f, 3.734f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.326f, 1.895f)
                lineToRelative(2.687f, -3.3f)
                arcTo(7.245f, 7.245f, 0.0f, false, true, 18.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 15.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
