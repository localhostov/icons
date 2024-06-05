package me.localx.icons.rounded.outline

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

public val Icons.Outline.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.469f, 1.027f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.209f, 0.0f)
                horizontalLineTo(4.791f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.819f, 3.405f)
                lineToRelative(2.219f, 16.27f)
                arcTo(5.017f, 5.017f, 0.0f, false, false, 8.992f, 24.0f)
                horizontalLineToRelative(6.016f)
                arcToRelative(5.017f, 5.017f, 0.0f, false, false, 4.954f, -4.324f)
                lineTo(22.181f, 3.405f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.469f, 1.027f)
                close()
                moveTo(17.981f, 19.406f)
                arcTo(3.011f, 3.011f, 0.0f, false, true, 15.008f, 22.0f)
                horizontalLineTo(8.992f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -2.973f, -2.595f)
                lineTo(4.6f, 9.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(4.327f)
                lineTo(3.8f, 3.135f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.791f, 2.0f)
                horizontalLineTo(19.209f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.2f, 3.135f)
                close()
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
