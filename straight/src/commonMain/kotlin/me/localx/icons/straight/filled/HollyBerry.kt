package me.localx.icons.straight.filled

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

public val Icons.Filled.HollyBerry: ImageVector
    get() {
        if (_hollyBerry != null) {
            return _hollyBerry!!
        }
        _hollyBerry = Builder(name = "HollyBerry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.972f, 3.0f)
                curveTo(8.972f, 1.343f, 10.316f, 0.0f, 11.972f, 0.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 17.599f)
                reflectiveCurveToRelative(-1.84f, -0.404f, -3.035f, -1.605f)
                curveToRelative(-0.797f, -0.8f, -1.402f, -2.303f, -1.718f, -3.22f)
                curveToRelative(-0.875f, 0.754f, -2.0f, 1.226f, -3.246f, 1.226f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(1.399f, 0.37f, 2.728f, 0.944f, 3.38f, 1.599f)
                curveToRelative(1.196f, 1.201f, 1.628f, 3.17f, 1.628f, 3.17f)
                curveToRelative(0.0f, 0.0f, 1.352f, -0.795f, 2.852f, -0.795f)
                reflectiveCurveToRelative(2.994f, 0.528f, 2.994f, 0.528f)
                curveToRelative(0.0f, 0.0f, -0.855f, -1.502f, -0.855f, -3.002f)
                curveToRelative(0.0f, -1.0f, 1.0f, -2.901f, 1.0f, -2.901f)
                close()
                moveTo(1.0f, 20.5f)
                curveToRelative(0.0f, 1.5f, -0.855f, 3.002f, -0.855f, 3.002f)
                curveToRelative(0.0f, 0.0f, 1.494f, -0.528f, 2.994f, -0.528f)
                reflectiveCurveToRelative(2.852f, 0.795f, 2.852f, 0.795f)
                curveToRelative(0.0f, 0.0f, 0.432f, -1.969f, 1.628f, -3.17f)
                curveToRelative(0.652f, -0.655f, 1.981f, -1.229f, 3.38f, -1.599f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.246f, 0.0f, -2.371f, -0.472f, -3.246f, -1.226f)
                curveToRelative(-0.317f, 0.917f, -0.922f, 2.42f, -1.718f, 3.22f)
                curveToRelative(-1.196f, 1.201f, -3.035f, 1.605f, -3.035f, 1.605f)
                curveToRelative(0.0f, 0.0f, 1.0f, 1.901f, 1.0f, 2.901f)
                close()
            }
        }
        .build()
        return _hollyBerry!!
    }

private var _hollyBerry: ImageVector? = null
