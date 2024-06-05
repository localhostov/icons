package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.654f, 20.47f)
                lineTo(2.126f, 10.942f)
                lineTo(0.005f, 13.063f)
                lineTo(9.533f, 22.59f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, 4.934f, 0.0f)
                lineTo(24.0f, 13.063f)
                lineToRelative(-2.121f, -2.121f)
                lineTo(12.346f, 20.47f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, true, -0.692f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.126f, 1.0f)
                lineTo(0.005f, 3.121f)
                lineTo(10.939f, 14.056f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(24.0f, 3.121f)
                lineTo(21.879f, 1.0f)
                lineTo(12.0f, 10.874f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

private var _chevronDoubleDown: ImageVector? = null
