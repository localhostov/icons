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

public val Icons.Outline.VolumeSlash: ImageVector
    get() {
        if (_volumeSlash != null) {
            return _volumeSlash!!
        }
        _volumeSlash = Builder(name = "VolumeSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 14.242f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(7.77f)
                lineToRelative(-7.356f, -6.013f)
                horizontalLineToRelative(-2.644f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.026f, 0.776f, -1.873f, 1.771f, -1.987f)
                lineToRelative(1.987f, 1.987f)
                horizontalLineToRelative(-1.758f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.356f)
                lineToRelative(4.644f, 3.795f)
                verticalLineToRelative(-5.552f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.543f, 0.0f, 1.082f, -0.049f, 1.612f, -0.145f)
                lineToRelative(-1.855f, -1.855f)
                horizontalLineToRelative(-0.757f)
                close()
                moveTo(20.521f, 19.107f)
                lineToRelative(3.436f, 3.436f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(4.717f, 4.717f)
                lineTo(12.0f, 0.037f)
                verticalLineToRelative(10.549f)
                lineToRelative(4.175f, 4.175f)
                curveToRelative(1.093f, -0.464f, 1.825f, -1.543f, 1.825f, -2.761f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.759f, -0.915f, 3.345f, -2.346f, 4.24f)
                lineToRelative(1.439f, 1.439f)
                curveToRelative(1.809f, -1.308f, 2.907f, -3.424f, 2.907f, -5.679f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 2.79f, -1.308f, 5.415f, -3.479f, 7.107f)
                close()
                moveTo(7.596f, 6.182f)
                lineToRelative(2.404f, 2.404f)
                verticalLineToRelative(-4.353f)
                lineToRelative(-2.404f, 1.949f)
                close()
            }
        }
        .build()
        return _volumeSlash!!
    }

private var _volumeSlash: ImageVector? = null
