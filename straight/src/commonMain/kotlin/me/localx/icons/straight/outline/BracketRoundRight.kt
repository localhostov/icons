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

public val Icons.Outline.BracketRoundRight: ImageVector
    get() {
        if (_bracketRoundRight != null) {
            return _bracketRoundRight!!
        }
        _bracketRoundRight = Builder(name = "BracketRoundRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.23f, 23.97f)
                lineToRelative(-1.23f, -1.58f)
                curveToRelative(0.05f, -0.04f, 5.0f, -3.99f, 5.0f, -10.39f)
                reflectiveCurveTo(9.05f, 1.65f, 9.0f, 1.61f)
                lineTo(10.23f, 0.03f)
                curveToRelative(0.24f, 0.18f, 5.77f, 4.56f, 5.77f, 11.97f)
                reflectiveCurveToRelative(-5.54f, 11.79f, -5.77f, 11.97f)
                close()
            }
        }
        .build()
        return _bracketRoundRight!!
    }

private var _bracketRoundRight: ImageVector? = null
