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

public val Icons.Filled.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) {
            return _homeHeart!!
        }
        _homeHeart = Builder(name = "HomeHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.635f, 12.43f)
                curveToRelative(0.0f, 1.277f, -1.917f, 3.491f, -3.301f, 4.598f)
                curveToRelative(-0.119f, 0.095f, -0.28f, 0.096f, -0.399f, 0.0f)
                curveToRelative(-1.384f, -1.107f, -3.3f, -3.322f, -3.3f, -4.598f)
                curveToRelative(0.0f, -0.789f, 0.561f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.622f, 0.0f, 1.25f, 0.374f, 1.25f, 1.209f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.893f, 0.674f, -1.209f, 1.25f, -1.209f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.642f, 1.25f, 1.43f)
                close()
                moveTo(24.0f, 9.723f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.999f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.203f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                curveToRelative(1.379f, 0.931f, 2.203f, 2.48f, 2.203f, 4.145f)
                close()
                moveTo(17.635f, 12.43f)
                curveToRelative(0.0f, -1.892f, -1.458f, -3.43f, -3.25f, -3.43f)
                curveToRelative(-0.89f, 0.0f, -1.675f, 0.318f, -2.25f, 0.852f)
                curveToRelative(-0.575f, -0.533f, -1.36f, -0.852f, -2.25f, -0.852f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.539f, -3.25f, 3.43f)
                curveToRelative(0.0f, 2.307f, 2.649f, 5.038f, 4.05f, 6.16f)
                curveToRelative(0.427f, 0.342f, 0.938f, 0.512f, 1.45f, 0.512f)
                reflectiveCurveToRelative(1.022f, -0.171f, 1.449f, -0.512f)
                curveToRelative(1.401f, -1.121f, 4.051f, -3.851f, 4.051f, -6.16f)
                close()
            }
        }
        .build()
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
