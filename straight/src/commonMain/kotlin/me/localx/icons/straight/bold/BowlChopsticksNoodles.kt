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

public val Icons.Bold.BowlChopsticksNoodles: ImageVector
    get() {
        if (_bowlChopsticksNoodles != null) {
            return _bowlChopsticksNoodles!!
        }
        _bowlChopsticksNoodles = Builder(name = "BowlChopsticksNoodles", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                lineTo(24.0f, 0.0f)
                lineTo(3.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 0.095f)
                verticalLineToRelative(2.905f)
                horizontalLineToRelative(-1.582f)
                curveToRelative(-1.01f, 0.0f, -1.963f, 0.442f, -2.615f, 1.215f)
                curveToRelative(-0.646f, 0.765f, -0.921f, 1.767f, -0.755f, 2.748f)
                curveToRelative(0.732f, 4.325f, 3.533f, 8.024f, 7.493f, 9.894f)
                lineToRelative(0.304f, 0.144f)
                horizontalLineToRelative(8.311f)
                lineToRelative(0.304f, -0.144f)
                curveToRelative(3.96f, -1.869f, 6.761f, -5.568f, 7.493f, -9.894f)
                curveToRelative(0.166f, -0.981f, -0.109f, -1.983f, -0.755f, -2.748f)
                curveToRelative(-0.652f, -0.772f, -1.605f, -1.215f, -2.615f, -1.215f)
                horizontalLineToRelative(-7.582f)
                verticalLineToRelative(-2.524f)
                lineToRelative(11.0f, 0.524f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(20.906f, 13.151f)
                curveToRelative(0.054f, 0.063f, 0.112f, 0.169f, 0.088f, 0.312f)
                curveToRelative(-0.55f, 3.251f, -2.605f, 6.046f, -5.523f, 7.537f)
                horizontalLineToRelative(-6.941f)
                curveToRelative(-2.918f, -1.491f, -4.973f, -4.286f, -5.523f, -7.537f)
                curveToRelative(-0.024f, -0.143f, 0.035f, -0.248f, 0.088f, -0.312f)
                curveToRelative(0.048f, -0.057f, 0.153f, -0.151f, 0.324f, -0.151f)
                horizontalLineToRelative(17.164f)
                curveToRelative(0.17f, 0.0f, 0.276f, 0.095f, 0.324f, 0.151f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.762f)
                lineToRelative(2.0f, 0.095f)
                verticalLineToRelative(2.667f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bowlChopsticksNoodles!!
    }

private var _bowlChopsticksNoodles: ImageVector? = null
