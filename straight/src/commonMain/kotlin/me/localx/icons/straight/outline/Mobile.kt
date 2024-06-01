package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(3.0f)
                    curveTo(21.0f, 2.2043f, 20.6839f, 1.4413f, 20.1213f, 0.8787f)
                    curveTo(19.5587f, 0.3161f, 18.7956f, 0.0f, 18.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(19.0f, 22.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(3.0f)
                    curveTo(5.0f, 2.7348f, 5.1054f, 2.4804f, 5.2929f, 2.2929f)
                    curveTo(5.4804f, 2.1054f, 5.7348f, 2.0f, 6.0f, 2.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.2652f, 2.0f, 18.5196f, 2.1054f, 18.7071f, 2.2929f)
                    curveTo(18.8946f, 2.4804f, 19.0f, 2.7348f, 19.0f, 3.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(11.0f, 11.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(10.293f)
                    curveTo(15.0012f, 9.2987f, 14.7894f, 8.3156f, 14.379f, 7.41f)
                    lineTo(13.857f, 6.258f)
                    curveTo(13.7104f, 5.8895f, 13.4576f, 5.5728f, 13.1306f, 5.3483f)
                    curveTo(12.8037f, 5.1238f, 12.4173f, 5.0016f, 12.0207f, 4.9972f)
                    curveTo(11.6242f, 4.9928f, 11.2352f, 5.1065f, 10.9034f, 5.3236f)
                    curveTo(10.5715f, 5.5408f, 10.3117f, 5.8518f, 10.157f, 6.217f)
                    lineTo(9.621f, 7.411f)
                    curveTo(9.2105f, 8.3163f, 8.9987f, 9.299f, 9.0f, 10.293f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(12.018f, 7.041f)
                    lineTo(12.556f, 8.233f)
                    curveTo(12.6611f, 8.4813f, 12.7457f, 8.7379f, 12.809f, 9.0f)
                    horizontalLineTo(11.191f)
                    curveTo(11.2538f, 8.7382f, 11.3381f, 8.482f, 11.443f, 8.234f)
                    lineTo(12.018f, 7.041f)
                    close()
                    moveTo(8.0f, 14.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
