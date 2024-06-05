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

public val Icons.Bold.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3f, 20.022f)
                arcTo(64.16f, 64.16f, 0.0f, false, true, 10.531f, 9.589f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.825f, 7.8f)
                reflectiveCurveToRelative(0.849f, -1.316f, 0.878f, -1.378f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 8.9f, 2.0f)
                horizontalLineTo(8.51f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.1f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 2.3f, 6.419f)
                curveToRelative(0.029f, 0.062f, 0.878f, 1.378f, 0.878f, 1.378f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.3f, 1.793f)
                arcTo(63.41f, 63.41f, 0.0f, false, true, 1.7f, 20.022f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 24.0f)
                horizontalLineTo(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.3f, -3.978f)
                close()
                moveTo(7.55f, 10.0f)
                arcTo(64.939f, 64.939f, 0.0f, false, false, 9.205f, 20.0f)
                horizontalLineTo(4.8f)
                arcTo(64.007f, 64.007f, 0.0f, false, false, 6.451f, 10.0f)
                close()
                moveTo(5.1f, 5.0f)
                horizontalLineTo(8.9f)
                lineToRelative(0.082f, 0.129f)
                lineTo(7.767f, 7.0f)
                horizontalLineTo(6.233f)
                lineTo(4.979f, 5.066f)
                close()
                moveTo(24.0f, 9.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.0f, 2.0f)
                verticalLineToRelative(7.057f)
                arcTo(4.006f, 4.006f, 0.0f, false, true, 15.444f, 20.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.268f, 3.268f, 0.0f, false, true, 16.0f, 22.0f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, true, -0.556f, 2.0f)
                horizontalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, -3.732f)
                verticalLineTo(11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 9.5f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
