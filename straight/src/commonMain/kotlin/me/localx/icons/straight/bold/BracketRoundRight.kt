package me.localx.icons.straight.bold

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
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, 7.39f, -5.21f, 11.78f, -5.43f, 11.96f)
                lineToRelative(-1.92f, -2.31f)
                reflectiveCurveToRelative(4.34f, -3.71f, 4.34f, -9.66f)
                reflectiveCurveTo(8.7f, 2.38f, 8.66f, 2.34f)
                lineTo(10.57f, 0.04f)
                curveToRelative(0.22f, 0.18f, 5.43f, 4.58f, 5.43f, 11.96f)
                close()
            }
        }
        .build()
        return _bracketRoundRight!!
    }

private var _bracketRoundRight: ImageVector? = null
