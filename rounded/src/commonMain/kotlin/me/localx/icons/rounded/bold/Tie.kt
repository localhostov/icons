package me.localx.icons.rounded.bold

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

public val Icons.Bold.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.312f, 15.195f)
                lineToRelative(-2.747f, -8.717f)
                lineToRelative(0.81f, -2.842f)
                curveToRelative(0.277f, -0.842f, 0.132f, -1.773f, -0.387f, -2.491f)
                curveToRelative(-0.519f, -0.717f, -1.358f, -1.146f, -2.244f, -1.146f)
                horizontalLineToRelative(-3.488f)
                curveToRelative(-0.886f, 0.0f, -1.725f, 0.429f, -2.244f, 1.146f)
                curveToRelative(-0.52f, 0.718f, -0.664f, 1.649f, -0.405f, 2.433f)
                lineToRelative(0.827f, 2.899f)
                lineToRelative(-2.739f, 8.693f)
                curveToRelative(-0.564f, 1.689f, -0.076f, 3.555f, 1.242f, 4.753f)
                lineToRelative(4.054f, 3.686f)
                curveToRelative(0.286f, 0.26f, 0.647f, 0.39f, 1.009f, 0.39f)
                reflectiveCurveToRelative(0.723f, -0.13f, 1.009f, -0.39f)
                lineToRelative(4.054f, -3.686f)
                curveToRelative(1.318f, -1.198f, 1.806f, -3.063f, 1.25f, -4.729f)
                close()
                moveTo(13.438f, 3.0f)
                lineToRelative(-0.57f, 2.0f)
                horizontalLineToRelative(-1.737f)
                lineToRelative(-0.571f, -2.0f)
                horizontalLineToRelative(2.878f)
                close()
                moveTo(15.045f, 17.705f)
                lineToRelative(-3.045f, 2.768f)
                lineToRelative(-3.045f, -2.768f)
                curveToRelative(-0.439f, -0.399f, -0.602f, -1.021f, -0.406f, -1.608f)
                lineToRelative(2.551f, -8.097f)
                horizontalLineToRelative(1.8f)
                lineToRelative(2.559f, 8.121f)
                curveToRelative(0.188f, 0.563f, 0.025f, 1.185f, -0.414f, 1.584f)
                close()
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
