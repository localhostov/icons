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

public val Icons.Filled.OliveOil: ImageVector
    get() {
        if (_oliveOil != null) {
            return _oliveOil!!
        }
        _oliveOil = Builder(name = "OliveOil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, false, -6.0f, -3.45f)
                lineTo(15.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(8.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(9.0f, 8.0f)
                curveToRelative(-0.387f, 1.593f, -3.718f, 3.386f, -4.81f, 5.0f)
                lineTo(17.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(15.1f, 8.354f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.54f, 2.531f)
                arcTo(11.565f, 11.565f, 0.0f, false, true, 15.1f, 8.354f)
                close()
                moveTo(20.858f, 15.0f)
                curveToRelative(0.816f, 3.661f, -2.882f, 9.078f, -6.59f, 9.0f)
                lineTo(9.732f, 24.0f)
                curveToRelative(-3.712f, 0.076f, -7.4f, -5.334f, -6.59f, -9.0f)
                close()
            }
        }
        .build()
        return _oliveOil!!
    }

private var _oliveOil: ImageVector? = null
