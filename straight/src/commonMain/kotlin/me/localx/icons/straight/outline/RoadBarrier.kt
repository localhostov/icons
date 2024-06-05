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

public val Icons.Outline.RoadBarrier: ImageVector
    get() {
        if (_roadBarrier != null) {
            return _roadBarrier!!
        }
        _roadBarrier = Builder(name = "RoadBarrier", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 4.0f)
                lineTo(2.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                lineTo(22.0f, 15.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.914f, 6.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(7.0f, -7.0f)
                close()
                moveTo(7.086f, 13.0f)
                lineTo(2.914f, 13.0f)
                lineToRelative(7.0f, -7.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(-7.0f, 7.0f)
                close()
                moveTo(7.086f, 6.0f)
                lineTo(2.0f, 11.086f)
                lineTo(2.0f, 6.0f)
                lineTo(7.086f, 6.0f)
                close()
                moveTo(16.914f, 13.0f)
                lineToRelative(5.086f, -5.086f)
                verticalLineToRelative(5.086f)
                horizontalLineToRelative(-5.086f)
                close()
            }
        }
        .build()
        return _roadBarrier!!
    }

private var _roadBarrier: ImageVector? = null
