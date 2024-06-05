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

public val Icons.Filled.Tally: ImageVector
    get() {
        if (_tally != null) {
            return _tally!!
        }
        _tally = Builder(name = "Tally", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.714f)
                lineToRelative(-0.818f, -1.825f)
                lineToRelative(-1.182f, 0.53f)
                lineToRelative(0.0f, -6.419f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 7.316f)
                lineToRelative(-4.0f, 1.794f)
                lineToRelative(0.0f, -9.11f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 10.007f)
                lineToRelative(-4.0f, 1.794f)
                lineToRelative(0.0f, -11.801f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 12.699f)
                lineToRelative(-4.0f, 1.794f)
                lineToRelative(0.0f, -14.493f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 15.39f)
                lineToRelative(-2.0f, 0.897f)
                lineToRelative(0.818f, 1.824f)
                lineToRelative(1.182f, -0.53f)
                lineToRelative(0.0f, 6.419f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -7.316f)
                lineToRelative(4.0f, -1.794f)
                lineToRelative(0.0f, 9.11f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -10.007f)
                lineToRelative(4.0f, -1.794f)
                lineToRelative(0.0f, 11.801f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -12.698f)
                lineToRelative(4.0f, -1.794f)
                lineToRelative(0.0f, 14.492f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -15.389f)
                lineToRelative(2.0f, -0.897f)
                close()
            }
        }
        .build()
        return _tally!!
    }

private var _tally: ImageVector? = null
