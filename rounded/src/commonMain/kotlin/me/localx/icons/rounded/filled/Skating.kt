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

public val Icons.Filled.Skating: ImageVector
    get() {
        if (_skating != null) {
            return _skating!!
        }
        _skating = Builder(name = "Skating", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 21.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 0.0f)
                close()
                moveTo(8.707f, 18.474f)
                lineTo(5.685f, 21.5f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.7f, 0.3f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, 0.71f, -0.286f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.429f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 6.6f, 24.0f)
                horizontalLineTo(6.57f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, -2.112f, -0.9f)
                lineToRelative(-2.8f, -2.856f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.428f, -1.4f)
                lineToRelative(1.2f, 1.224f)
                lineTo(7.293f, 17.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineTo(18.845f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.312f, -0.725f)
                lineToRelative(-3.4f, -3.229f)
                lineToRelative(4.83f, -4.829f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.1f, -4.338f)
                lineToRelative(-0.67f, -0.56f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 13.145f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                horizontalLineToRelative(7.781f)
                lineTo(9.0f, 9.783f)
                arcToRelative(3.35f, 3.35f, 0.0f, false, false, 0.062f, 4.8f)
                lineTo(14.0f, 19.274f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _skating!!
    }

private var _skating: ImageVector? = null
