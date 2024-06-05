package me.localx.icons.rounded.outline

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

public val Icons.Outline.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(506.02f, 475.743f)
                lineTo(378.865f, 348.588f)
                curveToRelative(74.591f, -91.227f, 61.105f, -225.649f, -30.122f, -300.239f)
                reflectiveCurveTo(123.095f, -12.757f, 48.504f, 78.47f)
                reflectiveCurveTo(-12.601f, 304.119f, 78.626f, 378.71f)
                curveToRelative(78.578f, 64.249f, 191.54f, 64.249f, 270.118f, 0.0f)
                lineToRelative(127.155f, 127.155f)
                curveToRelative(8.463f, 8.173f, 21.949f, 7.939f, 30.122f, -0.524f)
                curveTo(513.993f, 497.086f, 513.993f, 483.998f, 506.02f, 475.743f)
                close()
                moveTo(43.604f, 213.87f)
                curveToRelative(0.0f, -94.121f, 76.3f, -170.421f, 170.421f, -170.421f)
                reflectiveCurveToRelative(170.421f, 76.3f, 170.421f, 170.421f)
                reflectiveCurveToRelative(-76.3f, 170.421f, -170.421f, 170.421f)
                curveTo(119.948f, 384.185f, 43.71f, 307.947f, 43.604f, 213.87f)
                close()
                moveTo(256.631f, 128.659f)
                curveToRelative(-15.914f, 0.072f, -31.183f, 6.301f, -42.605f, 17.383f)
                curveToRelative(-11.422f, -11.081f, -26.691f, -17.311f, -42.605f, -17.383f)
                curveToRelative(-36.433f, 1.262f, -64.997f, 31.73f, -63.908f, 68.168f)
                curveToRelative(0.0f, 42.605f, 43.479f, 86.553f, 79.97f, 115.886f)
                curveToRelative(15.533f, 12.371f, 37.553f, 12.371f, 53.086f, 0.0f)
                curveToRelative(36.491f, -29.334f, 79.97f, -73.281f, 79.97f, -115.886f)
                curveTo(321.627f, 160.389f, 293.064f, 129.921f, 256.631f, 128.659f)
                close()
                moveTo(214.153f, 279.482f)
                curveToRelative(-39.495f, -31.741f, -64.036f, -63.482f, -64.036f, -82.654f)
                curveToRelative(-1.063f, -12.906f, 8.416f, -24.282f, 21.303f, -25.563f)
                curveToRelative(12.886f, 1.281f, 22.366f, 12.657f, 21.303f, 25.563f)
                curveToRelative(0.0f, 11.765f, 9.537f, 21.303f, 21.303f, 21.303f)
                curveToRelative(11.765f, 0.0f, 21.303f, -9.537f, 21.303f, -21.303f)
                curveToRelative(-1.063f, -12.906f, 8.416f, -24.282f, 21.303f, -25.563f)
                curveToRelative(12.886f, 1.281f, 22.366f, 12.657f, 21.303f, 25.563f)
                curveTo(277.933f, 216.0f, 253.393f, 247.741f, 214.153f, 279.482f)
                lineTo(214.153f, 279.482f)
                close()
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
