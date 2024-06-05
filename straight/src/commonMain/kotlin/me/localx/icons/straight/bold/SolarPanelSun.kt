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

public val Icons.Bold.SolarPanelSun: ImageVector
    get() {
        if (_solarPanelSun != null) {
            return _solarPanelSun!!
        }
        _solarPanelSun = Builder(name = "SolarPanelSun", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 19.0f)
                horizontalLineToRelative(10.513f)
                lineToRelative(-1.938f, -6.5f)
                curveToRelative(-0.439f, -1.472f, -1.818f, -2.5f, -3.354f, -2.5f)
                lineTo(5.318f, 10.0f)
                curveToRelative(-1.536f, 0.0f, -2.915f, 1.028f, -3.354f, 2.5f)
                lineTo(0.026f, 19.0f)
                horizontalLineToRelative(10.474f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.13f, 16.0f)
                lineToRelative(0.25f, -3.0f)
                horizontalLineToRelative(3.239f)
                lineToRelative(0.25f, 3.0f)
                horizontalLineToRelative(-3.739f)
                close()
                moveTo(19.2f, 13.357f)
                lineToRelative(0.787f, 2.643f)
                horizontalLineToRelative(-3.107f)
                lineToRelative(-0.25f, -3.0f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.223f, 0.0f, 0.416f, 0.144f, 0.479f, 0.357f)
                close()
                moveTo(4.838f, 13.357f)
                curveToRelative(0.063f, -0.214f, 0.256f, -0.357f, 0.479f, -0.357f)
                horizontalLineToRelative(2.052f)
                lineToRelative(-0.25f, 3.0f)
                horizontalLineToRelative(-3.069f)
                lineToRelative(0.788f, -2.643f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.23f)
                curveToRelative(0.18f, -0.572f, 0.469f, -1.092f, 0.829f, -1.555f)
                lineToRelative(-1.188f, -1.716f)
                lineTo(9.337f, 0.02f)
                lineToRelative(1.185f, 1.712f)
                curveToRelative(0.468f, -0.145f, 0.962f, -0.232f, 1.478f, -0.232f)
                reflectiveCurveToRelative(1.01f, 0.086f, 1.478f, 0.232f)
                lineTo(14.663f, 0.021f)
                lineToRelative(2.467f, 1.707f)
                lineToRelative(-1.189f, 1.717f)
                curveToRelative(0.36f, 0.463f, 0.649f, 0.983f, 0.83f, 1.555f)
                horizontalLineToRelative(2.229f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _solarPanelSun!!
    }

private var _solarPanelSun: ImageVector? = null
