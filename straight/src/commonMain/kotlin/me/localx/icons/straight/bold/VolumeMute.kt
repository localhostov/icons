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

public val Icons.Bold.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.123f, 5.5f)
                curveToRelative(-1.171f, 0.0f, -2.123f, 0.952f, -2.123f, 2.123f)
                verticalLineToRelative(8.754f)
                curveToRelative(0.0f, 1.171f, 0.952f, 2.123f, 2.123f, 2.123f)
                horizontalLineToRelative(3.144f)
                lineToRelative(7.733f, 5.109f)
                lineTo(13.0f, 0.391f)
                lineToRelative(-7.733f, 5.109f)
                horizontalLineToRelative(-3.144f)
                close()
                moveTo(10.0f, 5.969f)
                verticalLineToRelative(12.062f)
                lineToRelative(-3.832f, -2.531f)
                horizontalLineToRelative(-3.168f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3.168f)
                lineToRelative(3.832f, -2.531f)
                close()
                moveTo(21.146f, 12.0f)
                lineToRelative(2.453f, 2.453f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.453f, -2.453f)
                lineToRelative(-2.453f, 2.453f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.453f, -2.453f)
                lineToRelative(-2.453f, -2.453f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.453f, 2.453f)
                lineToRelative(2.453f, -2.453f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.453f, 2.453f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
