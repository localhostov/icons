package me.localx.icons.straight.filled

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

public val Icons.Filled.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.59f, 24.0f)
                lineTo(11.0f, 19.0f)
                horizontalLineTo(7.923f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, true, -0.883f, -1.19f)
                lineTo(9.7f, 10.0f)
                horizontalLineTo(14.0f)
                lineToRelative(-1.963f, 5.0f)
                horizontalLineToRelative(3.056f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, true, 0.755f, 1.406f)
                lineTo(10.789f, 24.0f)
                close()
                moveTo(17.44f, 5.059f)
                curveTo(13.528f, -4.12f, -0.043f, 0.313f, 2.266f, 10.049f)
                curveToRelative(-3.84f, 2.632f, -2.453f, 8.98f, 2.073f, 9.825f)
                lineToRelative(1.388f, 0.105f)
                curveToRelative(-0.048f, -0.055f, -0.106f, -0.1f, -0.15f, -0.159f)
                arcToRelative(2.936f, 2.936f, 0.0f, false, true, -0.452f, -2.588f)
                lineTo(8.265f, 8.0f)
                horizontalLineToRelative(8.67f)
                lineToRelative(-1.964f, 5.0f)
                horizontalLineToRelative(0.123f)
                arcToRelative(2.906f, 2.906f, 0.0f, false, true, 2.42f, 4.512f)
                lineToRelative(-1.649f, 2.475f)
                lineToRelative(1.272f, -0.019f)
                curveTo(26.031f, 19.05f, 26.3f, 6.306f, 17.44f, 5.059f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
