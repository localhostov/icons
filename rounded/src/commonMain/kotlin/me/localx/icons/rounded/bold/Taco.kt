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

public val Icons.Bold.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.379f, 8.21f)
                arcTo(6.875f, 6.875f, 0.0f, false, false, 23.0f, 5.667f)
                arcTo(2.844f, 2.844f, 0.0f, false, false, 20.0f, 3.0f)
                arcToRelative(2.456f, 2.456f, 0.0f, false, false, -2.312f, -2.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -1.013f, 0.3f)
                arcTo(2.724f, 2.724f, 0.0f, false, false, 14.5f, 0.0f)
                arcToRelative(2.707f, 2.707f, 0.0f, false, false, -2.15f, 1.324f)
                arcTo(2.43f, 2.43f, 0.0f, false, false, 11.337f, 1.0f)
                arcTo(2.484f, 2.484f, 0.0f, false, false, 9.0f, 3.0f)
                arcTo(2.844f, 2.844f, 0.0f, false, false, 6.0f, 5.667f)
                arcToRelative(6.725f, 6.725f, 0.0f, false, false, 0.583f, 2.451f)
                arcTo(9.194f, 9.194f, 0.0f, false, false, 5.0f, 13.3f)
                lineTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(3.0f, 12.846f)
                arcTo(7.031f, 7.031f, 0.0f, false, true, 4.23f, 8.858f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 1.77f, 7.142f)
                arcTo(10.049f, 10.049f, 0.0f, false, false, 0.0f, 12.846f)
                lineTo(0.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(18.5f, 24.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineToRelative(-5.0f)
                arcTo(9.535f, 9.535f, 0.0f, false, false, 22.379f, 8.21f)
                close()
                moveTo(21.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                lineTo(7.874f, 21.0f)
                arcTo(4.024f, 4.024f, 0.0f, false, false, 8.0f, 20.0f)
                lineTo(8.0f, 13.3f)
                arcToRelative(6.254f, 6.254f, 0.0f, false, true, 6.064f, -6.289f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 13.5f)
                close()
                moveTo(19.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 13.5f)
                close()
                moveTo(16.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 17.5f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
