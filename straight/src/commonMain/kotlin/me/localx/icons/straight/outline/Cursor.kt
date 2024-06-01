package me.localx.icons.straight.outline

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

public val Icons.Outline.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2778f, 23.979f)
                lineTo(9.0779f, 15.739f)
                lineTo(3.9999f, 20.216f)
                verticalLineTo(2.019f)
                curveTo(3.9998f, 1.6463f, 4.104f, 1.281f, 4.3005f, 0.9643f)
                curveTo(4.497f, 0.6476f, 4.7781f, 0.3922f, 5.1121f, 0.2267f)
                curveTo(5.4461f, 0.0613f, 5.8197f, -0.0075f, 6.1907f, 0.028f)
                curveTo(6.5617f, 0.0636f, 6.9154f, 0.2021f, 7.2119f, 0.428f)
                lineTo(21.1168f, 12.436f)
                lineTo(14.4998f, 13.17f)
                lineTo(18.6448f, 21.3f)
                lineTo(13.2778f, 23.979f)
                close()
                moveTo(9.6839f, 12.534f)
                lineTo(14.1578f, 21.3f)
                lineTo(15.9468f, 20.406f)
                lineTo(11.3998f, 11.5f)
                lineTo(16.3378f, 10.953f)
                lineTo(5.9518f, 1.98f)
                lineTo(5.9939f, 15.79f)
                lineTo(9.6839f, 12.534f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
