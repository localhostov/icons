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

public val Icons.Bold.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.351f, 3.533f)
                lineToRelative(9.528f, 9.528f)
                lineTo(24.0f, 10.94f)
                lineTo(14.472f, 1.413f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, -4.934f, 0.0f)
                lineTo(0.005f, 10.94f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(9.533f, -9.528f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, true, 0.692f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.879f, 23.0f)
                lineTo(24.0f, 20.882f)
                lineTo(13.066f, 9.947f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(0.005f, 20.882f)
                lineTo(2.126f, 23.0f)
                lineToRelative(9.879f, -9.874f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
