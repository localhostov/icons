package me.localx.icons.rounded.filled

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

public val Icons.Filled.StageTheatre: ImageVector
    get() {
        if (_stageTheatre != null) {
            return _stageTheatre!!
        }
        _stageTheatre = Builder(name = "StageTheatre", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.744f, 16.0f)
                horizontalLineToRelative(4.256f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.936f)
                curveToRelative(-0.975f, 0.0f, -1.697f, -0.883f, -1.54f, -1.846f)
                curveToRelative(0.429f, -2.63f, 2.555f, -4.715f, 3.72f, -6.154f)
                close()
                moveTo(4.257f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.955f)
                curveToRelative(0.965f, 0.0f, 1.676f, -0.873f, 1.525f, -1.826f)
                curveToRelative(-0.42f, -2.639f, -2.555f, -4.731f, -3.723f, -6.174f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.11f, -1.398f, -7.638f, -4.65f, -8.0f, -12.0f)
                curveToRelative(-0.362f, 7.35f, -4.89f, 10.602f, -8.0f, 12.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.239f, 2.239f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(8.929f, 3.152f)
                curveToRelative(0.083f, -0.606f, -0.389f, -1.152f, -1.0f, -1.152f)
                curveToRelative(-0.492f, 0.0f, -0.926f, 0.355f, -0.991f, 0.842f)
                curveToRelative(-0.353f, 2.618f, -1.436f, 4.301f, -2.6f, 5.367f)
                curveToRelative(-0.21f, 0.192f, -0.337f, 0.454f, -0.337f, 0.738f)
                curveToRelative(0.0f, 0.853f, 1.009f, 1.31f, 1.645f, 0.741f)
                curveToRelative(1.476f, -1.319f, 2.85f, -3.369f, 3.284f, -6.537f)
                close()
                moveTo(20.0f, 8.947f)
                curveToRelative(0.0f, -0.284f, -0.127f, -0.545f, -0.336f, -0.737f)
                curveToRelative(-1.161f, -1.066f, -2.228f, -2.749f, -2.578f, -5.366f)
                curveToRelative(-0.065f, -0.488f, -0.499f, -0.844f, -0.992f, -0.844f)
                curveToRelative(-0.611f, 0.0f, -1.083f, 0.546f, -1.0f, 1.152f)
                curveToRelative(0.431f, 3.166f, 1.793f, 5.216f, 3.262f, 6.535f)
                curveToRelative(0.635f, 0.57f, 1.645f, 0.113f, 1.645f, -0.739f)
                close()
            }
        }
        .build()
        return _stageTheatre!!
    }

private var _stageTheatre: ImageVector? = null
