package me.localx.icons.rounded.filled

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

public val Icons.Filled.BracketRound: ImageVector
    get() {
        if (_bracketRound != null) {
            return _bracketRound!!
        }
        _bracketRound = Builder(name = "BracketRound", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                curveToRelative(0.29f, 0.0f, 0.58f, -0.13f, 0.78f, -0.38f)
                curveToRelative(0.34f, -0.43f, 0.27f, -1.06f, -0.16f, -1.4f)
                curveToRelative(-0.09f, -0.07f, -4.63f, -3.84f, -4.63f, -10.22f)
                reflectiveCurveTo(14.58f, 1.82f, 14.63f, 1.78f)
                curveToRelative(0.43f, -0.35f, 0.5f, -0.98f, 0.15f, -1.41f)
                curveToRelative(-0.34f, -0.43f, -0.97f, -0.5f, -1.4f, -0.15f)
                curveToRelative(-0.22f, 0.18f, -5.37f, 4.39f, -5.37f, 11.78f)
                curveToRelative(0.0f, 7.4f, 5.16f, 11.61f, 5.38f, 11.78f)
                curveToRelative(0.18f, 0.15f, 0.41f, 0.22f, 0.62f, 0.22f)
                close()
            }
        }
        .build()
        return _bracketRound!!
    }

private var _bracketRound: ImageVector? = null
