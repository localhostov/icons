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

public val Icons.Filled.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = Builder(name = "BowlChopsticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.96f, 13.493f)
                curveToRelative(-0.778f, 4.601f, -3.866f, 8.689f, -7.733f, 10.515f)
                lineTo(7.778f, 24.008f)
                curveTo(3.911f, 22.182f, 0.823f, 18.094f, 0.045f, 13.493f)
                curveToRelative(-0.146f, -0.862f, 0.096f, -1.743f, 0.664f, -2.415f)
                curveToRelative(0.575f, -0.681f, 1.415f, -1.07f, 2.304f, -1.07f)
                horizontalLineToRelative(17.981f)
                curveToRelative(0.889f, 0.0f, 1.729f, 0.391f, 2.304f, 1.07f)
                curveToRelative(0.568f, 0.672f, 0.81f, 1.553f, 0.664f, 2.415f)
                close()
                moveTo(3.002f, 5.007f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(21.001f)
                verticalLineToRelative(-2.0f)
                lineTo(3.002f, 5.007f)
                close()
                moveTo(23.986f, 2.506f)
                lineToRelative(-0.096f, -1.998f)
                lineTo(2.955f, 1.508f)
                lineToRelative(0.096f, 1.998f)
                lineToRelative(20.937f, -1.0f)
                close()
            }
        }
        .build()
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
