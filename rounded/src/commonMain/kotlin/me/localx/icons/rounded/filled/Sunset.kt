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

public val Icons.Filled.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(5.071f)
                arcTo(6.991f, 6.991f, 0.0f, false, true, 5.5f, 20.39f)
                lineTo(1.982f, 18.349f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.731f)
                lineTo(6.51f, 18.662f)
                arcTo(7.053f, 7.053f, 0.0f, false, true, 7.662f, 17.51f)
                lineTo(5.618f, 13.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.731f, -1.0f)
                lineTo(9.39f, 16.5f)
                arcTo(6.991f, 6.991f, 0.0f, false, true, 11.0f, 16.071f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.071f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 1.609f, 0.433f)
                lineToRelative(2.042f, -3.522f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.731f, 1.0f)
                lineTo(16.338f, 17.51f)
                arcToRelative(7.047f, 7.047f, 0.0f, false, true, 1.151f, 1.152f)
                lineToRelative(3.527f, -2.044f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.731f)
                lineTo(18.5f, 20.39f)
                arcTo(6.894f, 6.894f, 0.0f, false, true, 18.929f, 22.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 24.0f)
                close()
                moveTo(8.3f, 5.708f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.3f, 4.293f)
                lineTo(13.0f, 5.586f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(5.586f)
                lineTo(9.7f, 4.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.291f, 5.708f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
