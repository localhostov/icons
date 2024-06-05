package me.localx.icons.rounded.outline

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

public val Icons.Outline.LightbulbExclamation: ImageVector
    get() {
        if (_lightbulbExclamation != null) {
            return _lightbulbExclamation!!
        }
        _lightbulbExclamation = Builder(name = "LightbulbExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.994f, 2.286f)
                curveTo(16.086f, 0.581f, 13.522f, -0.231f, 10.956f, 0.059f)
                curveTo(6.904f, 0.517f, 3.59f, 3.782f, 3.075f, 7.822f)
                curveToRelative(-0.374f, 2.931f, 0.644f, 5.76f, 2.793f, 7.761f)
                curveToRelative(1.375f, 1.279f, 2.132f, 2.9f, 2.132f, 4.566f)
                verticalLineToRelative(0.161f)
                curveToRelative(0.0f, 2.035f, 1.655f, 3.69f, 3.69f, 3.69f)
                horizontalLineToRelative(0.619f)
                curveToRelative(2.035f, 0.0f, 3.69f, -1.655f, 3.69f, -3.69f)
                verticalLineToRelative(-0.549f)
                curveToRelative(0.0f, -1.486f, 0.687f, -2.906f, 1.932f, -3.998f)
                curveToRelative(1.95f, -1.708f, 3.068f, -4.173f, 3.068f, -6.763f)
                curveToRelative(0.0f, -2.56f, -1.096f, -5.007f, -3.006f, -6.714f)
                close()
                moveTo(12.309f, 22.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.932f, 0.0f, -1.69f, -0.758f, -1.69f, -1.69f)
                verticalLineToRelative(-0.161f)
                curveToRelative(0.0f, -0.05f, -0.001f, -0.1f, -0.002f, -0.149f)
                horizontalLineToRelative(4.002f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 0.932f, -0.759f, 1.69f, -1.69f, 1.69f)
                close()
                moveTo(16.613f, 14.259f)
                curveToRelative(-1.177f, 1.032f, -1.998f, 2.34f, -2.376f, 3.741f)
                horizontalLineToRelative(-4.548f)
                curveToRelative(-0.42f, -1.431f, -1.258f, -2.765f, -2.458f, -3.881f)
                curveToRelative(-1.671f, -1.556f, -2.463f, -3.759f, -2.171f, -6.043f)
                curveToRelative(0.399f, -3.138f, 2.974f, -5.673f, 6.121f, -6.029f)
                curveToRelative(0.278f, -0.031f, 0.554f, -0.047f, 0.828f, -0.047f)
                curveToRelative(1.725f, 0.0f, 3.353f, 0.617f, 4.652f, 1.778f)
                curveToRelative(1.486f, 1.328f, 2.339f, 3.231f, 2.339f, 5.222f)
                curveToRelative(0.0f, 2.013f, -0.87f, 3.93f, -2.387f, 5.259f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(13.5f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _lightbulbExclamation!!
    }

private var _lightbulbExclamation: ImageVector? = null
