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

public val Icons.Bold.HatWitch: ImageVector
    get() {
        if (_hatWitch != null) {
            return _hatWitch!!
        }
        _hatWitch = Builder(name = "HatWitch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.242f, 21.0f)
                lineToRelative(-5.039f, -14.659f)
                lineToRelative(2.38f, -2.677f)
                lineToRelative(1.645f, 2.631f)
                lineToRelative(2.544f, -1.59f)
                lineToRelative(-2.94f, -4.705f)
                horizontalLineToRelative(-7.255f)
                curveToRelative(-2.78f, 0.0f, -5.252f, 1.768f, -6.151f, 4.399f)
                lineTo(1.756f, 21.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.758f)
                close()
                moveTo(10.264f, 5.369f)
                curveToRelative(0.484f, -1.417f, 1.815f, -2.369f, 3.312f, -2.369f)
                horizontalLineToRelative(2.583f)
                lineToRelative(-2.363f, 2.659f)
                lineToRelative(5.274f, 15.341f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.074f)
                lineToRelative(5.337f, -15.631f)
                close()
            }
        }
        .build()
        return _hatWitch!!
    }

private var _hatWitch: ImageVector? = null
