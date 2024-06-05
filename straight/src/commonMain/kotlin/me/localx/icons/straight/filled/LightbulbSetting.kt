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

public val Icons.Filled.LightbulbSetting: ImageVector
    get() {
        if (_lightbulbSetting != null) {
            return _lightbulbSetting!!
        }
        _lightbulbSetting = Builder(name = "LightbulbSetting", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 18.0f)
                curveToRelative(0.0f, -0.46f, -0.089f, -0.895f, -0.218f, -1.313f)
                lineToRelative(1.416f, -0.816f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.411f, 0.813f)
                curveToRelative(-0.605f, -0.652f, -1.393f, -1.125f, -2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(-0.896f, 0.205f, -1.685f, 0.678f, -2.289f, 1.33f)
                lineToRelative(-1.411f, -0.813f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(1.416f, 0.816f)
                curveToRelative(-0.129f, 0.418f, -0.218f, 0.853f, -0.218f, 1.313f)
                reflectiveCurveToRelative(0.089f, 0.895f, 0.218f, 1.313f)
                lineToRelative(-1.416f, 0.816f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(1.411f, -0.813f)
                curveToRelative(0.605f, 0.652f, 1.393f, 1.125f, 2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(0.896f, -0.205f, 1.685f, -0.678f, 2.289f, -1.33f)
                lineToRelative(1.411f, 0.813f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.416f, -0.816f)
                curveToRelative(0.129f, -0.418f, 0.218f, -0.853f, 0.218f, -1.313f)
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.001f, 18.998f)
                horizontalLineToRelative(-3.125f)
                curveToRelative(-0.264f, -1.251f, -0.951f, -2.435f, -2.007f, -3.417f)
                curveTo(0.72f, 13.58f, -0.298f, 10.752f, 0.076f, 7.82f)
                curveTo(0.591f, 3.78f, 3.905f, 0.515f, 7.957f, 0.057f)
                curveToRelative(2.567f, -0.289f, 5.13f, 0.522f, 7.038f, 2.227f)
                curveToRelative(1.91f, 1.707f, 3.006f, 4.154f, 3.006f, 6.714f)
                curveToRelative(0.0f, 0.338f, -0.021f, 0.673f, -0.058f, 1.005f)
                curveToRelative(-4.386f, 0.031f, -7.932f, 3.589f, -7.942f, 7.98f)
                verticalLineToRelative(-7.169f)
                curveToRelative(1.161f, -0.414f, 2.0f, -1.514f, 2.0f, -2.816f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.302f, 0.839f, 2.402f, 2.0f, 2.816f)
                verticalLineToRelative(8.184f)
                close()
                moveTo(12.719f, 23.998f)
                horizontalLineToRelative(-7.718f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.585f)
                curveToRelative(0.47f, 1.162f, 1.207f, 2.184f, 2.132f, 3.0f)
                close()
            }
        }
        .build()
        return _lightbulbSetting!!
    }

private var _lightbulbSetting: ImageVector? = null
