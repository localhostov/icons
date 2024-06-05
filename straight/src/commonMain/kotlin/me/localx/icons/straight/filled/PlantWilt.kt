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

public val Icons.Filled.PlantWilt: ImageVector
    get() {
        if (_plantWilt != null) {
            return _plantWilt!!
        }
        _plantWilt = Builder(name = "PlantWilt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.987f, 12.138f)
                curveToRelative(-0.135f, -4.515f, -2.741f, -6.138f, -4.987f, -6.138f)
                curveToRelative(-1.012f, 0.0f, -2.099f, 0.329f, -3.0f, 1.102f)
                verticalLineToRelative(-0.602f)
                curveTo(13.0f, 1.702f, 10.307f, 0.0f, 8.0f, 0.0f)
                curveTo(5.754f, 0.0f, 3.148f, 1.623f, 3.013f, 6.138f)
                curveToRelative(-1.727f, 0.443f, -3.013f, 1.999f, -3.013f, 3.862f)
                curveToRelative(0.0f, 2.833f, 2.956f, 5.87f, 3.293f, 6.207f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.707f, -0.707f)
                curveToRelative(0.337f, -0.337f, 3.293f, -3.375f, 3.293f, -6.207f)
                curveToRelative(0.0f, -1.854f, -1.274f, -3.402f, -2.988f, -3.854f)
                curveToRelative(0.13f, -3.829f, 2.305f, -4.146f, 2.988f, -4.146f)
                curveToRelative(0.704f, 0.0f, 3.0f, 0.325f, 3.0f, 4.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0.0f, -4.175f, 2.296f, -4.5f, 3.0f, -4.5f)
                curveToRelative(0.683f, 0.0f, 2.857f, 0.317f, 2.988f, 4.146f)
                curveToRelative(-1.714f, 0.452f, -2.988f, 2.0f, -2.988f, 3.854f)
                curveToRelative(0.0f, 2.833f, 2.956f, 5.87f, 3.293f, 6.207f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.707f, -0.707f)
                curveToRelative(0.337f, -0.337f, 3.293f, -3.375f, 3.293f, -6.207f)
                curveToRelative(0.0f, -1.863f, -1.286f, -3.419f, -3.013f, -3.862f)
                close()
            }
        }
        .build()
        return _plantWilt!!
    }

private var _plantWilt: ImageVector? = null
