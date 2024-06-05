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

public val Icons.Filled.Cars: ImageVector
    get() {
        if (_cars != null) {
            return _cars!!
        }
        _cars = Builder(name = "Cars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.319f, 8.0f)
                horizontalLineToRelative(4.362f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, 4.709f, 3.318f)
                lineToRelative(0.853f, 2.388f)
                arcTo(13.11f, 13.11f, 0.0f, false, true, 23.623f, 15.0f)
                horizontalLineTo(7.377f)
                arcToRelative(13.11f, 13.11f, 0.0f, false, true, 0.38f, -1.294f)
                lineToRelative(0.853f, -2.388f)
                arcTo(5.01f, 5.01f, 0.0f, false, true, 13.319f, 8.0f)
                close()
                moveTo(24.0f, 18.079f)
                curveToRelative(0.0f, -0.362f, -0.016f, -0.721f, -0.046f, -1.079f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.046f)
                arcTo(4.221f, 4.221f, 0.0f, false, false, 9.0f, 21.476f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.524f)
                arcTo(3.909f, 3.909f, 0.0f, false, false, 24.0f, 18.079f)
                close()
                moveTo(15.912f, 5.706f)
                lineTo(15.06f, 3.318f)
                arcTo(5.012f, 5.012f, 0.0f, false, false, 10.351f, 0.0f)
                horizontalLineTo(5.988f)
                arcTo(5.012f, 5.012f, 0.0f, false, false, 1.279f, 3.318f)
                lineTo(0.427f, 5.706f)
                curveTo(0.392f, 5.8f, 0.372f, 5.9f, 0.34f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(15.967f, 5.9f, 15.947f, 5.8f, 15.912f, 5.706f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(0.046f)
                curveTo(0.016f, 8.358f, 0.0f, 9.717f, 0.0f, 10.079f)
                arcToRelative(3.909f, 3.909f, 0.0f, false, false, 2.0f, 3.4f)
                verticalLineTo(14.0f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, 3.168f, 1.616f)
                lineToRelative(0.267f, -1.09f)
                arcToRelative(14.553f, 14.553f, 0.0f, false, true, 0.439f, -1.492f)
                lineToRelative(0.853f, -2.388f)
                arcTo(6.973f, 6.973f, 0.0f, false, true, 8.43f, 8.0f)
                close()
            }
        }
        .build()
        return _cars!!
    }

private var _cars: ImageVector? = null
