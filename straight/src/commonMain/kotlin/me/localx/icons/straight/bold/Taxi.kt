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

public val Icons.Bold.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.379f, 5.393f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.059f, 3.0f)
                horizontalLineTo(16.0f)
                lineToRelative(-0.544f, -1.632f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.558f, 0.0f)
                horizontalLineTo(10.442f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.9f, 1.368f)
                lineTo(8.0f, 3.0f)
                horizontalLineTo(6.941f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.32f, 2.394f)
                lineTo(2.752f, 8.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(1.752f)
                lineTo(1.1f, 12.969f)
                arcTo(3.481f, 3.481f, 0.0f, false, false, 0.0f, 15.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.5f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, false, -1.1f, -2.531f)
                lineTo(22.248f, 11.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.248f)
                close()
                moveTo(17.0f, 16.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 16.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 16.5f)
                close()
                moveTo(6.941f, 6.0f)
                horizontalLineTo(17.059f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.474f, 0.342f)
                lineTo(19.419f, 12.0f)
                horizontalLineTo(4.581f)
                lineTo(6.467f, 6.342f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.941f, 6.0f)
                close()
                moveTo(5.5f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 16.5f)
                horizontalLineTo(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 16.5f)
                horizontalLineTo(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 18.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
