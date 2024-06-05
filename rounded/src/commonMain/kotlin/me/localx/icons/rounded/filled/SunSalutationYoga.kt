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

public val Icons.Filled.SunSalutationYoga: ImageVector
    get() {
        if (_sunSalutationYoga != null) {
            return _sunSalutationYoga!!
        }
        _sunSalutationYoga = Builder(name = "SunSalutationYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(18.082f, 7.588f)
                curveToRelative(-0.459f, -0.307f, -1.081f, -0.182f, -1.387f, 0.277f)
                lineToRelative(-1.292f, 1.941f)
                reflectiveCurveToRelative(-2.088f, -2.864f, -2.134f, -2.907f)
                curveToRelative(-0.618f, -0.58f, -1.424f, -0.899f, -2.27f, -0.899f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.646f)
                curveToRelative(0.0f, 1.525f, 0.848f, 2.896f, 2.211f, 3.578f)
                lineToRelative(0.789f, 0.395f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-9.678f)
                lineToRelative(-1.703f, -2.251f)
                curveToRelative(-0.325f, -0.447f, -0.226f, -1.072f, 0.221f, -1.397f)
                curveToRelative(0.449f, -0.326f, 1.073f, -0.225f, 1.396f, 0.221f)
                lineToRelative(1.177f, 1.501f)
                curveToRelative(0.333f, 0.385f, 0.902f, 0.604f, 1.409f, 0.604f)
                curveToRelative(0.526f, -0.015f, 0.972f, -0.264f, 1.332f, -0.735f)
                lineToRelative(1.527f, -2.29f)
                curveToRelative(0.307f, -0.459f, 0.183f, -1.081f, -0.277f, -1.387f)
                close()
            }
        }
        .build()
        return _sunSalutationYoga!!
    }

private var _sunSalutationYoga: ImageVector? = null
