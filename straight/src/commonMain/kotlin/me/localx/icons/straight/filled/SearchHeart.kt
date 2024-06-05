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
                moveTo(277.259f, 196.883f)
                curveToRelative(0.0f, 22.867f, -34.067f, 58.957f, -63.875f, 82.633f)
                curveToRelative(-29.808f, -23.676f, -63.875f, -59.766f, -63.875f, -82.633f)
                curveToRelative(-1.063f, -12.899f, 8.412f, -24.269f, 21.292f, -25.55f)
                curveToRelative(10.992f, -0.768f, 20.524f, 7.521f, 21.292f, 18.512f)
                curveToRelative(0.065f, 0.925f, 0.065f, 1.854f, 0.0f, 2.78f)
                horizontalLineToRelative(42.583f)
                curveToRelative(-0.768f, -10.992f, 7.521f, -20.524f, 18.512f, -21.292f)
                curveToRelative(0.925f, -0.065f, 1.854f, -0.065f, 2.78f, 0.0f)
                curveTo(268.841f, 172.624f, 278.31f, 183.987f, 277.259f, 196.883f)
                close()
                moveTo(512.0f, 481.894f)
                lineTo(481.894f, 512.0f)
                lineTo(348.565f, 378.671f)
                curveToRelative(-91.18f, 74.553f, -225.533f, 61.074f, -300.086f, -30.106f)
                reflectiveCurveTo(-12.595f, 123.032f, 78.586f, 48.479f)
                reflectiveCurveToRelative(225.533f, -61.074f, 300.086f, 30.106f)
                curveToRelative(64.216f, 78.538f, 64.216f, 191.442f, 0.0f, 269.979f)
                lineTo(512.0f, 481.894f)
                close()
                moveTo(319.842f, 196.883f)
                curveToRelative(1.088f, -36.42f, -27.461f, -66.872f, -63.875f, -68.134f)
                curveToRelative(-15.906f, 0.072f, -31.167f, 6.298f, -42.583f, 17.374f)
                curveToRelative(-11.428f, -11.059f, -26.681f, -17.282f, -42.583f, -17.374f)
                curveToRelative(-36.42f, 1.25f, -64.975f, 31.709f, -63.875f, 68.134f)
                curveToRelative(0.0f, 58.382f, 84.507f, 119.851f, 94.152f, 126.664f)
                lineToRelative(12.307f, 8.708f)
                lineToRelative(12.285f, -8.708f)
                curveTo(235.314f, 316.734f, 319.842f, 255.264f, 319.842f, 196.883f)
                close()
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
