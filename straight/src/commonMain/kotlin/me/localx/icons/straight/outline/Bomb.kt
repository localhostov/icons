package me.localx.icons.straight.outline

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

public val Icons.Outline.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineToRelative(-1.333f, -2.667f)
                lineTo(0.0f, 4.0f)
                lineToRelative(2.667f, -1.333f)
                lineTo(4.0f, 0.0f)
                lineToRelative(1.333f, 2.667f)
                lineToRelative(2.667f, 1.333f)
                lineToRelative(-2.667f, 1.333f)
                lineToRelative(-1.333f, 2.667f)
                close()
                moveTo(21.824f, 9.41f)
                lineToRelative(-1.71f, 1.711f)
                curveToRelative(0.582f, 1.211f, 0.886f, 2.538f, 0.886f, 3.879f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.962f, 3.0f, 15.0f)
                reflectiveCurveTo(7.038f, 6.0f, 12.0f, 6.0f)
                curveToRelative(1.337f, 0.0f, 2.66f, 0.303f, 3.869f, 0.881f)
                lineToRelative(1.713f, -1.713f)
                lineToRelative(4.242f, 4.242f)
                close()
                moveTo(19.0f, 15.0f)
                curveToRelative(0.0f, -1.243f, -0.338f, -2.472f, -0.978f, -3.553f)
                lineToRelative(-0.395f, -0.668f)
                lineToRelative(1.369f, -1.369f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.37f, 1.37f)
                lineToRelative(-0.667f, -0.394f)
                curveToRelative(-1.079f, -0.636f, -2.305f, -0.972f, -3.545f, -0.972f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                close()
                moveTo(22.034f, 1.62f)
                curveTo(20.976f, 0.562f, 19.527f, -0.013f, 18.037f, 0.034f)
                curveToRelative(-5.128f, 0.175f, -9.068f, 0.953f, -9.233f, 0.986f)
                lineToRelative(0.392f, 1.961f)
                curveToRelative(0.039f, -0.008f, 3.954f, -0.779f, 8.909f, -0.948f)
                curveToRelative(0.937f, -0.033f, 1.847f, 0.334f, 2.515f, 1.001f)
                curveToRelative(0.532f, 0.533f, 0.532f, 1.399f, 0.0f, 1.932f)
                lineToRelative(-0.327f, 0.327f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(0.327f, -0.327f)
                curveToRelative(1.312f, -1.312f, 1.312f, -3.448f, 0.0f, -4.76f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
