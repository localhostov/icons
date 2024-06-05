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

public val Icons.Bold.BracketRoundRight: ImageVector
    get() {
        if (_bracketRoundRight != null) {
            return _bracketRoundRight!!
        }
        _bracketRoundRight = Builder(name = "BracketRoundRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 24.0f)
                curveToRelative(-0.47f, 0.0f, -0.94f, -0.22f, -1.23f, -0.64f)
                curveToRelative(-0.47f, -0.68f, -0.31f, -1.61f, 0.36f, -2.09f)
                curveToRelative(0.19f, -0.13f, 4.37f, -3.19f, 4.37f, -9.27f)
                reflectiveCurveTo(8.81f, 2.85f, 8.63f, 2.72f)
                curveToRelative(-0.67f, -0.48f, -0.83f, -1.41f, -0.36f, -2.09f)
                curveToRelative(0.48f, -0.67f, 1.41f, -0.84f, 2.08f, -0.37f)
                curveToRelative(0.23f, 0.16f, 5.64f, 4.04f, 5.64f, 11.73f)
                reflectiveCurveToRelative(-5.41f, 11.57f, -5.64f, 11.73f)
                curveToRelative(-0.26f, 0.18f, -0.56f, 0.27f, -0.86f, 0.27f)
                close()
            }
        }
        .build()
        return _bracketRoundRight!!
    }

private var _bracketRoundRight: ImageVector? = null
