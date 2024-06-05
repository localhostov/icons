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

public val Icons.Bold.Joint: ImageVector
    get() {
        if (_joint != null) {
            return _joint!!
        }
        _joint = Builder(name = "Joint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 16.0f)
                horizontalLineToRelative(-12.536f)
                curveToRelative(-4.108f, 0.0f, -8.125f, 2.638f, -8.294f, 2.75f)
                curveTo(0.251f, 19.029f, 0.0f, 19.499f, 0.0f, 20.002f)
                curveToRelative(0.0f, 0.503f, 0.253f, 0.972f, 0.673f, 1.25f)
                curveToRelative(0.17f, 0.112f, 4.209f, 2.748f, 8.291f, 2.748f)
                horizontalLineToRelative(12.536f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.736f, 19.999f)
                curveToRelative(1.261f, -0.53f, 2.796f, -0.999f, 4.228f, -0.999f)
                horizontalLineToRelative(1.915f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-3.915f)
                curveToRelative(-1.475f, 0.0f, -3.007f, -0.483f, -4.228f, -1.001f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-3.879f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(5.879f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 4.856f)
                verticalLineToRelative(-1.356f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(1.356f)
                curveToRelative(0.0f, 0.873f, 0.465f, 1.695f, 1.214f, 2.144f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(1.347f, 0.808f, 2.185f, 2.287f, 2.185f, 3.858f)
                verticalLineToRelative(0.68f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.68f)
                curveToRelative(0.0f, -0.524f, -0.279f, -1.017f, -0.728f, -1.286f)
                lineToRelative(-1.602f, -0.961f)
                curveToRelative(-1.647f, -0.989f, -2.67f, -2.796f, -2.67f, -4.716f)
                close()
                moveTo(24.0f, 10.264f)
                verticalLineToRelative(0.235f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.235f)
                curveToRelative(0.0f, -0.873f, -0.465f, -1.694f, -1.213f, -2.144f)
                lineToRelative(-2.088f, -1.252f)
                curveToRelative(-1.048f, -0.629f, -1.699f, -1.779f, -1.699f, -3.001f)
                lineTo(16.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.368f)
                curveToRelative(0.0f, 0.175f, 0.093f, 0.339f, 0.243f, 0.429f)
                lineToRelative(2.087f, 1.252f)
                curveToRelative(1.647f, 0.988f, 2.67f, 2.795f, 2.67f, 4.716f)
                close()
            }
        }
        .build()
        return _joint!!
    }

private var _joint: ImageVector? = null
