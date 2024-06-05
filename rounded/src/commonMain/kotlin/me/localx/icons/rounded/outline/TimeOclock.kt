package me.localx.icons.rounded.outline

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

public val Icons.Outline.TimeOclock: ImageVector
    get() {
        if (_timeOclock != null) {
            return _timeOclock!!
        }
        _timeOclock = Builder(name = "TimeOclock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, true, -10.0f, 10.0f)
                close()
                moveTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, -1.723f)
                verticalLineToRelative(-3.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.277f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, 1.0f, 1.723f)
                close()
            }
        }
        .build()
        return _timeOclock!!
    }

private var _timeOclock: ImageVector? = null
