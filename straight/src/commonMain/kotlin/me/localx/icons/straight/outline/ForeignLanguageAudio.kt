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

public val Icons.Outline.ForeignLanguageAudio: ImageVector
    get() {
        if (_foreignLanguageAudio != null) {
            return _foreignLanguageAudio!!
        }
        _foreignLanguageAudio = Builder(name = "ForeignLanguageAudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.993f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.899f, -2.0f, 2.003f)
                verticalLineToRelative(8.013f)
                curveToRelative(0.0f, 1.104f, 0.897f, 2.003f, 2.0f, 2.003f)
                horizontalLineToRelative(2.803f)
                lineToRelative(7.197f, 5.987f)
                lineTo(12.0f, 0.0f)
                lineTo(4.803f, 5.993f)
                lineTo(2.0f, 5.993f)
                close()
                moveTo(2.0f, 7.993f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(10.001f, 4.268f)
                verticalLineToRelative(15.467f)
                lineToRelative(-4.475f, -3.722f)
                lineToRelative(-3.525f, -0.003f)
                lineToRelative(0.003f, -8.017f)
                horizontalLineToRelative(3.524f)
                lineToRelative(4.473f, -3.725f)
                close()
                moveTo(22.906f, 10.0f)
                curveToRelative(-0.237f, 1.434f, -0.95f, 3.441f, -2.372f, 5.089f)
                curveToRelative(0.917f, 0.548f, 2.047f, 0.911f, 3.466f, 0.911f)
                verticalLineToRelative(2.0f)
                curveToRelative(-2.08f, 0.0f, -3.722f, -0.606f, -5.005f, -1.516f)
                curveToRelative(-1.282f, 0.908f, -2.919f, 1.516f, -4.995f, 1.516f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.418f, 0.0f, 2.558f, -0.354f, 3.476f, -0.902f)
                curveToRelative(-0.838f, -0.97f, -1.432f, -2.067f, -1.826f, -3.098f)
                horizontalLineToRelative(2.174f)
                curveToRelative(0.29f, 0.612f, 0.685f, 1.233f, 1.182f, 1.804f)
                curveToRelative(1.092f, -1.254f, 1.636f, -2.769f, 1.859f, -3.804f)
                horizontalLineToRelative(-6.864f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.095f)
                close()
            }
        }
        .build()
        return _foreignLanguageAudio!!
    }

private var _foreignLanguageAudio: ImageVector? = null
