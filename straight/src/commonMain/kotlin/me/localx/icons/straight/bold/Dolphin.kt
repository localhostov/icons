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

public val Icons.Bold.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.881f, 6.501f)
                curveTo(21.229f, 2.591f, 17.965f, -0.029f, 13.5f, -0.029f)
                curveToRelative(-1.72f, 0.0f, -3.919f, 0.444f, -5.932f, 1.644f)
                curveTo(6.062f, 0.9f, 3.997f, 0.223f, 1.313f, -0.024f)
                curveTo(0.394f, -0.109f, -0.451f, 1.098f, 0.273f, 1.67f)
                curveToRelative(1.607f, 1.271f, 2.683f, 2.695f, 3.401f, 3.974f)
                curveToRelative(-1.024f, 1.853f, -1.673f, 4.252f, -1.673f, 7.327f)
                curveToRelative(0.0f, 2.642f, 0.531f, 5.011f, 0.847f, 6.19f)
                curveToRelative(-1.697f, 0.944f, -2.847f, 2.763f, -2.847f, 4.839f)
                curveToRelative(4.173f, 0.0f, 5.5f, -2.776f, 5.5f, -2.776f)
                curveToRelative(0.0f, 0.0f, 1.378f, 2.776f, 5.5f, 2.776f)
                curveToRelative(0.0f, -2.131f, -1.212f, -3.992f, -2.984f, -4.913f)
                curveToRelative(0.105f, -1.328f, 0.744f, -2.872f, 1.865f, -4.493f)
                curveToRelative(0.688f, -0.996f, 1.583f, -1.815f, 2.613f, -2.421f)
                curveToRelative(0.44f, 0.771f, 0.935f, 1.869f, 1.507f, 3.298f)
                curveToRelative(0.961f, -1.922f, 1.428f, -3.327f, 1.621f, -4.401f)
                curveToRelative(0.437f, -0.065f, 0.882f, -0.099f, 1.333f, -0.099f)
                horizontalLineToRelative(7.046f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.249f, -0.921f, -2.287f, -2.119f, -2.471f)
                close()
                moveTo(16.954f, 7.972f)
                curveToRelative(-3.849f, 0.0f, -7.416f, 1.839f, -9.542f, 4.918f)
                curveToRelative(-0.948f, 1.373f, -1.62f, 2.711f, -2.009f, 4.0f)
                curveToRelative(-0.209f, -1.073f, -0.402f, -2.457f, -0.402f, -3.918f)
                curveTo(5.0f, 3.454f, 12.081f, 2.971f, 13.5f, 2.971f)
                curveToRelative(3.799f, 0.0f, 5.5f, 2.511f, 5.5f, 5.0f)
                horizontalLineToRelative(-2.046f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
