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

public val Icons.Bold.Tally: ImageVector
    get() {
        if (_tally != null) {
            return _tally!!
        }
        _tally = Builder(name = "Tally", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.014f, 8.279f)
                lineToRelative(-1.217f, -2.742f)
                lineToRelative(-1.797f, 0.797f)
                lineToRelative(0.0f, -6.334f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 7.666f)
                lineToRelative(-2.0f, 0.887f)
                lineToRelative(0.0f, -8.553f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 9.885f)
                lineToRelative(-2.0f, 0.888f)
                lineToRelative(0.0f, -10.773f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 12.104f)
                lineToRelative(-2.0f, 0.888f)
                lineToRelative(0.0f, -12.992f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 14.323f)
                lineToRelative(-2.994f, 1.329f)
                lineToRelative(1.217f, 2.743f)
                lineToRelative(1.777f, -0.789f)
                lineToRelative(0.0f, 6.394f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -7.726f)
                lineToRelative(2.0f, -0.888f)
                lineToRelative(0.0f, 8.614f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -9.945f)
                lineToRelative(2.0f, -0.888f)
                lineToRelative(0.0f, 10.833f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -12.164f)
                lineToRelative(2.0f, -0.888f)
                lineToRelative(0.0f, 13.052f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -14.384f)
                lineToRelative(3.014f, -1.337f)
                close()
            }
        }
        .build()
        return _tally!!
    }

private var _tally: ImageVector? = null
