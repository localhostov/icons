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

public val Icons.Outline.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.235f, 2.174f)
                arcToRelative(4.685f, 4.685f, 0.0f, false, false, -2.53f, 0.0f)
                arcToRelative(3.494f, 3.494f, 0.0f, true, false, 0.193f, 2.033f)
                arcTo(3.52f, 3.52f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, 1.072f, 0.207f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 16.5f, 17.0f)
                close()
                moveTo(7.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 22.0f)
                close()
                moveTo(16.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 18.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 22.0f)
                close()
                moveTo(19.975f, 8.675f)
                curveTo(19.709f, 0.612f, 15.3f, 0.026f, 15.105f, 0.006f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 15.0f, 0.0f)
                arcToRelative(4.509f, 4.509f, 0.0f, false, false, -2.416f, 0.818f)
                arcToRelative(1.018f, 1.018f, 0.0f, false, true, -1.167f, 0.0f)
                arcTo(4.514f, 4.514f, 0.0f, false, false, 9.0f, 0.0f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 8.9f, 0.006f)
                curveToRelative(-0.194f, 0.02f, -4.6f, 0.606f, -4.87f, 8.669f)
                curveTo(2.693f, 9.122f, 0.0f, 10.243f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.69f, 6.194f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(12.0f, -0.31f, 12.0f, -4.0f)
                curveTo(24.0f, 10.243f, 21.307f, 9.122f, 19.975f, 8.675f)
                close()
                moveTo(9.055f, 2.005f)
                arcToRelative(2.632f, 2.632f, 0.0f, false, true, 1.215f, 0.452f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, false, 3.461f, 0.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 1.206f, -0.452f)
                curveToRelative(0.445f, 0.106f, 2.909f, 0.964f, 3.056f, 6.858f)
                arcTo(13.207f, 13.207f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(13.217f, 13.217f, 0.0f, false, true, 6.007f, 8.864f)
                curveTo(6.155f, 2.92f, 8.658f, 2.1f, 9.055f, 2.005f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(3.735f, 14.0f, 2.0f, 12.912f, 1.988f, 12.082f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, 2.86f, -1.574f)
                arcTo(14.557f, 14.557f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(14.557f, 14.557f, 0.0f, false, false, 7.152f, -1.492f)
                arcTo(6.829f, 6.829f, 0.0f, false, true, 22.0f, 12.0f)
                curveTo(22.0f, 12.912f, 20.265f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
