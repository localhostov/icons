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

public val Icons.Outline.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0001f, 17.88f)
                verticalLineTo(6.71f)
                curveTo(8.999f, 6.5114f, 9.057f, 6.3169f, 9.1668f, 6.1514f)
                curveTo(9.2766f, 5.9859f, 9.4332f, 5.8568f, 9.6167f, 5.7807f)
                curveTo(9.8001f, 5.7045f, 10.0021f, 5.6847f, 10.1968f, 5.7238f)
                curveTo(10.3916f, 5.7628f, 10.5703f, 5.859f, 10.7101f, 6.0f)
                lineTo(16.2902f, 11.59f)
                curveTo(16.4764f, 11.7774f, 16.5809f, 12.0309f, 16.5809f, 12.295f)
                curveTo(16.5809f, 12.5592f, 16.4764f, 12.8127f, 16.2902f, 13.0f)
                lineTo(10.7101f, 18.59f)
                curveTo(10.5703f, 18.7311f, 10.3916f, 18.8272f, 10.1968f, 18.8663f)
                curveTo(10.0021f, 18.9054f, 9.8001f, 18.8856f, 9.6167f, 18.8094f)
                curveTo(9.4332f, 18.7332f, 9.2766f, 18.6042f, 9.1668f, 18.4387f)
                curveTo(9.057f, 18.2731f, 8.999f, 18.0787f, 9.0001f, 17.88f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
