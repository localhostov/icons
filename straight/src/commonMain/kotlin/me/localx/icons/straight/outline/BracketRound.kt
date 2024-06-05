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

public val Icons.Outline.BracketRound: ImageVector
    get() {
        if (_bracketRound != null) {
            return _bracketRound!!
        }
        _bracketRound = Builder(name = "BracketRound", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.77f, 23.97f)
                curveToRelative(-0.24f, -0.18f, -5.77f, -4.56f, -5.77f, -11.97f)
                reflectiveCurveTo(13.54f, 0.21f, 13.77f, 0.03f)
                lineToRelative(1.23f, 1.58f)
                reflectiveCurveToRelative(-5.0f, 3.99f, -5.0f, 10.39f)
                reflectiveCurveToRelative(4.95f, 10.35f, 5.0f, 10.39f)
                lineToRelative(-1.23f, 1.58f)
                close()
            }
        }
        .build()
        return _bracketRound!!
    }

private var _bracketRound: ImageVector? = null
