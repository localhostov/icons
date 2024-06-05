package me.localx.icons.straight.outline

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
                moveTo(512.0f, 481.894f)
                lineTo(378.671f, 348.565f)
                curveToRelative(74.553f, -91.18f, 61.074f, -225.533f, -30.106f, -300.086f)
                reflectiveCurveTo(123.032f, -12.595f, 48.479f, 78.586f)
                reflectiveCurveToRelative(-61.074f, 225.533f, 30.106f, 300.086f)
                curveToRelative(78.538f, 64.216f, 191.442f, 64.216f, 269.979f, 0.0f)
                lineTo(481.894f, 512.0f)
                lineTo(512.0f, 481.894f)
                close()
                moveTo(213.916f, 384.25f)
                curveToRelative(-94.073f, 0.0f, -170.334f, -76.261f, -170.334f, -170.334f)
                reflectiveCurveTo(119.843f, 43.582f, 213.916f, 43.582f)
                reflectiveCurveTo(384.25f, 119.843f, 384.25f, 213.916f)
                curveTo(384.144f, 307.945f, 307.945f, 384.144f, 213.916f, 384.25f)
                close()
                moveTo(255.967f, 128.749f)
                curveToRelative(-15.502f, -0.189f, -30.533f, 5.319f, -42.243f, 15.479f)
                curveToRelative(-11.96f, -10.191f, -27.213f, -15.691f, -42.924f, -15.479f)
                curveToRelative(-36.42f, 1.25f, -64.975f, 31.709f, -63.875f, 68.134f)
                curveToRelative(0.0f, 58.382f, 84.507f, 119.851f, 94.152f, 126.664f)
                lineToRelative(12.307f, 8.708f)
                lineToRelative(12.285f, -8.708f)
                curveToRelative(9.645f, -6.813f, 94.173f, -68.283f, 94.173f, -126.664f)
                curveTo(320.931f, 160.462f, 292.382f, 130.01f, 255.967f, 128.749f)
                close()
                moveTo(213.384f, 279.516f)
                curveToRelative(-29.808f, -23.676f, -63.875f, -59.766f, -63.875f, -82.633f)
                curveToRelative(-1.063f, -12.899f, 8.412f, -24.269f, 21.292f, -25.55f)
                curveToRelative(11.287f, -0.751f, 21.046f, 7.791f, 21.797f, 19.078f)
                curveToRelative(0.049f, 0.737f, 0.058f, 1.476f, 0.027f, 2.213f)
                horizontalLineToRelative(42.583f)
                curveToRelative(-1.001f, -10.737f, 6.892f, -20.251f, 17.628f, -21.252f)
                curveToRelative(1.041f, -0.097f, 2.088f, -0.11f, 3.131f, -0.04f)
                curveToRelative(12.874f, 1.292f, 22.343f, 12.654f, 21.292f, 25.55f)
                curveTo(277.259f, 219.75f, 243.107f, 255.839f, 213.384f, 279.516f)
                lineTo(213.384f, 279.516f)
                close()
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
