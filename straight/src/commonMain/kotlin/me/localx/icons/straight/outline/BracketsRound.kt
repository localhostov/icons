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
                moveTo(7.0f, 22.39f)
                lineToRelative(-1.23f, 1.58f)
                curveToRelative(-0.24f, -0.18f, -5.77f, -4.56f, -5.77f, -11.97f)
                reflectiveCurveTo(5.54f, 0.21f, 5.77f, 0.03f)
                lineToRelative(1.23f, 1.58f)
                reflectiveCurveTo(2.0f, 5.6f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.95f, 10.35f, 5.0f, 10.39f)
                close()
                moveTo(18.23f, 0.03f)
                lineToRelative(-1.23f, 1.58f)
                reflectiveCurveToRelative(5.0f, 3.99f, 5.0f, 10.39f)
                reflectiveCurveToRelative(-4.95f, 10.35f, -5.0f, 10.39f)
                lineToRelative(1.23f, 1.58f)
                curveToRelative(0.24f, -0.18f, 5.77f, -4.56f, 5.77f, -11.97f)
                reflectiveCurveTo(18.46f, 0.21f, 18.23f, 0.03f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
