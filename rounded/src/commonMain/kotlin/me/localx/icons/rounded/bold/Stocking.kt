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

public val Icons.Bold.Stocking: ImageVector
    get() {
        if (_stocking != null) {
            return _stocking!!
        }
        _stocking = Builder(name = "Stocking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.251f)
                curveToRelative(0.0f, 0.66f, -0.423f, 1.235f, -1.053f, 1.432f)
                lineToRelative(-1.842f, 0.576f)
                curveTo(1.613f, 11.35f, -0.569f, 14.917f, 0.136f, 18.379f)
                curveToRelative(0.664f, 3.258f, 3.551f, 5.623f, 6.862f, 5.623f)
                curveToRelative(0.708f, 0.0f, 1.411f, -0.108f, 2.09f, -0.32f)
                lineToRelative(6.245f, -1.952f)
                curveToRelative(3.988f, -1.247f, 6.667f, -4.89f, 6.667f, -9.067f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 12.662f)
                curveToRelative(0.0f, 2.858f, -1.833f, 5.351f, -4.562f, 6.204f)
                lineToRelative(-6.246f, 1.952f)
                curveToRelative(-0.389f, 0.122f, -0.791f, 0.184f, -1.194f, 0.184f)
                curveToRelative(-1.893f, 0.0f, -3.542f, -1.355f, -3.923f, -3.222f)
                curveToRelative(-0.402f, -1.974f, 0.883f, -4.02f, 2.925f, -4.658f)
                lineToRelative(1.842f, -0.576f)
                curveToRelative(1.889f, -0.589f, 3.158f, -2.315f, 3.158f, -4.295f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(9.662f)
                close()
            }
        }
        .build()
        return _stocking!!
    }

private var _stocking: ImageVector? = null
