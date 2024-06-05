package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 17.0f)
                horizontalLineTo(7.329f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, -2.122f, -0.879f)
                lineTo(0.052f, 10.966f)
                curveTo(0.023f, 11.308f, 0.0f, 11.651f, 0.0f, 12.0f)
                arcTo(12.009f, 12.009f, 0.0f, false, false, 11.0f, 23.949f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.436f, 3.478f)
                lineToRelative(-1.79f, 1.79f)
                arcTo(2.516f, 2.516f, 0.0f, false, true, 16.879f, 6.0f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(0.962f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, 0.353f)
                lineToRelative(2.625f, 2.626f)
                arcTo(11.949f, 11.949f, 0.0f, false, false, 20.436f, 3.478f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.962f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 4.0f)
                horizontalLineToRelative(1.379f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, 0.353f, -0.146f)
                lineToRelative(1.661f, -1.661f)
                arcTo(11.974f, 11.974f, 0.0f, false, false, 0.5f, 8.587f)
                lineToRelative(6.12f, 6.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.329f, 15.0f)
                horizontalLineTo(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(5.949f)
                arcToRelative(11.962f, 11.962f, 0.0f, false, false, 7.483f, -3.469f)
                lineToRelative(-2.751f, -2.751f)
                arcTo(2.516f, 2.516f, 0.0f, false, true, 17.0f, 15.962f)
                close()
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
