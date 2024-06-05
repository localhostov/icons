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

public val Icons.Bold.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.096f, 107.435f)
                curveToRelative(-0.875f, -0.512f, -153.301f, -70.869f, -153.301f, -70.869f)
                curveToRelative(-36.604f, -20.159f, -80.985f, -20.159f, -117.589f, 0.0f)
                curveToRelative(0.0f, 0.0f, -152.405f, 70.357f, -153.301f, 70.869f)
                curveToRelative(-40.813f, 22.217f, -55.888f, 73.314f, -33.671f, 114.127f)
                curveToRelative(7.747f, 14.232f, 19.439f, 25.923f, 33.671f, 33.671f)
                curveToRelative(0.896f, 0.512f, 62.763f, 29.099f, 62.763f, 29.099f)
                verticalLineToRelative(100.843f)
                curveToRelative(0.06f, 43.435f, 28.345f, 81.789f, 69.824f, 94.677f)
                curveToRelative(25.834f, 7.462f, 52.621f, 11.105f, 79.509f, 10.816f)
                curveToRelative(26.889f, 0.289f, 53.675f, -3.354f, 79.509f, -10.816f)
                curveToRelative(41.479f, -12.889f, 69.764f, -51.243f, 69.824f, -94.677f)
                verticalLineTo(284.331f)
                lineTo(448.0f, 264.661f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.327f, 32.0f, -32.0f)
                verticalLineTo(180.501f)
                curveTo(511.154f, 149.044f, 496.121f, 121.088f, 468.096f, 107.435f)
                close()
                moveTo(341.333f, 385.173f)
                curveToRelative(0.078f, 15.245f, -9.754f, 28.774f, -24.277f, 33.408f)
                curveToRelative(-39.997f, 10.731f, -82.115f, 10.731f, -122.112f, 0.0f)
                curveToRelative(-14.524f, -4.634f, -24.355f, -18.163f, -24.277f, -33.408f)
                verticalLineToRelative(-71.317f)
                lineToRelative(26.539f, 12.245f)
                curveToRelative(36.591f, 20.212f, 80.998f, 20.212f, 117.589f, 0.0f)
                lineToRelative(26.539f, -12.245f)
                verticalLineTo(385.173f)
                close()
                moveTo(437.013f, 199.253f)
                curveToRelative(0.0f, 0.0f, -152.085f, 70.187f, -152.939f, 70.699f)
                curveToRelative(-17.407f, 9.9f, -38.742f, 9.9f, -56.149f, 0.0f)
                curveToRelative(-0.853f, -0.512f, -152.939f, -70.699f, -152.939f, -70.699f)
                curveToRelative(-9.897f, -5.049f, -13.827f, -17.165f, -8.778f, -27.062f)
                curveToRelative(1.927f, -3.778f, 5.0f, -6.85f, 8.778f, -8.778f)
                curveToRelative(0.0f, 0.0f, 152.085f, -70.187f, 152.939f, -70.699f)
                curveToRelative(17.407f, -9.9f, 38.742f, -9.9f, 56.149f, 0.0f)
                curveToRelative(0.853f, 0.512f, 152.939f, 70.699f, 152.939f, 70.699f)
                curveToRelative(9.897f, 5.049f, 13.827f, 17.165f, 8.778f, 27.062f)
                curveTo(443.864f, 194.254f, 440.791f, 197.326f, 437.013f, 199.253f)
                lineTo(437.013f, 199.253f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
