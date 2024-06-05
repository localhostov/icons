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

public val Icons.Bold.RoadBarrier: ImageVector
    get() {
        if (_roadBarrier != null) {
            return _roadBarrier!!
        }
        _roadBarrier = Builder(name = "RoadBarrier", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 4.0f)
                lineTo(3.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                lineTo(21.0f, 16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.121f, 7.0f)
                horizontalLineToRelative(2.758f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-2.758f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(6.879f, 13.0f)
                horizontalLineToRelative(-2.758f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(2.758f)
                lineToRelative(-6.0f, 6.0f)
                close()
                moveTo(5.879f, 7.0f)
                lineToRelative(-2.879f, 2.879f)
                verticalLineToRelative(-2.879f)
                horizontalLineToRelative(2.879f)
                close()
                moveTo(18.121f, 13.0f)
                lineToRelative(2.879f, -2.879f)
                verticalLineToRelative(2.879f)
                horizontalLineToRelative(-2.879f)
                close()
            }
        }
        .build()
        return _roadBarrier!!
    }

private var _roadBarrier: ImageVector? = null
