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

public val Icons.Outline.CloudCode: ImageVector
    get() {
        if (_cloudCode != null) {
            return _cloudCode!!
        }
        _cloudCode = Builder(name = "CloudCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.95f, 13.962f)
                lineToRelative(2.802f, 2.786f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.802f, -2.802f)
                curveToRelative(-0.775f, -0.776f, -0.774f, -2.038f, 0.0f, -2.812f)
                lineToRelative(2.756f, -2.756f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.756f, 2.756f)
                close()
                moveTo(14.708f, 9.792f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.756f, 2.74f)
                lineToRelative(-2.802f, 2.802f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.803f, -2.803f)
                curveToRelative(0.774f, -0.775f, 0.773f, -2.037f, 0.0f, -2.812f)
                lineToRelative(-2.756f, -2.756f)
                close()
                moveTo(24.0f, 14.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.468f, -5.0f, -5.5f)
                curveToRelative(0.0f, -1.722f, 0.811f, -3.335f, 2.157f, -4.367f)
                curveToRelative(-0.104f, -0.536f, -0.157f, -1.082f, -0.157f, -1.633f)
                curveTo(2.0f, 5.813f, 5.813f, 2.0f, 10.5f, 2.0f)
                curveToRelative(3.453f, 0.0f, 6.538f, 2.079f, 7.848f, 5.23f)
                curveToRelative(3.308f, 0.833f, 5.652f, 3.803f, 5.652f, 7.27f)
                close()
                moveTo(22.0f, 14.5f)
                curveToRelative(0.0f, -2.687f, -1.919f, -4.966f, -4.563f, -5.42f)
                lineToRelative(-0.587f, -0.101f)
                lineToRelative(-0.191f, -0.564f)
                curveToRelative(-0.894f, -2.641f, -3.369f, -4.415f, -6.159f, -4.415f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                curveToRelative(0.0f, 0.613f, 0.085f, 1.219f, 0.253f, 1.801f)
                lineToRelative(0.219f, 0.76f)
                lineToRelative(-0.688f, 0.389f)
                curveToRelative(-1.1f, 0.621f, -1.784f, 1.79f, -1.784f, 3.051f)
                curveToRelative(0.0f, 1.93f, 1.346f, 3.5f, 3.0f, 3.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _cloudCode!!
    }

private var _cloudCode: ImageVector? = null
