package me.localx.icons.rounded.outline

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

public val Icons.Outline.StageTheatre: ImageVector
    get() {
        if (_stageTheatre != null) {
            return _stageTheatre!!
        }
        _stageTheatre = Builder(name = "StageTheatre", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.243f, 1.792f, 4.0f, 4.08f, 4.0f)
                horizontalLineToRelative(1.913f)
                curveToRelative(0.6f, 0.0f, 1.165f, -0.265f, 1.55f, -0.727f)
                curveToRelative(0.374f, -0.448f, 0.53f, -1.03f, 0.427f, -1.598f)
                curveToRelative(-0.51f, -2.803f, -2.565f, -5.034f, -4.225f, -6.431f)
                curveToRelative(2.6f, -1.006f, 6.453f, -3.28f, 8.257f, -8.196f)
                curveToRelative(1.803f, 4.917f, 5.656f, 7.19f, 8.257f, 8.196f)
                curveToRelative(-1.661f, 1.396f, -3.715f, 3.627f, -4.225f, 6.431f)
                curveToRelative(-0.103f, 0.567f, 0.053f, 1.149f, 0.427f, 1.598f)
                curveToRelative(0.385f, 0.462f, 0.95f, 0.727f, 1.55f, 0.727f)
                horizontalLineToRelative(1.913f)
                curveToRelative(2.288f, 0.0f, 4.08f, -1.757f, 4.08f, -4.0f)
                lineTo(24.004f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.992f, 22.0f)
                horizontalLineToRelative(-1.913f)
                curveToRelative(-1.166f, 0.0f, -2.08f, -0.879f, -2.08f, -2.0f)
                verticalLineToRelative(-3.592f)
                curveToRelative(1.469f, 1.147f, 3.55f, 3.156f, 3.992f, 5.592f)
                close()
                moveTo(2.0f, 13.754f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.961f)
                curveToRelative(-0.185f, 2.485f, -1.07f, 4.487f, -2.643f, 5.958f)
                curveToRelative(-0.404f, 0.377f, -0.425f, 1.01f, -0.048f, 1.413f)
                curveToRelative(0.197f, 0.211f, 0.463f, 0.317f, 0.73f, 0.317f)
                curveToRelative(0.245f, 0.0f, 0.49f, -0.089f, 0.683f, -0.27f)
                curveToRelative(1.988f, -1.857f, 3.082f, -4.354f, 3.277f, -7.419f)
                horizontalLineToRelative(2.014f)
                curveToRelative(-0.44f, 8.447f, -6.416f, 11.032f, -8.973f, 11.754f)
                close()
                moveTo(13.027f, 2.0f)
                horizontalLineToRelative(2.014f)
                curveToRelative(0.195f, 3.065f, 1.289f, 5.561f, 3.277f, 7.419f)
                curveToRelative(0.193f, 0.181f, 0.438f, 0.27f, 0.683f, 0.27f)
                curveToRelative(0.267f, 0.0f, 0.534f, -0.106f, 0.73f, -0.317f)
                curveToRelative(0.377f, -0.403f, 0.356f, -1.036f, -0.048f, -1.413f)
                curveToRelative(-1.574f, -1.471f, -2.459f, -3.473f, -2.643f, -5.958f)
                horizontalLineToRelative(1.961f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.759f)
                curveToRelative(-2.558f, -0.71f, -8.536f, -3.274f, -8.973f, -11.759f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 1.121f, -0.914f, 2.0f, -2.08f, 2.0f)
                lineToRelative(-1.921f, 0.033f)
                curveToRelative(0.447f, -2.456f, 2.531f, -4.474f, 4.001f, -5.624f)
                verticalLineToRelative(3.591f)
                close()
            }
        }
        .build()
        return _stageTheatre!!
    }

private var _stageTheatre: ImageVector? = null
