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

public val Icons.Bold.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 466.928f)
                lineTo(403.624f, 358.552f)
                curveToRelative(74.164f, -98.987f, 54.041f, -239.353f, -44.945f, -313.517f)
                reflectiveCurveTo(119.325f, -9.007f, 45.161f, 89.98f)
                reflectiveCurveTo(-8.88f, 329.333f, 90.107f, 403.497f)
                curveToRelative(79.531f, 59.587f, 188.816f, 59.638f, 268.403f, 0.126f)
                lineTo(466.886f, 512.0f)
                lineTo(512.0f, 466.928f)
                close()
                moveTo(65.745f, 225.121f)
                curveToRelative(0.0f, -88.022f, 71.356f, -159.377f, 159.377f, -159.377f)
                reflectiveCurveTo(384.499f, 137.1f, 384.499f, 225.121f)
                reflectiveCurveToRelative(-71.356f, 159.377f, -159.377f, 159.377f)
                curveTo(137.139f, 384.405f, 65.838f, 313.104f, 65.745f, 225.121f)
                close()
                moveTo(320.195f, 203.34f)
                curveToRelative(0.0f, 55.081f, -95.626f, 122.72f, -95.626f, 122.72f)
                reflectiveCurveToRelative(-95.626f, -67.64f, -95.626f, -122.72f)
                curveToRelative(-1.251f, -27.702f, 20.118f, -51.208f, 47.813f, -52.594f)
                curveToRelative(27.701f, 1.376f, 49.076f, 24.888f, 47.813f, 52.594f)
                curveToRelative(-1.251f, -27.702f, 20.118f, -51.208f, 47.813f, -52.594f)
                curveTo(300.083f, 152.121f, 321.458f, 175.634f, 320.195f, 203.34f)
                close()
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
