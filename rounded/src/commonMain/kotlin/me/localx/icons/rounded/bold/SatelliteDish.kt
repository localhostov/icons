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

public val Icons.Bold.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = Builder(name = "SatelliteDish", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                curveToRelative(3.584f, 0.0f, 6.5f, 2.916f, 6.5f, 6.5f)
                close()
                moveTo(12.5f, 0.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveTo(24.0f, 5.159f, 18.841f, 0.0f, 12.5f, 0.0f)
                close()
                moveTo(16.13f, 17.76f)
                curveToRelative(0.636f, 0.636f, 0.947f, 1.514f, 0.854f, 2.409f)
                curveToRelative(-0.095f, 0.904f, -0.587f, 1.707f, -1.351f, 2.204f)
                curveToRelative(-1.674f, 1.086f, -3.585f, 1.616f, -5.489f, 1.616f)
                curveToRelative(-2.624f, 0.0f, -5.232f, -1.008f, -7.179f, -2.955f)
                curveTo(-0.395f, 17.675f, -0.958f, 12.348f, 1.627f, 8.367f)
                curveToRelative(0.496f, -0.764f, 1.298f, -1.256f, 2.202f, -1.351f)
                curveToRelative(0.897f, -0.104f, 1.775f, 0.217f, 2.412f, 0.854f)
                lineToRelative(3.884f, 3.884f)
                lineToRelative(1.315f, -1.315f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                reflectiveCurveToRelative(0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-1.315f, 1.315f)
                lineToRelative(3.885f, 3.885f)
                close()
                moveTo(13.99f, 19.863f)
                lineTo(4.119f, 9.991f)
                curveToRelative(-1.794f, 2.81f, -1.397f, 6.558f, 0.967f, 8.922f)
                curveToRelative(2.362f, 2.362f, 6.105f, 2.763f, 8.904f, 0.949f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
