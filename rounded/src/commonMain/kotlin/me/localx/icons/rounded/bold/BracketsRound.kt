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

public val Icons.Bold.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.27f, 0.69f)
                curveToRelative(0.44f, 0.7f, 0.24f, 1.63f, -0.46f, 2.07f)
                curveToRelative(-0.19f, 0.12f, -4.81f, 3.18f, -4.81f, 9.23f)
                reflectiveCurveToRelative(4.19f, 9.15f, 4.37f, 9.28f)
                curveToRelative(0.67f, 0.48f, 0.83f, 1.41f, 0.36f, 2.09f)
                curveToRelative(-0.29f, 0.41f, -0.76f, 0.64f, -1.23f, 0.64f)
                curveToRelative(-0.3f, 0.0f, -0.59f, -0.09f, -0.86f, -0.27f)
                curveToRelative(-0.23f, -0.16f, -5.64f, -4.04f, -5.64f, -11.73f)
                reflectiveCurveTo(5.94f, 0.4f, 6.19f, 0.23f)
                curveToRelative(0.7f, -0.44f, 1.63f, -0.24f, 2.07f, 0.46f)
                close()
                moveTo(18.93f, 0.31f)
                curveToRelative(-0.65f, -0.51f, -1.59f, -0.39f, -2.1f, 0.26f)
                reflectiveCurveToRelative(-0.4f, 1.59f, 0.25f, 2.1f)
                curveToRelative(0.16f, 0.13f, 3.93f, 3.19f, 3.93f, 9.32f)
                reflectiveCurveToRelative(-4.18f, 9.14f, -4.37f, 9.27f)
                curveToRelative(-0.67f, 0.48f, -0.84f, 1.41f, -0.36f, 2.09f)
                curveToRelative(0.29f, 0.42f, 0.76f, 0.64f, 1.23f, 0.64f)
                curveToRelative(0.3f, 0.0f, 0.6f, -0.09f, 0.86f, -0.27f)
                curveToRelative(0.23f, -0.16f, 5.64f, -4.04f, 5.64f, -11.73f)
                reflectiveCurveTo(19.13f, 0.48f, 18.92f, 0.32f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
