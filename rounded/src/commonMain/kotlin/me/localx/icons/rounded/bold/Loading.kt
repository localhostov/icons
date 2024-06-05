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

public val Icons.Bold.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }
        _loading = Builder(name = "Loading", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
                moveTo(13.5f, 22.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(17.476f, 5.329f)
                lineTo(18.457f, 3.586f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.613f, -1.473f)
                lineToRelative(-0.982f, 1.743f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.571f, 2.044f)
                arcToRelative(1.484f, 1.484f, 0.0f, false, false, 0.735f, 0.194f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.308f, -0.765f)
                close()
                moveTo(8.156f, 21.887f)
                lineTo(9.138f, 20.144f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.614f, -1.473f)
                lineToRelative(-0.981f, 1.743f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.613f, 1.473f)
                close()
                moveTo(5.9f, 8.567f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.57f, -2.043f)
                lineToRelative(-1.744f, -0.981f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.473f, 2.613f)
                lineToRelative(1.743f, 0.982f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.044f, -0.571f)
                close()
                moveTo(22.458f, 17.887f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.57f, -2.043f)
                lineToRelative(-1.743f, -0.982f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.473f, 2.614f)
                lineToRelative(1.743f, 0.981f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.043f, -0.57f)
                close()
                moveTo(8.567f, 5.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.571f, -2.043f)
                lineToRelative(-0.982f, -1.744f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.613f, 1.473f)
                lineToRelative(0.981f, 1.743f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.308f, 0.764f)
                arcToRelative(1.484f, 1.484f, 0.0f, false, false, 0.735f, -0.193f)
                close()
                moveTo(17.887f, 22.458f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.57f, -2.043f)
                lineToRelative(-0.981f, -1.743f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.614f, 1.473f)
                lineToRelative(0.982f, 1.743f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.043f, 0.57f)
                close()
                moveTo(20.144f, 9.138f)
                lineTo(21.887f, 8.156f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.473f, -2.613f)
                lineToRelative(-1.743f, 0.981f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.473f, 2.614f)
                close()
                moveTo(3.586f, 18.457f)
                lineTo(5.329f, 17.476f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.473f, -2.614f)
                lineToRelative(-1.743f, 0.982f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.738f, 2.806f)
                arcToRelative(1.483f, 1.483f, 0.0f, false, false, 0.735f, -0.193f)
                close()
            }
        }
        .build()
        return _loading!!
    }

private var _loading: ImageVector? = null
