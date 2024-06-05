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

public val Icons.Filled.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.828f)
                curveTo(114.683f, 0.993f, 0.165f, 115.511f, 0.0f, 256.828f)
                curveToRelative(12.8f, 339.2f, 499.2f, 339.051f, 512.0f, 0.0f)
                curveTo(511.847f, 115.506f, 397.322f, 0.981f, 256.0f, 0.828f)
                close()
                moveTo(155.904f, 191.185f)
                horizontalLineToRelative(64.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                curveTo(134.571f, 200.737f, 144.122f, 191.185f, 155.904f, 191.185f)
                close()
                moveTo(387.2f, 330.748f)
                curveToRelative(-25.506f, 44.966f, -72.938f, 73.042f, -124.629f, 73.771f)
                curveToRelative(-51.727f, -0.722f, -99.199f, -28.793f, -124.757f, -73.771f)
                curveToRelative(-6.356f, -9.921f, -3.466f, -23.116f, 6.455f, -29.471f)
                curveToRelative(4.713f, -3.02f, 10.425f, -4.066f, 15.902f, -2.913f)
                curveToRelative(32.804f, 12.359f, 67.374f, 19.388f, 102.4f, 20.821f)
                curveToRelative(34.968f, -1.451f, 69.479f, -8.48f, 102.229f, -20.821f)
                curveToRelative(11.524f, -2.454f, 22.855f, 4.898f, 25.309f, 16.422f)
                curveTo(391.279f, 320.282f, 390.234f, 326.018f, 387.2f, 330.748f)
                close()
                moveTo(347.904f, 233.852f)
                curveToRelative(-23.573f, 0.0f, -42.667f, 0.0f, -42.667f, -21.333f)
                curveToRelative(0.0f, -23.564f, 19.103f, -42.667f, 42.667f, -42.667f)
                reflectiveCurveToRelative(42.667f, 19.103f, 42.667f, 42.667f)
                curveTo(390.571f, 233.852f, 371.477f, 233.852f, 347.904f, 233.852f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
