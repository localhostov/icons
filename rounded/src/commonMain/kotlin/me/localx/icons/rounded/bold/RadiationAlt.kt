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

public val Icons.Bold.RadiationAlt: ImageVector
    get() {
        if (_radiationAlt != null) {
            return _radiationAlt!!
        }
        _radiationAlt = Builder(name = "RadiationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(17.912f, 12.0f)
                horizontalLineToRelative(-1.528f)
                curveToRelative(-0.479f, 0.0f, -0.867f, -0.345f, -0.978f, -0.811f)
                curveToRelative(-0.143f, -0.601f, -0.442f, -1.141f, -0.851f, -1.577f)
                curveToRelative(-0.33f, -0.352f, -0.41f, -0.868f, -0.145f, -1.271f)
                lineToRelative(0.843f, -1.281f)
                curveToRelative(0.348f, -0.528f, 1.081f, -0.595f, 1.542f, -0.162f)
                curveToRelative(0.392f, 0.368f, 0.747f, 0.786f, 1.055f, 1.255f)
                curveToRelative(0.557f, 0.846f, 0.904f, 1.768f, 1.058f, 2.707f)
                curveToRelative(0.098f, 0.6f, -0.388f, 1.141f, -0.996f, 1.141f)
                close()
                moveTo(9.446f, 9.612f)
                curveToRelative(-0.409f, 0.436f, -0.707f, 0.976f, -0.851f, 1.577f)
                curveToRelative(-0.111f, 0.466f, -0.499f, 0.811f, -0.978f, 0.811f)
                horizontalLineToRelative(-1.528f)
                curveToRelative(-0.608f, 0.0f, -1.095f, -0.541f, -0.996f, -1.141f)
                curveToRelative(0.153f, -0.939f, 0.501f, -1.861f, 1.058f, -2.707f)
                curveToRelative(0.308f, -0.468f, 0.663f, -0.887f, 1.055f, -1.255f)
                curveToRelative(0.461f, -0.433f, 1.195f, -0.366f, 1.542f, 0.162f)
                lineToRelative(0.843f, 1.281f)
                curveToRelative(0.265f, 0.403f, 0.185f, 0.919f, -0.145f, 1.271f)
                close()
                moveTo(15.109f, 17.02f)
                curveToRelative(0.318f, 0.514f, 0.12f, 1.208f, -0.437f, 1.442f)
                curveToRelative(-0.822f, 0.345f, -1.723f, 0.539f, -2.671f, 0.539f)
                reflectiveCurveToRelative(-1.849f, -0.194f, -2.671f, -0.539f)
                curveToRelative(-0.557f, -0.234f, -0.755f, -0.928f, -0.437f, -1.442f)
                lineToRelative(0.791f, -1.278f)
                curveToRelative(0.243f, -0.393f, 0.727f, -0.599f, 1.162f, -0.443f)
                curveToRelative(0.361f, 0.129f, 0.749f, 0.201f, 1.154f, 0.201f)
                reflectiveCurveToRelative(0.794f, -0.072f, 1.154f, -0.201f)
                curveToRelative(0.435f, -0.156f, 0.919f, 0.05f, 1.162f, 0.443f)
                lineToRelative(0.791f, 1.278f)
                close()
            }
        }
        .build()
        return _radiationAlt!!
    }

private var _radiationAlt: ImageVector? = null
