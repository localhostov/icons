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

public val Icons.Filled.GlobeSnow: ImageVector
    get() {
        if (_globeSnow != null) {
            return _globeSnow!!
        }
        _globeSnow = Builder(name = "GlobeSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.602f)
                curveToRelative(-0.843f, 0.0f, -1.325f, -0.963f, -0.819f, -1.637f)
                lineToRelative(0.907f, -1.343f)
                horizontalLineToRelative(-0.141f)
                curveToRelative(-0.732f, 0.0f, -1.149f, -0.835f, -0.71f, -1.421f)
                lineToRelative(2.414f, -3.084f)
                curveToRelative(0.495f, -0.66f, 1.485f, -0.66f, 1.98f, 0.0f)
                lineToRelative(2.414f, 3.084f)
                curveToRelative(0.439f, 0.585f, 0.021f, 1.421f, -0.71f, 1.421f)
                horizontalLineToRelative(-0.141f)
                lineToRelative(0.907f, 1.343f)
                curveToRelative(0.506f, 0.675f, 0.025f, 1.637f, -0.819f, 1.637f)
                horizontalLineToRelative(-1.679f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.092f)
                curveToRelative(1.169f, -1.768f, 1.806f, -3.853f, 1.806f, -6.051f)
                curveTo(22.897f, 4.883f, 17.963f, -0.051f, 11.897f, -0.051f)
                reflectiveCurveTo(0.897f, 4.883f, 0.897f, 10.949f)
                curveToRelative(0.0f, 2.198f, 0.636f, 4.284f, 1.806f, 6.051f)
                horizontalLineToRelative(8.297f)
                close()
                moveTo(18.5f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _globeSnow!!
    }

private var _globeSnow: ImageVector? = null
