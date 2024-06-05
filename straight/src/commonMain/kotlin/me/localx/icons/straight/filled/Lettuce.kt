package me.localx.icons.straight.filled

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

public val Icons.Filled.Lettuce: ImageVector
    get() {
        if (_lettuce != null) {
            return _lettuce!!
        }
        _lettuce = Builder(name = "Lettuce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 10.838f)
                arcTo(4.884f, 4.884f, 0.0f, false, true, 19.0f, 13.0f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, true, -2.0f, 3.979f)
                verticalLineTo(17.0f)
                arcToRelative(4.972f, 4.972f, 0.0f, false, true, -0.854f, 2.792f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(-3.1f, 4.2f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-0.044f)
                lineToRelative(-3.1f, -4.2f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(4.972f, 4.972f, 0.0f, false, true, 7.0f, 17.0f)
                verticalLineToRelative(-0.021f)
                arcTo(4.991f, 4.991f, 0.0f, false, true, 5.0f, 13.0f)
                arcToRelative(4.884f, 4.884f, 0.0f, false, true, 0.5f, -2.162f)
                arcToRelative(4.486f, 4.486f, 0.0f, false, true, 2.62f, -7.822f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.754f, 0.0f)
                arcToRelative(4.486f, 4.486f, 0.0f, false, true, 2.62f, 7.822f)
                close()
                moveTo(24.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.961f, -3.846f)
                arcToRelative(6.378f, 6.378f, 0.0f, false, true, -0.258f, 7.117f)
                arcTo(6.846f, 6.846f, 0.0f, false, true, 21.0f, 13.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, -2.065f, 4.941f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -2.042f, 4.049f)
                curveToRelative(0.036f, 0.0f, 0.071f, 0.01f, 0.107f, 0.01f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-0.021f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, 1.227f, -6.633f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 24.0f, 8.0f)
                close()
                moveTo(0.773f, 10.346f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 2.0f, 16.979f)
                verticalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                curveToRelative(0.036f, 0.0f, 0.071f, -0.009f, 0.107f, -0.01f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -2.042f, -4.049f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 3.0f, 13.0f)
                arcToRelative(6.846f, 6.846f, 0.0f, false, true, 0.219f, -1.729f)
                arcToRelative(6.378f, 6.378f, 0.0f, false, true, -0.258f, -7.117f)
                arcTo(3.969f, 3.969f, 0.0f, false, false, 0.773f, 10.346f)
                close()
            }
        }
        .build()
        return _lettuce!!
    }

private var _lettuce: ImageVector? = null
