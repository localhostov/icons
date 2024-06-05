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
                horizontalLineTo(13.863f)
                lineTo(10.424f, 1.824f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.351f, 0.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.351f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, true, 0.445f, 0.272f)
                lineTo(10.429f, 8.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(10.429f)
                lineTo(7.79f, 20.739f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.351f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(7.351f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, false, 3.066f, -1.812f)
                lineTo(13.863f, 16.0f)
                horizontalLineToRelative(4.143f)
                arcToRelative(7.839f, 7.839f, 0.0f, false, false, 3.84f, -0.964f)
                curveToRelative(1.78f, -1.0f, 2.154f, -2.2f, 2.154f, -3.036f)
                reflectiveCurveTo(23.626f, 9.966f, 21.846f, 8.964f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, true, -0.6f, 1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(9.4f)
                arcTo(1.362f, 1.362f, 0.0f, false, true, 18.0f, 12.0f)
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
