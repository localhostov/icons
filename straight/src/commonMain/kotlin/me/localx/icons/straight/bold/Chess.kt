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
                moveTo(11.184f, 20.1f)
                arcTo(108.043f, 108.043f, 0.0f, false, true, 10.0f, 8.0f)
                lineToRelative(0.0f, -1.462f)
                lineTo(10.882f, 4.4f)
                arcToRelative(1.635f, 1.635f, 0.0f, false, false, -0.255f, -1.64f)
                arcTo(2.115f, 2.115f, 0.0f, false, false, 8.973f, 2.0f)
                horizontalLineTo(8.026f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, false, -1.654f, 0.761f)
                arcToRelative(1.644f, 1.644f, 0.0f, false, false, -0.25f, 1.653f)
                lineTo(3.0f, 6.533f)
                verticalLineTo(8.0f)
                arcTo(107.749f, 107.749f, 0.0f, false, true, 1.861f, 20.083f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 22.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.184f, 20.1f)
                close()
                moveTo(7.039f, 9.5f)
                curveToRelative(0.151f, 3.336f, 0.707f, 7.709f, 1.1f, 10.5f)
                horizontalLineTo(4.9f)
                curveToRelative(0.382f, -2.787f, 0.922f, -7.156f, 1.062f, -10.5f)
                close()
                moveTo(22.0f, 20.05f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.762f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 15.0f, 22.5f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(22.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 20.05f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
