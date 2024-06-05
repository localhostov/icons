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

public val Icons.Bold.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.937f, 0.84f)
                curveToRelative(-0.028f, 0.012f, -2.896f, 1.16f, -5.438f, 1.16f)
                curveToRelative(-1.211f, 0.0f, -2.79f, -0.476f, -4.317f, -0.936f)
                curveToRelative(-1.735f, -0.523f, -3.53f, -1.064f, -5.183f, -1.064f)
                curveTo(3.683f, 0.0f, 0.736f, 2.133f, 0.613f, 2.224f)
                lineToRelative(-0.613f, 0.449f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-7.746f)
                curveToRelative(0.835f, -0.486f, 2.406f, -1.254f, 3.999f, -1.254f)
                curveToRelative(1.211f, 0.0f, 2.79f, 0.476f, 4.317f, 0.936f)
                curveToRelative(1.735f, 0.523f, 3.53f, 1.064f, 5.183f, 1.064f)
                curveToRelative(3.119f, 0.0f, 6.424f, -1.322f, 6.562f, -1.378f)
                lineToRelative(0.938f, -0.379f)
                lineTo(23.999f, 0.006f)
                lineToRelative(-2.062f, 0.834f)
                close()
                moveTo(20.999f, 7.171f)
                curveToRelative(-0.951f, 0.308f, -2.494f, 0.732f, -4.0f, 0.814f)
                verticalLineToRelative(-3.01f)
                curveToRelative(1.441f, -0.062f, 2.883f, -0.36f, 4.0f, -0.671f)
                verticalLineToRelative(2.868f)
                close()
                moveTo(13.999f, 4.675f)
                verticalLineToRelative(2.907f)
                curveToRelative(-0.598f, -0.157f, -1.21f, -0.335f, -1.818f, -0.518f)
                curveToRelative(-0.722f, -0.218f, -1.454f, -0.43f, -2.182f, -0.614f)
                lineTo(9.999f, 3.551f)
                curveToRelative(0.438f, 0.123f, 0.878f, 0.253f, 1.317f, 0.385f)
                curveToRelative(0.888f, 0.268f, 1.791f, 0.537f, 2.683f, 0.739f)
                close()
                moveTo(6.999f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.48f, 0.0f, -2.884f, 0.425f, -3.998f, 0.903f)
                verticalLineToRelative(-2.649f)
                curveToRelative(0.835f, -0.486f, 2.406f, -1.254f, 3.999f, -1.254f)
                close()
                moveTo(3.0f, 12.902f)
                verticalLineToRelative(-2.645f)
                curveToRelative(0.831f, -0.486f, 2.394f, -1.257f, 3.998f, -1.257f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.479f, 0.0f, -2.885f, 0.424f, -3.999f, 0.902f)
                close()
                moveTo(9.999f, 12.45f)
                verticalLineToRelative(-2.899f)
                curveToRelative(0.437f, 0.123f, 0.878f, 0.253f, 1.316f, 0.385f)
                curveToRelative(0.888f, 0.268f, 1.791f, 0.537f, 2.684f, 0.74f)
                verticalLineToRelative(2.906f)
                curveToRelative(-0.598f, -0.157f, -1.209f, -0.335f, -1.817f, -0.518f)
                curveToRelative(-0.722f, -0.218f, -1.454f, -0.43f, -2.183f, -0.614f)
                close()
                moveTo(16.999f, 13.983f)
                verticalLineToRelative(-2.996f)
                curveToRelative(1.442f, -0.062f, 2.883f, -0.373f, 4.0f, -0.684f)
                verticalLineToRelative(2.87f)
                curveToRelative(-0.953f, 0.308f, -2.496f, 0.729f, -4.0f, 0.81f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
