package me.localx.icons.straight.filled

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

public val Icons.Filled.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(name = "Bottle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                lineTo(10.0f, 17.0f)
                lineTo(10.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 11.354f)
                lineTo(20.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 11.354f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 5.886f, 8.568f)
                lineTo(9.0f, 7.323f)
                lineTo(9.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 2.0f)
                lineTo(15.0f, 2.0f)
                lineTo(15.0f, 7.323f)
                lineToRelative(3.114f, 1.245f)
                arcTo(2.988f, 2.988f, 0.0f, false, true, 20.0f, 11.354f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
