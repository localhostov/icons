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

public val Icons.Bold.SpaceShuttle: ImageVector
    get() {
        if (_spaceShuttle != null) {
            return _spaceShuttle!!
        }
        _spaceShuttle = Builder(name = "SpaceShuttle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.846f, 8.964f)
                arcTo(7.839f, 7.839f, 0.0f, false, false, 18.006f, 8.0f)
                horizontalLineTo(14.36f)
                lineTo(11.454f, 2.812f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.656f, 0.0f)
                horizontalLineTo(5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 3.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineTo(6.656f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.837f, 4.278f)
                lineTo(10.922f, 8.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(7.922f)
                lineTo(8.837f, 19.722f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.656f, 21.0f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineTo(6.656f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 4.8f, -2.812f)
                lineTo(14.36f, 16.0f)
                horizontalLineToRelative(3.646f)
                arcToRelative(7.839f, 7.839f, 0.0f, false, false, 3.84f, -0.964f)
                curveTo(24.76f, 13.314f, 24.762f, 10.688f, 21.846f, 8.964f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(9.4f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
