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

public val Icons.Outline.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.29f, 18.59f)
                lineTo(7.71f, 13.0f)
                curveTo(7.5237f, 12.8127f, 7.4192f, 12.5592f, 7.4192f, 12.295f)
                curveTo(7.4192f, 12.0309f, 7.5237f, 11.7774f, 7.71f, 11.59f)
                lineTo(13.29f, 6.0f)
                curveTo(13.4299f, 5.859f, 13.6086f, 5.7628f, 13.8033f, 5.7238f)
                curveTo(13.998f, 5.6847f, 14.2f, 5.7045f, 14.3835f, 5.7807f)
                curveTo(14.5669f, 5.8568f, 14.7235f, 5.9859f, 14.8333f, 6.1514f)
                curveTo(14.9431f, 6.3169f, 15.0011f, 6.5114f, 15.0f, 6.71f)
                verticalLineTo(17.88f)
                curveTo(15.0011f, 18.0787f, 14.9431f, 18.2731f, 14.8333f, 18.4387f)
                curveTo(14.7235f, 18.6042f, 14.5669f, 18.7332f, 14.3835f, 18.8094f)
                curveTo(14.2f, 18.8856f, 13.998f, 18.9054f, 13.8033f, 18.8663f)
                curveTo(13.6086f, 18.8272f, 13.4299f, 18.7311f, 13.29f, 18.59f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
