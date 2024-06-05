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

public val Icons.Bold.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = Builder(name = "Curling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.315f, 9.258f)
                lineToRelative(-0.247f, -0.986f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.158f, 6.0f)
                horizontalLineTo(7.536f)
                lineToRelative(0.232f, -1.042f)
                arcTo(2.485f, 2.485f, 0.0f, false, true, 10.209f, 3.0f)
                horizontalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(10.209f)
                arcTo(5.466f, 5.466f, 0.0f, false, false, 4.84f, 4.307f)
                lineTo(3.651f, 9.659f)
                arcTo(6.507f, 6.507f, 0.0f, false, false, 0.0f, 15.5f)
                verticalLineToRelative(2.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 6.5f, 24.0f)
                horizontalLineToRelative(11.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 24.0f, 17.5f)
                verticalLineToRelative(-2.0f)
                arcTo(6.512f, 6.512f, 0.0f, false, false, 19.315f, 9.258f)
                close()
                moveTo(20.964f, 15.0f)
                horizontalLineTo(3.036f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.5f, 12.0f)
                horizontalLineToRelative(11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.964f, 15.0f)
                close()
                moveTo(17.5f, 21.0f)
                horizontalLineTo(6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, -3.0f)
                horizontalLineTo(20.964f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.5f, 21.0f)
                close()
            }
        }
        .build()
        return _curling!!
    }

private var _curling: ImageVector? = null
