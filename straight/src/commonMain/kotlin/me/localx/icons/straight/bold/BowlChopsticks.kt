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

public val Icons.Bold.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = Builder(name = "BowlChopsticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.581f, 10.0f)
                lineTo(3.417f, 10.0f)
                curveToRelative(-1.01f, 0.0f, -1.963f, 0.443f, -2.616f, 1.215f)
                curveToRelative(-0.646f, 0.765f, -0.921f, 1.767f, -0.755f, 2.748f)
                curveToRelative(0.732f, 4.325f, 3.533f, 8.023f, 7.494f, 9.894f)
                lineToRelative(0.304f, 0.144f)
                horizontalLineToRelative(8.311f)
                lineToRelative(0.304f, -0.144f)
                curveToRelative(3.96f, -1.87f, 6.761f, -5.568f, 7.493f, -9.894f)
                curveToRelative(0.166f, -0.981f, -0.109f, -1.983f, -0.755f, -2.748f)
                curveToRelative(-0.652f, -0.771f, -1.606f, -1.215f, -2.616f, -1.215f)
                close()
                moveTo(20.994f, 13.463f)
                curveToRelative(-0.55f, 3.251f, -2.605f, 6.045f, -5.523f, 7.537f)
                horizontalLineToRelative(-6.941f)
                curveToRelative(-2.919f, -1.491f, -4.974f, -4.286f, -5.524f, -7.537f)
                curveToRelative(-0.024f, -0.143f, 0.035f, -0.248f, 0.088f, -0.312f)
                curveToRelative(0.048f, -0.057f, 0.153f, -0.151f, 0.324f, -0.151f)
                horizontalLineToRelative(17.164f)
                curveToRelative(0.171f, 0.0f, 0.276f, 0.095f, 0.324f, 0.151f)
                curveToRelative(0.054f, 0.063f, 0.112f, 0.169f, 0.088f, 0.312f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 3.0f)
                lineTo(3.0f, 1.0f)
                lineTo(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
