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

public val Icons.Filled.Sunrise: ImageVector
    get() {
        if (_sunrise != null) {
            return _sunrise!!
        }
        _sunrise = Builder(name = "Sunrise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(5.071f, 11.0f)
                arcToRelative(6.948f, 6.948f, 0.0f, false, true, 0.434f, -1.609f)
                lineTo(1.982f, 7.349f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.731f)
                lineTo(6.51f, 7.662f)
                arcTo(7.053f, 7.053f, 0.0f, false, true, 7.662f, 6.51f)
                lineTo(5.618f, 2.984f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.731f, -1.0f)
                lineTo(9.39f, 5.505f)
                arcTo(6.943f, 6.943f, 0.0f, false, true, 11.0f, 5.071f)
                lineTo(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 5.071f)
                arcToRelative(6.948f, 6.948f, 0.0f, false, true, 1.609f, 0.434f)
                lineToRelative(2.042f, -3.524f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.731f, 1.0f)
                lineTo(16.338f, 6.51f)
                arcTo(7.053f, 7.053f, 0.0f, false, true, 17.49f, 7.662f)
                lineToRelative(3.525f, -2.044f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.731f)
                lineTo(18.5f, 9.391f)
                arcTo(6.948f, 6.948f, 0.0f, false, true, 18.929f, 11.0f)
                lineTo(23.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(1.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(22.332f, 21.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.385f, -0.811f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.889f, -0.011f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, true, -4.115f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.885f, 0.0f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, true, -4.114f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.885f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.389f, 0.822f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.332f, 22.978f)
                arcTo(4.185f, 4.185f, 0.0f, false, false, 6.0f, 22.774f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.336f, -1.489f)
                close()
                moveTo(22.332f, 16.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.385f, -0.811f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.889f, -0.011f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, true, -4.115f, 0.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.885f, 0.0f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, true, -4.114f, 0.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.885f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.389f, 0.822f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.332f, 17.978f)
                arcTo(4.185f, 4.185f, 0.0f, false, false, 6.0f, 17.774f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.336f, -1.489f)
                close()
            }
        }
        .build()
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
