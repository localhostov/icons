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

public val Icons.Filled.OilCan: ImageVector
    get() {
        if (_oilCan != null) {
            return _oilCan!!
        }
        _oilCan = Builder(name = "OilCan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.587f, 8.19f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -0.9f, -0.14f)
                lineTo(16.857f, 9.961f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.911f, -0.19f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 12.691f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.973f)
                lineTo(4.046f, 7.189f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 10.0f)
                verticalLineToRelative(1.465f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.671f, 3.772f)
                lineTo(4.0f, 15.708f)
                verticalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(5.149f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, false, 3.812f, -1.764f)
                lineToRelative(6.8f, -8.01f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 9.578f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.587f, 8.19f)
                close()
                moveTo(3.335f, 13.353f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 11.467f)
                verticalLineTo(10.0f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, true, 0.429f, -0.821f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, 0.88f, -0.132f)
                lineTo(4.0f, 9.34f)
                verticalLineToRelative(4.247f)
                close()
                moveTo(23.414f, 16.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, 0.0f)
                lineToRelative(0.8f, -0.9f)
                arcToRelative(0.819f, 0.819f, 0.0f, false, true, 1.226f, 0.0f)
                close()
            }
        }
        .build()
        return _oilCan!!
    }

private var _oilCan: ImageVector? = null
