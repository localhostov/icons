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

public val Icons.Bold.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.688f, 13.26f)
                curveToRelative(-0.666f, -0.801f, -1.646f, -1.26f, -2.688f, -1.26f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.042f, 0.0f, -2.022f, 0.459f, -2.697f, 1.27f)
                lineToRelative(-5.963f, 7.28f)
                curveToRelative(-0.367f, 0.448f, -0.443f, 1.068f, -0.195f, 1.592f)
                curveToRelative(0.248f, 0.524f, 0.776f, 0.858f, 1.355f, 0.858f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.58f, 0.0f, 1.107f, -0.334f, 1.355f, -0.858f)
                curveToRelative(0.248f, -0.523f, 0.172f, -1.144f, -0.195f, -1.592f)
                lineToRelative(-5.972f, -7.29f)
                close()
                moveTo(7.667f, 20.0f)
                lineToRelative(3.948f, -4.82f)
                curveToRelative(0.131f, -0.156f, 0.297f, -0.18f, 0.384f, -0.18f)
                reflectiveCurveToRelative(0.253f, 0.023f, 0.376f, 0.17f)
                lineToRelative(3.956f, 4.83f)
                lineTo(7.667f, 20.0f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.248f, -0.429f, 2.469f, -1.208f, 3.439f)
                curveToRelative(-0.52f, 0.645f, -1.463f, 0.747f, -2.109f, 0.23f)
                curveToRelative(-0.646f, -0.52f, -0.749f, -1.463f, -0.23f, -2.109f)
                curveToRelative(0.358f, -0.445f, 0.548f, -0.985f, 0.548f, -1.561f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.999f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.575f, 0.189f, 1.115f, 0.548f, 1.562f)
                curveToRelative(0.518f, 0.646f, 0.414f, 1.591f, -0.232f, 2.108f)
                curveToRelative(-0.277f, 0.223f, -0.608f, 0.33f, -0.938f, 0.33f)
                curveToRelative(-0.439f, 0.0f, -0.875f, -0.192f, -1.171f, -0.562f)
                curveToRelative(-0.778f, -0.971f, -1.207f, -2.192f, -1.207f, -3.438f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 3.468f, 2.467f, 1.0f, 5.5f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
