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

public val Icons.Outline.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, 6.41f, 4.58f, 10.18f, 4.63f, 10.22f)
                curveToRelative(0.43f, 0.35f, 0.5f, 0.98f, 0.15f, 1.41f)
                curveToRelative(-0.2f, 0.25f, -0.49f, 0.37f, -0.78f, 0.37f)
                curveToRelative(-0.22f, 0.0f, -0.44f, -0.07f, -0.62f, -0.22f)
                curveToRelative(-0.22f, -0.18f, -5.38f, -4.39f, -5.38f, -11.78f)
                reflectiveCurveTo(5.16f, 0.39f, 5.38f, 0.22f)
                curveToRelative(0.43f, -0.34f, 1.06f, -0.28f, 1.41f, 0.16f)
                curveToRelative(0.35f, 0.43f, 0.28f, 1.06f, -0.16f, 1.41f)
                curveToRelative(-0.04f, 0.04f, -4.62f, 3.81f, -4.62f, 10.22f)
                close()
                moveTo(18.62f, 0.22f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.27f, -1.4f, 0.15f)
                curveToRelative(-0.35f, 0.43f, -0.28f, 1.06f, 0.15f, 1.41f)
                curveToRelative(0.05f, 0.04f, 4.63f, 3.81f, 4.63f, 10.22f)
                reflectiveCurveToRelative(-4.54f, 10.15f, -4.63f, 10.22f)
                curveToRelative(-0.43f, 0.35f, -0.5f, 0.97f, -0.16f, 1.4f)
                curveToRelative(0.2f, 0.25f, 0.49f, 0.38f, 0.78f, 0.38f)
                curveToRelative(0.22f, 0.0f, 0.44f, -0.07f, 0.62f, -0.22f)
                curveToRelative(0.22f, -0.18f, 5.38f, -4.39f, 5.38f, -11.78f)
                reflectiveCurveTo(18.84f, 0.39f, 18.62f, 0.22f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
