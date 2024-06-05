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

public val Icons.Bold.AngleDoubleLeft: ImageVector
    get() {
        if (_angleDoubleLeft != null) {
            return _angleDoubleLeft!!
        }
        _angleDoubleLeft = Builder(name = "AngleDoubleLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.62f, 11.654f)
                lineToRelative(9.528f, -9.528f)
                lineTo(11.027f, 0.005f)
                lineTo(1.5f, 9.533f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, 0.0f, 4.934f)
                lineTo(11.027f, 24.0f)
                lineToRelative(2.121f, -2.121f)
                lineTo(3.62f, 12.346f)
                arcTo(0.489f, 0.489f, 0.0f, false, true, 3.62f, 11.654f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.09f, 2.126f)
                lineTo(20.969f, 0.005f)
                lineTo(10.034f, 10.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 2.122f)
                lineTo(20.969f, 24.0f)
                lineToRelative(2.121f, -2.121f)
                lineTo(13.216f, 12.0f)
                close()
            }
        }
        .build()
        return _angleDoubleLeft!!
    }

private var _angleDoubleLeft: ImageVector? = null
