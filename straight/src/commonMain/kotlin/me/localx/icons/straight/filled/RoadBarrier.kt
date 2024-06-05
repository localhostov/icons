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

public val Icons.Filled.RoadBarrier: ImageVector
    get() {
        if (_roadBarrier != null) {
            return _roadBarrier!!
        }
        _roadBarrier = Builder(name = "RoadBarrier", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                lineTo(24.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.879f)
                lineToRelative(5.879f, -5.879f)
                verticalLineToRelative(-2.828f)
                lineTo(13.293f, 15.0f)
                lineTo(7.914f, 15.0f)
                lineTo(18.914f, 4.0f)
                horizontalLineToRelative(3.086f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.086f, 4.0f)
                horizontalLineToRelative(-5.379f)
                lineTo(2.0f, 12.707f)
                verticalLineToRelative(-2.828f)
                lineTo(7.879f, 4.0f)
                lineTo(2.0f, 4.0f)
                lineTo(2.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3.086f)
                lineTo(16.086f, 4.0f)
                close()
            }
        }
        .build()
        return _roadBarrier!!
    }

private var _roadBarrier: ImageVector? = null
