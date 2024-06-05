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

public val Icons.Bold.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.074f, 3.842f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.635f, 0.325f)
                lineTo(17.728f, 7.879f)
                lineTo(13.061f, 3.212f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 0.0f)
                lineTo(6.272f, 7.879f)
                lineTo(2.561f, 4.167f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 5.228f)
                verticalLineTo(16.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 5.5f, 22.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineTo(5.228f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.074f, 3.842f)
                close()
                moveTo(21.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 19.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 16.5f)
                verticalLineTo(8.849f)
                lineToRelative(2.212f, 2.212f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 0.0f)
                lineTo(12.0f, 6.394f)
                lineToRelative(4.667f, 4.667f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 0.0f)
                lineTo(21.0f, 8.849f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
