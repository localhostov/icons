package me.localx.icons.straight.bold

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

public val Icons.Bold.Fingerprint: ImageVector
    get() {
        if (_fingerprint != null) {
            return _fingerprint!!
        }
        _fingerprint = Builder(name = "Fingerprint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.743f, 22.571f)
                lineTo(7.2f, 20.0f)
                curveToRelative(3.3f, -1.981f, 3.3f, -6.374f, 3.3f, -9.0f)
                horizontalLineToRelative(3.0f)
                curveTo(13.5f, 13.829f, 13.5f, 19.717f, 8.743f, 22.571f)
                close()
                moveTo(17.02f, 18.733f)
                lineTo(14.164f, 17.815f)
                arcToRelative(11.175f, 11.175f, 0.0f, false, true, -2.381f, 4.206f)
                lineToRelative(2.205f, 2.034f)
                arcTo(14.148f, 14.148f, 0.0f, false, false, 17.02f, 18.733f)
                close()
                moveTo(18.0f, 11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.736f, 6.779f)
                lineToRelative(2.133f, 2.11f)
                arcTo(2.973f, 2.973f, 0.0f, false, true, 12.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(31.1f, 31.1f, 0.0f, false, true, -0.149f, 3.479f)
                lineToRelative(2.982f, 0.326f)
                arcTo(33.623f, 33.623f, 0.0f, false, false, 18.0f, 11.0f)
                close()
                moveTo(6.537f, 18.338f)
                curveTo(9.0f, 16.859f, 9.0f, 13.747f, 9.0f, 11.0f)
                arcToRelative(3.053f, 3.053f, 0.0f, false, true, 0.061f, -0.606f)
                lineToRelative(-2.939f, -0.6f)
                arcTo(6.015f, 6.015f, 0.0f, false, false, 6.0f, 11.0f)
                curveToRelative(0.0f, 2.514f, -0.07f, 4.2f, -1.006f, 4.766f)
                arcTo(2.039f, 2.039f, 0.0f, false, true, 4.0f, 16.0f)
                verticalLineToRelative(3.0f)
                arcTo(5.054f, 5.054f, 0.0f, false, false, 6.537f, 18.338f)
                close()
                moveTo(23.0f, 11.0f)
                arcToRelative(10.871f, 10.871f, 0.0f, false, false, -1.1f, -4.794f)
                lineTo(19.2f, 7.517f)
                arcTo(7.894f, 7.894f, 0.0f, false, true, 20.0f, 11.0f)
                arcToRelative(25.686f, 25.686f, 0.0f, false, true, -2.107f, 11.089f)
                lineTo(20.6f, 23.38f)
                arcTo(28.454f, 28.454f, 0.0f, false, false, 23.0f, 11.0f)
                close()
                moveTo(4.0f, 11.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, 8.0f, -8.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, 4.8f, 1.6f)
                lineToRelative(1.805f, -2.4f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, false, 1.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
