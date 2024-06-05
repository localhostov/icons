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

public val Icons.Filled.HelmetBattle: ImageVector
    get() {
        if (_helmetBattle != null) {
            return _helmetBattle!!
        }
        _helmetBattle = Builder(name = "HelmetBattle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.703f, 13.064f)
                lineToRelative(-3.703f, 1.998f)
                lineToRelative(-3.703f, -1.998f)
                curveToRelative(-0.183f, -0.099f, -0.297f, -0.29f, -0.297f, -0.498f)
                curveToRelative(0.0f, -0.312f, 0.254f, -0.566f, 0.565f, -0.566f)
                horizontalLineToRelative(6.869f)
                curveToRelative(0.312f, 0.0f, 0.565f, 0.254f, 0.565f, 0.566f)
                curveToRelative(0.0f, 0.208f, -0.114f, 0.399f, -0.297f, 0.498f)
                close()
                moveTo(14.336f, 0.631f)
                curveToRelative(-1.303f, -0.849f, -2.984f, -0.848f, -4.287f, 0.0f)
                curveToRelative(-2.934f, 1.91f, -7.856f, 5.721f, -7.856f, 9.782f)
                verticalLineToRelative(6.344f)
                curveToRelative(0.0f, 2.13f, 1.272f, 4.03f, 3.242f, 4.841f)
                lineToRelative(4.972f, 2.047f)
                curveToRelative(0.194f, 0.08f, 0.394f, 0.127f, 0.594f, 0.179f)
                verticalLineToRelative(-7.029f)
                lineToRelative(-3.652f, -1.972f)
                curveToRelative(-0.831f, -0.448f, -1.348f, -1.313f, -1.348f, -2.258f)
                curveToRelative(0.0f, -1.415f, 1.15f, -2.566f, 2.565f, -2.566f)
                horizontalLineToRelative(6.869f)
                curveToRelative(1.415f, 0.0f, 2.565f, 1.151f, 2.565f, 2.566f)
                curveToRelative(0.0f, 0.944f, -0.517f, 1.81f, -1.348f, 2.258f)
                lineToRelative(-3.652f, 1.972f)
                verticalLineToRelative(7.125f)
                curveToRelative(0.332f, -0.059f, 0.66f, -0.145f, 0.978f, -0.276f)
                lineToRelative(4.972f, -2.047f)
                curveToRelative(1.97f, -0.811f, 3.242f, -2.711f, 3.242f, -4.841f)
                verticalLineToRelative(-6.344f)
                curveToRelative(0.0f, -4.061f, -4.923f, -7.872f, -7.856f, -9.782f)
                close()
            }
        }
        .build()
        return _helmetBattle!!
    }

private var _helmetBattle: ImageVector? = null
