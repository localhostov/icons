package me.localx.icons.rounded.bold

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
                moveTo(8.5f, 22.437f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.88f, -2.715f)
                curveToRelative(2.512f, -1.82f, 2.865f, -5.181f, 2.878f, -8.229f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 10.0f)
                horizontalLineToRelative(0.006f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 11.507f)
                curveToRelative(-0.01f, 2.3f, -0.033f, 7.686f, -4.12f, 10.644f)
                arcTo(1.487f, 1.487f, 0.0f, false, true, 8.5f, 22.437f)
                close()
                moveTo(14.528f, 23.431f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 16.513f, 20.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.762f, -1.174f)
                arcTo(10.925f, 10.925f, 0.0f, false, true, 12.2f, 21.542f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.331f, 1.889f)
                close()
                moveTo(17.936f, 13.593f)
                curveTo(18.0f, 12.572f, 18.0f, 11.663f, 18.0f, 11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.0f, -5.658f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.0f, 8.17f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 11.0f)
                curveToRelative(0.0f, 0.659f, 0.0f, 1.479f, -0.058f, 2.407f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.347f, 15.0f)
                quadToRelative(0.046f, 0.0f, 0.093f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.937f, 13.593f)
                close()
                moveTo(4.691f, 18.956f)
                arcToRelative(4.745f, 4.745f, 0.0f, false, false, 1.846f, -0.618f)
                curveTo(8.978f, 16.873f, 8.99f, 13.771f, 9.0f, 11.506f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.505f, 10.0f)
                lineTo(7.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 11.494f)
                curveToRelative(-0.009f, 2.385f, -0.172f, 3.772f, -1.0f, 4.271f)
                arcToRelative(1.823f, 1.823f, 0.0f, false, true, -0.686f, 0.216f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 18.969f)
                arcTo(1.4f, 1.4f, 0.0f, false, false, 4.691f, 18.956f)
                close()
                moveTo(20.719f, 23.128f)
                arcTo(28.7f, 28.7f, 0.0f, false, false, 23.0f, 11.0f)
                arcToRelative(10.946f, 10.946f, 0.0f, false, false, -0.774f, -4.054f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.788f, 1.108f)
                arcTo(7.937f, 7.937f, 0.0f, false, true, 20.0f, 11.0f)
                arcToRelative(25.906f, 25.906f, 0.0f, false, true, -2.006f, 10.872f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.725f, 1.256f)
                close()
                moveTo(4.0f, 12.5f)
                lineTo(4.0f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.787f, 3.954f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.426f, -2.639f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 1.0f, 11.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
