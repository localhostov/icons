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

public val Icons.Bold.Salad: ImageVector
    get() {
        if (_salad != null) {
            return _salad!!
        }
        _salad = Builder(name = "Salad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2f, 11.215f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.012f, -1.149f)
                arcTo(28.251f, 28.251f, 0.0f, false, false, 22.0f, 4.557f)
                lineToRelative(0.062f, -1.632f)
                lineTo(20.43f, 3.0f)
                arcToRelative(26.657f, 26.657f, 0.0f, false, false, -3.986f, 0.508f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 11.421f, 0.872f)
                curveToRelative(-0.166f, 0.166f, -0.421f, 0.372f, -0.421f, 0.372f)
                reflectiveCurveToRelative(-0.254f, -0.206f, -0.421f, -0.372f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, false, -4.77f, 3.4f)
                arcToRelative(5.511f, 5.511f, 0.0f, false, false, -3.747f, 6.02f)
                arcTo(3.38f, 3.38f, 0.0f, false, false, 0.048f, 13.964f)
                arcTo(13.415f, 13.415f, 0.0f, false, false, 7.54f, 23.856f)
                lineToRelative(0.3f, 0.144f)
                horizontalLineToRelative(8.31f)
                lineToRelative(0.3f, -0.144f)
                arcToRelative(13.415f, 13.415f, 0.0f, false, false, 7.492f, -9.892f)
                arcTo(3.373f, 3.373f, 0.0f, false, false, 23.2f, 11.215f)
                close()
                moveTo(18.057f, 10.0f)
                lineTo(13.045f, 10.0f)
                arcToRelative(2.718f, 2.718f, 0.0f, false, true, 0.707f, -2.237f)
                curveToRelative(0.774f, -0.8f, 3.075f, -1.349f, 5.108f, -1.61f)
                arcTo(19.28f, 19.28f, 0.0f, false, true, 18.057f, 10.0f)
                close()
                moveTo(7.5f, 7.0f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 2.437f, 3.0f)
                lineTo(5.063f, 10.0f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 7.5f, 7.0f)
                close()
                moveTo(15.471f, 21.0f)
                lineTo(8.529f, 21.0f)
                arcToRelative(10.421f, 10.421f, 0.0f, false, true, -5.524f, -7.537f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, 0.089f, -0.312f)
                arcTo(0.421f, 0.421f, 0.0f, false, true, 3.418f, 13.0f)
                lineTo(20.582f, 13.0f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, 0.324f, 0.151f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, 0.089f, 0.312f)
                arcTo(10.421f, 10.421f, 0.0f, false, true, 15.471f, 21.0f)
                close()
            }
        }
        .build()
        return _salad!!
    }

private var _salad: ImageVector? = null
