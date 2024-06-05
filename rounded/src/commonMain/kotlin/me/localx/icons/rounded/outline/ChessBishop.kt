package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineTo(17.65f)
                arcTo(8.985f, 8.985f, 0.0f, false, false, 21.0f, 15.0f)
                curveToRelative(0.0f, -4.677f, -5.961f, -9.848f, -7.846f, -11.367f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 10.8f, 3.6f)
                curveTo(8.786f, 5.009f, 3.0f, 9.531f, 3.0f, 15.0f)
                arcToRelative(8.985f, 8.985f, 0.0f, false, false, 3.35f, 7.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(0.0f, -4.485f, 5.2f, -8.526f, 6.958f, -9.765f)
                arcToRelative(33.425f, 33.425f, 0.0f, false, true, 3.4f, 3.172f)
                lineToRelative(-4.127f, 4.952f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.536f, 1.282f)
                lineTo(16.68f, 9.946f)
                curveTo(18.0f, 11.619f, 19.0f, 13.423f, 19.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 15.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
