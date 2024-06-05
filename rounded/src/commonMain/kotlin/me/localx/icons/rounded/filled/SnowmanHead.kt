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

public val Icons.Filled.SnowmanHead: ImageVector
    get() {
        if (_snowmanHead != null) {
            return _snowmanHead!!
        }
        _snowmanHead = Builder(name = "SnowmanHead", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(21.0f, 10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(20.701f, 12.706f)
                curveToRelative(-0.112f, -0.425f, -0.518f, -0.706f, -0.957f, -0.706f)
                lineTo(4.256f, 12.0f)
                curveToRelative(-0.439f, 0.0f, -0.845f, 0.282f, -0.957f, 0.706f)
                curveToRelative(-0.197f, 0.745f, -0.299f, 1.516f, -0.299f, 2.294f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -0.778f, -0.102f, -1.549f, -0.299f, -2.294f)
                close()
                moveTo(8.5f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.79f, 21.41f)
                curveToRelative(-0.232f, 0.787f, -1.349f, 0.787f, -1.581f, 0.0f)
                curveToRelative(-0.361f, -1.228f, -0.71f, -2.516f, -0.71f, -2.914f)
                curveToRelative(0.0f, -0.826f, 0.672f, -1.495f, 1.5f, -1.495f)
                reflectiveCurveToRelative(1.5f, 0.669f, 1.5f, 1.495f)
                curveToRelative(0.0f, 0.398f, -0.349f, 1.687f, -0.71f, 2.914f)
                close()
                moveTo(15.5f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _snowmanHead!!
    }

private var _snowmanHead: ImageVector? = null
