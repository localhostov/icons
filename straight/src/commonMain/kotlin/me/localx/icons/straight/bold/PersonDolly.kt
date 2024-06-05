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

public val Icons.Bold.PersonDolly: ImageVector
    get() {
        if (_personDolly != null) {
            return _personDolly!!
        }
        _personDolly = Builder(name = "PersonDolly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 2.5f)
                curveTo(1.0f, 1.119f, 2.119f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.0f, 3.881f, 1.0f, 2.5f)
                close()
                moveTo(0.0f, 18.117f)
                verticalLineToRelative(5.883f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.972f)
                lineToRelative(-2.377f, -1.46f)
                curveToRelative(-0.22f, -0.135f, -0.426f, -0.288f, -0.623f, -0.451f)
                close()
                moveTo(23.819f, 19.615f)
                lineToRelative(-0.678f, -2.922f)
                lineToRelative(-7.793f, 1.807f)
                lineToRelative(-2.936f, -12.664f)
                lineToRelative(-2.923f, 0.678f)
                lineToRelative(0.808f, 3.486f)
                horizontalLineToRelative(-1.966f)
                lineToRelative(-1.471f, -2.354f)
                curveToRelative(-0.644f, -1.031f, -1.753f, -1.646f, -2.968f, -1.646f)
                horizontalLineToRelative(-1.392f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.661f)
                curveToRelative(0.0f, 1.05f, 0.534f, 2.005f, 1.431f, 2.557f)
                lineToRelative(3.456f, 2.121f)
                verticalLineToRelative(5.161f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.839f)
                lineToRelative(-2.886f, -1.772f)
                verticalLineToRelative(-5.059f)
                lineToRelative(1.669f, 2.67f)
                horizontalLineToRelative(4.324f)
                lineToRelative(1.446f, 6.236f)
                curveToRelative(-0.85f, 0.399f, -1.439f, 1.262f, -1.439f, 2.264f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.024f, -0.001f, -0.048f, -0.002f, -0.072f)
                lineToRelative(7.821f, -1.813f)
                close()
                moveTo(16.387f, 14.707f)
                curveToRelative(0.189f, 0.808f, 1.0f, 1.309f, 1.807f, 1.117f)
                lineToRelative(2.736f, -0.65f)
                curveToRelative(0.804f, -0.191f, 1.302f, -0.997f, 1.114f, -1.802f)
                lineToRelative(-0.659f, -2.811f)
                curveToRelative(-0.189f, -0.808f, -1.0f, -1.309f, -1.807f, -1.117f)
                lineToRelative(-2.736f, 0.65f)
                curveToRelative(-0.804f, 0.191f, -1.302f, 0.997f, -1.114f, 1.802f)
                lineToRelative(0.659f, 2.811f)
                close()
            }
        }
        .build()
        return _personDolly!!
    }

private var _personDolly: ImageVector? = null
