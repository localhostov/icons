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

public val Icons.Filled.DiamondExclamation: ImageVector
    get() {
        if (_diamondExclamation != null) {
            return _diamondExclamation!!
        }
        _diamondExclamation = Builder(name = "DiamondExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.536f, 8.46f)
                lineTo(15.537f, 1.459f)
                curveTo(14.592f, 0.515f, 13.337f, -0.006f, 12.001f, -0.006f)
                reflectiveCurveToRelative(-2.592f, 0.521f, -3.536f, 1.465f)
                lineTo(1.466f, 8.46f)
                curveToRelative(-1.949f, 1.949f, -1.949f, 5.12f, 0.0f, 7.069f)
                lineToRelative(6.999f, 7.001f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.465f, 3.536f, 1.465f)
                reflectiveCurveToRelative(2.591f, -0.521f, 3.536f, -1.465f)
                lineToRelative(6.999f, -7.001f)
                curveToRelative(0.944f, -0.944f, 1.464f, -2.199f, 1.464f, -3.534f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.464f, -3.535f)
                close()
                moveTo(11.0f, 7.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _diamondExclamation!!
    }

private var _diamondExclamation: ImageVector? = null
