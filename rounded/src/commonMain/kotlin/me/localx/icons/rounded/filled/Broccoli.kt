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

public val Icons.Filled.Broccoli: ImageVector
    get() {
        if (_broccoli != null) {
            return _broccoli!!
        }
        _broccoli = Builder(name = "Broccoli", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                curveToRelative(-0.241f, 6.376f, -8.06f, 5.643f, -8.0f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                curveToRelative(-0.838f, 0.011f, -1.083f, 0.787f, -1.0f, 1.5f)
                arcToRelative(6.542f, 6.542f, 0.0f, false, false, 2.332f, 4.9f)
                arcToRelative(5.625f, 5.625f, 0.0f, false, true, -5.823f, -0.482f)
                curveTo(6.114f, 17.631f, -0.356f, 15.011f, 0.0f, 10.0f)
                curveTo(0.0f, 7.419f, 2.0f, 5.0f, 4.483f, 5.0f)
                curveTo(7.0f, 5.0f, 9.0f, 7.409f, 9.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(7.006f, 7.006f, 0.0f, false, false, 5.7f, 3.218f)
                curveToRelative(1.98f, -4.1f, 8.322f, -4.29f, 10.5f, -0.206f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, true, 4.6f, 3.194f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 24.0f, 10.5f)
                close()
                moveTo(14.0f, 18.0f)
                arcToRelative(9.123f, 9.123f, 0.0f, false, true, -1.0f, -0.057f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(17.446f)
                curveToRelative(-0.2f, -0.076f, -0.391f, -0.15f, -0.576f, -0.242f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.2f, 0.782f)
                curveToRelative(0.731f, 2.162f, 0.163f, 5.926f, 3.617f, 6.014f)
                horizontalLineToRelative(2.316f)
                arcToRelative(3.021f, 3.021f, 0.0f, false, false, 2.987f, -2.725f)
                arcToRelative(19.37f, 19.37f, 0.0f, false, true, 0.83f, -3.938f)
                arcTo(6.977f, 6.977f, 0.0f, false, true, 14.0f, 18.0f)
                close()
            }
        }
        .build()
        return _broccoli!!
    }

private var _broccoli: ImageVector? = null
