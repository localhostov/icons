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

public val Icons.Bold.PlantWilt: ImageVector
    get() {
        if (_plantWilt != null) {
            return _plantWilt!!
        }
        _plantWilt = Builder(name = "PlantWilt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.891f, 12.22f)
                curveToRelative(-0.632f, -4.812f, -3.836f, -5.22f, -4.891f, -5.22f)
                curveToRelative(-0.827f, 0.0f, -1.7f, 0.195f, -2.5f, 0.637f)
                verticalLineToRelative(-0.637f)
                curveTo(13.5f, 1.833f, 10.537f, 0.0f, 8.0f, 0.0f)
                curveToRelative(-1.092f, 0.0f, -4.484f, 0.438f, -4.947f, 5.739f)
                curveToRelative(-1.773f, 0.604f, -3.053f, 2.286f, -3.053f, 4.261f)
                curveToRelative(0.0f, 3.034f, 3.087f, 6.208f, 3.439f, 6.561f)
                lineToRelative(1.061f, 1.061f)
                lineToRelative(1.061f, -1.061f)
                curveToRelative(0.352f, -0.352f, 3.439f, -3.527f, 3.439f, -6.561f)
                curveToRelative(0.0f, -1.933f, -1.225f, -3.585f, -2.94f, -4.221f)
                curveToRelative(0.154f, -1.451f, 0.649f, -2.779f, 1.94f, -2.779f)
                curveToRelative(0.751f, 0.0f, 2.5f, 0.39f, 2.5f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -3.61f, 1.749f, -4.0f, 2.5f, -4.0f)
                curveToRelative(1.148f, 0.0f, 1.666f, 1.05f, 1.876f, 2.303f)
                curveToRelative(-1.681f, 0.653f, -2.876f, 2.288f, -2.876f, 4.197f)
                curveToRelative(0.0f, 3.034f, 3.087f, 6.208f, 3.439f, 6.561f)
                lineToRelative(1.061f, 1.061f)
                lineToRelative(1.061f, -1.061f)
                curveToRelative(0.352f, -0.352f, 3.439f, -3.527f, 3.439f, -6.561f)
                curveToRelative(0.0f, -1.996f, -1.306f, -3.693f, -3.109f, -4.28f)
                close()
                moveTo(4.503f, 13.202f)
                curveToRelative(-0.751f, -0.996f, -1.502f, -2.266f, -1.502f, -3.202f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.922f, -0.724f, 2.179f, -1.498f, 3.202f)
                close()
                moveTo(19.503f, 19.702f)
                curveToRelative(-0.751f, -0.996f, -1.502f, -2.266f, -1.502f, -3.202f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.922f, -0.724f, 2.179f, -1.498f, 3.202f)
                close()
            }
        }
        .build()
        return _plantWilt!!
    }

private var _plantWilt: ImageVector? = null
