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

public val Icons.Bold.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = Builder(name = "PencilRuler", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.053f, 9.364f)
                curveToRelative(-1.393f, -1.392f, -1.393f, -3.612f, -0.028f, -4.977f)
                lineTo(5.393f, 0.02f)
                lineToRelative(5.105f, 4.907f)
                lineToRelative(-2.079f, 2.162f)
                lineToRelative(-2.984f, -2.868f)
                lineToRelative(-2.288f, 2.288f)
                curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0.0f, 0.707f)
                lineToRelative(2.592f, 2.46f)
                lineToRelative(-2.065f, 2.176f)
                lineToRelative(-2.62f, -2.487f)
                close()
                moveTo(19.099f, 13.528f)
                lineToRelative(-2.163f, 2.078f)
                lineToRelative(2.869f, 2.985f)
                lineToRelative(-2.288f, 2.288f)
                curveToRelative(-0.194f, 0.193f, -0.512f, 0.195f, -0.68f, 0.028f)
                lineToRelative(-2.487f, -2.621f)
                lineToRelative(-2.176f, 2.064f)
                lineToRelative(2.515f, 2.649f)
                curveToRelative(0.683f, 0.683f, 1.578f, 1.023f, 2.475f, 1.023f)
                reflectiveCurveToRelative(1.792f, -0.342f, 2.475f, -1.023f)
                lineToRelative(4.368f, -4.368f)
                lineToRelative(-4.907f, -5.104f)
                close()
                moveTo(22.814f, 6.91f)
                lineTo(5.724f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.725f)
                lineTo(17.09f, 1.186f)
                curveToRelative(0.764f, -0.765f, 1.78f, -1.186f, 2.862f, -1.186f)
                reflectiveCurveToRelative(2.098f, 0.421f, 2.862f, 1.186f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.577f, 1.578f, 1.577f, 4.146f, 0.0f, 5.725f)
                close()
                moveTo(17.148f, 8.334f)
                lineToRelative(-1.482f, -1.482f)
                lineTo(3.0f, 19.518f)
                verticalLineToRelative(1.482f)
                horizontalLineToRelative(1.482f)
                lineToRelative(12.667f, -12.666f)
                close()
            }
        }
        .build()
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
