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

public val Icons.Outline.GrinTears: ImageVector
    get() {
        if (_grinTears != null) {
            return _grinTears!!
        }
        _grinTears = Builder(name = "GrinTears", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.071f, 10.685f)
                curveToRelative(1.849f, -14.163f, 22.014f, -14.153f, 23.858f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.989f, 0.217f)
                curveTo(20.4f, -0.9f, 3.6f, -0.889f, 2.06f, 10.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.989f, -0.217f)
                close()
                moveTo(18.7f, 19.421f)
                arcToRelative(10.049f, 10.049f, 0.0f, false, true, -13.4f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.341f, 1.485f)
                arcToRelative(12.063f, 12.063f, 0.0f, false, false, 16.086f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.34f, -1.485f)
                close()
                moveTo(7.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveTo(5.0f, 9.108f, 5.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 11.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(-0.248f, -5.285f, -5.753f, -5.282f, -6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 11.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.053f, -1.518f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                close()
                moveTo(23.38f, 14.387f)
                arcTo(6.955f, 6.955f, 0.0f, false, false, 19.694f, 13.0f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, false, -0.686f, 0.691f)
                curveToRelative(0.125f, 2.138f, 1.7f, 5.845f, 4.372f, 3.687f)
                arcTo(2.115f, 2.115f, 0.0f, false, false, 23.38f, 14.387f)
                close()
                moveTo(4.306f, 13.0f)
                curveTo(2.2f, 13.1f, -1.549f, 14.736f, 0.62f, 17.38f)
                curveToRelative(2.673f, 2.159f, 4.247f, -1.552f, 4.372f, -3.687f)
                arcTo(0.637f, 0.637f, 0.0f, false, false, 4.306f, 13.0f)
                close()
            }
        }
        .build()
        return _grinTears!!
    }

private var _grinTears: ImageVector? = null
