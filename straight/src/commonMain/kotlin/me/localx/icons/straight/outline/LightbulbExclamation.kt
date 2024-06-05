package me.localx.icons.straight.outline

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
                verticalLineToRelative(3.851f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.685f)
                curveToRelative(0.0f, -1.816f, 0.704f, -3.475f, 1.932f, -4.552f)
                curveToRelative(1.95f, -1.708f, 3.068f, -4.173f, 3.068f, -6.763f)
                curveToRelative(0.0f, -2.56f, -1.096f, -5.007f, -3.006f, -6.714f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                reflectiveCurveToRelative(-0.001f, -1.95f, -0.002f, -2.0f)
                horizontalLineToRelative(4.008f)
                curveToRelative(-0.004f, 0.105f, -0.006f, 2.0f, -0.006f, 2.0f)
                close()
                moveTo(16.613f, 14.259f)
                curveToRelative(-1.106f, 0.969f, -1.897f, 2.272f, -2.303f, 3.741f)
                horizontalLineToRelative(-4.622f)
                curveToRelative(-0.42f, -1.431f, -1.258f, -2.765f, -2.458f, -3.881f)
                curveToRelative(-1.671f, -1.556f, -2.463f, -3.759f, -2.171f, -6.043f)
                curveToRelative(0.399f, -3.138f, 2.974f, -5.673f, 6.121f, -6.029f)
                curveToRelative(2.027f, -0.227f, 3.974f, 0.386f, 5.48f, 1.731f)
                curveToRelative(1.486f, 1.328f, 2.339f, 3.231f, 2.339f, 5.222f)
                curveToRelative(0.0f, 2.013f, -0.87f, 3.93f, -2.387f, 5.259f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _lightbulbExclamation!!
    }

private var _lightbulbExclamation: ImageVector? = null
