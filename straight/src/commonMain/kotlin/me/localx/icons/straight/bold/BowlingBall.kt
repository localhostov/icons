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

public val Icons.Bold.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) {
            return _bowlingBall!!
        }
        _bowlingBall = Builder(name = "BowlingBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, 9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(10.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 11.5f)
                close()
                moveTo(6.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 9.0f)
                close()
                moveTo(9.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 5.0f)
                close()
            }
        }
        .build()
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
