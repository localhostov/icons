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

public val Icons.Bold.GlobeSnow: ImageVector
    get() {
        if (_globeSnow != null) {
            return _globeSnow!!
        }
        _globeSnow = Builder(name = "GlobeSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.229f, -1.128f, -1.218f, -1.98f, -2.409f, -1.999f)
                curveToRelative(2.129f, -2.007f, 3.46f, -4.851f, 3.46f, -8.001f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 3.15f, 1.331f, 5.994f, 3.46f, 8.001f)
                curveToRelative(-1.191f, 0.019f, -2.18f, 0.871f, -2.409f, 1.999f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.0f, 11.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                curveToRelative(0.0f, 4.073f, -3.059f, 7.444f, -7.0f, 7.938f)
                verticalLineToRelative(-1.938f)
                horizontalLineToRelative(1.641f)
                curveToRelative(0.843f, 0.0f, 1.325f, -0.963f, 0.819f, -1.637f)
                lineToRelative(-0.878f, -1.17f)
                horizontalLineToRelative(0.151f)
                curveToRelative(0.732f, 0.0f, 1.149f, -0.835f, 0.71f, -1.421f)
                lineToRelative(-2.414f, -3.219f)
                curveToRelative(-0.495f, -0.66f, -1.485f, -0.66f, -1.98f, 0.0f)
                lineToRelative(-2.414f, 3.219f)
                curveToRelative(-0.439f, 0.585f, -0.021f, 1.421f, 0.71f, 1.421f)
                horizontalLineToRelative(0.074f)
                lineToRelative(-0.878f, 1.17f)
                curveToRelative(-0.506f, 0.675f, -0.025f, 1.637f, 0.819f, 1.637f)
                horizontalLineToRelative(1.641f)
                verticalLineToRelative(1.938f)
                curveToRelative(-3.941f, -0.494f, -7.0f, -3.865f, -7.0f, -7.938f)
                close()
                moveTo(13.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _globeSnow!!
    }

private var _globeSnow: ImageVector? = null
