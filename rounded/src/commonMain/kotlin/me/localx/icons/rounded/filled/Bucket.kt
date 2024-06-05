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

public val Icons.Filled.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 8.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.534f, -3.351f, -2.829f, -6.12f, -5.901f, -7.335f)
                curveToRelative(-0.366f, -0.406f, -0.89f, -0.665f, -1.48f, -0.665f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.589f, 0.0f, -1.114f, 0.26f, -1.48f, 0.665f)
                curveToRelative(-3.073f, 1.215f, -5.367f, 3.983f, -5.901f, 7.335f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.634f)
                curveToRelative(0.025f, 0.043f, 0.486f, 2.0f, 0.486f, 2.0f)
                horizontalLineToRelative(13.38f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(3.549f, 14.0f)
                lineToRelative(1.296f, 6.048f)
                curveToRelative(0.491f, 2.29f, 2.547f, 3.952f, 4.889f, 3.952f)
                horizontalLineToRelative(4.533f)
                curveToRelative(2.342f, 0.0f, 4.397f, -1.662f, 4.889f, -3.952f)
                curveToRelative(0.0f, 0.0f, 2.186f, -10.005f, 2.211f, -10.048f)
                horizontalLineToRelative(0.634f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.651f, 8.0f)
                curveToRelative(0.436f, -2.14f, 1.786f, -3.951f, 3.623f, -5.007f)
                curveToRelative(0.346f, 0.599f, 0.985f, 1.007f, 1.726f, 1.007f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.741f, 0.0f, 1.381f, -0.408f, 1.726f, -1.007f)
                curveToRelative(1.837f, 1.056f, 3.187f, 2.867f, 3.623f, 5.007f)
                lineTo(4.651f, 8.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
