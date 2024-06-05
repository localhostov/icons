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

public val Icons.Bold.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.978f, 8.644f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.068f, 2.067f)
                lineToRelative(-4.378f, -4.379f)
                lineToRelative(2.067f, -2.067f)
                lineTo(15.356f, 0.022f)
                lineToRelative(-2.875f, 2.874f)
                lineToRelative(-8.254f, 2.697f)
                lineTo(0.002f, 23.998f)
                lineToRelative(18.405f, -4.226f)
                lineToRelative(2.697f, -8.255f)
                lineToRelative(2.874f, -2.873f)
                close()
                moveTo(6.751f, 19.37f)
                lineToRelative(3.396f, -3.396f)
                curveToRelative(0.116f, 0.016f, 0.234f, 0.025f, 0.354f, 0.025f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.12f, 0.009f, 0.238f, 0.025f, 0.354f)
                lineToRelative(-3.396f, 3.396f)
                lineToRelative(2.142f, -9.331f)
                lineToRelative(6.107f, -1.996f)
                lineToRelative(5.198f, 5.198f)
                lineToRelative(-1.995f, 6.107f)
                lineToRelative(-9.331f, 2.142f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
