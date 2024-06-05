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

public val Icons.Filled.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(506.02f, 475.898f)
                lineTo(378.865f, 348.743f)
                curveToRelative(74.591f, -91.227f, 61.105f, -225.648f, -30.122f, -300.239f)
                reflectiveCurveTo(123.095f, -12.601f, 48.504f, 78.626f)
                reflectiveCurveToRelative(-61.105f, 225.649f, 30.122f, 300.239f)
                curveToRelative(78.578f, 64.249f, 191.54f, 64.249f, 270.118f, 0.0f)
                lineTo(475.898f, 506.02f)
                curveToRelative(8.463f, 8.173f, 21.949f, 7.939f, 30.122f, -0.524f)
                curveTo(513.993f, 497.241f, 513.993f, 484.154f, 506.02f, 475.898f)
                close()
                moveTo(240.568f, 312.848f)
                curveToRelative(-15.533f, 12.371f, -37.553f, 12.371f, -53.086f, 0.0f)
                curveToRelative(-36.491f, -29.312f, -79.97f, -73.26f, -79.97f, -115.865f)
                curveToRelative(-1.089f, -36.439f, 27.475f, -66.907f, 63.908f, -68.168f)
                curveToRelative(15.914f, 0.072f, 31.183f, 6.301f, 42.605f, 17.383f)
                curveToRelative(11.422f, -11.081f, 26.691f, -17.311f, 42.605f, -17.383f)
                curveToRelative(36.433f, 1.262f, 64.997f, 31.73f, 63.908f, 68.168f)
                curveTo(320.538f, 239.588f, 277.06f, 283.536f, 240.568f, 312.848f)
                close()
                moveTo(277.933f, 196.983f)
                curveToRelative(0.0f, 19.172f, -24.541f, 50.913f, -63.78f, 82.654f)
                curveToRelative(-39.495f, -31.741f, -64.036f, -63.482f, -64.036f, -82.654f)
                curveToRelative(-1.063f, -12.906f, 8.416f, -24.282f, 21.303f, -25.563f)
                curveToRelative(12.886f, 1.281f, 22.366f, 12.657f, 21.303f, 25.563f)
                curveToRelative(0.0f, 11.765f, 9.537f, 21.303f, 21.303f, 21.303f)
                curveToRelative(11.765f, 0.0f, 21.303f, -9.537f, 21.303f, -21.303f)
                curveToRelative(-1.063f, -12.906f, 8.416f, -24.282f, 21.303f, -25.563f)
                curveTo(269.517f, 172.701f, 278.996f, 184.077f, 277.933f, 196.983f)
                close()
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
