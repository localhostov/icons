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

public val Icons.Filled.FireFlameCurved: ImageVector
    get() {
        if (_fireFlameCurved != null) {
            return _fireFlameCurved!!
        }
        _fireFlameCurved = Builder(name = "FireFlameCurved", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(-0.057f)
                curveToRelative(-5.482f, 0.0f, -9.943f, -4.486f, -9.943f, -10.0f)
                curveToRelative(0.0f, -1.929f, 0.666f, -4.07f, 1.874f, -6.031f)
                curveToRelative(0.471f, -0.765f, 1.373f, -1.126f, 2.241f, -0.896f)
                curveToRelative(0.869f, 0.229f, 1.474f, 0.987f, 1.505f, 1.885f)
                curveToRelative(0.096f, 2.74f, 0.753f, 6.014f, 3.338f, 6.043f)
                curveToRelative(1.081f, 0.009f, 1.937f, -0.747f, 2.027f, -1.727f)
                curveToRelative(0.094f, -1.026f, -0.277f, -1.83f, -0.746f, -2.847f)
                curveToRelative(-0.552f, -1.2f, -1.24f, -2.692f, -1.24f, -4.901f)
                curveToRelative(0.0f, -1.707f, 0.345f, -3.412f, 0.687f, -4.345f)
                curveTo(11.941f, 0.488f, 12.542f, 0.033f, 13.256f, -0.008f)
                curveToRelative(0.739f, -0.04f, 1.414f, 0.367f, 1.753f, 1.042f)
                curveToRelative(0.802f, 1.595f, 1.938f, 3.069f, 3.036f, 4.495f)
                curveToRelative(1.972f, 2.562f, 4.011f, 5.211f, 3.956f, 8.487f)
                curveToRelative(0.0f, 5.464f, -4.483f, 9.95f, -9.994f, 9.983f)
                horizontalLineToRelative(-0.006f)
                close()
            }
        }
        .build()
        return _fireFlameCurved!!
    }

private var _fireFlameCurved: ImageVector? = null
