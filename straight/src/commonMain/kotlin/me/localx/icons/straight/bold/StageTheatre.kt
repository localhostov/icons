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

public val Icons.Bold.StageTheatre: ImageVector
    get() {
        if (_stageTheatre != null) {
            return _stageTheatre!!
        }
        _stageTheatre = Builder(name = "StageTheatre", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(8.658f)
                lineToRelative(-0.165f, -1.649f)
                curveToRelative(-0.284f, -2.838f, -1.777f, -5.083f, -3.23f, -6.639f)
                curveToRelative(2.34f, -1.216f, 5.24f, -3.527f, 6.738f, -7.818f)
                curveToRelative(1.498f, 4.29f, 4.398f, 6.602f, 6.738f, 7.818f)
                curveToRelative(-1.453f, 1.556f, -2.947f, 3.801f, -3.23f, 6.639f)
                lineToRelative(-0.165f, 1.649f)
                horizontalLineToRelative(8.658f)
                lineTo(24.002f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-3.312f)
                curveToRelative(0.814f, 0.857f, 1.648f, 1.979f, 2.129f, 3.312f)
                horizontalLineToRelative(-2.129f)
                close()
                moveTo(3.0f, 13.494f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.246f)
                curveToRelative(1.414f, -1.339f, 2.605f, -3.351f, 2.915f, -6.246f)
                horizontalLineToRelative(2.012f)
                curveToRelative(-0.523f, 6.888f, -4.55f, 9.534f, -6.928f, 10.494f)
                close()
                moveTo(14.072f, 3.0f)
                horizontalLineToRelative(2.012f)
                curveToRelative(0.311f, 2.895f, 1.501f, 4.907f, 2.915f, 6.246f)
                lineTo(18.999f, 3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(9.994f)
                curveToRelative(-2.381f, -0.962f, -6.405f, -3.609f, -6.928f, -10.494f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-2.129f)
                curveToRelative(0.481f, -1.333f, 1.315f, -2.455f, 2.129f, -3.312f)
                verticalLineToRelative(3.312f)
                close()
            }
        }
        .build()
        return _stageTheatre!!
    }

private var _stageTheatre: ImageVector? = null
