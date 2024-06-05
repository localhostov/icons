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

public val Icons.Outline.HelmetBattle: ImageVector
    get() {
        if (_helmetBattle != null) {
            return _helmetBattle!!
        }
        _helmetBattle = Builder(name = "HelmetBattle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.144f, 0.638f)
                curveToRelative(-1.303f, -0.849f, -2.984f, -0.848f, -4.287f, 0.0f)
                curveToRelative(-2.934f, 1.91f, -7.856f, 5.721f, -7.856f, 9.782f)
                verticalLineToRelative(6.344f)
                curveToRelative(0.0f, 2.13f, 1.272f, 4.03f, 3.242f, 4.841f)
                lineToRelative(4.972f, 2.047f)
                curveToRelative(0.576f, 0.237f, 1.181f, 0.355f, 1.786f, 0.355f)
                reflectiveCurveToRelative(1.21f, -0.119f, 1.786f, -0.355f)
                lineToRelative(4.972f, -2.047f)
                curveToRelative(1.97f, -0.811f, 3.242f, -2.711f, 3.242f, -4.841f)
                verticalLineToRelative(-6.344f)
                curveToRelative(0.0f, -4.061f, -4.923f, -7.872f, -7.856f, -9.782f)
                close()
                moveTo(12.0f, 15.061f)
                lineToRelative(-3.703f, -1.998f)
                curveToRelative(-0.183f, -0.099f, -0.297f, -0.29f, -0.297f, -0.498f)
                curveToRelative(0.0f, -0.312f, 0.254f, -0.566f, 0.565f, -0.566f)
                horizontalLineToRelative(6.869f)
                curveToRelative(0.312f, 0.0f, 0.565f, 0.254f, 0.565f, 0.566f)
                curveToRelative(0.0f, 0.208f, -0.114f, 0.399f, -0.297f, 0.498f)
                lineToRelative(-3.703f, 1.998f)
                close()
                moveTo(20.0f, 16.763f)
                curveToRelative(0.0f, 1.316f, -0.786f, 2.49f, -2.004f, 2.991f)
                lineToRelative(-4.972f, 2.047f)
                curveToRelative(-0.008f, 0.003f, -0.016f, 0.004f, -0.024f, 0.007f)
                verticalLineToRelative(-5.014f)
                lineToRelative(3.652f, -1.972f)
                curveToRelative(0.831f, -0.448f, 1.348f, -1.313f, 1.348f, -2.258f)
                curveToRelative(0.0f, -1.415f, -1.15f, -2.566f, -2.565f, -2.566f)
                horizontalLineToRelative(-6.869f)
                curveToRelative(-1.415f, 0.0f, -2.565f, 1.151f, -2.565f, 2.566f)
                curveToRelative(0.0f, 0.944f, 0.517f, 1.81f, 1.348f, 2.258f)
                lineToRelative(3.652f, 1.972f)
                verticalLineToRelative(5.014f)
                curveToRelative(-0.008f, -0.003f, -0.016f, -0.004f, -0.024f, -0.007f)
                lineToRelative(-4.972f, -2.047f)
                curveToRelative(-1.218f, -0.501f, -2.004f, -1.675f, -2.004f, -2.991f)
                verticalLineToRelative(-6.344f)
                curveToRelative(0.0f, -3.233f, 4.859f, -6.746f, 6.948f, -8.106f)
                curveToRelative(0.319f, -0.208f, 0.686f, -0.312f, 1.052f, -0.312f)
                reflectiveCurveToRelative(0.732f, 0.104f, 1.052f, 0.312f)
                curveToRelative(2.089f, 1.36f, 6.948f, 4.873f, 6.948f, 8.106f)
                verticalLineToRelative(6.344f)
                close()
            }
        }
        .build()
        return _helmetBattle!!
    }

private var _helmetBattle: ImageVector? = null
