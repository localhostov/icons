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

public val Icons.Outline.ThunderstormRisk: ImageVector
    get() {
        if (_thunderstormRisk != null) {
            return _thunderstormRisk!!
        }
        _thunderstormRisk = Builder(name = "ThunderstormRisk", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.5f)
                curveToRelative(0.0f, 3.343f, -2.199f, 6.179f, -5.225f, 7.145f)
                lineToRelative(-1.044f, -1.789f)
                curveToRelative(2.441f, -0.561f, 4.269f, -2.748f, 4.269f, -5.356f)
                curveToRelative(0.0f, -2.688f, -1.919f, -4.966f, -4.563f, -5.419f)
                lineToRelative(-0.587f, -0.101f)
                lineToRelative(-0.191f, -0.564f)
                curveToRelative(-0.894f, -2.641f, -3.369f, -4.415f, -6.159f, -4.415f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                curveToRelative(0.0f, 0.612f, 0.085f, 1.219f, 0.253f, 1.802f)
                lineToRelative(0.219f, 0.759f)
                lineToRelative(-0.688f, 0.388f)
                curveToRelative(-1.1f, 0.621f, -1.783f, 1.79f, -1.783f, 3.05f)
                curveToRelative(0.0f, 1.93f, 1.346f, 3.5f, 3.0f, 3.5f)
                horizontalLineToRelative(1.185f)
                lineToRelative(-1.167f, 2.0f)
                horizontalLineToRelative(-0.018f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.468f, -5.0f, -5.5f)
                curveToRelative(0.0f, -1.722f, 0.811f, -3.334f, 2.157f, -4.367f)
                curveToRelative(-0.104f, -0.536f, -0.157f, -1.083f, -0.157f, -1.633f)
                curveTo(2.0f, 3.813f, 5.813f, 0.0f, 10.5f, 0.0f)
                curveToRelative(3.453f, 0.0f, 6.537f, 2.079f, 7.848f, 5.23f)
                curveToRelative(3.308f, 0.833f, 5.652f, 3.803f, 5.652f, 7.27f)
                close()
                moveTo(12.0f, 12.0f)
                lineToRelative(7.0f, 12.0f)
                lineTo(5.0f, 24.0f)
                lineToRelative(7.0f, -12.0f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _thunderstormRisk!!
    }

private var _thunderstormRisk: ImageVector? = null
