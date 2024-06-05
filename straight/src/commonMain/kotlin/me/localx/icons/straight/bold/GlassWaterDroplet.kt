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

public val Icons.Bold.GlassWaterDroplet: ImageVector
    get() {
        if (_glassWaterDroplet != null) {
            return _glassWaterDroplet!!
        }
        _glassWaterDroplet = Builder(name = "GlassWaterDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.014f, 0.0f)
                lineToRelative(1.709f, 20.787f)
                curveToRelative(0.148f, 1.802f, 1.681f, 3.213f, 3.488f, 3.213f)
                horizontalLineToRelative(11.459f)
                curveToRelative(1.828f, 0.0f, 3.326f, -1.373f, 3.486f, -3.194f)
                lineTo(22.986f, 0.0f)
                lineTo(1.014f, 0.0f)
                close()
                moveTo(19.71f, 3.0f)
                lineToRelative(-0.966f, 11.0f)
                horizontalLineToRelative(-2.336f)
                curveToRelative(-0.207f, 0.581f, -0.757f, 1.0f, -1.408f, 1.0f)
                reflectiveCurveToRelative(-1.201f, -0.419f, -1.408f, -1.0f)
                horizontalLineToRelative(-3.184f)
                curveToRelative(-0.207f, 0.581f, -0.757f, 1.0f, -1.408f, 1.0f)
                reflectiveCurveToRelative(-1.201f, -0.419f, -1.408f, -1.0f)
                horizontalLineToRelative(-2.417f)
                lineToRelative(-0.905f, -11.0f)
                horizontalLineToRelative(15.439f)
                close()
                moveTo(17.67f, 21.0f)
                lineTo(6.211f, 21.0f)
                curveToRelative(-0.258f, 0.0f, -0.477f, -0.201f, -0.498f, -0.459f)
                lineToRelative(-0.27f, -3.281f)
                curveToRelative(0.196f, -0.13f, 0.382f, -0.274f, 0.556f, -0.431f)
                curveToRelative(0.798f, 0.72f, 1.843f, 1.17f, 3.0f, 1.17f)
                reflectiveCurveToRelative(2.202f, -0.451f, 3.0f, -1.17f)
                curveToRelative(0.798f, 0.72f, 1.843f, 1.17f, 3.0f, 1.17f)
                reflectiveCurveToRelative(2.202f, -0.451f, 3.0f, -1.17f)
                curveToRelative(0.146f, 0.132f, 0.301f, 0.255f, 0.463f, 0.367f)
                lineToRelative(-0.294f, 3.347f)
                curveToRelative(-0.023f, 0.26f, -0.237f, 0.456f, -0.498f, 0.456f)
                close()
                moveTo(8.999f, 9.0f)
                curveToRelative(0.0f, -2.0f, 3.0f, -4.8f, 3.0f, -4.8f)
                curveToRelative(0.0f, 0.0f, 3.0f, 2.8f, 3.0f, 4.8f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _glassWaterDroplet!!
    }

private var _glassWaterDroplet: ImageVector? = null
