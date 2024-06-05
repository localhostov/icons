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

public val Icons.Filled.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.259f, 2.845f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, true, 6.741f, -2.794f)
                verticalLineToRelative(1.3f)
                arcToRelative(11.938f, 11.938f, 0.0f, false, false, 2.28f, 6.689f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, -0.137f, 1.4f)
                lineToRelative(-0.367f, 0.367f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.552f, 0.0f)
                close()
                moveTo(17.59f, 7.824f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.186f, 1.711f)
                arcToRelative(9.939f, 9.939f, 0.0f, false, false, 4.93f, 1.465f)
                horizontalLineToRelative(1.243f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, false, -2.794f, -6.741f)
                close()
                moveTo(13.0f, 0.051f)
                verticalLineToRelative(1.272f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, 1.465f, 4.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 1.71f, 0.186f)
                lineToRelative(3.566f, -3.566f)
                arcToRelative(11.941f, 11.941f, 0.0f, false, false, -6.741f, -2.792f)
                close()
                moveTo(14.557f, 10.857f)
                lineTo(14.19f, 11.224f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, 1.552f)
                lineToRelative(6.965f, 6.965f)
                arcToRelative(11.941f, 11.941f, 0.0f, false, false, 2.794f, -6.741f)
                horizontalLineToRelative(-1.272f)
                arcToRelative(11.966f, 11.966f, 0.0f, false, true, -6.717f, -2.28f)
                arcToRelative(1.092f, 1.092f, 0.0f, false, false, -1.403f, 0.137f)
                close()
                moveTo(9.443f, 13.143f)
                lineTo(9.81f, 12.776f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, -1.552f)
                lineToRelative(-6.965f, -6.965f)
                arcToRelative(11.941f, 11.941f, 0.0f, false, false, -2.794f, 6.741f)
                horizontalLineToRelative(1.272f)
                arcToRelative(11.964f, 11.964f, 0.0f, false, true, 6.717f, 2.28f)
                arcToRelative(1.092f, 1.092f, 0.0f, false, false, 1.403f, -0.137f)
                close()
                moveTo(11.224f, 14.19f)
                lineTo(10.857f, 14.557f)
                arcToRelative(1.092f, 1.092f, 0.0f, false, false, -0.137f, 1.4f)
                arcToRelative(11.929f, 11.929f, 0.0f, false, true, 2.28f, 6.691f)
                verticalLineToRelative(1.3f)
                arcToRelative(11.941f, 11.941f, 0.0f, false, false, 6.741f, -2.794f)
                lineToRelative(-6.965f, -6.964f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.552f, 0.0f)
                close()
                moveTo(11.0f, 22.677f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, -1.465f, -4.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.71f, -0.185f)
                lineToRelative(-3.566f, 3.563f)
                arcToRelative(11.941f, 11.941f, 0.0f, false, false, 6.741f, 2.794f)
                close()
                moveTo(1.294f, 13.0f)
                horizontalLineToRelative(-1.243f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, false, 2.794f, 6.741f)
                lineToRelative(3.565f, -3.565f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.186f, -1.711f)
                arcToRelative(9.939f, 9.939f, 0.0f, false, false, -4.93f, -1.465f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
