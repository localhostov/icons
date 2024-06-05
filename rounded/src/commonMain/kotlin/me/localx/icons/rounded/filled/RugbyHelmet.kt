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

public val Icons.Filled.RugbyHelmet: ImageVector
    get() {
        if (_rugbyHelmet != null) {
            return _rugbyHelmet!!
        }
        _rugbyHelmet = Builder(name = "RugbyHelmet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.983f, 21.926f)
                arcToRelative(32.651f, 32.651f, 0.0f, false, false, -0.608f, -5.545f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.439f, 14.0f)
                horizontalLineToRelative(-2.1f)
                reflectiveCurveToRelative(-0.343f, -4.126f, -0.346f, -4.147f)
                lineToRelative(0.436f, -0.033f)
                curveToRelative(0.949f, -0.138f, 1.682f, -0.181f, 2.139f, -1.025f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, false, 0.156f, -2.71f)
                curveTo(19.084f, 2.559f, 14.786f, 0.0f, 10.5f, 0.0f)
                arcTo(10.512f, 10.512f, 0.0f, false, false, 0.0f, 10.5f)
                arcToRelative(39.043f, 39.043f, 0.0f, false, false, 0.587f, 5.155f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, 3.457f, 3.989f)
                curveToRelative(0.514f, 0.161f, 1.02f, 0.311f, 1.519f, 0.458f)
                arcTo(21.1f, 21.1f, 0.0f, false, true, 9.3f, 21.569f)
                arcTo(4.073f, 4.073f, 0.0f, false, false, 11.121f, 22.0f)
                arcTo(3.975f, 3.975f, 0.0f, false, false, 13.9f, 20.877f)
                lineToRelative(1.1f, -0.877f)
                horizontalLineToRelative(1.834f)
                lineToRelative(0.071f, 0.855f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, 2.137f, 2.631f)
                arcTo(25.208f, 25.208f, 0.0f, false, false, 21.979f, 24.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, 2.0f, -2.074f)
                close()
                moveTo(9.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 18.0f)
                close()
                moveTo(20.439f, 16.0f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.977f, 0.783f)
                curveToRelative(0.061f, 0.3f, 0.138f, 0.709f, 0.215f, 1.217f)
                lineTo(18.667f, 18.0f)
                lineTo(18.5f, 16.0f)
                close()
                moveTo(12.086f, 12.26f)
                arcToRelative(2.854f, 2.854f, 0.0f, false, true, 2.338f, -2.142f)
                lineTo(16.0f, 10.0f)
                curveToRelative(0.0f, 0.027f, 0.329f, 4.0f, 0.329f, 4.0f)
                lineTo(12.2f, 14.0f)
                arcTo(2.864f, 2.864f, 0.0f, false, true, 12.086f, 12.26f)
                close()
                moveTo(14.986f, 18.0f)
                lineTo(13.549f, 16.0f)
                lineTo(16.5f, 16.0f)
                lineToRelative(0.166f, 2.0f)
                close()
                moveTo(19.6f, 21.567f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.707f, -0.878f)
                lineTo(18.833f, 20.0f)
                horizontalLineToRelative(3.034f)
                curveToRelative(0.053f, 0.608f, 0.094f, 1.277f, 0.113f, 2.0f)
                arcTo(11.842f, 11.842f, 0.0f, false, true, 19.6f, 21.567f)
                close()
            }
        }
        .build()
        return _rugbyHelmet!!
    }

private var _rugbyHelmet: ImageVector? = null
