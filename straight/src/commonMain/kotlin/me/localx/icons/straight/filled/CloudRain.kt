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

public val Icons.Filled.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 24.0f)
                arcToRelative(2.486f, 2.486f, 0.0f, false, true, -1.768f, -0.732f)
                arcToRelative(2.513f, 2.513f, 0.0f, false, true, 0.0f, -3.536f)
                lineTo(15.5f, 18.0f)
                lineToRelative(1.761f, 1.723f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 0.007f, 3.542f)
                horizontalLineToRelative(0.0f)
                arcTo(2.486f, 2.486f, 0.0f, false, true, 15.5f, 24.0f)
                close()
                moveTo(8.5f, 24.0f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, -1.768f, -0.732f)
                arcToRelative(2.512f, 2.512f, 0.0f, false, true, 0.0f, -3.536f)
                lineTo(8.5f, 18.0f)
                lineToRelative(1.761f, 1.723f)
                arcTo(2.516f, 2.516f, 0.0f, false, true, 8.5f, 24.0f)
                close()
                moveTo(17.44f, 5.059f)
                curveTo(13.527f, -4.12f, -0.042f, 0.313f, 2.265f, 10.05f)
                curveToRelative(-3.407f, 2.268f, -2.755f, 7.973f, 0.984f, 9.463f)
                arcToRelative(3.107f, 3.107f, 0.0f, false, false, 1.078f, 0.309f)
                arcToRelative(4.479f, 4.479f, 0.0f, false, true, 0.991f, -1.5f)
                lineTo(8.5f, 15.205f)
                lineTo(11.66f, 18.3f)
                arcToRelative(4.708f, 4.708f, 0.0f, false, true, 0.339f, 0.411f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, true, 0.318f, -0.388f)
                lineTo(15.5f, 15.205f)
                lineTo(18.659f, 18.3f)
                arcToRelative(4.622f, 4.622f, 0.0f, false, true, 0.746f, 1.012f)
                arcToRelative(11.458f, 11.458f, 0.0f, false, false, 1.083f, -0.468f)
                curveTo(26.39f, 15.213f, 24.389f, 5.855f, 17.44f, 5.059f)
                close()
                moveTo(14.121f, 13.121f)
                horizontalLineToRelative(0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.879f, 8.878f)
                lineTo(12.0f, 6.8f)
                lineToRelative(2.113f, 2.067f)
                arcTo(3.012f, 3.012f, 0.0f, false, true, 14.121f, 13.121f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
