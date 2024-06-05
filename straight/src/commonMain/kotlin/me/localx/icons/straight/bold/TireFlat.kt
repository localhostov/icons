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

public val Icons.Bold.TireFlat: ImageVector
    get() {
        if (_tireFlat != null) {
            return _tireFlat!!
        }
        _tireFlat = Builder(name = "TireFlat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.564f, 19.228f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -19.121f, 0.013f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, 1.064f, -4.772f)
                close()
                moveTo(18.892f, 17.773f)
                arcToRelative(2.687f, 2.687f, 0.0f, false, false, -0.83f, 2.469f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, false, 0.362f, 0.758f)
                lineTo(5.58f, 21.0f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, false, 0.358f, -0.759f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, false, -0.871f, -2.517f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 13.825f, 0.049f)
                close()
                moveTo(12.0f, 14.773f)
                lineTo(14.75f, 18.44f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, -5.5f, 0.0f)
                close()
                moveTo(9.625f, 12.935f)
                lineTo(6.813f, 16.684f)
                arcTo(6.963f, 6.963f, 0.0f, false, true, 5.0f, 12.0f)
                arcToRelative(7.091f, 7.091f, 0.0f, false, true, 0.063f, -0.891f)
                close()
                moveTo(10.5f, 10.053f)
                lineTo(6.078f, 8.284f)
                arcTo(7.016f, 7.016f, 0.0f, false, true, 10.5f, 5.166f)
                close()
                moveTo(17.922f, 8.285f)
                lineTo(13.5f, 10.053f)
                lineTo(13.5f, 5.166f)
                arcTo(7.014f, 7.014f, 0.0f, false, true, 17.922f, 8.285f)
                close()
                moveTo(14.375f, 12.934f)
                lineTo(18.937f, 11.109f)
                arcTo(7.091f, 7.091f, 0.0f, false, true, 19.0f, 12.0f)
                arcToRelative(6.963f, 6.963f, 0.0f, false, true, -1.813f, 4.684f)
                close()
            }
        }
        .build()
        return _tireFlat!!
    }

private var _tireFlat: ImageVector? = null
