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

public val Icons.Outline.GreekHelmet: ImageVector
    get() {
        if (_greekHelmet != null) {
            return _greekHelmet!!
        }
        _greekHelmet = Builder(name = "GreekHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.075f)
                verticalLineToRelative(-0.075f)
                curveToRelative(0.0f, -1.731f, -0.632f, -3.317f, -1.677f, -4.541f)
                lineToRelative(3.332f, -3.83f)
                lineToRelative(-0.749f, -0.657f)
                curveToRelative(-2.188f, -1.917f, -4.995f, -2.973f, -7.906f, -2.973f)
                curveTo(8.383f, 0.0f, 3.0f, 5.383f, 3.0f, 12.0f)
                verticalLineToRelative(5.505f)
                curveToRelative(0.0f, 0.896f, -0.241f, 1.777f, -0.698f, 2.549f)
                lineTo(-0.037f, 24.0f)
                lineTo(4.562f, 24.0f)
                curveToRelative(1.862f, 0.0f, 3.592f, -1.004f, 4.515f, -2.62f)
                curveToRelative(0.604f, -1.056f, 0.923f, -2.257f, 0.923f, -3.474f)
                verticalLineToRelative(-5.906f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(4.078f, 1.631f)
                lineToRelative(0.789f, 6.369f)
                horizontalLineToRelative(-6.591f)
                lineToRelative(-2.276f, -4.509f)
                verticalLineToRelative(0.416f)
                curveToRelative(0.0f, 1.564f, -0.41f, 3.108f, -1.187f, 4.466f)
                curveToRelative(-0.349f, 0.612f, -0.789f, 1.154f, -1.286f, 1.628f)
                horizontalLineToRelative(13.606f)
                lineToRelative(-0.967f, -7.739f)
                lineToRelative(1.466f, -0.683f)
                lineToRelative(-1.632f, -3.503f)
                close()
                moveTo(18.822f, 6.137f)
                curveToRelative(-1.1f, -0.719f, -2.413f, -1.138f, -3.822f, -1.138f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                verticalLineToRelative(5.906f)
                curveToRelative(0.0f, 0.869f, -0.228f, 1.727f, -0.659f, 2.481f)
                curveToRelative(-0.568f, 0.994f, -1.633f, 1.612f, -2.778f, 1.612f)
                horizontalLineToRelative(-1.09f)
                lineToRelative(0.55f, -0.927f)
                curveToRelative(0.64f, -1.081f, 0.978f, -2.314f, 0.978f, -3.568f)
                verticalLineToRelative(-5.505f)
                curveTo(5.0f, 6.486f, 9.486f, 2.0f, 15.0f, 2.0f)
                curveToRelative(2.092f, 0.0f, 4.119f, 0.654f, 5.806f, 1.857f)
                lineToRelative(-1.983f, 2.28f)
                close()
            }
        }
        .build()
        return _greekHelmet!!
    }

private var _greekHelmet: ImageVector? = null
