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
                moveTo(7.34f, 21.66f)
                lineToRelative(-1.92f, 2.31f)
                curveToRelative(-0.22f, -0.18f, -5.43f, -4.58f, -5.43f, -11.96f)
                reflectiveCurveTo(5.21f, 0.22f, 5.43f, 0.04f)
                lineToRelative(1.91f, 2.31f)
                reflectiveCurveTo(3.0f, 6.06f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.3f, 9.62f, 4.34f, 9.66f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 7.39f, -5.21f, 11.78f, -5.43f, 11.96f)
                lineToRelative(-1.92f, -2.31f)
                reflectiveCurveToRelative(4.34f, -3.71f, 4.34f, -9.66f)
                reflectiveCurveTo(16.7f, 2.38f, 16.66f, 2.34f)
                lineTo(18.57f, 0.04f)
                curveToRelative(0.22f, 0.18f, 5.43f, 4.58f, 5.43f, 11.96f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
